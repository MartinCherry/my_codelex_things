package io.codelex.classesandobjects.practice.videostoreremade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoStoreTest {
    private static final List<Video> MOVIES = new ArrayList<>();
    private static final Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to list all video (as user)");
            System.out.println("Choose 5 to rate a video (as user)");
            System.out.println("Choose 9 to load default movie list");

            int n = Integer.parseInt(KEYBOARD.nextLine());

            System.out.println("\n");

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore();
                    break;
                case 2:
                    rentVideo();
                    break;
                case 3:
                    returnVideo();
                    break;
                case 4:
                    listMovies();
                    break;
                case 5:
                    rateVideo();
                    break;
                case 9:
                    fillDefault();
                    break;
                default:
                    wrongChoise();
                    break;
            }
        }
    }

    private static void fillVideoStore() {
        boolean addMovie = true;
        do {
            System.out.println("Enter movie name");
            String movieName = KEYBOARD.nextLine();
            System.out.println("Enter rating");
            int rating = Integer.parseInt(KEYBOARD.nextLine());
            addVideo(movieName, rating);

            System.out.println(movieName + " added to list!");
            System.out.println("Do more? y/n");
            String answer = KEYBOARD.nextLine();
            while ((!answer.equals("y")) && (!answer.equals("n"))) {
                System.out.println("Please check your answer. You need to choose y/n! ");
                answer = KEYBOARD.nextLine();
            }
            if (answer.equals("n")) {
                addMovie = false;
            }
        }
        while (addMovie);
    }

    private static void addVideo(String title, int rating) {
        Video newMovie = new Video(title, rating);
        MOVIES.add(newMovie);
    }

    private static void rentVideo() {
        System.out.println("Enter movie name to rent: ");
        String movieName = KEYBOARD.nextLine();
        Video forRent = findVideo(movieName);
        if (forRent != null) {
            forRent.rent();
            System.out.println(movieName + " is registered successfully as rented!");
        } else {
            System.out.println("Video can't be found.");
        }
    }

    private static void returnVideo() {
        System.out.println("Enter movie name to bring back: ");
        String movieName = KEYBOARD.nextLine();
        Video forBack = findVideo(movieName);
        if (forBack != null) {
            forBack.bringBack();
            System.out.println(movieName + " is registered successfully back in store!");
        } else {
            System.out.println("Video can't be found.");
        }
    }

    private static void rateVideo() {
        System.out.println("Enter movies name: ");
        String movieName = KEYBOARD.nextLine();
        Video movie = findVideo(movieName);
        if (movie != null) {
            System.out.println(movieName + " is found. Please enter your rating!");
            int rating = Integer.parseInt(KEYBOARD.nextLine());
            movie.rate(rating);
        } else {
            System.out.println("Movie couldn't be found! Please try again");
        }
    }

    private static void wrongChoise() {
        System.out.println("Wrong choise. Please chose 0-4!");
    }

    private static void listMovies() {
        for (Video movie : MOVIES) {
            System.out.println(movie);
        }
    }

    private static Video findVideo(String title) {
        for (Video movie : MOVIES) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }

    private static void fillDefault() {
        MOVIES.add(new Video("The Matrix"));
        MOVIES.add(new Video("Godfather II"));
        MOVIES.add(new Video("Star Wars Episode IV: A New Hope"));
        System.out.println("Movies loaded! \n");
    }
}
