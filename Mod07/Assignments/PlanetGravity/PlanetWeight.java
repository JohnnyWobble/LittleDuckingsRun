/**
 * This will calculate your weight on different planets
 * 
 * @author Max Gordon
 * @version 11/17/2019
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class PlanetWeight {
    public static void main(String[] args) throws IOException {

        // Declare arrays
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] gravity = getGravities();

        // Get weight from user input
        double masslb = getWeight();

        // Calculate the user's weight for each planet
        double weights[] = calcWeights(masslb, gravity);

        // Print the results
        printData(planets, gravity, weights, masslb);
    }

    public static double[] getGravities() throws IOException {

        // Make files
        File fileName = new File("SurfaceGravity.txt");
        Scanner inFile = new Scanner(fileName);

        int numLines = 0;

        // Get the number of lines in the file
        while (inFile.hasNextDouble()) {
            numLines++;
            inFile.nextDouble();
        }
        inFile.close();

        // Make gravity array
        double[] gravity = new double[numLines];

        // Read the data from the file
        int counter = 0;
        inFile = new Scanner(fileName);
        while (inFile.hasNextDouble()) {
            gravity[counter] = inFile.nextDouble();
            counter++;
        }
        inFile.close();

        return gravity;
    }

    public static double getWeight() {

        // Create scanner
        Scanner input = new Scanner(System.in);
        
        // Get user input
        System.out.print("What is your mass (lb): ");
        double masslb = input.nextDouble();
        while (masslb <= 0) {
            System.out.print("What is your mass (lb): ");
            masslb = input.nextDouble();
        }
        input.close();

        return masslb;
    }

    public static double[] calcWeights(double masslb, double[] gravity) {

        // Create array
        double[] weightsG = new double[gravity.length];

        // Iteratively calculate the weight on each planet
        for (int i = 0; i < gravity.length; i++) {
            weightsG[i] = (masslb * (gravity[i] / 9.797646134132883));
        }

        return weightsG;
    }

    public static void printData(String[] planets, double[] gravity, double[] weights, double masslb) {
        
        // Print header
        System.out.println("Your weight (" + masslb + " lb) on different planets\n");
        System.out.println("Planet        Gravity      Weight (lb)");
        System.out.println("___________________________________________________");

        // Iteratively print the data
        for (int i = 0; i < planets.length; i++) {
            System.out.printf("%-10s    %5.2f        %6.2f%n", planets[i], gravity[i], weights[i]);
        }
    };
}