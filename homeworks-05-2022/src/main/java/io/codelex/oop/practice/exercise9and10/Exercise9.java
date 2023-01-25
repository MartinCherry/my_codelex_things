package io.codelex.oop.practice.exercise9and10;

public class Exercise9 {


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(5, 7, 9);
        Hexagon hexagon = new Hexagon(8);

        Qube qube = new Qube(10);
        Cone cone = new Cone(5, 20);

        System.out.println("Perimeter of rectangle: " + rectangle.calculatePerimeter() + " cm");
        System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter() + " cm");
        System.out.println("Perimeter of hexagon: " + hexagon.calculatePerimeter() + " cm");

        System.out.println("Perimeter of qube: " + qube.calculatePerimeter() + " cm");
        System.out.println("Volume of qube: " + qube.calculateVolume() + " m3");

        System.out.println("Perimeter of qube: " + cone.calculatePerimeter() + " cm");
        System.out.println("Perimeter of qube: " + cone.calculateVolume() + " m3");
    }
}
