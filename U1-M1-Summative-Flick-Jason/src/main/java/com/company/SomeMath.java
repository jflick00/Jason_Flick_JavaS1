package com.company;

public class SomeMath {

    public static void main(String[] args) {
        System.out.println(total5(1, 2, 3, 4, 5));
        System.out.println(average5(1, 3, 5, 7, 9));
        System.out.println(largest5(42.0, 35.1, 2.3, 40.2, 15.6));
    }

    public static int total5(int num1, int num2, int num3, int num4, int num5) {
        return num1 + num2 + num3 + num4 + num5;
    }

    public static double average5(int num1, int num2, int num3, int num4, int num5) {
        double solution = ((num1 + num2 + num3 + num4 + num5) / 5);
        return solution;
    }

    public static double largest5(double num1, double num2, double num3, double num4, double num5) {
        double[] numbers = {num1, num2, num3, num4, num5};
        double largest;

        // Determining the larger number between index 0 and index 1
        if (numbers[1] > numbers[0]) {
            largest = numbers[1];
        }else
            largest = numbers[0];

        // Starting from index 2
        for(int i = 2; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }
}
