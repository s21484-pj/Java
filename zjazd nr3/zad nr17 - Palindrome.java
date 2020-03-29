/*
    Palindrome
    Author: Maciej Leciejewski
 */
package com.company;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz wyraz, ktory chcesz sprawdzic, czy jest palindromem: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.print("To jest palindrom");
        } else System.out.print("To nie jest palindrom");
    }

    static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        word = word.replaceAll("[,. ]", "");
        int x = 0;
        int y = word.length() - 1;

        while (x < y) {
            if (word.charAt(x) != word.charAt(y)) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
}
