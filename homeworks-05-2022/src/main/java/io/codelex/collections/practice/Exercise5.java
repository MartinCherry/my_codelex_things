package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter number for test: ");
        int input = Integer.parseInt(in.nextLine());
        int result = input;

        while (result != 1 && result != 4) {
            result = checkIfHappy(result);
        }

        String outputText = (result == 1) ? " Happy" : " Not happy";
        System.out.println(input + outputText);
    }

    public static int checkIfHappy(int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum = sum + (temp * temp);
            num = num / 10;
        }
        return sum;
    }
}
