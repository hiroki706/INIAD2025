package asgn3;

public class Practice3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("0123", 1500);
        System.out.println("Initial balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("After balance: " + account.getBalance());
        try {
            account.withdraw(1500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Final Balance: " + account.getBalance());
    }
}
