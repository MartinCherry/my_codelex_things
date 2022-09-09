package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {

        Random randomer = new Random();
        Scanner input = new Scanner(System.in);

        int maxNum = 100;
        int numToGuess = randomer.nextInt(maxNum);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int userNumber = input.nextInt();

        if (numToGuess == userNumber) {
            System.out.println("You guessed it!  What are the odds?!?");
        }
        else if (userNumber < numToGuess) {
            System.out.println("Sorry, you are too low.  I was thinking of " + numToGuess);
        } else {
            System.out.println("Sorry, you are too high.  I was thinking of " + numToGuess);
        }


    }
}
