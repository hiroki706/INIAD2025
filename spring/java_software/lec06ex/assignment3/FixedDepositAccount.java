package assignment3;

import java.time.LocalDate;

public class FixedDepositAccount extends BankAccount{
    private double interestRate;
    private int maturityPeriod; // in months
    private LocalDate lockedUntil;

    public FixedDepositAccount(String accountNumber, int balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        if (maturityPeriod <= 0) {
            throw new IllegalArgumentException("Maturity period must be positive");
        }
        this.interestRate = interestRate;
        this.maturityPeriod = maturityPeriod;
        this.lockedUntil = LocalDate.now().plusMonths(maturityPeriod);
    }

    public double getInterestRate() {
        return this.interestRate;
    }
    public int getMaturityPeriod() {
        return this.maturityPeriod;
    }
    public LocalDate getLockedUntil() {
        return this.lockedUntil;
    }

    @Override
    public void withdraw(int amount) {
        if (LocalDate.now().isBefore(lockedUntil)) {
            System.out.println("Cannot be withdrawn before maturity");
        }
        if (this.balance - amount < MINIMUM_BALANCE) {
            System.out.println("Insufficient balance");
        }
        super.withdraw(amount);
    }
}
