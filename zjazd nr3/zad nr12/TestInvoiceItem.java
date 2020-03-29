/*
    TestInvoiceItem
    Author: Maciej Leciejewski
 */
package com.company;

public class TestInvoiceItem {

    public static void main(String[] args) {

        InvoiceItem invoiceItem = new InvoiceItem("58", "rower", 1, 2300);
        System.out.println(invoiceItem.toString());
    }
}
