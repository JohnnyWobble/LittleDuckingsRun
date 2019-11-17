/**
 * This will calculate the surface gravity for several planets
 * 
 * @author Max Gordon
 * @version 11/14/2019
 */

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class PlanetGravity {
    public static void main(String[] args) throws IOException {

        // Define variables
        String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double [] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double [] mass = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};

        // Get gravity data
        double[] gravity = calcGravity(diameter, mass);

        // Displays data to the user
        displayData(planets, diameter, mass, gravity);

        // Prints data to a file
        writeToFile(gravity);
    }

    public static double[] calcGravity(double[] diameter, double[] mass) {

        // Define array length
        double [] gravity = new double[mass.length];

        // Iteratively calculate the data
        double G = 6.67408e-11;
        for (int i = 0; i < mass.length; i++) {
            gravity[i] = (G * mass[i]) / Math.pow(diameter[i] * 1000 / 2, 2);
        }

        return gravity;
    }

    public static void displayData(String[] planets, double[] diameter, double[] mass, double[] gravity) {
        
        // Print headers
        System.out.println("Planet      Diameter (km)      Mass (kg)      Gravity (m/s^2)");
        System.out.println("_____________________________________________________________");

        // Iteratively print data
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("%-12s%10.0f         %-16.2E%8.2f%n", planets[i], diameter[i], mass[i], gravity[i]);
        }
    }

    public static void writeToFile(double[] gravity) throws IOException {

        // Create file type
        File outFile = new File("SurfaceGravity.txt");

        // Create file
        outFile.createNewFile();

        // Create printWriter
        PrintWriter out = new PrintWriter(outFile);

        // Write to file
        for (double num : gravity) {
            out.println(num);
        }

        // Close File
        out.close();
    }
}