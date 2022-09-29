package io.codelex.oop.practice.exercise2;

public class PersonApp {

    public static void main(String[] args) {

        Employee employee = new Employee("John", "Bash", "12345", "49", "Manager", "2012-08-09");
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Martin", "Cherry", "225287", "25", "ID11562", 24);
        System.out.println(customer.getInfo());
    }
}
