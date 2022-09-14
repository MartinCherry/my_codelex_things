package io.codelex.typesandvariables.practice;

public class SadFor {
    public static void main(String[] args) {
        System.out.println(test1());
    }

    public static int test1() {
//fixme
        int number = 0;
        for (int i = 0; i < 10; i++) {
            if (Math.sqrt(i) > 2.5) {
                number = i;
                break;
            }
        }
        return number;

//        throw new NoCodeWrittenException();
    }
}
