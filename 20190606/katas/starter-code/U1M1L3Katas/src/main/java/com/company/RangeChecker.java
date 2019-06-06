package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {

        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);
        // Variables
        String userInput;
        int userInt;

        // Do-While Loop
        do {
            System.out.println("Please enter in a number between 15 and 32.");
            // Grabs the user input
            userInput = myScanner.nextLine();
            // Takes user input and changes it from a string to an integer
            userInt = Integer.parseInt(userInput);
        } while (userInt < 15 || userInt > 32);

        System.out.println(userInt);
    }

}

