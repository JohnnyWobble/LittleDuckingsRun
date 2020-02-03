/**
 * This a subclass of Forest
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class BearForest extends Forest {
    private int numberBears;

    public BearForest(int l, int w, int numTrees, int num) {
        super(l, w, numTrees);
        numberBears = num;
    }

    public String getBears() {
        return "Bear " + getTrees() + " and also has " + numberBears + " bears";
    }
}