package io.codelex.classesandobjects.practice.exercise4;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String raiting) {
        this.title = title;
        this.studio = studio;
        this.rating = raiting;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }


    public Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[index] = movie;
                index++;
            }
        }
        return pgMovies;
    }
}
