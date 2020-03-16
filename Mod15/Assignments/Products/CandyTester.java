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
        List<Candy> candyList = new ArrayList<Candy>();
        Class[] classes = {Gummy.class, Chocolate.class, Lollipop.class};

        for (Class candyClass : classes) {
            for (int i = 0; i < r.nextInt(5) + 2; i++) {
                candyList.add((Candy)candyClass.getDeclaredConstructor(double.class).newInstance(r.nextDouble() + 0.1 * 20));
            }
        }

        calcInventory(candyList);
        comparePrice(new Lollipop(r.nextDouble() + 0.1 * 20), new Lollipop(r.nextDouble() + 0.1 * 20));
    }

    public static void calcInventory(List<Candy> candyList) {
        Candy lastCandy = candyList.get(0);
        double totalPrice = 0;
        int count = 0;

        System.out.println("           Inventory");
        System.out.println("-----------------------------------");
        for (Candy candy : candyList) {
            if (lastCandy.getName() != candy.getName()) {
                System.out.println(lastCandy.getName() + ":   \tQuantity=" + count + ",   \tTotal Cost=$" + ((int)(totalPrice*100))/100.);
                totalPrice = 0;
                count = 1;
            } else {
                totalPrice += candy.getCost();
                count += 1;
            }
            lastCandy = candy;
        }
        System.out.println(lastCandy.getName() + ": \tQuantity=" + count + ", \tTotal Cost=$" + ((int)(totalPrice*100))/100.);
    }

    public static void comparePrice(Lollipop... lollipops) {
        System.out.println("\n\n           Comparing");
        System.out.println("-----------------------------------");
        if (lollipops[0].compareTo(lollipops[1]) > 0) {
            System.out.println("The second lollipop costs more than the first");
        } else if (lollipops[0].compareTo(lollipops[1]) < 0) {
            System.out.println("The first lollipop costs more than the second");
        } else {
            System.out.println("The lollipops are the same price");
        }
    }
}