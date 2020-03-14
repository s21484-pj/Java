/*
    Triangle
    Author: Maciej Leciejewski
 */

package com.company;
import java.lang.Math;

public class Trojkat {

    public static void main(String[] args) {

        double bok1 = 13;
        double bok2 = 13;
        double bok3podstawa = 10;

        System.out.println("Pierwszy bok wynosi: " + bok1);
        System.out.println("Drugi bok wynosi: " + bok2);
        System.out.println("Trzeci bok (podstawa) wynosi: " + bok3podstawa);

        double pole = Pole(bok1, bok3podstawa);
        System.out.println("Pole trojkata wynosi: " + pole);

        double obwod = Obwod(bok1, bok2, bok3podstawa);
        System.out.println("Obwod trojkata wynosi: " + obwod);

        boolean isequilateral = isEquilateral(bok1, bok2, bok3podstawa);
        System.out.println("Czy trojkat jest rownoboczny: " + isequilateral);

        boolean isisosceles = isIsosceles(bok1, bok2);
        System.out.println("Czy trojkat jest rownoramienny: " + isisosceles);

        boolean isscalene = isScalene(bok1, bok2, bok3podstawa);
        System.out.println("Czy trojkat jest roznoboczny: " + isscalene);
    }

    static double Pole(double a, double b){
        double wysokosc = a*a - ((b/2) * (b/2));
        double pole = 0.5 * b * Math.sqrt(wysokosc);
        return pole;
    }

    static double Obwod(double a, double b, double c){
        double obwod = a + b + c;
        return obwod;
    }

    static boolean isEquilateral(double a, double b, double c){
        if (a == b && b == c){
            return true;
        } else return false;
    }

    static boolean isIsosceles(double a, double b){
        if (a == b){
            return true;
        } else return false;
    }

    static boolean isScalene(double a, double b, double c){
        if (a != b && a != c && b != c){
            return true;
        } else return false;
    }
}
