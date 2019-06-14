package com.company;

public class ArrayFunReverseIt {
    public static void main(String[] args) {

        int[] forwardArray = {1, 2, 3, 4, 5};

        int[] reversedArray = new int[forwardArray.length];

        for(int i = 0; i < forwardArray.length; i++) {
            reversedArray[i] = forwardArray[forwardArray.length - (i + 1)];
        }

        System.out.println(forwardArray[0]);
        System.out.println(forwardArray[1]);
        System.out.println(forwardArray[2]);
        System.out.println(forwardArray[3]);
        System.out.println(forwardArray[4]);

        System.out.println(reversedArray[0]);
        System.out.println(reversedArray[1]);
        System.out.println(reversedArray[2]);
        System.out.println(reversedArray[3]);
        System.out.println(reversedArray[4]);
    }
}
