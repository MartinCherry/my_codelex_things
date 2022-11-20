package io.codelex.generics.practice.exercise3;

public class MyClass<T> {
    T object;

    public MyClass(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return this.object.toString();
    }
}
