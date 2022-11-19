package io.codelex.collections.practice.phonebook;

public class Exercise9 {

    public static void main(String[] args) {

        PhoneDirectoryWithMapTree phoneDirectory = new PhoneDirectoryWithMapTree();
        phoneDirectory.putNumber("Martins", "23454");
        System.out.println(phoneDirectory.getNumber("Martins"));
    }
}
