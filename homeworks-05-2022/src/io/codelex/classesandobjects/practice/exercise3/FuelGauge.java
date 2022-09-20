package io.codelex.classesandobjects.practice.exercise3;

public class FuelGauge {
    double fuel;

    public FuelGauge(int fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    private void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void fillUp(double filled) {
        double inTank = this.getFuel();
        if ((filled + inTank) > 70) {
            this.setFuel(70);
        } else {
            this.setFuel(filled + inTank);
        }
    }

    public void drive(double mile) {
        double inTank = this.getFuel();
        this.setFuel(inTank - (mile / 10));
    }

}
