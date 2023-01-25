package io.codelex.classesandobjects.practice.exercise9;

public class Exercise9 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    static void swapPoints(Point p1, Point p2) {
        int tempX1 = p1.x;
        int tempY1 = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = tempX1;
        p2.y = tempY1;
    }
}
