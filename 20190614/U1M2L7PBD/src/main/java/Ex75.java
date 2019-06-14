import java.util.Random;

public class Ex75 {

    public static void main(String[] args) {
        System.out.println("Baby Blackjack!\n");

        Random randomGenerator = new Random();

        int player1 = randomGenerator.nextInt(10) + 1;
        int player2 = randomGenerator.nextInt(10) + 1;

        int dealer1 = randomGenerator.nextInt(10) + 1;
        int dealer2 = randomGenerator.nextInt(10) + 1;

        int playerTotal = (player1 + player2);
        int dealerTotal = (dealer1 + dealer2);

        System.out.println("You drew " + player1 + " and " + player2+ ".");
        System.out.println("Your total is " + playerTotal + ".\n");
        System.out.println("The dealer has " + dealer1 + " and " + dealer2+ ".");
        System.out.println("Dealer's total is " + dealerTotal + ".\n");

        if (playerTotal > dealerTotal) {
            System.out.println("YOU WIN!");
        }else
            System.out.println("YOU LOSE.");

    }
}
