package io.codelex.classesandobjects.practice.exercise7;

import java.util.Objects;

public class Dog {
    String name;
    String sex;
    String mother;
    String father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public String fathersName() {
        return this.father != null ? this.father : "Unknown";
    }

    @Override
    public String toString() {
        return name + ", " + sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return Objects.equals(name, dog.name) && Objects.equals(sex, dog.sex) && Objects.equals(mother, dog.mother) && Objects.equals(father, dog.father);
    }

    public boolean hasSameMotherAs(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return Objects.equals(mother, dog.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, mother, father);
    }
}

