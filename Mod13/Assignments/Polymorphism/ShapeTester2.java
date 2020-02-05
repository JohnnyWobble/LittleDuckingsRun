import java.util.ArrayList;

/**
 * This with use the other class, Circle2, Cylinder2, Oval2, OvalCylinder2 
 * 
 * @author Max Gordon
 * @version 02/03/2020
 */

public class ShapeTester2 {
    public static void main(String[] args) {
        ArrayList<Circle2> list = new ArrayList<Circle2>(5);

        list.add(0, new Circle2(6, 5, 3));
        list.add(1, new Cylinder2(8, 3, 5, 9));
        list.add(2, new Oval2(10, 1, 3, 4));
        list.add(3, new OvalCylinder2(2, 3, 8, 5, 1));

        for (Circle2 cir : list) {
            showCenter(cir);
        }
    }

    /**
     * This method will print out the center of a circle object, or relating subclass
     * @param obj The circle to print the data from
     */
    public static void showCenter(Circle2 obj) {
        System.out.printf("For this %s the %s.\n", obj.getName(), obj.getCenter());
    }
}