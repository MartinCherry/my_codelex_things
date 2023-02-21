package io.codelex.generics.practice.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {


    public static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        if (list.stream().findFirst().get() instanceof String) {
            result = "String:";
            separator = " ";
        }
        else if (list.stream().findFirst().get() instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        else {
            return "Object unknown";
        }
        result = result + list.stream().map(Object::toString).collect(Collectors.joining(separator));

        return result;
    }
}
