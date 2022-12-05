package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boost {
    private final String name;
    private Integer currentSpeed;

    public Lexus(String name) {
        this.name = name;
        this.currentSpeed = 0;
    }

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
    }

    @Override
    public String showCurrentSpeed() {
        return this.currentSpeed.toString();
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public String toString() {
        return "Car: " + this.name + " with current speed " + this.currentSpeed;
    }
}
