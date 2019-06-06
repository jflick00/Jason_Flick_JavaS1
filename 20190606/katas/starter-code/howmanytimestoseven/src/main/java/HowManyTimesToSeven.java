import java.util.Random;

public class HowManyTimesToSeven {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int diceOne = randomGenerator.nextInt(6) + 1;
        int diceTwo = randomGenerator.nextInt(6) + 1;
//        System.out.println(diceOne);
//        System.out.println(diceTwo);
        int total = (diceOne + diceTwo);
        int howMany = 0;
        int totalNumSevs = 0;


        for(int i=0; i < 100; i++) {
            if (total == 7) {
//                howMany++;
//                System.out.println("It took " + howMany + " rolls to roll the first 7");

                totalNumSevs++;
                System.out.println("The total number of 7s rolled out of 100 rolls was " + totalNumSevs + ".");
            }
        }
    }
}
