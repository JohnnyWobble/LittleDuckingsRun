/**
 * 
 * @author Max Gordon
 * @version 02/05/2020
 */

public class Cube4 extends Box4{
    public Cube4 (int side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
        return "Cube - " + getLength() +" X " + getWidth() + " X " + getHeight(); 
    }
}