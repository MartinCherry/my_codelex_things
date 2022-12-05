package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private final String name;
    private Integer currentSpeed = 0;

    public Tesla(String name) {
        this.name = name;
        this.currentSpeed = 0;
    }

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 20;
    }

    @Override
    public String showCurrentSpeed() {
        return this.currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("-- silence ---");
    }

    @Override
    public String toString() {
        return "Car: " + this.name + " with current speed " + this.currentSpeed;
    }
}
