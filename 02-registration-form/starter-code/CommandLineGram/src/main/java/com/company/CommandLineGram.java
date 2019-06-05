package com.company;

import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to CommandLineGram. To register please enter in the following information. \nFirst Name:");
        String first = myScanner.nextLine();

        System.out.println("Last Name:");
        String last = myScanner.nextLine();

        System.out.println("Email:");
        String email = myScanner.nextLine();

        System.out.println("Twitter Handle:");
        String twitter = myScanner.nextLine();

        System.out.println("Age");
        int age = Integer.parseInt(myScanner.nextLine());

        System.out.println("Country:");
        String country = myScanner.nextLine();

        System.out.println("Profession:");
        String profession = myScanner.nextLine();

        System.out.println("Favorite Operating System:");
        String system = myScanner.nextLine();

        System.out.println("Favorite programming language:");
        String lang = myScanner.nextLine();

        System.out.println("Favorite computer scientist:");
        String scientist = myScanner.nextLine();

        System.out.println("Favorite keyboard shortcut:");
        String keys = myScanner.nextLine();

        System.out.println("Have you ever built your own computer?");
        String yayornay = myScanner.nextLine();

        System.out.println("If you could be any super hero, who would it be?");
        String superhero = myScanner.nextLine();


        // Answers displayed back to the user

        System.out.println("First name: " + first);
        System.out.println("Last name: " + last);
        System.out.println("Email: " + email);
        System.out.println("Twitter Handle: " + twitter);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Profession: " + profession);
        System.out.println("System: " + system);
        System.out.println("Favorite Programming Language: " + lang);
        System.out.println("Favorite computer scientist: " + scientist);
        System.out.println("Favorite keyboard shortcut: " + keys);
        System.out.println("Have you ever built your own computer? " + yayornay);
        System.out.println("If you could be any super hero, who would it be? " + superhero);

    }
}
