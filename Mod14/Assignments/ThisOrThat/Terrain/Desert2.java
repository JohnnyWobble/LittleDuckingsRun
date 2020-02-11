/**
 * Subclass of Terrain
 * 
 * @author Max Gordon
 * @version 02/02/2020
 */

public class Desert2 extends Terrain2 {
    private int grainsOfSand;

    public Desert2(int length, int width, int grainsOfSand) {
        super(length, width);
        this.grainsOfSand = grainsOfSand;
    }

    public String getSand() {
        return "Desert " + getTerrainSize() + " and also has " + this.grainsOfSand + " grains of sand";
    }
}