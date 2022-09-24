package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise05 {

    private static final int TOTAL_WIDTH = 30;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first word ");
        String firstWord = input.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = input.nextLine();

        System.out.println(firstWord + ".".repeat(TOTAL_WIDTH - firstWord.length() - secondWord.length()) + secondWord);
    }
}
