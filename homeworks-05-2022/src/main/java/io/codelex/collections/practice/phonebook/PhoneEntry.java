package io.codelex.collections.practice.phonebook;

import java.util.Objects;

public class PhoneEntry {
    protected String name;
    protected String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneEntry that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getNumber(), that.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString() {
        return "PhoneEntry{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
