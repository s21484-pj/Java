/*
    TestEmployee
    Author: Maciej Leciejewski
 */
package com.company;

public class TestEmployee {

    public static void main(String[] args) {

        Employee jan = new Employee(1234, "Jan", "Nowak", 6000);
        System.out.println(jan.getId());
        System.out.println(jan.getFirstName());
        System.out.println(jan.getLastName());
        System.out.println(jan.getSalary());
    }
}
