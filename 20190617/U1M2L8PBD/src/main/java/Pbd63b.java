import java.util.Scanner;

public class Pbd63b {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;

        do {
            System.out.println("A: " + pile1 + "\tB: " + pile2 + "\tC: " + pile3 + "\n\nChoose a pile: ");
            String userInput = myScanner.nextLine();
            System.out.println("\nHow many to remove from pile: ");
            int userChoice = Integer.parseInt(myScanner.nextLine());

            if (userInput.equals("A") || userInput.equals("a"))  {
                pile1 = pile1 - userChoice;

            } else if (userInput.equals("B") || userInput.equals("b")) {
                pile2 = pile2 - userChoice;

            } else if (userInput.equals("C") || userInput.equals("c")) {
                pile3 = pile3 - userChoice;
            } else if (!userInput.equals("A") || !userInput.equals("a") || !userInput.equals("B") || !userInput.equals("b") || !userInput.equals("C") || !userInput.equals("c")) {
                System.out.println("\nThis is not a pile. Try again.\n");
            }

        } while(pile1 > 0 || pile2 > 0 || pile3 > 0);

        System.out.println("\nAll piles are empty! Good Job.");

    }
}
