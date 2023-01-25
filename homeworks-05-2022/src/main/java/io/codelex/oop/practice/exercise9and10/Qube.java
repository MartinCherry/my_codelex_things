package io.codelex.oop.practice.exercise9and10;

public class Qube extends Shape3D {

    private final int side;

    public Qube(int side) {
        this.side = side;
    }


    @Override
    public int calculatePerimeter() {
        return side * 6;
    }

    @Override
    public double calculateVolume() {
        return side * 3;
    }
}
