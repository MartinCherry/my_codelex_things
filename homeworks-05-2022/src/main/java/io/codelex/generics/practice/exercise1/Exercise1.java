package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1<T> {
    List<T> exercise1List = new ArrayList<>();

    public void add(int i, T el) {
        exercise1List.add(i, el);
    }


    public T get(int i) {
        return exercise1List.get(i);
    }

    @Override
    public String toString() {
        return exercise1List.toString();
    }
}
