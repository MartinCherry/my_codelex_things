package io.codelex.oop.practice.exercise1;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {

        return (this.height * 2 + this.width * 2);
    }
}
