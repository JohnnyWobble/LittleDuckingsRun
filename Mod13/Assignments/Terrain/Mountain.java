/**
 * This will contain a class for making mountain objects, inherited from the Terrain class
 * 
 * @author Max Gordon
 * @version 02/01/2020
 */

public class Mountain extends Terrain {
    private int numMountains;

    public Mountain (int l, int w, int num) {
        super(l, w);
        numMountains = num;
    }

    public String getMountains() {
        return "Mountain " + getTerrainSize() + " and has " + numMountains + " mountains";
    }
}