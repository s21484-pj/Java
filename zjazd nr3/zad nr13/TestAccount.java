/*
    TestAccount
    Author: Maciej Leciejewski
 */
package com.company;

public class TestAccount {

    public static void main(String[] args) {

        Account account = new Account("1", "Oszczednosciowe", 20000);
        Account account2 = new Account("2", "Oszczednosciowe", 50000);
        System.out.println(account.toString());
        System.out.println(account.debit(5000));
        System.out.println(account.transferTo(account2, 4000));
        System.out.println(account2.getBalance());
    }
}
