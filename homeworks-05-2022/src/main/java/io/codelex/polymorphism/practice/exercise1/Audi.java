package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {

    private final String name;
    private Integer currentSpeed;

    public Audi(String name) {
        this.name = name;
        this.currentSpeed = 0;
    }

    @Override
    public void speedUp() {
        currentSpeed += 10;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }

    @Override
    public String showCurrentSpeed() {
        return this.currentSpeed.toString();
    }

    @Override
    public String toString() {
        return "Car: " + this.name + " with current speed " + this.currentSpeed;
    }

}
