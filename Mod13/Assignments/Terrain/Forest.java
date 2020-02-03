/**
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class Forest extends Terrain {
    private int numTrees;

    public Forest (int l, int w, int num) {
        super(l, w);
        numTrees = num;
    }

    public String getTrees() {
        return "Forest " + getTerrainSize() + " and has " + numTrees + " trees";
    }
}