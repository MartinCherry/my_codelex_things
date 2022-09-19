package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double moneyEarned = 0;

        System.out.print("Enter your base pay: ");
        double baseSalary = input.nextDouble();
        while (baseSalary < 8) {
            System.out.println("Base salary can't be less than 8.00$ ");
            System.out.print("Enter your base pay: ");
            baseSalary = input.nextDouble();
        }
        System.out.print("Enter worked hours: ");
        int workedHours = input.nextInt();
        while (workedHours > 60) {
            System.out.println("Emploee can't work more than 60 hours!");
            System.out.print("Enter worked hours: ");
            workedHours = input.nextInt();
        }
        if (workedHours <= 40) {
            moneyEarned = baseSalary * workedHours;
            System.out.printf("Employee with hour rate %.2f $/hour have worked %d hours this week. Earned %.2f$", baseSalary, workedHours, moneyEarned);
        }
        if (workedHours > 40) {
            int overtimeHours = workedHours - 40;
            moneyEarned = (40 * baseSalary) + (overtimeHours * (baseSalary * 1.5));
            System.out.printf("Employee have worked %d hours this week. Base salary is %.2f $/hour. This week have overworked %d hours. Earned %.2f $", workedHours, baseSalary, overtimeHours, moneyEarned);
        }
    }
}
