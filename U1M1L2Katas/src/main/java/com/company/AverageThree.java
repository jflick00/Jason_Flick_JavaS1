package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.Float.parseFloat;


public class AverageThree {

    public static void main(String[] args) {
        NumberFormat numberFormat = new DecimalFormat("#0.00");
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");
        float num1= parseFloat(myScanner.nextLine());


        System.out.println("Please type in another number.");
        float num2 = parseFloat(myScanner.nextLine());

        System.out.println("Please type in another number.");
        float num3 = parseFloat(myScanner.nextLine());

        float sum = (num1 + num2 + num3);
        float avg = sum / 3;

        System.out.println("The average of the three numbers is " + numberFormat.format(avg));
    }
}
