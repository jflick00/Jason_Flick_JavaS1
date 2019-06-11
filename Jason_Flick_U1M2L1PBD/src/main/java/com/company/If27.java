package com.company;

import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("Are you ready for a quiz?");
        String ready = myScanner.nextLine();

        System.out.println("Okay, here it comes!\n");

        /////////////
        // Question 1
        /////////////
        System.out.println("Q1) What is the capital of Alaska?\n1) Melbourne\n2) Anchorage\n3) Juneau");
        int answer1 = Integer.parseInt(myScanner.nextLine());

        if (answer1 == 3) {
            System.out.println("That's right!");
            counter++;
        }else
            System.out.println("Sorry, that is incorrect.");


        /////////////
        // Question 2
        /////////////
        System.out.println("\nQ2) Can you store the value 'cat' in a variable of type int?\n1) yes\n2) no");
        int answer2 = Integer.parseInt(myScanner.nextLine());

        if (answer2 == 2) {
            System.out.println("That's right!");
            counter++;
        }else
            System.out.println("Sorry, that is incorrect.");


        /////////////
        // Question 3
        /////////////
        System.out.println("\nQ3) What is the result of 9+6/3?\n1) 5\n2) 11\n3) 15/3");
        int answer3 = Integer.parseInt(myScanner.nextLine());

        if (answer3 == 2) {
            System.out.println("That's right!");
            counter++;
        }else
            System.out.println("Sorry, that is incorrect.");


        System.out.println("\nOverall you got " + counter + " out of 3 correct.\nThanks for playing!");

    }
}
