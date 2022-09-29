package io.codelex.oop.practice.exercise9and10;

public class Cone extends Shape3D {

    int radius;
    int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public int calculatePerimeter() {
        throw new RuntimeException("Cone has no perimeter!");
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}
