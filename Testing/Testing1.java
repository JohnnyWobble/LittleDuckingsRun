import java.util.Random;
import java.util.Scanner;  
import java.lang.reflect.Array; 

public class Testing1 {
    public static void main(String[ ] args) {

        double times[] = {20.3, 22.5, 28.5, 24.6, 19.8, 26.7, 25.5};

        double average = 0.0;
        double total = 0.0;
        
        double min = Integer.MAX_VALUE;
        doutble max = Integer.MIN_VALUE;
        
        for (int i = 0; i < times.length; i++) {
        
        if (min > times[i]) {
        min = times[i];
        } else if (max < times[i]) {
        max = times[i];
        }
        }
        
        System.out.println("Your times, parsed for maximum and minimum are: ");
        
        for (double time : times) {
        
        if (time != min && time != max) {
        System.out.print(time + " ");
        total += time;
        }
        }
        System.out.println("\nAnd your average was " + (total / (times.length - 2)));
        
        

    }
}