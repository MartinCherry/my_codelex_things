package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.nextLine();
        System.out.println("Enter your year of birth");
        int year = in.nextInt();

        System.out.println("My name is " + name + " and I was born in " + year + ".");
    }
}
