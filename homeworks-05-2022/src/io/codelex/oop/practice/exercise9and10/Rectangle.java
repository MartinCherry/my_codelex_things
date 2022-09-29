package io.codelex.oop.practice.exercise9and10;

public class Rectangle extends Shape {
    int sideA;
    int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int calculatePerimeter() {
        return (this.sideA * 2) + (this.sideB * 2);
    }
}
