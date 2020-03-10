import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class HomeworkTester3 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Homework3> homeworks = new ArrayList<Homework3>();
        homeworks.add(new Calculus3());
        homeworks.add(new History3());
        homeworks.add(new English3());
        homeworks.add(new German3());

        for (Homework3 hw : homeworks) {
            hw.type(r.nextInt(10) + 1);
            System.out.println("Before reading: " + hw.toString());
            hw.doHomework(r.nextInt(hw.getPages()) + 1);
            System.out.println("After reading: " + hw.toString());
        }
    }
}