package com.company;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");

        // Grabs the user's input
        String userInput = myScanner.nextLine();

        // Converts input into integer
        int userInt = Integer.parseInt(userInput);

        // For loop. Starts count from 1 up to user's input
        for (int i=1; i < userInt + 1; i++) {

            if ((userInt % i) == 1) {
                System.out.println(i);
            }
        }

    }
}
