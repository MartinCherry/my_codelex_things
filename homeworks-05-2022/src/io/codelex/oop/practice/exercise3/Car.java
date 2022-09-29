package io.codelex.oop.practice.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car {
    String name;
    String model;
    int price;
    int yearOfManufacture;
    List<Manufacturer> manufacturersList;
    EngineType engineType;

    public Car(String name, String model, int price, int yearOfManufacture, EngineType engineType, Manufacturer... manufacturers) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturersList = Arrays.stream(manufacturers).toList();
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(manufacturersList, car.manufacturersList) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturersList, engineType);
    }

    @Override
    public String toString() {
        return "Name:" + name + " Model:" + model + " Price:" + price + "EUR. Year of Manufactured:" + yearOfManufacture + ". All Manufacturers:" + manufacturersList + ". Engine Type:" + engineType;
    }
}
