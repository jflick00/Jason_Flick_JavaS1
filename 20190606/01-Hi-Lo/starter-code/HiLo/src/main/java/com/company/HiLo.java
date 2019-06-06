package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Hi-Low!");
        System.out.println("What is your name?");

        // Setting a variable for the user's first name
        String name = myScanner.nextLine();
        System.out.println("OK, " + name + ", here are the rules:");

        // Generate a random number
        Random randomGenerator = new Random();
        // Setting a variable to hold the random number between 1-100
        int randomInt = randomGenerator.nextInt(100) + 1;

        // Variables
        String  userInput;
        int userInt;
        int userGuesses = 0;

        // Do-While Loop
        do {
            System.out.println("Can you guess the number?");
            // User inputs number
            userInput = myScanner.nextLine();
            // Converts the string into an integer
            userInt = Integer.parseInt(userInput);
            // Increments number of guesses by 1
            userGuesses++;

            // If else statement
            if (userInt < randomInt) {
                System.out.println("Too Low!");
            } else if (userInt > randomInt) {
                System.out.println("Too High!");
            }

        } while (userInt != randomInt);
        System.out.println("Congratulations, " + name + "! You win!");
        System.out.println("It took you " + userGuesses + " guesses to find my number!");

    }
}
