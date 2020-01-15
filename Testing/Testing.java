/**
 * 
 * @author Max Gordon
 * @version 01/14/2020
 */

public class Testing {
    public static void main(String[] args) {
        // System.out.println(recur);
        System.out.println( recur("mouse", 1));
    }

    public static String recur(String str, int n)
{
     if(n >= str.length())
     {
          return str;
     }

     return str + recur(str.substring(n + 1), n);
}

    public static void recur(String str) {
        int len = str.length();
        if (len > 1) {
            String temp = str.substring(0, len - 2);
            recur(temp);
            System.out.println(temp);
        }
    }

    public static void mystery(int n) {
        if (n > 5) {
            System.out.print(n + " ");
        } else {
            mystery(n + 3);
        }
    }

    public static int mystery(int n, boolean a) {
        if (n > 5) {
            return mystery(n - 2, false) + 2;
        }

        return n + 2;
    }
}