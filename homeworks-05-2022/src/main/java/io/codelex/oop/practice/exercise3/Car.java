package io.codelex.oop.practice.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Car {
    protected String name;
    protected int price;
    protected int yearOfManufacture;
    protected List<Manufacturer> manufacturersList;
    protected EngineType engineType;
    private final String model;

    public Car(String name, String model, int price, int yearOfManufacture, EngineType engineType,
               Manufacturer... manufacturers) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturersList = Arrays.stream(manufacturers).toList();
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacturersList() {
        return manufacturersList;
    }

    public void setManufacturersList(List<Manufacturer> manufacturersList) {
        this.manufacturersList = manufacturersList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this ==
                o) {
            return true;
        }
        if (!(o instanceof Car car)) {
            return false;
        }
        return yearOfManufacture ==
                car.yearOfManufacture &&
                Objects.equals(name, car.name) &&
                Objects.equals(model, car.model) &&
                Objects.equals(price, car.price) &&
                Objects.equals(manufacturersList, car.manufacturersList) &&
                engineType ==
                        car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturersList, engineType);
    }

    @Override
    public String toString() {
        return "Name:" +
                name +
                " Model:" +
                model +
                " Price:" +
                price +
                "EUR. Year of Manufactured:" +
                yearOfManufacture +
                ". All Manufacturers:" +
                manufacturersList +
                ". Engine Type:" +
                engineType;
    }
}
