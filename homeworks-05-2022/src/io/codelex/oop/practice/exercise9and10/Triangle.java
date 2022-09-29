package io.codelex.oop.practice.exercise9and10;

public class Triangle extends Shape {

    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public int calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
