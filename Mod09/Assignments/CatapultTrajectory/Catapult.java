/**
 * This will calculate the range that a fruit can go a a given speed and angle
 * 
 * @author Max Gordon
 * @version 12/13/2019
 */

public class Catapult {
    private double speedOfFruit;  // In m/s

    /**
     * Precondition: speed is positive, and in km/s
     * @param speed the initial speed of the fruit (km/s)
     * Postcondition: all private variable are initialized
     */
    public Catapult(double speed) {
        speedOfFruit = speed * 1000;
    }


    /**
     * If you use this constructor you must use `setSpeed()` later
     */
    public Catapult() {

    }

    /**
     * Precondition: speed is positive, and in km/s
     * @param speed the initial speed of the fruit (km/s)
     * Postcondition: all private variable are initialized
     */
    public void setSpeed(double speed) {
        speedOfFruit = speed * 1000;
    }

    /**
     * Precondition: angle is in degrees
     * @param angle the launch angle
     * @return the distance the fruit would go before hitting the ground (m)
     */
    public double calcDistanceAtAngle(double angle) {
        return Math.pow(speedOfFruit / 3600, 2) * Math.sin(2 * Math.toRadians(angle)) / 9.8;
    }
}