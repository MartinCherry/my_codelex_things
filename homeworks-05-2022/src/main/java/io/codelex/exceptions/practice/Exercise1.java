package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int numerator;
        int divisor;

        while (true) {
            System.out.println("Enter the numerator");
            try {
                String input = scanner.nextLine();
                if (input.toLowerCase().equals("q")) {
                    System.exit(0);
                }
                numerator = Integer.parseInt(input);
            } catch (Exception e) {
                errorMessage();
                continue;
            }
            System.out.println("Enter the divisor");
            try {
                String input = scanner.nextLine();
                if (input.toLowerCase().equals("q")) {
                    System.exit(0);
                }
                divisor = Integer.parseInt(input);
            } catch (Exception e) {
                errorMessage();
                continue;
            }

            try {
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (Exception e) {
                System.out.println("Can't divide " + numerator + " by " + divisor);
            }
        }
    }

    private static void errorMessage() {
        System.out.println("You entered bad data");
        System.out.println("Please try again!");
    }
}
