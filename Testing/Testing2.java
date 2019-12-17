/**
 * Testing different logical operators when calculating triangles
 * 
 * @author Max Gordon
 * @version 12/12/2019
 */

public class Testing2 {
    public static void main(String[] args) {
        System.out.println("--- With AND ---");
        System.out.println(calcTriAnd(3, 5, 4));        // Right triangle, should be false
        System.out.println(calcTriAnd(1, 1, 1));        // Equilateral triangle, should, be true
        System.out.println(calcTriAnd(100, 100, 1));    // Acute triangle, should be true
        System.out.println(calcTriAnd(100, 100, 200));  // Obtuse triangle, should be false
        System.out.println("--- With OR ---");
        System.out.println(calcTriOr(3, 5, 4));         // Right triangle, should be false
        System.out.println(calcTriOr(1, 1, 1));         // Equilateral triangle, should, be true
        System.out.println(calcTriOr(100, 100, 1));     // Acute triangle, should be true
        System.out.println(calcTriOr(100, 100, 200));   // Obtuse triangle, should be false

        
    }

    public static boolean calcTriAnd(int side1, int side2, int side3) {
        if (Math.pow(side1, 2) < Math.pow(side2, 2) + Math.pow(side3, 2) && Math.pow(side2, 2) < Math.pow(side1, 2) + Math.pow(side3, 2) && Math.pow(side3, 2) < Math.pow(side2, 2) + Math.pow(side1, 2)) {
            return true;
        }
        return false;
    }

    public static boolean calcTriOr(int side1, int side2, int side3) {
        if (Math.pow(side1, 2) < Math.pow(side2, 2) + Math.pow(side3, 2) || Math.pow(side2, 2) < Math.pow(side1, 2) + Math.pow(side3, 2) || Math.pow(side3, 2) < Math.pow(side2, 2) + Math.pow(side1, 2)) {
            return true;
        }
        return false;
    }
}