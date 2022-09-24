package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input number you want to multiply: ");
        long number = Long.parseLong(in.nextLine());

        System.out.print("Input number of times you want to multiply itself : ");
        long n = Long.parseLong(in.nextLine());
        long nBase = number;
//        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int i = 0; i < n; i++) {
            number *= nBase;
        }
        System.out.println(number);
    }
}
