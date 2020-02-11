/**
 * 
 * @author Max Gordon
 * @version 02/05/2020
 */

public class Cube5 extends Box5{
    public Cube5 (int side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
        return "Cube - " + getLength() +" X " + getWidth() + " X " + getHeight(); 
    }
}