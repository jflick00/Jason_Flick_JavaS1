package com.company;

import java.util.Scanner;

public class ValidNumber {

    public static void main(String[] args) {

        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        // Prompts user to enter a number between 1 and 10
        System.out.println("Please enter a number between 1 and 10.");

        // Variables
        int userInt = myScanner.nextInt();

        if (userInt < 1 || userInt > 10) {

            do {

                //Prompt the user again to enter another number
                System.out.println("You must enter a number between 1 and 10, please try again.");

                // Grabs the user's input
                userInt = myScanner.nextInt();

                // If user's number is below 1 or above 10, run through the do loop again
            } while (userInt < 1 || userInt > 10);

            // Print out user's guess to screen after he failed to enter correct number the first time
            System.out.println(userInt);

        }else
            // User picked a number between 1 and 10 on first try..prints number to screen
            System.out.println(userInt);

    }

}
