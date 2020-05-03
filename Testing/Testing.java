
/**
 * 
 * @author Max Gordon
 * @version 01/14/2020
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        String[] fruits = {"apple", "pear", "mango", "peach"};
int i = 3;
String str = "p";

for(String item : fruits)
{
   i = item.indexOf("p") + 2;
   str += item.substring(i);
}

System.out.println(str);
    }
}