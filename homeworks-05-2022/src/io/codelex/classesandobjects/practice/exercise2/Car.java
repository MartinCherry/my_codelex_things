package io.codelex.classesandobjects.practice.exercise2;

public class Car {
    double startKilometers; // Starting odometer reading
    double endKilometers; // Ending odometer reading
    double liters; // Liters of gas used between the readings

    public Car(double startKilometers) {

        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;
    }

    public Car(double startKilometers, double endKilometers, double liters) {

        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public void fillUp(double driven, double liters) {
        this.endKilometers = this.startKilometers + driven;
        this.liters = liters;
    }


    public double getStartKilometers() {
        return startKilometers;
    }

    public void setStartKilometers(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double getEndKilometers() {
        return endKilometers;
    }

    public void setEndKilometers(double endKilometers) {
        this.endKilometers = endKilometers;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }


    public double calculateConsumption() {

        return (liters * 100 / (endKilometers - startKilometers));
    }

    public boolean isGasHog() {
        return (calculateConsumption() > 15);
    }

    public boolean isEconomyCar() {
        return (calculateConsumption() < 5);
    }
}
