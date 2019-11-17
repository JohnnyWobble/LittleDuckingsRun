/**
 * This will estimate pi using the monte carlo method
 * 
 * @author Max Gordon
 * @version 11/17/2019
 */
import java.util.Random;
import java.util.Scanner;
public class EstimatePi {
    public static void main(String[] args) {
        // Get iteration data
        int iterationsPerTrial = getNumIters("iterations");
        int trials = getNumIters("trials");

        // Get estimate of pi array
        double[] piArr = calcData(trials, iterationsPerTrial);

        // Print data
        printData(piArr);
    }
    public static int getNumIters(String goal) {
        Scanner input = new Scanner(System.in);

        // Get input
        System.out.print("How many " + goal + " do you want: ");
        int iters = input.nextInt();
        while (iters <= 0) {
            System.out.print("How many " + goal + " do you want: ");
            iters = input.nextInt();
        }
        return iters;
    }

    public static double pythagorean(double x, double y) {
        // Pythagorean Theorem
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));   
    }

    public static boolean evaluate(double point) {
        // Check if the point is within the unit circle
        return point <= 1.00000;
    }

    public static void printData(double[] piArr) {
        double piTot = 0.0;

        // Add up pi estimate data
        for (double tmpPi : piArr) {
            piTot += tmpPi;
        }

        // Print final data
        System.out.println("|____________|_______________|");
        System.out.println("Estimate of pi = " + piTot / piArr.length);
    }

    public static double[] calcData(int trials, int iterationsPerTrial) {
        double[] piArr = new double[trials];

        System.out.println(" ___________________________ ");
        
        // Iteratively calculate pi
        for (int j = 0; j < trials; j++) {
            int yes = 0;
            for (int i = 1; i <= iterationsPerTrial; i++) {
                if (evaluate(pythagorean(Math.random(), Math.random()))) {
                    yes += 1;
                }
            }

            // Print trial data
            piArr[j] = 4 * ((double) yes / iterationsPerTrial);
            System.out.printf("| Trial: %3s | pi = %8.6f |%n", j + 1, 4 * ((double) yes / iterationsPerTrial));
        }
        return piArr;
    }
}