package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please type in a number.");
        int num = Integer.parseInt(myScanner.nextLine());

        int total = (num + 13);
        System.out.println("The number you just inputted, after adding 13 to it the total is " + total + ".");
    }
}
