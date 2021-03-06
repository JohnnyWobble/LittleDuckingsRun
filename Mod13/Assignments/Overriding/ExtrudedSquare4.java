/**
 * 
 * @author Max Gordon
 * @version 02/07/2020
 */

public class ExtrudedSquare4 extends Square4 {
    private int height;

    public ExtrudedSquare4(int length, int height) {
        super(length);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Extruded square - " + getLength() +" X " + getWidth() + " X " + getHeight(); 
    }

    public boolean equals(ExtrudedSquare4 other) {
        return (getLength() == other.getLength() && getWidth() == other.getWidth() && this.height == other.getHeight());
    }
}