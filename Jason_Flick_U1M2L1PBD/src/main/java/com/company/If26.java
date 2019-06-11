package com.company;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your current earth weight:");
        int weight = Integer.parseInt(myScanner.nextLine());

        System.out.println("\nI have the following information for the following planets:\n1. Venus     2. Mars     3. Jupiter\n" +
                "4. Saturn    5. Uranus   6. Neptune\n");

        System.out.println("Which planet are you visiting?");
        int num = Integer.parseInt(myScanner.nextLine());

        if(num == 1) {
            float sol1 = weight * 0.78f;
            System.out.printf("\nYour weight would be %.2f" + " pounds on that planet.", sol1);
        }
        if(num == 2) {
            float sol2 = weight * 0.39f;
            System.out.printf("\nYour weight would be %.2f" + " pounds on that planet.", sol2);
        }
        if (num == 3) {
            float sol3 = weight * 2.65f;
            System.out.printf("\nYour weight would be %.2f" + " pounds on that planet.", sol3);
        }
        if (num == 4) {
            float sol4 = weight * 1.17f;
            System.out.printf("\nYour weight would be %.2f" + " pounds on that planet.", sol4);
        }
        if (num == 5) {
            float sol5 = weight * 1.05f;
            System.out.printf("\nYour weight would be %.2f" + " pounds on that planet.", sol5);
        }
        if (num == 6) {
            float sol6 = weight * 1.23f;
            System.out.printf("\nYour weight would be %.2f" + " pounds on that planet.", sol6);
        }
    }
}
