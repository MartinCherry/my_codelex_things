package io.codelex.classesandobjects.practice.videostore;

public class VideoTest {
    public static void main(String[] args) {
        Video video1 = new Video("Ilgais ceļš", true, 0);
        System.out.println(video1);
        video1.rate(5);
        System.out.println(video1);
        video1.rate(10);
        System.out.println(video1);
        video1.rent();
        System.out.println(video1);
        video1.returning();
        System.out.println(video1);

    }
}
