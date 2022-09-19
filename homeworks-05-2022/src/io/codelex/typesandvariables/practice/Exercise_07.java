package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        String nameInput = input.nextLine();

        int numberOfUpperCase = 0;
        for (int i = 0; i < nameInput.length(); i++) {
            char ch = nameInput.charAt(i);
            if (Character.isUpperCase(ch)) {
                numberOfUpperCase++;
            }
        }
        System.out.println("Entered name has " + numberOfUpperCase + " uppercase letters.");

    }
}
