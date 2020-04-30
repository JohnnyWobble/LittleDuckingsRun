
/**
 * 
 * @author Max Gordon
 * @version 01/14/2020
 */
import java.util.ArrayList;

public class Testing {
    public static String a;

    public static void main(String[] args) {
        int n = 5;
                    
        double[][] amps = new double[n][n];
        for (double[] r : amps)
        {
          for (int k = 0; k < n; k++)
          {
            r[k] = Math.random();
          }
        }

        for (var r : amps) {
            for (var c : r) {
                System.out.print(c + ", ");
            }
            System.out.println();
        }
    }

    private String x;
  
    public void feed(String number)
    {
      if (x == null || x.compareTo(number) < 0)
        x = number;
    }
  
    public String get()
    {
      return x;
    }

    public static void l() {
        a.length();
    }

    public static void printSomething(String s) {
        int n = s.length();
        if (n < 1)
            return;
        String s1 = s.substring(1, n);
        printSomething(s1);
        System.out.println(s);
        printSomething(s1);
    }

    public static int fun(int n) {
        int product = 2;
        for (int k = 2; k < n; k++)
            product *= fun(k);

        System.out.println(product + "   " + n);
        return product;
    }

}