package io.codelex.classesandobjects.practice.exercise2;

public class CarTesting {
    public static void main(String[] args) {
        int startOdo = 0;
        Car car = new Car(startOdo);


        //First fillUp
        car.fillUp(15, 7);
        System.out.println("First fill up - " + car.calculateConsumption());
        System.out.println("Started at - " + car.getStartKilometers() + " KM, Ended at " + car.getEndKilometers() + " KM. Filled up " + car.getLiters() + " liters.");
        car.setStartKilometers(car.getEndKilometers());
        //First fillUp
        car.fillUp(15, 9);
        System.out.println("Second fill up - " + car.calculateConsumption());
        System.out.println("Started at - " + car.getStartKilometers() + " KM, Ended at " + car.getEndKilometers() + " KM. Filled up " + car.getLiters() + " liters.");
        car.setStartKilometers(car.getEndKilometers());
        //First fillUp
        car.fillUp(15, 7);
        System.out.println("Third fill up - " + car.calculateConsumption());
        System.out.println("Started at - " + car.getStartKilometers() + " KM, Ended at " + car.getEndKilometers() + " KM. Filled up " + car.getLiters() + " liters.");
        car.setStartKilometers(car.getEndKilometers());
        //First fillUp
        car.fillUp(15, 12);
        System.out.println("Forth fill up - " + car.calculateConsumption());
        System.out.println("Started at - " + car.getStartKilometers() + " KM, Ended at " + car.getEndKilometers() + " KM. Filled up " + car.getLiters() + " liters.");
        car.setStartKilometers(car.getEndKilometers());


    }
}
