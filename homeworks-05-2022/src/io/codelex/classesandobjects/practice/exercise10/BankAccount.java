package io.codelex.classesandobjects.practice.exercise10;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    private final String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        //todo
    }

    public final void withdraw(double amount) {
        //todo
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        String sign = (this.balance > 0) ? "$" : "-$";
        return this.name + ", " + sign + String.format("%.2f", Math.abs(this.balance));
    }
}
