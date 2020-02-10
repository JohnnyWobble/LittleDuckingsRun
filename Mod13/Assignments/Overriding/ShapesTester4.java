
/**
 * This class demonstrates classes that overrides
 * the toString method.
 *
 * @author Max Gordon
 * @version 2/5/20
 */
import java.util.*;

public class ShapesTester4 {
    public static void main(String[] args) {

        // Print all shapes
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add(new Rectangle4(5, 20));
        shapes.add(new Box4(4, 10, 5));
        shapes.add(new Cube4(10));
        shapes.add(new Square4(11));
        shapes.add(new ExtrudedSquare4(9, 13));

        for (Rectangle4 rect : shapes) {
            showEffectBoth(rect);
        }

        System.out.println("\n\nTests for equality:\n");

        testEquality(new Box4(13, 13, 9), new ExtrudedSquare4(13, 9));
        testEquality(new Box4(3, 4, 20), new ExtrudedSquare4(4, 20));
        testEquality(new Rectangle4(5, 7), new Square4(6));
        testEquality(new Rectangle4(8, 8), new Square4(8));
    }

    public static void showEffectBoth(Rectangle4 r) {
        System.out.println(r);
        
    }

    public static void testEquality(Rectangle4 one, Rectangle4 two) {
        if (one.equals(two)) {
            System.out.println(one.toString() + "  IS the same size as  " + two.toString());
        } else {
            System.out.println(one.toString() + "  IS NOT the same size as  " + two.toString());
        }
        System.out.println();

        // Box4 box = new Box4(13, 13, 9);
        // ExtrudedSquare4 extrudedSquare = new ExtrudedSquare4(13, 9);
        // System.out.println(box.equals(extrudedSquare));
    }

}