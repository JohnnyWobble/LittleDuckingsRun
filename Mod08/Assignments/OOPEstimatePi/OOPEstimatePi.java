/**
 * This is an OOP take on how to estimate pi
 * 
 * @author Max Gordon
 * @version 12/05/2019
 */

public class OOPEstimatePi {
    private int numDarts = 0, numDartsHit = 0;
    private double currentPi = 0;

    /**
     * Default constructor (no parameters)
     */
    OOPEstimatePi() {

    }

    /**
     * Get the number of darts thrown
     * @return number of darts thrown
     * Post-condition: positive int
     */
    public int getNumDarts() {
        return numDarts;
    }
    
    /**
     * Get the number of darts that hit the target
     * @return number of darts that hit 
     * Post-condition: positive int
     */
    public int getNumDartsHit() {
        return numDartsHit;
    }

    /**
     * Get the current estimation of pi
     * @return estimation of pi
     * Post-condition: positive double
     */
    public double getCurrentPi() {
        return currentPi;
    }

    /**
     * Get a string representation of the object
     * @return string representation
     */
    public String toString() {
        return "<OOPEstimateP Object; numDarts=" + numDarts + "; numDartsHit=" + numDartsHit + "; currentPi=" + currentPi + ">";
    }

    /**
     * Generates a random point on a 1x1 plane, and checks if it within a (quarter) circle of radius 1, drawn from the origin
     * @return Wether it is in the circle, boolean
     */
    public boolean throwDart() {
        numDarts++;
        if (Math.sqrt(Math.pow(Math.random(), 2) + Math.pow(Math.random(), 2)) <= 1) {
            numDartsHit++;
            return true;
        }
        return false;
    }

    /**
     * Calculates pi with the current values at hand
     */
    public void calcPi() {
        currentPi = 4 * numDartsHit / (double) numDarts;
    }

    /**
     * Prints the data in a table-like format
     */
    public void printData() {
        System.out.printf(" %6d | %6d | %6.4f%n", numDarts, numDartsHit, currentPi);
    }
}