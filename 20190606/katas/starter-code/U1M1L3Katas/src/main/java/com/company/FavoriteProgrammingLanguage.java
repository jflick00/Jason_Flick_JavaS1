package com.company;

        import java.util.Scanner;

public class FavoriteProgrammingLanguage {

    public static void main(String[] args) {
        // Allows user to input info
        Scanner myScanner = new Scanner(System.in);

        // Setting a variable which will hold the user's input
        String userInput;

        // Creating a boolean
        boolean isNotJava = true;

        // Do-While Loop
        do {
            System.out.println("What is your favorite programming language?");
            userInput = myScanner.nextLine();
            if (userInput.equals("Java")) {
                isNotJava = false;
                System.out.println("That's what I was looking for! Java is definitely the answer!");
            }
        } while (isNotJava);

    }
}
