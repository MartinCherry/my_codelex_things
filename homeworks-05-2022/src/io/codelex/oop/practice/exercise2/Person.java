package io.codelex.oop.practice.exercise2;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    private final String id;
    private final String age;

    public Person(String firstName, String lastName, String id, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public abstract String getInfo();
}
