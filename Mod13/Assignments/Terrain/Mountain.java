/**
 * This will contain a class for making mountain objects, inherited from the Terrain class
 * 
 * @author Max Gordon
 * @version 02/01/2020
 */

public class Mountain extends Terrain {
    private int numMountains;

    public Mountain (int length, int width, int numMountains) {
        super(length, width);
        this.numMountains = numMountains;
    }

    public String getMountains() {
        return "Mountain " + getTerrainSize() + " and has " + this.numMountains + " mountains";
    }
}