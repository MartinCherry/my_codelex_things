package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean available;
    private double rating;
    private int ratedTimes;

    public Video(String title, boolean available, double rating) {
        this.title = title;
        this.available = available;
        this.rating = rating;
        this.ratedTimes = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void rent() {
        this.available = false;
    }

    public void returning() {
        this.available = true;
    }

    public void rate(double rating) {
        this.rating = ((this.rating * ratedTimes) + rating) / (ratedTimes + 1);
        ratedTimes++;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", available=" + available +
                ", rating=" + rating +
                ", ratedTimes=" + ratedTimes +
                '}';
    }
}
