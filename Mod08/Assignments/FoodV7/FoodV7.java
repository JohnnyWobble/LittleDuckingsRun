/**
 * This will define some tasty
 * 
 * @author Max Gordon
 * @version 11/22/2019
 */

public class FoodV7 {
    private String foodType, orderID;
    private int amountOfFood;
    private double costPerFood, totalCost;


    public FoodV7(String food) {
        foodType = food;
    }

    public void setAmount(int amount) {
        
        if (amount <= 0) {
            amount = 1;
        }
        orderID = foodType + amount;   
        amountOfFood = amount;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            price = 1.0;
        }
        costPerFood = price;
        totalCost = amountOfFood * costPerFood;
        orderID += price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            price = 1;
        }
        costPerFood = price;
        totalCost = amountOfFood * costPerFood;
        orderID += price + ".0";
    }

    public void printHeader() {
        String header = "Name      Cost per Item   Items     Total Cost\n";
        String line  =  "______________________________________________";
        System.out.println(header + line);
    }

    public void printReceipt() {
        String dataF =  "%-10s%10.2f%11d%15.2f\n";
        System.out.printf(dataF, foodType, costPerFood, amountOfFood, totalCost);
    }

    public double getCost() {
        return totalCost;
    }

    public String getOrderID() {
        return orderID;
    }
}