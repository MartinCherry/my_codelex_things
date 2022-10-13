package io.codelex.generics.practice.exercise3;

public class MyChildClass<T> extends MyClass {


    public MyChildClass(Object object) {
        super(object);
    }

    @Override
    public String toString() {
        return this.object.toString();
    }
}
