package io.codelex.loops.practice;

import java.util.Scanner;
import java.util.Random;

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        boolean gameOver = false;

            while (!gameOver) {
                int dice = rand.nextInt(1,7);

                if (dice == 1) {
                    gameOver = true;
                    totalScore = 1;
                    System.out.println("You rolled " + dice);
                    System.out.println("You lost. You have 1 point!");
                }
                else {
                    totalScore += dice;
                    System.out.println("You rolled " + dice);
                    System.out.println("Your total score is " + totalScore);
                    System.out.println();
                    System.out.print("Want to roll again? y/n: ");
                    String answer = in.nextLine();
                    while (!answer.equals("y") && !answer.equals("n")) {
                        System.out.println("Wrong answer!");
                        System.out.print("Want to roll again? y/n: ");
                        answer = in.nextLine();
                    }
                   if (answer.equals("n")) {
                        gameOver = true;
                        System.out.println("You ended game. Your total score is "+totalScore);

                    }
                }
            }





    }

}