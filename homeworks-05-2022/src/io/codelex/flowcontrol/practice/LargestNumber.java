package io.codelex.flowcontrol.practice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] sort = new int[3];

        System.out.print("Input the 1st number: ");
        int num1 = Integer.parseInt(in.nextLine());
        sort[0] = num1;

        System.out.print("Input the 2nd number: ");
        int num2 = Integer.parseInt(in.nextLine());
        sort[1] = num2;

        System.out.print("Input the 3rd number: ");
        int num3 = Integer.parseInt(in.nextLine());
        sort[2] = num3;

        Arrays.sort(sort);


        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */

        System.out.println("Input the 1st number: " + sort[0]);
        System.out.println("Input the 2st number: " + sort[1]);
        System.out.println("Input the 3st number: " + sort[2]);
    }

}
