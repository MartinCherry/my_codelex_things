package io.codelex.oop.practice.exercise4;

public enum Runner {

    BEGINNER,
    INTERMEDIATE,
    ADVANCED;

    public static Runner getRunnersLevel(int min) {
        if (min > 180) {
            return BEGINNER;
        } else if (min > 120 && min < 180) {
            return INTERMEDIATE;
        } else {
            return ADVANCED;
        }
    }
}
