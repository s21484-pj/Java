/*
    Human - zad.5
    Author: Maciej Leciejewski
 */
package com.company;

public class Human {

    public int Age;
    public double Weight;
    public double Height;
    public String Name;
    public String Sex;
    public int IndexNumber;
    public double FeetSize;

    public static void main(String[] args) {

        Human human = new Human(23, 70, 185, "Maciek", "Male", 21484, 43);
    }

    public Human(int age, double weight, double height, String name, String sex, int indexnumber, double feetsize) {
        Age = age;
        Weight = weight;
        Height = height;
        Name = name;
        Sex = sex;
        IndexNumber = indexnumber;
        FeetSize = feetsize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.Weight = weight;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.Height = height;
    }

    public int getName(){
        return name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public boolean isMale(){
        return true;
    }

    public void isMale(String sex) {
        this.Sex = sex;
    }

    public int getIndexNumber(){
        return indexnumber;
    }

    public void setIndexNumber(int indexnumber) {
        this.IndexNumber = indexnumber;
    }

    public int getFeetSize(){
        return feetsize;
    }

    public void setFeetSize(double feetsize) {
        this.FeetSize = feetsize;
    }
}
