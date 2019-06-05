package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {

        NumberFormat numberFormat = new DecimalFormat("#0.00");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the width of your driveway in feet?");
        int width = Integer.parseInt(myScanner.nextLine());

        System.out.println("What is the length of the driveway in feet?");
        int length = Integer.parseInt(myScanner.nextLine());

        int area = (width * length);
        System.out.println("The area of your driveway is " + area + " feet.");

        int perimeter = (length *2) + (width * 2);
        System.out.println("The perimeter of your driveway is " + perimeter + " feet.");

        double totalCement = (area * 12.50);
        System.out.println("The subtotal cost of the cement would be $" + numberFormat.format(totalCement) + ".");

        double totalFraming = (perimeter * 8.25);
        System.out.println("The subtotal cost of the framing/footers would be $" + numberFormat.format(totalFraming) + ".");


        //  Version 2

        System.out.println("What is the cost for the cement per square foot?");
        double cement = Double.parseDouble(myScanner.nextLine());
        double totalCement2 = (cement * area);

        System.out.println("What is the cost for the framing/footer per linear foot?");
        double framing = Double.parseDouble(myScanner.nextLine());
        double totalFraming2 = (framing * perimeter);

        double allTotal = (totalCement2 + totalFraming2);
        System.out.println("The subtotal cost of all the supplies comes out to $" + numberFormat.format(allTotal) + ".");
    }
}
