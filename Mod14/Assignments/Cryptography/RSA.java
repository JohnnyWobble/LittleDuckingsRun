/**
 * This contains the class that will compute prime numbers
 * 
 * @author Max Gordon
 * @version 02/18/2020
 */

public class RSA {
    private double lower;
    private double upper;

    /**
     * Constructor for the RSA class
     * @param lower lower limit to look in for prime numbers
     * @param upper upper limit to look in for prime numbers
     */
    public RSA(double lower, double upper) {
        if (lower >= upper) {
            throw new ArithmeticException("`lower` must be a lower number than `upper`");
        }
        this.lower = lower;
        this.upper = upper;
    }

    /**
     * Calculates all of the prime numbers between the upper and lower limits
     * 
     * @return the number of prime numbers it found
     */
    public int calculatePrimes() {
        int primeNums = 0;

        for (double num = this.lower; num <= this.upper; num++) {  // iterates through all of the possible numbers
            if (isPrime(num)) {
                System.out.println((int)num);
                primeNums++;
            }
        }
        return primeNums;
    }

    /**
     * Method to determine whether a number is prime
     * It divides it by all the numbers smaller than it until the divisors starts to wrap back around
     * 
     * @param num the number to check
     * @return true if prime
     */
    public static boolean isPrime(double num) {
        if (num == 0 || num == 1) {  // 0, 1, 2 will yield the wrong answer, so I just hard coded them
            return false;
        } else if (num == 2) {
            return true;
        }

        num = Math.abs(num);  // makes everything positive for speed's sake
        int divisor = 2;  // gets incremented up
        double lastResult = num;

        while (lastResult > divisor) {
            lastResult = num / divisor;

            if (lastResult % 1 == 0) {   // if it evenly divides, it is not a prime
                return false;
            }
            divisor++;
        }
        return true; // if it does not evenly divide, it is prime
    }
}