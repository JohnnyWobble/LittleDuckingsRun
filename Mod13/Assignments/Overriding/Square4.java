/**
 * 
 * @author Max Gordon
 * @version 02/05/2020
 */

public class Square4 extends Rectangle4 {

    public Square4(int side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square - " + getLength() +" X " + getWidth(); 
    }
}