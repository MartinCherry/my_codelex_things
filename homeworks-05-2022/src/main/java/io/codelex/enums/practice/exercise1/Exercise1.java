package io.codelex.enums.practice.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(Directions.NORTH.getOutput());
        System.out.println(Directions.WEST.getOutput());
        System.out.println(Directions.EAST.getOutput());
        System.out.println(Directions.SOUTH.getOutput());
        
        for (Directions direction : Directions.values()) {
            System.out.println(direction + ":" + direction.getOutput() + ":" + direction.ordinal());
        }
    }
}
