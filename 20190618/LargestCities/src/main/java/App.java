import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        City newYork = new City("New York", 8654321);
        City losAngeles = new City("Los Angeles", 4563218);
        City chicago = new City("Chicago", 2716520);
        City denver = new City("Denver", 704621);
        City desMoines = new City("Des Moines", 217521);
        City atlanta = new City("Atlanta", 486213);

        Map<String, City> cityMap = new HashMap<>();

        cityMap.put("New York", newYork);
        cityMap.put("California", losAngeles);
        cityMap.put("Illinois", chicago);
        cityMap.put("Colorado", denver);
        cityMap.put("Iowa", desMoines);
        cityMap.put("Georgia", atlanta);

        for (Map.Entry<String, City> entry: cityMap.entrySet()) {
            System.out.println("State: " + entry.getKey());
            System.out.println("City: " + entry.getValue().getName());
            System.out.println("Population " + entry.getValue().getPopulation());
            System.out.println();
        }

        System.out.println("Please enter a population.");
        int userInput = Integer.parseInt(scan.nextLine());

        System.out.println("-----------");

        for (Map.Entry<String, City> entry: cityMap.entrySet()) {
            if (entry.getValue().getPopulation() > userInput) {
                System.out.println("State: " + entry.getKey());
            }
        }


    }
}
