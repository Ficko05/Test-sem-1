package BankingTest;

import Banking.BaseAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseAccountTest {
    BaseAccount account = new BaseAccount();

    @Test
    public void test() {
        // Arrange

        // Act
           int result = account.;
        // Assert
        assertEquals(0,result);
    }


}
