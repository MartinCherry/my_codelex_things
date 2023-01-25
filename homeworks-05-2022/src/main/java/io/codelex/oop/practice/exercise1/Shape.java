package io.codelex.oop.practice.exercise1;

public abstract class Shape {
    private final int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
