package com.company;

import java.util.Random;
import java.util.Scanner;

public class While49 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10) + 1;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number from 1 to 10.");
        int guess = Integer.parseInt(myScanner.nextLine());
        int guess2;

        do {
            System.out.println("That is incorrect. Guess again.");
            guess2 = myScanner.nextInt();
            System.out.println("Your guess: " + guess2);
        } while(guess2 != randomInt);

        System.out.println("That's right! My secret number was " + randomInt + "!");

    }
}
