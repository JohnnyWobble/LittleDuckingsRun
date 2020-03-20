import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Demonstrates the use of inheritance and other similar concepts
 * @author Max Gordon
 * @version 03/12/2020
 */

public class CandyTester {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException { // plz ignore all of these
        Random r = new Random();
        List<Product> candyList = new ArrayList<Product>();
        Class[] classes = {Gummy.class, Chocolate.class};

        for (Class candyClass : classes) {
            for (int i = 0; i < r.nextInt(5) + 2; i++) {
                candyList.add((Candy)candyClass.getDeclaredConstructor(double.class).newInstance(r.nextDouble() + 0.1 * 20));
            }
        }

        for (int i = 0; i < r.nextInt(5) + 2; i++) {
            candyList.add(new Soda(r.nextDouble() + 0.1 * 20));
        }

        calcInventory(candyList);
        comparePrice(new Soda(r.nextDouble() + 0.1 * 20), new Soda(r.nextDouble() + 0.1 * 20));
    }

    public static void calcInventory(List<Product> candyList) {
        Product lastCandy = candyList.get(0);
        double totalPrice = 0;
        int count = 0;

        System.out.println("           Inventory");
        System.out.println("-----------------------------------");
        for (Product candy : candyList) {
            if (lastCandy.getName() != candy.getName()) {
                System.out.printf("%-15s Quantity=%1d,     Total Cost=$%-5.2f\n", lastCandy.getName() + ":", count, ((int)(totalPrice*100))/100.);
                totalPrice = 0;
                count = 1;
            } else {
                totalPrice += candy.getCost();
                count += 1;
            }
            lastCandy = candy;
        }
        System.out.printf("%-15s Quantity=%1d,     Total Cost=$%-5.2f\n", lastCandy.getName() + ":", count, ((int)(totalPrice*100))/100.);
    }

    public static void comparePrice(Soda... sodas) {
        System.out.println("\n\n           Comparing");
        System.out.println("-----------------------------------");
        if (sodas[0].compareTo(sodas[1]) > 0) {
            System.out.println("The second lollipop costs more than the first");
        } else if (sodas[0].compareTo(sodas[1]) < 0) {
            System.out.println("The first lollipop costs more than the second");
        } else {
            System.out.println("The sodas are the same price");
        }
    }
}