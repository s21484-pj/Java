/*
    PersonalLoan class
    Author: Maciej Leciejewski
 */
package com.company;

public class PersonalLoan extends Loan {

    public PersonalLoan(int loanNumber, String customerLastName, int amountOfLoan, int term, double interestRate) {
        super(loanNumber, customerLastName, amountOfLoan, term);
        this.interestRate = interestRate + 2.0;
    }
}
