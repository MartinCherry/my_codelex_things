package io.codelex.oop.practice.exercise3;

import java.util.*;
import java.util.stream.Collectors;

public class CarService {

    List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void remove(Car car) {
        this.cars.remove(car);
    }

    public void listCars() {
        for (Car car : cars) {
            System.out.println(car.name);
        }
    }

    public List<Car> getEngine(EngineType engineType) {
        List<Car> carList = new ArrayList<>();
        for (Car car : cars) {
            if (car.engineType.equals(engineType)) {
                carList.add(car);
            }
        }

        return carList;
    }

    public void madeBefore(int year) {
        for (Car car : cars) {
            if (car.yearOfManufacture <= year) {
                System.out.println(car);
            }
        }
    }

    public Car mostExpensive() {
        int price = 0;
        int index = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).price > price) {
                price = cars.get(i).price;
                index = i;
            }
        }
        return cars.get(index);
    }

    public Car cheapest() {
        int price = cars.get(0).price;
        int index = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).price < price) {
                price = cars.get(i).price;
                index = i;
            }
        }
        return cars.get(index);
    }

    public List<Car> atleastThreeManufacturers() {
        return cars.stream().filter(car -> car.manufacturersList.size() >= 3).toList();
    }

    public List<Car> sort(String type) {
        List<Car> result = new ArrayList<>();
        if (type.equals("Ascending")) {
            result = cars.stream().sorted().toList();
        } else if (type.equals("Descending")) {
            result = cars.stream().sorted().collect(Collectors.toList());
        }

        return result;
    }

    public List<Car> findCar(String title) {
        List<Car> output = cars.stream().filter(car -> car.name.equals(title)).toList();
        return (output.size() > 0) ? output : null;
    }

    public List<Car> findManufacturers(Manufacturer title) {
        List<Car> output = cars.stream().filter(car -> car.manufacturersList.contains(title)).toList();
        return (output.size() > 0) ? output : null;
    }

}
