package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();
        if ((n >= Long.MIN_VALUE) && (n <= Long.MAX_VALUE)) {

            while (n < 0) {
                System.out.println("Number is not positive. Please enter positive number: ");
                n = in.nextLong();
            }
            if (n >= 1000000000L) {
                System.out.println("Number is more than billion.");
                return;
            }

            String number = Long.toString(n);

            System.out.println(number + " number has " + number.length() + " digits");
        } else {
            System.out.println("Number is not a Long number!");
        }
    }
}
