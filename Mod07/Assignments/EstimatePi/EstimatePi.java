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
        int iterationsPerTrial = getNumIters("iterations");
        int trials = getNumIters("trials");

        double piTot = 0;

        System.out.println(" ___________________________ ");
        
        for (int j = 1; j <= trials; j++) {
            int yes = 0;
            for (int i = 1; i <= iterationsPerTrial; i++) {
                if (evaluate(pythagorean(Math.random(), Math.random()))) {
                    yes += 1;
                }
            }
            piTot += 4 * ((double) yes / iterationsPerTrial);
            System.out.printf("| Trial: %3s | pi = %8.6f |%n", j, 4 * ((double) yes / iterationsPerTrial));
        }
        System.out.println("|____________|_______________|");
        System.out.println("Estimate of pi = " + piTot / trials);
    }
    public static int getNumIters(String goal) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many " + goal + " do you want: ");
        int iters = input.nextInt();
        while (iters <= 0) {
            System.out.print("How many " + goal + " do you want: ");
            iters = input.nextInt();
        }
        return iters;
    }

    public static double pythagorean(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));   
    }

    public static boolean evaluate(double radius) {
        return radius <= 1.00000;
    }
}