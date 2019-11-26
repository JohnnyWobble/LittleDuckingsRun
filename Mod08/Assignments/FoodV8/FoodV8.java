/**
 * This will define some tasty food
 * 
 * @author Max Gordon
 * @version 11/22/2019
 */

public class FoodV8 {
    private String foodType, orderID;
    private int amountOfFood;
    private double costPerFood, totalCost;


    public FoodV8(String food) {
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
        String header = "Name      Cost per Item   Items     Total Cost        Order ID";
        System.out.println(header);
        printLine();
    }

    public void printLine() {
        // Prints a line
        System.out.println("______________________________________________________________");
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

    public void setOrderID(String id) {
        // Set a specific order ID with a string
        orderID = id;
    }

    public void setOrderID(int id) {
        // Set and order ID with an int
        orderID = Integer.toString(id);
    }

    public String getFoodType() {
        // Returns the type of food
        return foodType;
    }

    public int getAmountOfFood() {
        // Returns the amount of food
        return amountOfFood;
    }

    public double getCostPerFood() {
        // Returns the cost per unit
        return costPerFood;
    }

    public void setTotalCost(int total) {
        // Set a specific total cost with an int
        totalCost = (double)total;
    }

    public void setTotalCost(double total) {
        // Set a specific total cost with a double
        totalCost = total;
    }

    public String toString() {
        // Returns the object in a string format
        return "<FoodV7 Object; " + foodType + "; CostPerItem=" + costPerFood+"; NumberOfItems=" + amountOfFood + "; TotalCost=" + totalCost + "; OrderID=" + orderID + ">";
    }
}