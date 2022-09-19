package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter digit:");
        int a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number " + a + " is Even");
        } else {
            System.out.println("Number " + a + " is Odd");
        }
        System.out.println("bye!");

    }


}
