/*
    DemoTurners2 class
    Author: Maciej Leciejewski
 */
package com.company;

public class DemoTurners2 {

    public static void main(String[] args) {

        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        Map map = new Map();
        ComputerGame computerGame = new ComputerGame();

        leaf.turn();
        page.turn();
        pancake.turn();
        map.turn();
        computerGame.turn();
    }
}
