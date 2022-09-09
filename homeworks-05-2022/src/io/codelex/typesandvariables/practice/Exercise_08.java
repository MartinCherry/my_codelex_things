package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes for counting: ");
        long minutes = input.nextLong();

        long yearMinutes = 60 * 24 * 365;
        long days = (minutes / 60 / 24) % 365;
        long years = minutes / yearMinutes;

        System.out.println(minutes + " minutes is " + years + " years and " + days + " days");

    }
}
