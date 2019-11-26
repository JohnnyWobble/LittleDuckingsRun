/**
 * Uses FoodV7.java in an array
 * 
 * @author Max Gordon
 * @version 11/22/2019
 */

public class FoodV8Tester {
    public static void main(String[] args) {
        // Declare arrays of data
        String[] names = {"Taco", "Pizza", "Cereal", "Lemonade", "Soup", "Toast", "Eggs"};
        double[] price = {12.99, 2.0, 5.59, 0.5, 4.25, 1.0, 6.99};
        int[] amount = {4, 8, 2, 3, 1, 7, 5};
        FoodV8[] foods = new FoodV8[7];

        // Declare other data
        double totalCost = 0.0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        // Iteratively create the objects and act upon them
        for (int i = 0; i < names.length; i++) {
            foods[i] = new FoodV8(names[i]);
            foods[i].setAmount(amount[i]);
            foods[i].setPrice(price[i]);
            if (i == 0) {
                foods[i].printHeader();
            }
            foods[i].printReceipt();
            totalCost += foods[i].getCost();
            if (foods[i].getCost() > max) {
                max = foods[i].getCost();
            }
            if (foods[i].getCost() < min) {
                min = foods[i].getCost();
            }

        }

        // Print the minimum, maximum, average, and total
        foods[0].printLine();
        System.out.printf("\t\t\t       Minimum: %6.2f", min);
        System.out.printf("\n\t\t\t       Maximum: %6.2f", max);
        System.out.printf("\n\t\t\t       Average: %6.2f", totalCost/foods.length);
        System.out.printf("\n\t\t\t         Total: %6.2f\n", totalCost);
    }
}