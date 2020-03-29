/*
    TestTime
    Author: Maciej Leciejewski
 */
package com.company;

public class TestTime {

    public static void main(String[] args) {

        Time time = new Time(16,06,06);
        System.out.println(time.toString());
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
        System.out.println(time.previousSecond());
    }
}
