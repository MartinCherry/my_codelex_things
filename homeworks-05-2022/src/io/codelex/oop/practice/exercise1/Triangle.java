package io.codelex.oop.practice.exercise1;

public class Triangle extends Shape {
    double width;
    double height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        return ((this.height * this.width) / 2);

    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(this.height, 2) + Math.pow((this.width / 2), 2));
        return (side * 2) + this.width;

    }
}
