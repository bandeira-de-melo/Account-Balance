package entities;

import java.util.Locale;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account (int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        makeDeposit(initialDeposit);
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account() {
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void makeDeposit(double amount) {
        this.accountBalance += amount;
    }
    public void makeWithDraw(double amount) {
        this.accountBalance -= amount + 5;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder:"
                + accountHolder
                + ", Balance: $"
                + String.format("%.2f", accountBalance);
    }
}
