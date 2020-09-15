package BankingTest;

import Banking.Bank;
import Banking.BaseAccount;

public class BankMock implements Bank {
    private BaseAccount account =  new BaseAccount(this,new CustomerMock(),"XYZ");
    @Override
    public BaseAccount getAccount(String number) {
        return account;
    }
}
