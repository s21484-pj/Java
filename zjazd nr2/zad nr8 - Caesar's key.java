/*
    Caesar's key
    Author: Maciej Leciejewski
 */

package com.company;
import java.util.Scanner;

public class SzyfrCezara {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Wiadomosc do zaszyfrowania: ");
        String wiadomosc = input.nextLine().toUpperCase();
        System.out.print("Klucz kodowania (np.3): ");
        int klucz = input.nextInt() % 26;
        for (int i = 0; i < wiadomosc.length(); i++) {
            char c = wiadomosc.charAt(i);
            if (c <= 64 || c >= 91) {
                c += 0;
            }
            else {
                c += klucz;
                if (c >= 91) {
                    c -= 26;
                }
            }
            System.out.print(c);
        }
    }
}
