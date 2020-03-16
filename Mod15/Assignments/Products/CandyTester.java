import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Max Gordon
 * @version 03/12/2020
 */

public class CandyTester {
    public static void main(String[] args) {
        Random r = new Random();
        List<Candy> candyList = new ArrayList<Candy>();

        for (int i = 0; i < r.nextInt(5) + 1; i++) {
            candyList.add(new Gummy(r.nextDouble() + 0.1 * 20));
        }

        for (int i = 0; i < r.nextInt(5) + 1; i++) {
            candyList.add(new Chocolate(r.nextDouble() + 0.1 * 20));
        }

        for (int i = 0; i < r.nextInt(5) + 1; i++) {
            candyList.add(new Lollipop(r.nextDouble() + 0.1 * 20));
        }

        calcInventory(candyList);
    }

    public static void calcInventory(List<Candy> candyList) {
        Candy lastCandy;
        double totalPrice = 0;
        int count = 0;

        for (Candy candy : candyList) {
            if (lastCandy.getName() != candy.getName()) {
                System.out.println(lastCandy.getName() + ": Quantity=" + count + ", Total Cost=$" + ((int)(totalPrice*100))/100.);
                curName = candy.getName();
                totalPrice = 0;
                count = 1;
            } else {
                totalPrice += candy.getCost();
                count += 1;
            }
            lastCandy = candy;
        }
        System.out.println(curName + ": Quantity=" + count + ", Total Cost=$" + ((int)(totalPrice*100))/100.);
    }
}