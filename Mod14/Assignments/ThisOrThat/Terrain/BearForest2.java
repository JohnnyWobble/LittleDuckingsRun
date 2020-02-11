/**
 * This a subclass of Forest
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class BearForest2 extends Forest2 {
    private int numberBears;

    public BearForest2(int length, int width, int numTrees, int numberBears) {
        super(length, width, numTrees);
        this.numberBears = numberBears;
    }

    public String getBears() {
        return "Bear " + getTrees() + " and also has " + this.numberBears + " bears";
    }
}