package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");
        int num1 = Integer.parseInt(myScanner.nextLine());

        System.out.println("Please type in another number.");
        int num2 = Integer.parseInt(myScanner.nextLine());

        int sum = (num1 - num2);
        System.out.println("The first number subtracted from the second number is " + sum);
    }
}
