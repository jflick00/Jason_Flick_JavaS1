package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");
        int num = Integer.parseInt(myScanner.nextLine());

        int total = ((num + 5) * 2);
        System.out.println("I added 5 to the number you just inputted and then doubled it.  The total is " + total + ".");
    }
}
