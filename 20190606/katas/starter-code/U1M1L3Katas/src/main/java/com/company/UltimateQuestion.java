package com.company;

import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {
        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        // Setting a variable which will hold the user's input
        int userInt;

        do {
            System.out.println("Guess a number between 1 and 100.");
            userInt = myScanner.nextInt();

        } while (userInt != 42);
        System.out.println("That's the number I was looking for! 42 is definitely the answer!");

    }
}
