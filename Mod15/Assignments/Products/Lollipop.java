/**
 * 
 * @author Max Gordon
 * @version 03/12/2020
 */

public class Lollipop extends Candy implements Comparable<Lollipop> {
    public Lollipop(double cost) {
        super("lollipop", cost);
    }

    public void eat() {
        System.out.println("A " + getName() + " was eaten");
    }

    @Override
    public int compareTo(Lollipop arg0) {
        return (int)(arg0.getCost() - getCost() * 100);
    }
}