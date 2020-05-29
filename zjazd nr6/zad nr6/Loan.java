/*
    Loan class
    Author: Maciej Leciejewski
 */
package com.company;

public abstract class Loan implements LoanConstants {

    protected int loanNumber;
    protected String customerLastName;
    protected int amountOfLoan;
    protected double interestRate;
    protected int term;

    public Loan(int loanNumber, String customerLastName, int amountOfLoan, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        this.amountOfLoan = amountOfLoan;
        if (term == shortTerm || term == mediumTerm || term == longTerm)
            this.term = term;
        else
            this.term = shortTerm;
    }

    public double getTotalAmount() {
        return amountOfLoan + (amountOfLoan * interestRate / 100) * this.term;
    }

    @Override
    public String toString() {
        return  "loanNumber=" + loanNumber +
                ", customerLastName=" + customerLastName +
                ", amountOfLoan=" + amountOfLoan +
                ", interestRate=" + interestRate +
                ", term=" + term +
                ", total amount owed at the due date=" + getTotalAmount();
    }
}
