/**
 * This class will simulate the CO2 generation from a gas tank with a size `gallons`.
 * It contains mutator methods to calculate both the weight of the CO2 in pounds and tons,
 * and it contains getter methods to return amount of gas in gallons, pounds of CO2, and tons of CO2.
 * Private instance variables include: `myGallonsUsed` - size of gas tank in gallons,
 *                                     `myTonsCO2` - tons of CO2 produced,
 *                                     `myPoundsCO2` - pounds of CO2 produced,
 * 
 * @author Max Gordon
 * @version 11/28/19
 */
public class CO2FootprintV2
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    /**
     * Instantiates an instance of the `CO2FootprintV1` class.
     * @param gallons The amount of gas to solve for to calculate CO2 creation.
     * Precondition: `gallons` need to be positive.
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
        myTonsCO2 = 0.0;
        myPoundsCO2 = 0.0;
    }

    /**
     * Mutator method to calculate the amount of CO2 generated (in tons) with `myGallonsUsed` gallons of gas (no parameters).
     * It takes the constant 8.78 and multiplies it by 0.01 (expressed as `Math.pow(10, -3)`) and then,
     * multiplies all of that by the quantity of gasoline, then stores it to `myTonsCO2`.
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to convert the amount of CO2 generated from tons to pounds (no parameters).
     * It multiplies `myTonsCO2` by 2205 and stores that to `myPoundsCO2`.
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the amount of gas in gallons used for the calculations (no parameters).
     * @return gallons of gas used (double).
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the amount of CO2 generated in tons (no parameters).
     * @return The amount of CO2 generated in tons (double).
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the amount of CO2 generated in pounds (no parameters).
     * @return The amount of CO2 generated in pounds (double).
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}
