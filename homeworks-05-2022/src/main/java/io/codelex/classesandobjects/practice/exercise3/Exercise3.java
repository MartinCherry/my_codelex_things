package io.codelex.classesandobjects.practice.exercise3;

public class Exercise3 {
    public static void main(String[] args) {

        Odometer odometer = new Odometer(999976);
        FuelGauge fuelGauge = new FuelGauge(0);

        int littersToFill = 80;
        int distanceToDrive = 1000;

        for (int i = 0; i < littersToFill; i++) {
            fuelGauge.fillUp(1);
            System.out.println(fuelGauge.getFuel());
        }
        for (int i = 0; i < distanceToDrive; i++) {
            if (fuelGauge.getFuel() > 0) {
                odometer.drive(1);
                fuelGauge.drive(1);
            }
            System.out.println(odometer.getMileage());
            System.out.println(fuelGauge.getFuel());
        }
    }
}
