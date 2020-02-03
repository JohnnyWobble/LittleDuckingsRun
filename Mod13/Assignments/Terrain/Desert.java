/**
 * Subclass of Terrain
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class Desert extends Terrain {
    private int grainsOfSand;

    public Desert(int l, int w, int numSand) {
        super(l, w);
        grainsOfSand = numSand;
    }

    public String getSand() {
        return "Desert " + getTerrainSize() + " and also has " + grainsOfSand + " grains of sand";
    }
}