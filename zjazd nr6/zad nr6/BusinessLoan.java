/*
    BusinessLoan class
    Author: Maciej Leciejewski
 */
package com.company;

public class BusinessLoan extends Loan {

    public BusinessLoan(int loanNumber, String customerLastName, int amountOfLoan, int term, double interestRate) {
        super(loanNumber, customerLastName, amountOfLoan, term);
        this.interestRate = interestRate + 1.0;
    }
}
