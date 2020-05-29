/*
    Insurance abstract class
    Author: Maciej Leciejewski
 */
package com.company;

abstract class Insurance {

    protected String type;
    protected double price;

    public Insurance(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    abstract public void setCost();
    abstract public void display();
}
