package Banking;

public class BaseAccount {
    private final Bank bank;
    private final  Customer customer;
    private final String number;
    private long balance;


    public BaseAccount(Bank bank, Customer customer, String number){
    this.bank = bank;
    this.customer = customer;
    this.number = number;

    }

    public Bank getBank() {
        return bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getNumber(){
        return number;

    }

    public Long getBalance(){
        return balance;
    }


    public void transfer(long amount, BaseAccount destination) {
        balance -= amount;
        destination.balance += amount;

    }

    public void transfer(long amount, String destinationNumber) {
        bank.getAccount(destinationNumber);
    balance -= amount;
    BaseAccount destination = bank.getAccount(destinationNumber);
    destination.balance += amount;

    }



}
