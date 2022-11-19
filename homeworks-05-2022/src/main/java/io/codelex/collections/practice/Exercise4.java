package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<String> enteredNames = new HashSet<>();
        String inputText = "a";

        while (!inputText.equals("")) {
            System.out.print("Enter name: ");
            inputText = in.nextLine();
            enteredNames.add(inputText);
        }

        System.out.println("Unique name list contains: " + String.join(" ", enteredNames));
    }
}
