/*
    Rectangle
    Author: Maciej Leciejewski
 */
package com.company;
import java.lang.Math;

public class Prostokat {

    public static void main(String[] args) {

        int szerokosc = 12;
        int dlugosc = 5;
        System.out.println("Szerokosc prostokata wynosi: " + szerokosc);
        System.out.println("Dlugosc prostokata wynosi: " + dlugosc );
        System.out.println("");

        int pole = Pole(szerokosc, dlugosc);
        System.out.println("Pole prostokata wynosi: " + pole);

        int obwod = Obwod(szerokosc, dlugosc);
        System.out.println("Obwod prostokata wynosi: " + obwod);

        double przekatna = Przekatna(szerokosc, dlugosc);
        System.out.println("Dlugosc przekatnej prostokata wynosi: " + Math.sqrt(przekatna));
    }

    static int Pole(int a, int b) {
        int pole = a * b;
        return pole;
    }

    static int Obwod(int a, int b){
        int obwod = 2 * a + 2 * b;
        return obwod;
    }

    static double Przekatna(int a, int b){
        double przekatna = a*a + b*b;
        return przekatna;
    }
}
