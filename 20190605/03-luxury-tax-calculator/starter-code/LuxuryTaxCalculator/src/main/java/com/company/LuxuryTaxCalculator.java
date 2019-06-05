package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class LuxuryTaxCalculator {

    public static void main(String[] args) {

        // Formats number to a decimal with 2 places
        NumberFormat numberFormat = new DecimalFormat("#0.00");

        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the salary for Player 1.");
        double salary1 = Double.parseDouble(myScanner.nextLine());

        System.out.println("Enter the salary for Player 2.");
        double salary2 = Double.parseDouble(myScanner.nextLine());

        System.out.println("Enter the salary for Player 3.");
        double salary3 = Double.parseDouble(myScanner.nextLine());

        double total = (salary1 + salary2 + salary3);
        System.out.println("The total salary for all three players is " + numberFormat.format(total));

        int totalSpendingLimit = 40000000;

        if (total > totalSpendingLimit) {
            double overLimit = (total - totalSpendingLimit);
            double luxTax = (overLimit * .18);
            System.out.println("Unfortunately you went over the spending limit and owe " + numberFormat.format(luxTax));
        }

    }
}
