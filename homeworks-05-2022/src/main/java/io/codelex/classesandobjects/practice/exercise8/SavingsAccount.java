package io.codelex.classesandobjects.practice.exercise8;

public class SavingsAccount {
    double accountBalance;

    public SavingsAccount(double accountStartingBalance) {
        this.accountBalance = accountStartingBalance;
    }

    public void withdrawal(double withdraw) {
        this.accountBalance -= withdraw;
    }

    public void deposit(double deposit) {
        this.accountBalance += deposit;
    }

    public double monthlyInterests(double annualRate) {
        double interestAmount = this.getAccountBalance() * (annualRate / 12);
        this.deposit(interestAmount);
        return interestAmount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
