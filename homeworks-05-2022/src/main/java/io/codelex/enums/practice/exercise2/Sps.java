package io.codelex.enums.practice.exercise2;

public enum Sps {
    S("SCISSORS"),
    P("PAPER"),
    T("STONE");

    final String name;


    Sps(String letter) {
        this.name = letter;
    }

    public String getName() {
        return name;
    }

    public static Sps getSpsByValue(int value) {
        return Sps.values()[value];
    }


}
