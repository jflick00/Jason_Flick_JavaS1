package com.company.interfaces;

import java.util.Scanner;

public class Input implements UserIO{

    Scanner myScanner = new Scanner(System.in);

    public int readInt(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        int userInput1 = Integer.parseInt(userInput);
        return userInput1;
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        long userInput1 = Long.parseLong(userInput);
        return userInput1;
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        double userInput1 = Double.parseDouble(userInput);
        return userInput1;
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        float userInput1 = Float.parseFloat(userInput);
        return userInput1;
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        return userInput;
    }

}
