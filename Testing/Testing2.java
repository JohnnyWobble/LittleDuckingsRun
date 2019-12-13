/**
 * <desciption>
 * 
 * @author Max Gordon
 * @version 12/09/2019
 */

public class Testing2 {
    public static void main(String[] args) {
        System.out.println(calcTri(3, 5, 4));
        System.out.println(calcTri(1, 1, 1));
        System.out.println(calcTri(100, 100, 1));
        System.out.println(calcTri(100, 100, 200));
        // System.out.println(calcTri(side1, side2, side3));
        
    }

    public static boolean calcTri(int side1, int side2, int side3) {
        // System.out.println(Math.pow(side1, 2) + "   " + Math.pow(side2, 2) + Math.pow(side3, 2));
        // System.out.println(Math.pow(side2, 2) + "   " + Math.pow(side1, 2) + Math.pow(side3, 2));
        // System.out.println(Math.pow(side3, 2) + "   " + Math.pow(side2, 2) + Math.pow(side1, 2));
        if (Math.pow(side1, 2) < Math.pow(side2, 2) + Math.pow(side3, 2)
                && Math.pow(side2, 2) < Math.pow(side1, 2) + Math.pow(side3, 2)
                && Math.pow(side3, 2) < Math.pow(side2, 2) + Math.pow(side1, 2)) {
            return true;
        }
        return false;
    }
}