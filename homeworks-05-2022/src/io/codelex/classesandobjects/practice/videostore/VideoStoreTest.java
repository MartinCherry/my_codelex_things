package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    static Video[] movies = new Video[COUNT_OF_MOVIES];

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        movies[0] = new Video("The Matrix", true, 6);
        movies[1] = new Video("GodFather", true, 6);
        movies[2] = new Video("StarWars", true, 6);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to list inventory");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    listInventory();
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.print("Enter movie name: ");
            String movieName = scanner.nextLine();
            System.out.println(movieName);
            System.out.print("Enter rating: ");
            double rating = Double.parseDouble(scanner.nextLine());

            System.out.println(rating);

            Video movie = new Video(movieName, true, rating);
            movies[i] = movie;

        }
        System.out.println();
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movie = scanner.nextLine().substring(1);

        for (int i = 0; i < movies.length; i++) {
            if (movie.equals(movies[i].getTitle())) {
                movies[i].rent();
                System.out.println("Movie is good to go");
                break;
            } else {
                System.out.println("Movie not found!");
            }
        }
        System.out.println();
    }

    private static void returnVideo(Scanner scanner) {

        System.out.println("Enter movie name");
        String movie = scanner.nextLine().substring(1);

        for (int i = 0; i < movies.length; i++) {
            if (movie.equals(movies[i].getTitle())) {
                movies[i].returning();
                System.out.println("Movie is returned successfully");
                break;
            } else {
                System.out.println("Movie not found!");
            }
        }
        System.out.println();
    }

    private static void listInventory() {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            String title = movies[i].getTitle();
            String avalable = movies[i].isAvailable() ? "Is available" : "Is not available";
            String raiting = String.valueOf(movies[i].getRating());
            System.out.println(title + ", " + avalable + ", " + raiting);
        }

        System.out.println();
    }
}
