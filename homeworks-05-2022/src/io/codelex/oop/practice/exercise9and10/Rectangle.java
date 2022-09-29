package io.codelex.oop.practice.exercise9and10;

public class Rectangle extends Shape {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculatePerimeter() {
        return (this.sideA * 2) + (this.sideB * 2);
    }
}
