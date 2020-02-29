/*
Calculator daily calories
Author: Maciej Leciejewski
 */
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Kalkulator dziennego zapotrzebowania na kalorie");
        System.out.println("Uzywaj przecinka (,) aby podac ilosc dg po kg");
        System.out.println("Podaj swoja mase (w kg) :");
        double Masa = in.nextDouble();
        System.out.println("Podaj swoj wzrost (w cm) :");
        double Wzrost = in.nextDouble();
        System.out.println("Ile masz lat ?");
        double Wiek = in.nextDouble();
        System.out.println("Podaj swoja plec: 1 - mezczyzna, 2 - kobieta ");
        int Plec = in.nextInt();

        if (Plec == 1) {
            System.out.print("Twoje dzienne zapotrzebowanie na kalorie wynosi: ");
            System.out.print(66.47 + (13.7 * Masa) + (5 * Wzrost) - (6.76 * Wiek));
            System.out.println(" kcal.");
        } else if (Plec == 2) {
            System.out.print("Twoje dzienne zapotrzebowanie na kalorie wynosi: ");
            System.out.print(655.1 + (9.567 * Masa) + (1.85 * Wzrost) - (4.68 * Wiek));
            System.out.println(" kcal.");
        } else {
            System.out.println("Podales/as zla liczbe.");
        }
    }
}
