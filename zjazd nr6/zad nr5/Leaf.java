/*
    Leaf class
    Author: Maciej Leciejewski
 */
package com.company;

public class Leaf implements Turner {

    @Override
    public void turn() {
        System.out.println("Changing colors");
    }
}
