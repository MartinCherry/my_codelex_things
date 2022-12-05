package io.codelex.polymorphism.practice.exercise3;

public class Exercise3 {

    public static void main(String[] args) {
    Student student = new Student("John", "Bush", "Brivibas street 12", 123, 46);
    Employee employee = new Employee("Peter", "Smith", "Gertrudes street 12", 123, "Teacher");

    student.display();
    employee.display();
    }



}
