/**
 * 
 * @author Max Gordon
 * @version 02/07/2020
 */

public class ExtrudedSquare4 extends Square4 {
    private int height;

    public ExtrudedSquare4(int l, int h) {
        super(l);
        height = h;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Extruded square - " + getLength() +" X " + getWidth() + " X " + getHeight(); 
    }

    public boolean equals(ExtrudedSquare4 other) {
        return (getLength() == other.getLength() && getWidth() == other.getWidth() && height == other.getHeight());
    }
}