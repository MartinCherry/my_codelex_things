package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectoryWithMapTree extends PhoneEntry {

    private TreeMap<String, String> data = new TreeMap<>();


    public PhoneDirectoryWithMapTree() {
        data = new TreeMap<>();
    }

    public String getNumber(String name) {
        return data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        data.put(name, number);
    }

}
