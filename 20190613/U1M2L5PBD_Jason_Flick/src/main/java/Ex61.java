import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter three integers: \nSide 1:");
        String side1 = myScanner.nextLine();
        int sideNum1 = Integer.parseInt(side1);

        System.out.println("Side 2: ");
        String side2 = myScanner.nextLine();
        int sideNum2 = Integer.parseInt(side2);


        while (sideNum2 < sideNum1) {
            System.out.println(sideNum2 + " is smaller than " + sideNum1 + ". Try again.");
            System.out.println("Side 2: ");
            side2 = myScanner.nextLine();
            sideNum2 = Integer.parseInt(side2);
        }

        System.out.println("Side 3: ");
        String side3 = myScanner.nextLine();
        int sideNum3 = Integer.parseInt(side3);

        while (sideNum3 < sideNum2) {
            System.out.println(sideNum3 + " is smaller than " + sideNum2 + ". Try again.");
            System.out.println("Side 3: ");
            side3 = myScanner.nextLine();
            sideNum3 = Integer.parseInt(side3);
        }

        if ((sideNum1 * sideNum1) + (sideNum2 * sideNum2) == (sideNum3 * sideNum3)) {
            System.out.println("Your three sides are " + sideNum1 + " " + sideNum2 + " " + sideNum3);
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        }else {
            System.out.println("Your three sides are " + sideNum1 + " " + sideNum2 + " " + sideNum3);
            System.out.println("NO!  These sides do not make a right triangle!");
        }

    }
}
