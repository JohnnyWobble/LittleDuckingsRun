import java.util.ArrayList;

/**
 * This is an OOP take on how to estimate pi
 * 
 * @author Max Gordon
 * @version 12/05/2019
 */

public class OOPEstimatePiTester {
    public static void main(String[] args) {
        // Make ArrayList for the OOPEstimatePi objects 
        ArrayList<OOPEstimatePi> arrList = new ArrayList<OOPEstimatePi>();

        // Print header
        System.out.println(" Trials |  Hits  |   Pi   ");
        System.out.println("________|________|________");

        // Initialize data
        int totalDarts = 0;
        int totalDartsHit = 0;
        double totalPi = 0;

        // Iteratively create an run objects
        for (int i = 0; i < 10; i++) {
            arrList.add(new OOPEstimatePi());
            for (int j = 0; j < 10000; j++) {
                arrList.get(i).throwDart();
            }
            arrList.get(i).calcPi();
            arrList.get(i).printData();
            totalDarts += arrList.get(i).getNumDarts();
            totalDartsHit += arrList.get(i).getNumDartsHit();
            totalPi += arrList.get(i).getCurrentPi();
        }

        // Print final data
        System.out.println("\nTotals:");
        System.out.printf(" %6d | %6d | %6.4f%n", totalDarts, totalDartsHit, totalPi);
        System.out.println("\nAverages:");
        System.out.printf(" %6.0f | %6.1f | %6.4f%n", totalDarts/10.0, totalDartsHit/10.0, totalPi/10.0);
    }
}