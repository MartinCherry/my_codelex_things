package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean check = false;

        System.out.print("Enter first digit: ");
        int a = input.nextInt();
        System.out.print("Enter second digit: ");
        int b = input.nextInt();

        if ((a == 15 || b == 15) || ((a + b) == 15) || ((a - b) == 15 || (b - a) == 15)) {
            check = true;
        }
        System.out.println(check);
    }
}
