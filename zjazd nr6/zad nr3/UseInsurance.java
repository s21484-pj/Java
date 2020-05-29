/*
    UseInsurance class
    Author: Maciej Leciejewski
 */
package com.company;

import java.util.Scanner;

public class UseInsurance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Which one insurance you want to display ?");
        System.out.println("1. health");
        System.out.println("2. life");
        int choose = sc.nextInt();
        if (choose == 1) {
            Health health = new Health();
            health.display();
        }
        else if (choose == 2) {
            Life life = new Life();
            life.display();
        }
        else
            System.out.println("Error");
    }
}
