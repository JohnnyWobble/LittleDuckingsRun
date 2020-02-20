import java.util.Scanner;

/**
 * Write a program to calculate and count the quantity of prime numbers between a given range.
 * 
 * @author Isabel Cruz Rivera
 * @version 02/03/2020
 */ 

 public class PrimeNumbersTester {
    public static void main(String[] args) {
        //declaration of the scanner, object, and variables
        Scanner in = new Scanner(System.in);
        PrimeNumbers num;
        int lowerRange;
        int upperRange;
        int counter = 0;

        //takes user input from terminal
        System.out.print("Please enter a lower limit: ");
        lowerRange = in.nextInt();

        System.out.print("Please enter an upper limit: ");
        upperRange = in.nextInt();

        System.out.println("Prime numbers within that range...");

        //determine if the numbers in the range are prime
        long startTime = System.currentTimeMillis(); // used for computing time
        for(int i = lowerRange; i < upperRange + 1; i++) {
            num = new PrimeNumbers(i);
            if(num.findIfPrime()) {
                counter++;
            }
        }
        long endTime = System.currentTimeMillis();   // used for computing time

        //prints out number of prime numbers within the range
        System.out.println("Prime numbers in range: " + counter);
        System.out.println("That took " + (endTime - startTime) / 1000. + " seconds");
        //13.735

        System.out.println();
        in.close();
    }
 }