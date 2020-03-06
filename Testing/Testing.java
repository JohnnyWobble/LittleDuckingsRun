
/**
 * 
 * @author Max Gordon
 * @version 01/14/2020
 */
import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList b = a;
        a.add(new Integer(4));
        b.add(new Integer(5));
        a.add(new Integer(6));
        System.out.println(b.size());
    }

    private int number;

    public void addNumbers(int number) {
        number = number + number;
        System.out.println("The local variable is: " + number);
        System.out.println("The instance variable is: " + number);
    }
}