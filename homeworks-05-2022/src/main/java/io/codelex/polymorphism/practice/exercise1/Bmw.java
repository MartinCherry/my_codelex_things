package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private final String name;
    private Integer currentSpeed;

    public Bmw(String name) {
        this.name = name;
        this.currentSpeed = 0;
    }

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 12;
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
