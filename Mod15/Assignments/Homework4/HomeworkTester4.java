import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 03/06/2020
 */

public class HomeworkTester4 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Homework4> homeworks = new ArrayList<Homework4>();
        homeworks.add(new Calculus4());
        homeworks.add(new History4());
        homeworks.add(new English4());
        homeworks.add(new German4());

        for (Homework4 hw : homeworks) {
            hw.type(r.nextInt(10) + 1);
            System.out.println("Before reading: " + hw.toString());
            hw.doHomework(r.nextInt(hw.getPages()) + 1);
            System.out.println("After reading: " + hw.toString());
        }

        System.out.println("    Comparing");
        System.out.println("-------------------------------");

        for (int idx1 = 0; idx1 < homeworks.size(); idx1++) {
            for (int idx2 = idx1; idx2 < homeworks.size(); idx2++) {
                if (idx1 != idx2) {
                    if (homeworks.get(idx1).compareTo(homeworks.get(idx2)) == 0) {
                        System.out.println(homeworks.get(idx1).getType() + " has the SAME number of pages as " + homeworks.get(idx2).getType());
                    } else if (homeworks.get(idx1).compareTo(homeworks.get(idx2)) < 0) {
                        System.out.println(homeworks.get(idx1).getType() + " has FEWER pages than " + homeworks.get(idx2).getType());
                    } else {
                        System.out.println(homeworks.get(idx1).getType() + " has MORE pages than " + homeworks.get(idx2).getType());
                    }
                }
            }
        }

    }
}