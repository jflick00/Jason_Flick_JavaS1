package com.company;

import java.util.Random;

public class Random44 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(6) + 1;

        String[] fortunes = {"You will find happiness with a new love.", "Enjoy the good luck a companion brings you.",
                "If you refuse to accept anything but the best, you very often get it.", "People are naturally attracted to you.",
                "A chance meeting opens new doors to success and friendship.", "Your shoes will make you happy today."};

        if (randomInt == 1) {
            System.out.println("Fortune cookie says: " + fortunes[0]);
        }
        if (randomInt == 2) {
            System.out.println("Fortune cookie says: " + fortunes[1]);
        }
        if (randomInt == 3) {
            System.out.println("Fortune cookie says: " + fortunes[2]);
        }
        if (randomInt == 4) {
            System.out.println("Fortune cookie says: " + fortunes[3]);
        }
        if (randomInt == 5) {
            System.out.println("Fortune cookie says: " + fortunes[4]);
        }
        if (randomInt == 6) {
            System.out.println("Fortune cookie says: " + fortunes[5]);
        }

    }
}
