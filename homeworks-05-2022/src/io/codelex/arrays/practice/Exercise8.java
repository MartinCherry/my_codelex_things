package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    private final static Scanner in = new Scanner(System.in);
    private final static Random randomer = new Random();
    private final static String[] words = {"Better", "Beyond", "Bishop", "Border", "Bottle", "Bottom", "Bought", "Branch", "Breath",
            "Bridge", "Bright", "Broken", "Budget", "Burden", "Bureau", "Button", "Camera", "Cancer", "Cannot", "Carbon", "Career", "Castle", "Casual", "Caught", "Center", "Centre", "Chance", "Change", "Charge", "Choice", "Choose", "Chosen", "Church", "Circle", "Client", "Closed", "Closer", "Coffee", "Column", "Combat", "Coming", "Common", "Comply", "Copper", "Corner", "Costly", "County", "Couple", "Course", "Covers", "Create", "Credit", "Crisis", "Custom", "Damage", "Danger", "Dealer", "Debate", "Decade", "Decide", "Defeat", "Defend", "Define", "Degree", "Demand", "Depend", "Deputy", "Desert", "Design", "Desire", "Detail", "Detect", "Device", "Differ", "Dinner", "Direct", "Doctor", "Dollar", "Domain", "Double", "Driven", "Driver", "During", "Easily", "Eating", "Editor", "Effect", "Effort", "Eighth", "Either", "Eleven", "Emerge", "Empire", "Employ", "Enable", "Ending", "Energy", "Engage", "Engine", "Enough", "Ensure", "Entire", "Entity", "Equity", "Escape", "Estate", "Ethnic", "Exceed", "Except", "Excess", "Expand", "Expect", "Expert", "Export", "Extend", "Extent", "Fabric", "Facing", "Factor", "Failed", "Fairly", "Fallen", "Family", "Famous", "Father", "Fellow", "Female", "Figure", "Filing", "Finger", "Finish", "Fiscal", "Flight", "Flying", "Follow", "Forced", "Forest", "Forget", "Formal", "Format", "Former", "Foster", "Fought", "Fourth", "French", "Friend", "Future", "Garden", "Gather", "Gender", "German", "Global", "Golden", "Ground", "Growth", "Guilty", "Handed", "Handle", "Happen", "Hardly", "Headed", "Health", "Height", "Hidden", "Holder", "Honest", "Impact", "Import", "Income", "Indeed", "Injury", "Inside", "Intend", "Intent", "Invest", "Island", "Itself", "Jersey", "Joseph", "Junior", "Killed", "Labour", "Latest", "Latter", "Launch", "Lawyer", "Leader", "League", "Leaves", "Legacy", "Length", "Lesson", "Letter", "Lights", "Likely", "Linked", "Liquid", "Listen", "Little", "Living", "Losing", "Lucent"};
    private static int wordChoose;
    private static String wordForPlay;
    private static String[] wordToPlayWith;
    private static int lives;
    private static String misses;
    private static boolean gameOver;
    private static boolean connected = true;
    private static boolean haveWon;

    public static void main(String[] args) {

        initialize();

        while (connected) {
            while (!gameOver) {

                playGame();

            }
            if (!haveWon) {
                System.out.println("Game over! You lost \n");

            }
            else {
                System.out.println("You won!!!");
                System.out.println("Word was: " + wordForPlay + "\n");

            }
            System.out.print("Do you want to play again? y/n: ");
            String answer = in.nextLine();

            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.print("Please give correct answer. y/n?: ");
                answer = in.nextLine();
            }
            if (answer.equals("y")) {
                initialize();
            }
            else if (answer.equals("n")) {
                connected = false;
//                System.exit(0);
            }
        }


    }

    private static void playGame() {
        System.out.println("-" + "=-".repeat(20));
        System.out.println("Lives left: " + lives);
        System.out.print("Word to guess: ");
        for (String s : wordToPlayWith) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        System.out.print("Misses: " + misses);
        System.out.println("\n");
        System.out.print("Guess: ");
        char guess = in.next().toLowerCase().charAt(0);
        int found = 0;
        for (int i = 0; i < wordForPlay.length(); i++) {

            if (guess == wordForPlay.toLowerCase().charAt(i)) {
                wordToPlayWith[i] = Character.toString(guess).toLowerCase();
                found++;
            }
        }

        if (found == 0) {
            misses += Character.toString(guess);
            lives--;
        }
        if (wordForPlay.toLowerCase().equals(String.join("", wordToPlayWith))) {
            haveWon = true;
            gameOver = true;
            System.out.println();
        }
        else if (lives < 0) {
            gameOver = true;
        }
    }

    private static void initialize() {
        wordChoose = randomer.nextInt(0, words.length);
        wordForPlay = words[wordChoose];
        wordToPlayWith = wordForPlay.replaceAll("[A-Za-z]", "_").split("");
        lives = 1;
        misses = "";
        gameOver = false;
        haveWon = false;

    }


}



