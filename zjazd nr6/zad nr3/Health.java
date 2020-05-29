/*
    Health class
    Author: Maciej Leciejewski
 */
package com.company;

class Health extends Insurance{

    public Health() {
        super("health");
        setCost();
    }

    @Override
    public void setCost() {
        price = 196;
    }

    @Override
    public void display() {
        System.out.println("Health insurance costs: " + price + "$ per month.");
    }
}
