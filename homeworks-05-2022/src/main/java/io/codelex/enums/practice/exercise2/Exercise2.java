package io.codelex.enums.practice.exercise2;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean gameEnded = false;
        int gameCount = 0;
        int playerWon = 0;
        int computerWon = 0;

        System.out.println("Let us begin!");
        while (!gameEnded) {
            System.out.println("Scissor-Paper-Stone");
            System.out.print("      Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
            String input = in.nextLine();
            if (input.toLowerCase().equals("q")) {
                gameEnded = true;
                gameEnd(gameCount, playerWon, computerWon);
                continue;
            }
            Sps playerChoise = Sps.valueOf(input.toUpperCase());
            Sps computerChoise = Sps.getSpsByValue(random.nextInt(3));
            System.out.println("        My turn: " + computerChoise.getName());
            if (playerChoise == Sps.S && computerChoise == Sps.T) {
                System.out.println("        You WON");
                playerWon++;
            }
            else if (playerChoise == Sps.T && computerChoise == Sps.P) {
                System.out.println("        You WON!!!");
                playerWon++;
            }
            else if (playerChoise == Sps.P && computerChoise == Sps.S) {
                System.out.println("        You WON!!!");
                playerWon++;
            }
            else if (playerChoise == computerChoise) {
                System.out.println("        TIE");
            }
            else {
                System.out.println("        You lost!");
                computerWon++;
            }
            gameCount++;
            System.out.println("");


        }
    }

    public static void gameEnd(int games, int playerWon, int computerWon) {
        System.out.println("");
        if (games > 0) {
            System.out.println("Number of games played: " + games);
            System.out.print("You won: " + playerWon + " (" + (playerWon * 100 / games) + "%). ");
            System.out.print("I won: " + computerWon + " (" + (computerWon * 100 / games) + "%). ");
            System.out.println("TIE: " + (games - playerWon - computerWon) + " (" + ((games - playerWon - computerWon) * 100 / games) + "%) ");
        }
        else {
            System.out.println("We didn't play any game!");
        }
        System.out.println("Bye!");


    }
}
