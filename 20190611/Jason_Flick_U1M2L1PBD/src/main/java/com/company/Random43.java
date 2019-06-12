package com.company;

import java.util.Random;
import java.util.Scanner;

public class Random43 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10) + 1;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number from 1 to 10.");
        int firstGuess = Integer.parseInt(myScanner.nextLine());
        if (firstGuess == randomInt) {
            System.out.println("That's right! My secret number was " + randomInt + "!");

        }else
            System.out.println("Sorry, but I was really thinking of " + randomInt);

    }
}
