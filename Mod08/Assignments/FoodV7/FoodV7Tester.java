/**
 * Uses FoodV7.java
 * 
 * @author Max Gordon
 * @version 11/22/2019
 */

public class FoodV7Tester {
    public static void main(String[] args) {
        // Initializes objects
        FoodV7 taco = new FoodV7("Taco");
        FoodV7 pizza = new FoodV7("Pizza");
        FoodV7 cereal = new FoodV7("Cereal");

        // Set data for taco
        taco.setAmount(4);
        taco.setPrice(12.99);

        // Sets data for pizza
        pizza.setAmount(8);
        pizza.setPrice(2);

        // Sets data for cereal
        cereal.setAmount(2);
        cereal.setPrice(5.59);

        // Prints the header, does not necessarily have to be from the taco object
        taco.printHeader();

        // Prints the receipts for all of the objects
        taco.printReceipt();
        pizza.printReceipt();
        cereal.printReceipt();

        // Calculates and prints the total cost
        System.out.printf("\n   Final Cost: $%-6.2f\n", (taco.getCost() + pizza.getCost() + cereal.getCost()));
    }
}