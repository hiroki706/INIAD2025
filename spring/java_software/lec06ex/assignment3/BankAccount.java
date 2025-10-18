package assignment3;

public class BankAccount {
    final protected static int MINIMUM_BALANCE = 1000;
    final protected String accountNumber;
    protected int balance;

    public BankAccount(String accountNumber, int balance) {
        if (balance < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("Intial balance must be at least " + MINIMUM_BALANCE);
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance - amount < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("Cannot withdraw, balance would fall below minimum");
        }
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }
}
