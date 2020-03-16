/**
 * 
 * @author Max Gordon
 * @version 03/12/2020
 */

public abstract class Candy {
    private String name;
    private double cost;

    public Candy(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public abstract void eat();

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