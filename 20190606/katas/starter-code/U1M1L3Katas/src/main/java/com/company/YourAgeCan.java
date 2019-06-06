package com.company;

import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {
        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in your age.");

        // Grabs the users input
        int userInput = myScanner.nextInt();

        if (userInput > 18) {
            System.out.println("You are able to vote.");
        }
        if (userInput > 21) {
            System.out.println("You are able to drink alcohol.");
        }
        if (userInput > 35) {
            System.out.println("You are able to become President.");
        }
        if (userInput > 55) {
            System.out.println("You are eligible for AARP");
        }
        if (userInput > 65) {
            System.out.println("You can retire.");
        }
        if (userInput >= 80 && userInput <=89) {
            System.out.println("You are an octogenerian.");
        }
        if (userInput > 100) {
            System.out.println("You are more than a century old.");
        }

    }
}
