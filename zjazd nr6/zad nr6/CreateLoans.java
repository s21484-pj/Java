/*
    CreateLoans class
    Author: Maciej Leciejewski
 */
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateLoans {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Loan> loans = new ArrayList<>();

        System.out.println("What is current prime interest rate ?");
        double currentPrimeInterestRate = sc.nextDouble();

        for (int i = 1; i <= 5; ) {
            System.out.println("Do you want get a business loan, or a personal loan ? \n 1. Business loan \n 2. Personal loan");
            int loan = sc.nextInt();
            if (loan == 1) {
                int loanNumber = i;
                System.out.println("What is your last name ?");
                String customerLastName = sc.next();
                System.out.println("What amount of loan would you like to get ?");
                int amountOfLoan = 0;
                for (int j = 0; j < 1;) {
                    amountOfLoan = sc.nextInt();
                    if (amountOfLoan > 0 && amountOfLoan <= 100000) {
                        j++;
                    } else
                        System.out.println("Wrong amount of loan");
                }
                System.out.println("For what term would you like to get a loan ?");
                int term = sc.nextInt();
                BusinessLoan businessLoan = new BusinessLoan(loanNumber, customerLastName, amountOfLoan, term, currentPrimeInterestRate);
                loans.add(businessLoan);
                i++;
            }
            else if (loan == 2) {
                int loanNumber = i;
                System.out.println("What is your last name ?");
                String customerLastName = sc.next();
                System.out.println("What amount of loan would you like to get ?");
                int amountOfLoan = 0;
                for (int j = 0; j < 1;) {
                    amountOfLoan = sc.nextInt();
                    if (amountOfLoan > 0 && amountOfLoan <= 100000) {
                        j++;
                    } else
                        System.out.println("Wrong amount of loan");
                }
                System.out.println("For what term would you like to get a loan ?");
                int term = sc.nextInt();
                PersonalLoan personalLoan = new PersonalLoan(loanNumber, customerLastName, amountOfLoan, term, currentPrimeInterestRate);
                loans.add(personalLoan);
                i++;
            }
            else
                System.out.println("Error");
        }
        for (Loan loan : loans) {
            System.out.println(loan);
        }
    }
}
