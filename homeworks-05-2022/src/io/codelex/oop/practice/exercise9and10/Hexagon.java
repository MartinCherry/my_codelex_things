package io.codelex.oop.practice.exercise9and10;

public class Hexagon extends Shape {
    int side;

    public Hexagon(int side) {
        this.side = side;
    }


    @Override
    public int calculatePerimeter() {
        return this.side * 6;
    }
}
