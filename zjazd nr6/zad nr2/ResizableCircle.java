/*
    ResizableCircle class
    Author: Maciej Leciejewski
 */
package com.company;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100;
    }
}
