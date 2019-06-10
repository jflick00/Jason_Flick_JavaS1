package com.company;

public class App {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 4};
        System.out.println(total(numbers));
    }

    public static int total(int[] numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int totalOdd(int[] numbers) {
        int sumOdd = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1 || i % 2 == -1) {
                sumOdd += numbers[i];
            }
        }
        return sumOdd;
    }

    public static int totalEven(int[] numbers) {
        int sumEven = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sumEven += numbers[i];
            }
        }
        return sumEven;
    }

//    public static int secondLargestNumber(int[] numbers) {
//        int max = numbers[0];
//        int secondMax = numbers[1];
//
//        for(int i = 0; i < numbers.length; i++) {
//            if (secondMax > max) {
//                secondMax = numbers[0];
//                max = numbers[1];
//            }
//            if (numbers[i] > max && numbers[i] < secondMax) {
//                numbers[i] = max;
//            }
//        }
//        return max;
//    }

//    public static String[] swapFirstAndLast(String[] words) {
//        String[] newArray = new String[words.length];
//        String firstWord = words[0];
//        int lastWord = words.length - 1;
//
//
//        for(int i = 0; i < words.length; i++) {
//            firstWord = lastWord;
//            lastWord = firstWord;
//        }
//        return newArray;
//    }

    public static int[] reverse(int[] numbers) {
        int[] newArray = new int[numbers.length];
        int indexPosition = 0;
        for(int i = numbers.length - 1; i >= 0; i--) {
            newArray[indexPosition] = numbers[i];
            indexPosition++;
        }
       return newArray;
    }

//    public static String[] concatenateString(String[] words) {
//
    // set new String
    // set new String = first index words[0];

    // for loop start at index 1
    // "new String" += words[i];

    // return "new String"



//    }

//    public static int[] everyThird(int[] numbers){
//        int[] newArray = new int[numbers.length];
//        int indexPosition = 0;
//        for(int i = 0; i < numbers.length; i+=3) {
//            newArray[indexPosition] = numbers[i];
//            if(numbers[i] < 3) {
//                return null;
//            }
//            indexPosition += 3;

//            for(int j = 0; i < numbers[i].length; i+=3);
//            newArray = numbers[j];
//        }
//        return newArray;
//    }

}

