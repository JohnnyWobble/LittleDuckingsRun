import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class HomeworkTester {
    public static void main(String[] args) {
        Random r = new Random();

        ArrayList<Homework> homeworks = new ArrayList<Homework>();
        homeworks.add(new Calculus());
        homeworks.add(new History());
        homeworks.add(new English());
        homeworks.add(new German());

        for (Homework hw : homeworks) {
            hw.type(r.nextInt(10) + 1);
            System.out.println(hw.toString());
        }
    }
}