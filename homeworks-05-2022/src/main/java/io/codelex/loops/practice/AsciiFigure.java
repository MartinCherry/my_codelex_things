package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String leftSide = "/";
    String rightSide = "\\";
    String middle = "*";
    int sideNumber = 0;
    int middleNumber = 0;
    int totalWidth = 0;

        System.out.print("How big tree you want? ");
        int number = input.nextInt();
        for (int i = 0; i<number;i++) {
            totalWidth = (number - 1) * 8;
            middleNumber = i * 8;
            sideNumber = (totalWidth-middleNumber)/2;
            System.out.println(leftSide.repeat(sideNumber) + middle.repeat(middleNumber) + rightSide.repeat(sideNumber));
        }






    }
}
