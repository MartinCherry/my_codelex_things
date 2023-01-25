package io.codelex.oop.practice.exercise4;

public enum Runner {

    BEGINNER,
    INTERMEDIATE,
    ADVANCED;


    public static Runner getRunnersLevel(int minutes) {
        if (minutes > 320) {
            return BEGINNER;
        } else if (minutes > 180 && minutes < 320) {
            return INTERMEDIATE;
        } else {
            return ADVANCED;
        }
    }
}
