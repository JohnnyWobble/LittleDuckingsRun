import java.util.Scanner;   

public class Testing1 {
    public static void main(String[ ] args) {
        // int[] arrNum = {1, 2, 3, 4, 5, 6};
        double [] numList = {4.17, 3.11, 2.46, 1.57};
        int x = 0;
        for(double n : numList)
        {
           x += (int)n + 1;
        }
        System.out.println(x);
    }
}