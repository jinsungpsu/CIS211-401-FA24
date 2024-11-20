import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GenericUUGraph<String> airports = new GenericUUGraph<>();
        airports.addNode("PHL");
        airports.addNode("BWI");
        airports.addNode("JFK");
        airports.addNode("EWR");
        airports.addNode("DTW");

        airports.addEdge("JFK", "BWI");
        airports.addEdge("DTW", "BWI");
        airports.addEdge("PHL", "DTW");

        Object[] neighbors = airports.neighbors("BWI");

        // check if JFK, BWI, DWT are all within 2 legs
        // PHL and JFK are 3 legs
        // EWR not connected to anything
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            System.out.println("Airport 1:");
            String aiport1Name = keyboard.next();
            System.out.println("Airport 2:");
            String aiport2Name = keyboard.next();
            if(airports.neighborWithinTwoEdges(aiport1Name, aiport2Name))
                System.out.println("Yes - you can get there with 1 stop or less");;
        }

    }
}
