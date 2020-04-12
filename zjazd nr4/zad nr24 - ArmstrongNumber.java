/*
    Write class to check if a number is Armstrong number or not
    Author: Maciej Leciejewski
 */
package com.company;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int originalNumber;
        int remainder;
        int result = 0;
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        }
        else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
