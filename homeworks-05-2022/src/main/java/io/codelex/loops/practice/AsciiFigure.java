package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {


    private static final String LEFT_SIDE = "/";
    private static final String RIGHT_SIDE = "\\";
    private static final String MIDDLE = "*";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sideNumber = 0;
        int middleNumber = 0;
        int totalWidth = 0;

        System.out.print("How big tree you want? ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            totalWidth = (number - 1) * 8;
            middleNumber = i * 8;
            sideNumber = (totalWidth - middleNumber) / 2;
            System.out.println(LEFT_SIDE.repeat(sideNumber) + MIDDLE.repeat(middleNumber) + RIGHT_SIDE.repeat(sideNumber));
        }
    }
}
