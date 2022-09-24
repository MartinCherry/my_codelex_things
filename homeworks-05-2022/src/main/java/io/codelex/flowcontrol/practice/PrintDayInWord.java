package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of day: ");
        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("1. Day is Monday");
            case 2 -> System.out.println("2. Day is Tuesday");
            case 3 -> System.out.println("3. Day is Wednesday");
            case 4 -> System.out.println("4. Day is Thursday");
            case 5 -> System.out.println("5. Day is Friday");
            case 6 -> System.out.println("6. Day is Saturday");
            case 7 -> System.out.println("7. Day is Sunday");
            default -> System.out.println("Not valid day number");
        }
    }
}
