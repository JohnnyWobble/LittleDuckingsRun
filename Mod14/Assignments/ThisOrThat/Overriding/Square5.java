/**
 * 
 * @author Max Gordon
 * @version 02/05/2020
 */

public class Square5 extends Rectangle5 {

    public Square5(int side) {
        super(side, side);
    }

    @Override
    public String toString() {
        return "Square - " + getLength() +" X " + getWidth(); 
    }
}