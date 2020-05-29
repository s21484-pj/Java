/*
    Life class
    Author: Maciej Leciejewski
 */
package com.company;

class Life extends Insurance {

    public Life() {
        super("life");
        setCost();
    }

    @Override
    public void setCost() {
        price = 36;
    }

    @Override
    public void display() {
        System.out.println("Life insurance costs: " + price + "$ per month.");
    }
}
