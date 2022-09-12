package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();

        while (n < 1) {
            System.out.println("Number is not positive. Please enter positive number: ");
            n = in.nextLong();
        }
        if (n >= 1000000000L) {
            System.out.println("Number is more than billion.");
            return;
        }

        String number = Long.toString(n);

        System.out.println(number + " number has "+ number.length() + " digits");


////        todo - check if Long
//        if (?) {
//            //todo - check if n is less than zero
//            if (?) {
//                n *= -1;
//            }
////            fixme
//            if (?) {
//                System.out.println("Number is greater or equals 10,000,000,000!");
//            }
//                System.out.println("Number of digits in the number: " + digits);
//            }
//        } else {
//            System.out.println("The number is not a long");
//        }

    }

}
