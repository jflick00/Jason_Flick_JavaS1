import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.\nNumber: ");

        String userInput = myScanner.nextLine();
        int userInt = Integer.parseInt(userInput);
        int total = 0;

        while (userInt != 0) {
            System.out.println("The total so far is " + (total += userInt));
            System.out.println("Number: ");
            userInput = myScanner.nextLine();
            userInt = Integer.parseInt(userInput);
        }

        System.out.println("The total is " + total);
    }
}






