package com.company;

import java.util.Scanner;

public class CountByTwo {

    public static void main(String[] args) {
        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");

        // Grabs the user's input
        String userInput = myScanner.nextLine();

        // Turns user's input into an integer
        int userInt = Integer.parseInt(userInput);

        // For Loop
        for (int i=0; i < userInt + 1; i+=2) {
            System.out.println(i);
        }
    }
}
