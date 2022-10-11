package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    double totalSales;
    double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    public void addSales(double salesMade) {
        this.totalSales += salesMade;
    }

    @Override
    public double pay() {
        double salary = super.pay() + totalSales * commissionRate;
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal sales " + totalSales;
    }
}
