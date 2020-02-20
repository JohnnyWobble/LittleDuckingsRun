import java.util.Scanner;
/**
 * This will computer all of the prime numbers between the upper and lower bounds
 *  
 * @author Max Gordon
 * @version 02/18/2020
 */

public class RSATester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Make scanner

        // Get upper and lower bounds
        System.out.print("What is your lower bound: ");
        int lower = in.nextInt();

        System.out.print("What is your upper bound: ");
        int upper = in.nextInt();

        while (lower > upper) {
            System.out.println("[Error: bad input]");

            System.out.print("What is your lower bound: ");
            lower = in.nextInt();
    
            System.out.print("What is your upper bound: ");
            upper = in.nextInt();
        }

        // Calculate prime numbers and print them out
        RSA rsa = new RSA(lower, upper);
        long startTime = System.currentTimeMillis(); // used for computing time
        System.out.println("A total of " + rsa.calculatePrimes() + " prime numbers were found");
        long endTime = System.currentTimeMillis();   // used for computing time

        System.out.println("That took " + (endTime - startTime) / 1000. + " seconds");
        // 2.916
    }
}