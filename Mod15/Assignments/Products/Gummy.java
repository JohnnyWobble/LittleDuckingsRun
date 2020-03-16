/**
 * 
 * @author Max Gordon
 * @version 03/12/2020
 */

public class Gummy extends Candy {
    public Gummy(double cost) {
        super("gummy", cost);
    }

    public void eat() {
        System.out.println("A " + getName() + " was eaten");
    }
}