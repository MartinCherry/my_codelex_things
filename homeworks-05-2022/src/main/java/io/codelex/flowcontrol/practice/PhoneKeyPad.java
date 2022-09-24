package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some word: ");
        String number = input.nextLine().toLowerCase();

        for (int i = 0; i < number.length(); i++) {
            String ch = number.substring(i, i + 1);
            switch (ch) {
                case "a", "b", "c" -> System.out.print(2);
                case "d", "e", "f" -> System.out.print(3);
                case "g", "h", "i" -> System.out.print(4);
                case "j", "k", "l" -> System.out.print(5);
                case "m", "n", "o" -> System.out.print(6);
                case "p", "q", "r", "s" -> System.out.print(7);
                case "t", "u", "v" -> System.out.print(8);
                case "w", "x", "y", "z" -> System.out.print(9);
                case " " -> System.out.print(0);
                case "#" -> System.out.print("#");
                case "*" -> System.out.print("*");
                default -> System.out.print(1);
            }
        }
    }
}
