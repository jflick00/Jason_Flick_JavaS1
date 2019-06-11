package com.company;

import java.util.Random;
import java.util.Scanner;

public class While54 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100) + 1;


        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");

        // Variables
        int userInput;
        int userGuesses = 0;

        // Do-While Loop
        do {
            // User inputs number
            userInput = myScanner.nextInt();
            // Increments number of guesses by 1
            userGuesses++;

            // If else statement
            if (userGuesses == 7) {
                System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
                break;
            } else if (userInput > randomInt) {
                System.out.println("Sorry, that guess is too high.");
            } else if (userInput < randomInt) {
                System.out.println("Sorry, you are too low.");
            } else
                System.out.println("You guessed it! What are the odds!?!?");
        } while (userInput != randomInt);

    }
}
