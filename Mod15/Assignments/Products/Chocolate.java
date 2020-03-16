/**
 * 
 * @author Max Gordon
 * @version 03/12/2020
 */

public class Chocolate extends Candy {
    public Chocolate(double cost) {
        super("chocolate", cost);
    }

    public void eat() {
        System.out.println("A " + getName() + " was eaten");
    }
}