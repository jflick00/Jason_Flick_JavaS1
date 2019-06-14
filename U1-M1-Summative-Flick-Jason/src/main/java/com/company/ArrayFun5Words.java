package com.company;

import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String userInput;
        String[] userInputs = new String[5];

        for(int i = 0; i < userInputs.length; i++) {
            userInput = myScanner.nextLine();
            userInputs[i] = userInput;
        }

        System.out.println(userInputs[0]);
        System.out.println(userInputs[1]);
        System.out.println(userInputs[2]);
        System.out.println(userInputs[3]);
        System.out.println(userInputs[4]);

    }

}
