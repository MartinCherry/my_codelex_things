package io.codelex.secondtest.exercise3;

import java.util.ArrayList;
import java.util.List;

public class JoinerApp {

    public static void main(String[] args) {

        Joiner something = new Joiner("-");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);


        String result = something.join(integerList, 2);
        System.out.println(result);


    }
}
