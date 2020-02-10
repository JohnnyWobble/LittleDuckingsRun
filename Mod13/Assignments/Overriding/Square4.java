/**
 * 
 * @author Max Gordon
 * @version 02/05/2020
 */

public class Square4 extends Rectangle4 {

    public Square4(int l) {
        super(l, l);
    }

    @Override
    public String toString() {
        return "Square - " + getLength() +" X " + getWidth(); 
    }
}