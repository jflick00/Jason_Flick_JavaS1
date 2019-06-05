package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");
        int num = Integer.parseInt(myScanner.nextLine());

        int total = ((num * 2) + 5);
        System.out.println("After doubling the number you just inputted and adding 5 to it, the total is " + total);
    }
}
