package io.codelex.loops.practice;

import java.util.Scanner;

public class Excercise_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalWidth = 30;

        System.out.print("Enter first word ");
        String firstWord = input.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = input.nextLine();

        System.out.println(firstWord + ".".repeat(totalWidth - firstWord.length() - secondWord.length()) + secondWord);

    }
}
