package io.codelex.classesandobjects.examples;

public class Student {
    // Constants used by class (final keyword)
    public static final int MAX_STUDENT_COUNT = 20;
    private static int nextId = 1; // one value per class
    // Variables of which there is only one for a class
    private String name; // one value per instance
    private int id; // one value per instance

    public static int getNextId() {
        return nextId++;
    }
}
