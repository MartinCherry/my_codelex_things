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

        initBoard();
        displayBoard();
        while (!gameOver) {
            String[] in = keyboard.nextLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);

            while ((x < 0 || x > 2) || (y < 0 || y > 2)) {
                System.out.println("Coordinates out of bond");
                System.out.println("Enter correct coordinates: ");
                System.out.println();
                System.out.println("Now " + player + " turn");
                in = keyboard.nextLine().split(" ");
                x = Integer.parseInt(in[0]);
                y = Integer.parseInt(in[1]);
            }

            while (board[x][y] != ' ') {
                System.out.println("Field already taken!");
                System.out.println("Enter correct coordinates: ");
                System.out.println();
                System.out.println("Now " + player + " turn");
                in = keyboard.nextLine().split(" ");
                x = Integer.parseInt(in[0]);
                y = Integer.parseInt(in[1]);
            }

            board[x][y] = player;

            gameOver = getWinner();

            getPlayer();
            displayBoard();
            isTie = getTie();

        }
        if (!isTie) {
            System.out.println("Game ended. " + winner + " WON!!!");
        }
        else {
            System.out.println("Game ended. TIE");
        }
    }


    private static void initBoard() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    private static void getPlayer() {
        if (player == 'X') {
            player = 'Y';
        }
        else {
            player = 'X';
        }
    }

    private static void displayBoard() {

        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
        if (!gameOver) {
            System.out.println("'" + player + "' , choose your location (row, column):");
        }
    }

    private static boolean getWinner() {
        if (checkRows()) {
            winner = player;
            return true;
        }
        else if (checkColumns()) {
            winner = player;
            return true;
        }
        else if (checkDiagonals()) {
            winner = player;
            return true;
        }
        return false;
    }

    private static boolean checkRows() {
        if (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) {
            return true;
        }
        else if (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) {
            return true;
        }
        else
            return board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2];
    }

    private static boolean checkColumns() {
        if (board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) {
            return true;
        }
        else if (board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) {
            return true;
        }
        else
            return board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2];
    }

    private static boolean checkDiagonals() {

        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        else
            return board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0];
    }

    public static boolean getTie() {
        int freeFields = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != ' ') {
                    freeFields--;
                }
            }
        }
        return freeFields == 0;
    }


}