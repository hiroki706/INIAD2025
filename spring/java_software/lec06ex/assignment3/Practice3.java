package assignment3;

public class Practice3 {
    public static void main(String[] args) {
        FixedDepositAccount fdAccount = new FixedDepositAccount("1234", 5000, 2.5, 12);

        fdAccount.deposit(3000);
        System.out.println("Current Balance: " + fdAccount.getBalance());
        System.out.println("Interest Rate: " + fdAccount.getInterestRate());
        System.out.println("Maturity Date: " + fdAccount.getLockedUntil());
        fdAccount.withdraw(1000);
    }
}
