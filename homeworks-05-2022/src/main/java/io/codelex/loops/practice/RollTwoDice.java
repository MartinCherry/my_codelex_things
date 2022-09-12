package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomer = new Random();

        System.out.print("Enter desired number 2-12: ");
        int playerNumber = input.nextInt();
        while (playerNumber < 2 || playerNumber > 12) {
            System.out.print("Please enter valid number 2-12: ");
            playerNumber = input.nextInt();
        }
        int sum = 0;
        int numberOfTries = 0;

        while (playerNumber != sum) {
            int a = randomer.nextInt(1, 7);
            int b = randomer.nextInt(1, 7);
            sum = a + b;
            numberOfTries++;
            System.out.println(numberOfTries +"| "+ a + " and " +b+" = "+ sum);

        }

    }
}
