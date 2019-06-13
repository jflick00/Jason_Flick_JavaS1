import java.util.Random;
import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3) + 1;


        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\nHe lays down" +
                " three cards.\n\nWhich one is the ace?\n\n" +
                "\t##  ##  ##\n" +
                "\t##  ##  ##\n" +
                "\t1   2   3");

        String userInput = myScanner.nextLine();
        int userInt = Integer.parseInt(userInput);

        if (userInt == randomNumber) {
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n");
        }else {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + randomNumber + "\n");
        }

        switch(randomNumber) {
            case 1:
                System.out.println
                        ("\tAA  ##  ##\n" +
                        "\tAA  ##  ##\n" +
                        "\t1   2   3");
                break;
            case 2:
                System.out.println
                        ("\t##  AA  ##\n" +
                        "\t##  AA  ##\n" +
                        "\t1   2   3");
                break;
            case 3:
                System.out.println
                        ("\t##  ##  AA\n" +
                        "\t##  ##  AA\n" +
                        "\t1   2   3");
                break;
        }
    }
}
