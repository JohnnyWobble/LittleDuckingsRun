/**
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class Forest extends Terrain {
    private int numTrees;

    public Forest (int length, int width, int numTrees) {
        super(length, width);
        this.numTrees = numTrees;
    }

    public String getTrees() {
        return "Forest " + getTerrainSize() + " and has " + this.numTrees + " trees";
    }
}