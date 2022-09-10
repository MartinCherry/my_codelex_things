package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int startNum = 1;

        System.out.print("Enter max value: ");
        int maxNum = Integer.parseInt(input.nextLine());

        boolean isTxt = false;

        for (int i = startNum; i<=maxNum; i++) {
            isTxt = false;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                isTxt = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                isTxt = true;
            }
//            if (i % 7 == 0) {
//                System.out.print("Woza");
//                isTxt = true;
//            }
            if (!isTxt) {
                System.out.print(i);
            }
            System.out.print(" ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
