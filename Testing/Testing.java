
/**
 * 
 * @author Max Gordon
 * @version 01/14/2020
 */
import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        	

        ArrayList<String> digits = new ArrayList<String>();
        for (int k = 0; k <= 9; k++)
          digits.add("" + k);
        
        for (int k = 0; k <= 4; k++)
        {
          String d1 = digits.remove(k);
          String d2 = digits.remove(k);
          digits.add(k, d1 + "+" + d2);
        }
        System.out.println(digits);
    }

    
private static int product(int n)
{
  if (n <= 1)
    return 1;
  else
    return n * product(n-2);
}



    public static void change(double[] nums, int n)              
    {
      for (int k = 0; k < n; k++)
      {
        nums[k] = 5.4;
      } 
      n = 2;
    }
}