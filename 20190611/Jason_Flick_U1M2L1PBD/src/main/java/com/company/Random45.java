package com.company;

import java.util.Random;

public class Random45 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6) + 1;
        int randomInt2 = randomGenerator.nextInt(6) + 1;

        int total = randomInt + randomInt2;

        System.out.println("Here comes the dice!\nRoll #1: " + randomInt + "\nRoll #2: " + randomInt2 +
                "\nThe total is " + total + "!");

    }
}
