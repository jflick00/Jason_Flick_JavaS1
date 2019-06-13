import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("SQUARE ROOT!\nEnter a number: ");

        String userInput = myScanner.nextLine();
        float userInt =  Float.parseFloat(userInput);
//        float squareNum = Math.sqrt(userInt);

        while (userInt < 0) {
            System.out.println("You can't take the square root of a negative number, silly.\nTry again: ");
            userInput = myScanner.nextLine();
            userInt = Float.parseFloat(userInput);
        }

        System.out.println("The square root of " + userInt + " is " + Math.sqrt(userInt) + ".");

    }
}
