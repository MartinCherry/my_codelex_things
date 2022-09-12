package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        int choice; // The user's menu choice

        do {
            // Get the user's menu choice.
            choice = getMenu();

            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }

        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        // keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // get input from user
        userChoice = keyboard.nextInt();

        // validate input
        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateCircleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");
        //todo
        double radiusInput = keyboard.nextDouble();
        while (radiusInput < 0) {
            System.out.println("Number can't be negative!");
            System.out.print("Please enter correct circle's radius: ");
            radiusInput = keyboard.nextDouble();
        }
        // Display output
        System.out.printf("The circle's area is %.2f. ", Geometry.areaOfCircle(radiusInput));
        System.out.println();
    }

    public static void calculateRectangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get length
        System.out.print("Enter length? ");
        //todo
        double lengthInput = keyboard.nextDouble();
        while (lengthInput < 0) {
            System.out.println("Number can't be negative!");
            System.out.print("Please enter correct length: ");
            lengthInput = keyboard.nextDouble();
        }

        // Get width
        System.out.print("Enter width? ");
        //todo
        double widthInput = keyboard.nextDouble();

        while (widthInput < 0) {
            System.out.println("Number cant be negative!");
            System.out.print("Enter correct width: ");
            widthInput = keyboard.nextDouble();
        }


        // Display output
        System.out.printf("The rectangle's area is %.2f.", Geometry.areaOfRectangle(lengthInput, widthInput));
        System.out.println();
    }

    public static void calculateTriangleArea() {

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        // Get the base
        System.out.print("Enter length of the triangle's base? ");
        //todo
        double baseInput = keyboard.nextDouble();
        while (baseInput < 0) {
            System.out.println("Number can't be negative!");
            System.out.print("Please enter correct length of the triangle's base: ");
            baseInput = keyboard.nextDouble();
        }

        // Get the height
        System.out.print("Enter triangle's height? ");
        //todo
        double heightInput = keyboard.nextDouble();
        while (heightInput < 0) {
            System.out.println("Number can't be negative!");
            System.out.print("Please enter correct triangle's height: ");
            heightInput = keyboard.nextDouble();
        }


        // Display the triangle's area.
        System.out.printf("The triangle's area is %.2f.", Geometry.areaOfTriangle(baseInput, heightInput));
        System.out.println();
    }
}
