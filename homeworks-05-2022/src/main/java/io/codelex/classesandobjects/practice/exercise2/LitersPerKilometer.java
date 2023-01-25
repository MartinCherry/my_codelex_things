package io.codelex.classesandobjects.practice.exercise2;

import java.util.Scanner;

public class LitersPerKilometer {

    public static void main(String[] args) {

        Car car1 = getCarData();
        Car car2 = getCarData();

        System.out.println(car1.isGasHog());
        System.out.println(car1.isEconomyCar());
        System.out.println(car2.isGasHog());
        System.out.println(car2.isEconomyCar());


//        car.fillUp(endKilometers, liters);

//        System.out.println("Liters per 100km are " + car.calculateConsumptionLitersPerHundred());
//        System.out.println("Kilometers per liter are " + car.calculateConsumptionKmPerLiter());
//
//
//        Car car2 = new Car(12);
//        car2.fillUp(20, 4);
//        double car2consupmtion = car2.calculateConsumptionKmPerLiter();
//
//
//        System.out.println(car2consupmtion);
//        System.out.println(car2.isGasHog());
//        System.out.println(car2.isEconomyCar());
    }

    private static Car getCarData() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter start odometer reading: ");
        double startKilometers = scan.nextDouble();

        System.out.print("Enter end odometer reading: ");
        double endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        double liters = scan.nextDouble();

        return new Car(startKilometers, endKilometers, liters);
    }


}
