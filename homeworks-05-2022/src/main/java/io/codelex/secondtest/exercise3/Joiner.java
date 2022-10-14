package io.codelex.secondtest.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {


    String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public String join(List<T> listToJoin, Integer count) {
        return listToJoin.stream().limit(count).map(Object::toString).collect(Collectors.joining(seperator));
    }



}
