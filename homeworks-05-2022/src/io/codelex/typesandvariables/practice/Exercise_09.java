package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_09 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Take distance
        System.out.print("Enter distance in meters: ");
        double distance = input.nextDouble();

        //Take hours
        System.out.print("Enter hours: ");
        int hours = input.nextInt();
        while (hours > 23) {
            System.out.println(ANSI_RED + "Incorrect hours count. Hours should be less than 24" + ANSI_RESET);
            System.out.print("Enter hours: ");
            hours = input.nextInt();
        }

        //Take Minutes
        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        //Check minutes
        while (minutes > 59) {
            System.out.println(ANSI_RED + "Incorrect minutes count. Minutes should be less than 60" + ANSI_RESET);
            System.out.print("Enter minutes: ");
            minutes = input.nextInt();
        }

        //Take seconds
        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();

        //Check seconds
        while (seconds > 59) {
            System.out.println(ANSI_RED + "Incorrect seconds count. Seconds should be less than 60" + ANSI_RESET);
            System.out.print("Enter seconds: ");
            seconds = input.nextInt();
        }

        //Make calculations
        double metersPerSeconds = (distance / (((hours * 60 * 60) + (minutes * 60) + seconds)) );
        double kmPerHours = (metersPerSeconds * 3.6);
        double milesPerHour = (kmPerHours * 0.6213711922);

        //Output
        System.out.println("You entered "+distance+" m. And you made it in: "+hours+":"+minutes+":"+seconds);
        System.out.printf("Your m/s is %.2f.", metersPerSeconds);
        System.out.println();
        System.out.printf("Your km/h is %.2f.", kmPerHours);
        System.out.println();
        System.out.printf("Your miles/h is %.2f.", milesPerHour);
    }
}
