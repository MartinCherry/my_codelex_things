package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car, Boost {
    private final String name;
    private Integer currentSpeed;

    public Mercedes(String name) {
        this.name = name;
        this.currentSpeed = 0;
    }

    @Override
    public void speedUp() {
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
    }

    @Override
    public String showCurrentSpeed() {
        return this.currentSpeed.toString();
    }

    @Override
    public void useNitrousOxideEngine() {
        this.currentSpeed += 50;
    }

    @Override
    public String toString() {
        return "Car: " + this.name + " with current speed " + this.currentSpeed;
    }

}
