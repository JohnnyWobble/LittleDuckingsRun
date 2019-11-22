import java.util.Random;
import java.util.Scanner;  
import java.lang.reflect.Array; 

public class Testing1 {

    public Testing1() {

    }


    public static void main(String[ ] args) {

        String[] arr = {"lmao", "asdfasdfa", "asdf", "asfasfsdfasdfasdfasdff"};

        System.out.println(someMethod(arr));
    }

    public static int someMethod(String[] str) {

        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < str.length; i++) {
        if (max < str[i].length()) {
        max = str[i].length();
        }
        }
        return max;
        }
}