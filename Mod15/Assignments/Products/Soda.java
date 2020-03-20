/**
 * 
 * @author Max Gordon
 * @version 03/12/2020
 */

public class Soda implements Product, Comparable<Soda> {
    private String name;
    private double cost;

    public Soda(double cost) {
        name = "soda";
        this.cost = cost;
    }

    public void eat() {
        System.out.println("A " + getName() + " was drank");
    }

    @Override
    public int compareTo(Soda arg0) {
        return (int)((arg0.getCost() - getCost()) * 100);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }
}