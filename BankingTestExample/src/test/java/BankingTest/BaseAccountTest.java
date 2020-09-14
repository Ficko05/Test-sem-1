package BankingTest;

import Banking.Bank;
import Banking.BaseAccount;
import Banking.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseAccountTest {
    private Bank bank;
    private Customer customer;


    @BeforeEach
    public void setup() {
        Bank bank = new BankMock();
        Customer customer = new CustomerMock();

    }


    @Test
    public void testCreatAccount() {
        // Arrange
        String number = "ABC-123";
        BaseAccount account = new BaseAccount(bank, customer, number);
        // Act

        // Assert
        assertNotNull(account);
    }

    @Test
    public void testCreatedAccountHasBank() {
        // Arrange
        String number = "ABC-123";
        BaseAccount account = new BaseAccount(bank, customer, number);
        // Act

        // Assert
        assertEquals(bank, account.getBank());
    }

    @Test
    public void testCreatedAccountHasCustomer() {
        // Arrange
        String number = "ABC-123";
        BaseAccount account = new BaseAccount(bank, customer, number);
        // Act

        // Assert
        assertEquals(customer, account.getCustomer());
    }

    @Test
    public void testCreatedAccountHasNumber() {
        // Arrange
        String number = "ABC-123";
        BaseAccount account = new BaseAccount(bank, customer, number);
        // Act

        // Assert
        assertEquals(number, account.getNumber());
    }

    @Test
    public void testCreatedAccountHasZeroBalance() {
        // Arrange
        String number = "ABC-123";
        BaseAccount account = new BaseAccount(bank, customer, number);
        // Act

        // Assert
        assertEquals(0l, account.getBalance());
    }


}
