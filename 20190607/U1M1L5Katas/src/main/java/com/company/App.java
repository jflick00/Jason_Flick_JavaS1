package com.company;

public class App {

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int subtractOrZero(int a, int b) {
        if ((a - b) > 0) {
            return a - b;
        } else if ((a - b) < 0) {
            return 0;
        }
        return a - b;
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        } else if ((a == b && b > c)){
            return a;
        } else if ((b == c && c > a)) {
            return b;
        } else if ((c == a && a > b)) {
            return c;
        } else if ((c == a && a == b)){
            return a;
        } else {
            return 0;
        }


    }

    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else if ((a == b && b < c)){
            return a;
        } else if ((b == c && c < a)) {
            return b;
        } else if ((c == a && a < b)) {
            return c;
        } else if ((c == a && a == b)){
            return a;
        } else {
            return 0;
        }
    }

    public static boolean isLarger(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }



    /////////////////////////////////////
    //  TESTING
    ////////////////////////////////////

//        public static void main(String[] args) {
//
//        int sub = subtract(5, 2);
//        System.out.println(sub);
//
//        int subz = subtractOrZero(5, 2);
//        System.out.println(subz);
//
//        int sub2 = subtractOrZero(4, 8);
//        System.out.println(sub2);
//
//        boolean ok = isLarger(6, 5);
//        System.out.println(ok);
//    }
}
