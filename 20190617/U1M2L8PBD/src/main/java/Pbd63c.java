import java.util.Scanner;

public class Pbd63c {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;

        int turn = 1;

        System.out.println("Player 1, enter your name: ");
        String player1 = myScanner.nextLine();
        System.out.println("Player 2, enter your name: ");
        String player2 = myScanner.nextLine();

        do {
            if (turn % 2 == 1) {
                System.out.println("\nA: " + pile1 + "\tB: " + pile2 + "\tC: " + pile3 + "\n\n" + player1 + " choose a pile: ");
                String userInput1 = myScanner.nextLine();
                System.out.println("\nHow many to remove from pile: ");
                int userChoice = Integer.parseInt(myScanner.nextLine());

                if (userInput1.equals("A") || userInput1.equals("a")) {
                    pile1 = pile1 - userChoice;
                    turn++;

                } else if (userInput1.equals("B") || userInput1.equals("b")) {
                    pile2 = pile2 - userChoice;
                    turn++;

                } else if (userInput1.equals("C") || userInput1.equals("c")) {
                    pile3 = pile3 - userChoice;
                    turn++;
                } else if (!userInput1.equals("A") || !userInput1.equals("a") || !userInput1.equals("B") || !userInput1.equals("b") || !userInput1.equals("C") || !userInput1.equals("c")) {
                    System.out.println("\nThis is not a pile " + player1 + ". Try again.\n");
                }
            }else if (turn % 2 == 0) {
                System.out.println("\nA: " + pile1 + "\tB: " + pile2 + "\tC: " + pile3 + "\n\n" + player2 + " choose a pile: ");
                String userInput2 = myScanner.nextLine();
                System.out.println("\nHow many to remove from pile: ");
                int userChoice = Integer.parseInt(myScanner.nextLine());
                if (userInput2.equals("A") || userInput2.equals("a")) {
                    pile1 = pile1 - userChoice;
                    turn++;

                } else if (userInput2.equals("B") || userInput2.equals("b")) {
                    pile2 = pile2 - userChoice;
                    turn++;

                } else if (userInput2.equals("C") || userInput2.equals("c")) {
                    pile3 = pile3 - userChoice;
                    turn++;
                } else if (!userInput2.equals("A") || !userInput2.equals("a") || !userInput2.equals("B") || !userInput2.equals("b") || !userInput2.equals("C") || !userInput2.equals("c")) {
                    System.out.println("\nThis is not a pile " + player2 + ". Try again.\n");
                }
            }

        } while(pile1 > 0 || pile2 > 0 || pile3 > 0);

        if (turn % 2 == 1) {
            System.out.println("\n" + player1 + ", there are no counters left, so you WIN!");

        }else if (turn % 2 == 0) {
            System.out.println("\n" + player2 + ", there are no counters left, so you WIN!");
        }

    }
}
