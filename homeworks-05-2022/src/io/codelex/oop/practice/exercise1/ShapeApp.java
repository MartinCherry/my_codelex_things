package io.codelex.oop.practice.exercise1;

public class ShapeApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getNumSides());

        Triangle triangle = new Triangle(3, 6, 4);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getNumSides());

    }
}
