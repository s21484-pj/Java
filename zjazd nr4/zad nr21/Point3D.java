/*
    UML Point3D class
    Author: Maciej Leciejewski
 */
package com.company;

import java.util.Arrays;
import java.util.List;

public class Point3D extends Point2D {

    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public List getXYZ() {
        return Arrays.asList(getX() , getY(), getZ());
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
