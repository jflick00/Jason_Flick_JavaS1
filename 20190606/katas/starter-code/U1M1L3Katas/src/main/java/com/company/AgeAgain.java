package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        // Allows use to input info
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your age?");

        // Grabs the user's input
        String userAge1 = myScanner.nextLine();
        // Converts input into an integer
        int userAge = Integer.parseInt(userAge1);

        if (userAge < 14) {
            System.out.println("What grade are you in?");
            int userGrade = myScanner.nextInt();
            System.out.println("Wow! " + userGrade + " grade - that sounds exciting!");
        } else if (userAge >= 14 && userAge <= 18) {
            System.out.println("Are you planning on going to college?");
            String userYayOrNay = myScanner.nextLine().toLowerCase();
            switch (userYayOrNay) {
                case "yes":
                    System.out.println("What college?");
                    String userCollege = myScanner.nextLine();
                    System.out.println(userCollege + " is a great school!");
                    break;
                case "no":
                    System.out.println("What do you want to do after high school?");
                    String userDecision = myScanner.nextLine();
                    System.out.println("Wow, sounds like a plan!");
                    break;
            }
        } else if (userAge > 18) {
            System.out.println("What is your job?");
            String userJob = myScanner.nextLine();
            System.out.println(userJob + " sounds like a great job!");
        }

    }
}
