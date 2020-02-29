/*
Polish and Japan flags
Author: Maciej Leciejewski
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a = "**********";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ktora flage chcesz wyswietlic ? ");
        System.out.println("1. Poland small flag");
        System.out.println("2. Poland medium flag");
        System.out.println("3. Poland big flag");
        System.out.println("4. Japan small flag");
        System.out.println("5. Japan medium flag");
        System.out.println("6. Japan big flag");
        int choose = sc.nextInt();

        if (choose == 1) {
            //PL SMALL
            System.out.println(ConsoleColors.WHITE + a + a + a);
            System.out.println(a + a + a);
            System.out.println(a + a + a);
            System.out.println(a + a + a);
            System.out.println(ConsoleColors.RED + a + a + a);
            System.out.println(a + a + a);
            System.out.println(a + a + a);
            System.out.println(a + a + a);
        }
        else if (choose == 2) {
            //PL MEDIUM
            System.out.println(ConsoleColors.WHITE + a + a + a + a);
            System.out.println(a + a + a + a);
            System.out.println(a + a + a + a);
            System.out.println(a + a + a + a);
            System.out.println(ConsoleColors.RED + a + a + a + a);
            System.out.println(a + a + a + a);
            System.out.println(a + a + a + a);
            System.out.println(a + a + a + a);
        }
        else if (choose == 3) {
            //PL BIG
            System.out.println(ConsoleColors.WHITE + a + a + a + a + a);
            System.out.println(a + a + a + a + a);
            System.out.println(a + a + a + a + a);
            System.out.println(a + a + a + a + a);
            System.out.println(ConsoleColors.RED + a + a + a + a + a);
            System.out.println(a + a + a + a + a);
            System.out.println(a + a + a + a + a);
            System.out.println(a + a + a + a + a);
        }
        else if (choose == 4) {
            //JP SMALL
            System.out.println(ConsoleColors.WHITE + a + a + a);
            System.out.println(a + "***" + ConsoleColors.RED + "****" + ConsoleColors.WHITE + "***" + a);
            System.out.println(a + "*" + ConsoleColors.RED + "********" + ConsoleColors.WHITE + "*" + a);
            System.out.println("*********" + ConsoleColors.RED + a + "**" + ConsoleColors.WHITE + "*********");
            System.out.println("*********" + ConsoleColors.RED + a + "**" + ConsoleColors.WHITE + "*********");
            System.out.println(a + "*" + ConsoleColors.RED + "********" + ConsoleColors.WHITE + "*" + a);
            System.out.println(a + "***" + ConsoleColors.RED + "****" + ConsoleColors.WHITE + "***" + a);
            System.out.println(ConsoleColors.WHITE + a + a + a);
        }
        else if (choose == 5) {
            //JP MED
            System.out.println(ConsoleColors.WHITE + a + a + a + a);
            System.out.println(a + "*******" + ConsoleColors.RED + "******" + ConsoleColors.WHITE + "*******" + a);
            System.out.println(a + "*****" + ConsoleColors.RED + a + ConsoleColors.WHITE + a + "*****");
            System.out.println(a + "***" + ConsoleColors.RED + a + "****" + ConsoleColors.WHITE + "***" + a);
            System.out.println(a + "***" + ConsoleColors.RED + a + "****" + ConsoleColors.WHITE + "***" + a);
            System.out.println(a + "*****" + ConsoleColors.RED + a + ConsoleColors.WHITE + a + "*****");
            System.out.println(a + "*******" + ConsoleColors.RED + "******" + ConsoleColors.WHITE + "*******" + a);
            System.out.println(ConsoleColors.WHITE + a + a + a + a);
        }
        else if (choose == 6) {
            //JP BIG
            System.out.println(ConsoleColors.WHITE + a + a + a + a + a);
            System.out.println(a + a + "*" + ConsoleColors.RED + "********" + ConsoleColors.WHITE + a + a + "*");
            System.out.println(a + "*********" + ConsoleColors.RED + a + "**" + ConsoleColors.WHITE + a + "*********");
            System.out.println(a + "*******" + ConsoleColors.RED + a + "******" + ConsoleColors.WHITE + a + "*******");
            System.out.println(a + "*******" + ConsoleColors.RED + a + "******" + ConsoleColors.WHITE + a + "*******");
            System.out.println(a + "*********" + ConsoleColors.RED + a + "**" + ConsoleColors.WHITE + a + "*********");
            System.out.println(a + a + "*" + ConsoleColors.RED + "********" + ConsoleColors.WHITE + a + a + "*");
            System.out.println(ConsoleColors.WHITE + a + a + a + a + a);
        }
        else {
            System.out.println("Nie prawidlowy wybor. ");
        }
    }
}
