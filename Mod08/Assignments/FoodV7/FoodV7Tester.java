/**
 * Uses FoodV7.java
 * 
 * @author Max Gordon
 * @version 11/22/2019
 */

public class FoodV7Tester {
    public static void main(String[] args) {
        FoodV7 food1 = new FoodV7("Taco");
        food1.setAmount(4);
        food1.setPrice(12.99);
        food1.printHeader();
        food1.printReceipt();
    }
}