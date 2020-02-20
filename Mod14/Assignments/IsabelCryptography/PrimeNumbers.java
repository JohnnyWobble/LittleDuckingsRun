/**
 * Write a program to calculate and count the quantity of prime numbers between a given range.
 * 
 * @author Isabel Cruz Rivera
 * @version 02/03/2020
 */ 

public class PrimeNumbers {

    //private class instance variables
    private int num;

    /**
     * class construction, declaring private instance variables using this
     * 
     * @param num number that will be check to see if prime
     * 
     * Preconditions: must be an int
     */

    public PrimeNumbers(int num) {
        this.num = num;
    }

    /**
     * used to find if a number is prime, and if so, prints that number to the console
     * 
     * @return boolean based on whether the number is prime
     */
    public boolean findIfPrime() {
        boolean prime = true;

        int n = Math.abs(this.num);

        if(n == 0 ||n == 1) {
            return false;
        }
        
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }

        if(prime) {
            System.out.println(this.num);
            return true;
        }

        return false;
    }
}