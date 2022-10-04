package io.codelex.enums.practice.exercise1;

public enum Directions {
    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    final String output;

    Directions(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

}
