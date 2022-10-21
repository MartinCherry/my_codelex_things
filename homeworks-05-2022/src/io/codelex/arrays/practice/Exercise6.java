package io.codelex.arrays.practice;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random randomer = new Random();

        int[] arrayOne = new int[10];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = randomer.nextInt(0, 101);
        }

        int[] arrayTwo = arrayOne.clone();

        arrayOne[arrayOne.length - 1] = -7;

        System.out.print("Array 1:");
        for (int num : arrayOne) {
            System.out.print(" " + num);
        }
        System.out.println();
        System.out.print("Array 2:");
        for (int num : arrayTwo) {
            System.out.print(" " + num);
        }
    }
}
