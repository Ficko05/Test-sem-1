package BankingTest;

import Banking.Bank;
import Banking.BaseAccount;
import Banking.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseAccountTranferTest {
    private BaseAccount source;
    private BaseAccount  destination;
    private Bank bank;

    @BeforeEach
    public void setup(){
        Bank bank = new BankMock();
        Customer customer = new CustomerMock();
        String number = "ABC-123";
        source = new BaseAccount(bank, customer, number);
        destination = new BaseAccount(bank, customer, "XYZ-456");
    }
    @Test
    public void testSourceIsUpdatedOnTranfert() {
        //pays money
        // Arrange

        // Act
        long balanceBefor = source.getBalance();
        long amount = 100_00;

        source.transfer(amount, destination);


        // Assert
        assertEquals(balanceBefor - amount, source.getBalance());

    }

    @Test
    public void testDestinationIsUpdatedOnTranfert() {
        //gets money
        // Arrange

        // Act
        long balanceBefor = destination.getBalance();
        long amount = 100_00;

        source.transfer(amount, destination);


        // Assert
        assertEquals(balanceBefor + amount, destination.getBalance());

    }

    @Test
    public void testSourceBalanceIsUpdatedOnTransferByNumber() {
        // Arrange

        // Act
        long balanceBefor = source.getBalance();
        long amount = 100_00;
        String destinationNumber = "XYZ-789";
        source.transfer(amount, destinationNumber);
        // Assert
        assertEquals(balanceBefor - amount, source.getBalance());
    }
    @Test
    public void testDestinationBalanceIsUpdatedOnTransferByNumber() {
        // Arrange

        // Act
        String destinationNumber = "XYZ-789";
        BaseAccount destination = bank.getAccount(destinationNumber);
        long balanceBefor = source.getBalance();
        long amount = 200_00;
        source.transfer(amount, destinationNumber);
        // Assert
        assertEquals(balanceBefor + amount, destination.getBalance());
    }
}
