
/**
 * 
 * @author Max Gordon
 * @version 01/14/2020
 */
import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        int number = str1.compareTo(str2);
        System.out.println(number);
    }

    private int number;

    public void addNumbers(int number) {
        number = number + number;
        System.out.println("The local variable is: " + number);
        System.out.println("The instance variable is: " + number);
    }
}