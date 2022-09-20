package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {


    private static final char[][] board = new char[3][3];
    private static char player = 'X';

    private static boolean gameOver = false;

    private static char winner;
    private static boolean isTie = false;


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean gameStarted = true;
        boolean firstPlayer = true;

        if (gameStarted) {
            initBoard();
            gameStarted = false;
        }
        displayBoard();
        while (!gameOver) {
            String[] in = keyboard.nextLine().split(" ");
            int X = Integer.parseInt(in[0]);
            int Y = Integer.parseInt(in[1]);

            while ((X < 0 || X > 2) || (Y < 0 || Y > 2)) {
                System.out.println("Coordinates out of bond");
                System.out.println("Enter correct coordinates: ");
                System.out.println();
                System.out.println("Now " + player + " turn");

                in = keyboard.nextLine().split(" ");
                X = Integer.parseInt(in[0]);
                Y = Integer.parseInt(in[1]);
            }

            while (board[X][Y] != ' ') {
                System.out.println("Field already taken!");
                System.out.println("Enter correct coordinates: ");
                System.out.println();
                System.out.println("Now " + player + " turn");
                in = keyboard.nextLine().split(" ");
                X = Integer.parseInt(in[0]);
                Y = Integer.parseInt(in[1]);
            }

            board[X][Y] = player;


            getWinner();

            getPlayer();
            displayBoard();
            getTie();

        }
        if (!isTie) {
            System.out.println("Game ended. " + winner + " WON!!!");
        } else {
            System.out.println("Game ended. TIE");
        }
    }


    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void getPlayer() {
        if (player == 'X') {
            player = 'Y';
        } else {
            player = 'X';
        }
    }

    public static void displayBoard() {

        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
        if (!gameOver) {
            System.out.println("'" + player + "' , choose your location (row, column):");
        }
//        System.out.println("Now " + player + " turn");
//        if (gameStarted && !gameOver) {
//            System.out.println("Game started. Please enter something");
//        }
    }

    public static void getWinner() {
        boolean hasWinner = false;
        //Rows
        if (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            hasWinner = true;
        } else if (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            hasWinner = true;
        } else if (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) {
            hasWinner = true;
        }
        //Columns
        else if (board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            hasWinner = true;
        } else if (board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            hasWinner = true;
        } else if (board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) {
            hasWinner = true;
        }
        //Diagonals
        else if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            hasWinner = true;
        } else if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            hasWinner = true;
        }
        if (hasWinner) {
            gameOver = true;
            winner = player;
        }
    }

    public static void getTie() {
        int freeFields = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != ' ') {
                    freeFields--;
                }
            }
        }
//        System.out.println(freeFields);
        if (freeFields == 0) {
            isTie = true;
        }
    }


}