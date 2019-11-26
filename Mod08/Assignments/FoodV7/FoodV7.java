/**
 * This will define some tasty food
 * 
 * @author Max Gordon
 * @version 11/22/2019
 */

public class FoodV7 {
    private String foodType, orderID;
    private int amountOfFood;
    private double costPerFood, totalCost;


    public FoodV7(String food) {
        // Constructor for the object
        foodType = food;
    }

    public void setAmount(int amount) {
        // Sets the amount of units and edits the order ID
        if (amount <= 0) {
            amount = 1;
        }
        orderID = amount + foodType;   
        amountOfFood = amount;
    }

    public void setPrice(double price) {
        // Sets the price per unit, edits the order ID, and calculates the total cost
        if (price <= 0) {
            price = 1.0;
        }
        costPerFood = price;
        totalCost = amountOfFood * costPerFood;
        orderID += price;
    }

    public void setPrice(int price) {
        // Sets the price per unit, edits the order ID, and calculates the total cost
        if (price <= 0) {
            price = 1;
        }
        costPerFood = price;
        totalCost = amountOfFood * costPerFood;
        orderID += price + ".0";
    }

    public void printHeader() {
        // Prints the header used in the receipt
        String header = "Name      Cost per Item   Items     Total Cost        Order ID\n";
        String line  =  "______________________________________________________________";
        System.out.println(header + line);
    }

    public void printReceipt() {
        // Prints the receipt for the purchase
        String dataF =  "%-10s%10.2f%11d%15.2f%16s\n";
        System.out.printf(dataF, foodType, costPerFood, amountOfFood, totalCost, orderID);
    }

    public double getCost() {
        // Returns the cost of the order
        return totalCost;
    }

    public String getOrderID() {
        // Returns the order ID
        return orderID;
    }
}