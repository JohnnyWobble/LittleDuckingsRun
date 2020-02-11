
/**
 * This class defines a basic Terrain.
 *
 * @author Max
 * @version Gordon
 */

public class Terrain2 {
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain2(int length, int width)
    {
        // initialize instance variables
        this.length = length;
        this.width = width;
    }

    public String getTerrainSize() {
        return "Land has dimensions " + this.length + " X " + this.width;
    }
}