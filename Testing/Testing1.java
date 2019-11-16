import java.util.Random;
import java.util.Scanner;  
import java.lang.reflect.Array; 

public class Testing1 {
    public static void main(String[ ] args) {

        // String[] str = {"asdfa", "dadafdfasdfadsf", "ads", "ad"};

        int num = someMethod({"asdfa", "dadafdfasdfadsf", "ads", "ad"});

        System.out.println(num);
    }

    public static int someMethod(String[] str) {

        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < str.length; i++) {
            if (min > str[i].length()) {
            min = str[i].length();
            }
        }
        return min;
    }
}