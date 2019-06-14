package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int userInt;
        int[] userInts = new int[5];

        for(int i = 0; i < userInts.length; i++) {
            userInt = Integer.parseInt(myScanner.nextLine());
            userInts[i] = userInt;
        }

        System.out.println(userInts[0]);
        System.out.println(userInts[1]);
        System.out.println(userInts[2]);
        System.out.println(userInts[3]);
        System.out.println(userInts[4]);

    }

}
