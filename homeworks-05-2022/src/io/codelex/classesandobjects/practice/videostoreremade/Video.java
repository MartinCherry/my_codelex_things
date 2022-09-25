package io.codelex.classesandobjects.practice.videostoreremade;

import java.util.Objects;

public class Video {
    private String title;
    private boolean available;
    private double rating;
    private int ratedTimes;


    public Video(String title, int rating) {
        this.title = title;
        this.available = true;
        this.rating = rating;
        this.ratedTimes = 0;
    }

    public Video(String title) {
        this.title = title;
        this.available = true;
        this.rating = 5;
        this.ratedTimes = 0;
    }


    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private boolean isAvailable() {
        return available;
    }

    private void setAvailable(boolean available) {
        this.available = available;
    }

    private double getRating() {
        return rating;
    }

    private void setRating(double raiting) {
        this.rating = raiting;
    }

    public void rent() {
        this.available = false;
    }

    public void bringBack() {
        this.available = true;
    }

    public void rate(double rating) {
        this.rating = ((this.rating * ratedTimes) + rating) / (ratedTimes + 1);
        ratedTimes++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video video)) return false;
        return isAvailable() == video.isAvailable() && Double.compare(video.getRating(), getRating()) == 0 && Objects.equals(getTitle(), video.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), isAvailable(), getRating());
    }

    @Override
    public String toString() {
        return
                "Title: " + title + ", is available: " + available + ", rating: " + rating;
    }
}
