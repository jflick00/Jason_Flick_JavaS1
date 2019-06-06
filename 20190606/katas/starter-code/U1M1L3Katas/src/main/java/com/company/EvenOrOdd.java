package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");

        // Grabs the user's input
        int userInput = myScanner.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("The number is even.");
        }else if (userInput % 2 == 1) {
            System.out.println("The number is odd.");
        }

    }
}
