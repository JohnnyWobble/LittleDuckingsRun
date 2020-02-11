
/**
 * This class demonstrates classes that overrides
 * the toString method.
 *
 * @author Max Gordon
 * @version 2/5/20
 */
import java.util.*;

public class ShapesTester5 {
    public static void main(String[] args) {

        // Print all shapes
        ArrayList<Rectangle5> shapes = new ArrayList<Rectangle5>();

        shapes.add(new Rectangle5(5, 20));
        shapes.add(new Box5(4, 10, 5));
        shapes.add(new Cube5(10));
        shapes.add(new Square5(11));
        shapes.add(new ExtrudedSquare5(9, 13));

        for (Rectangle5 rect : shapes) {
            showEffectBoth(rect);
        }

        System.out.println("\n\nTests for equality:\n");

        testEquality(new Box5(13, 13, 9), new ExtrudedSquare5(13, 9));
        testEquality(new Box5(3, 4, 20), new ExtrudedSquare5(4, 20));
        testEquality(new Rectangle5(5, 7), new Square5(6));
        testEquality(new Rectangle5(8, 8), new Square5(8));
    }

    public static void showEffectBoth(Rectangle5 r) {
        System.out.println(r);
        
    }

    public static void testEquality(Rectangle5 one, Rectangle5 two) {
        if (one.equals(two)) {
            System.out.println(one.toString() + "  IS the same size as  " + two.toString());
        } else {
            System.out.println(one.toString() + "  IS NOT the same size as  " + two.toString());
        }
        System.out.println();

        // Box5 box = new Box4(13, 13, 9);
        // ExtrudedSquare4 extrudedSquare = new ExtrudedSquare4(13, 9);
        // System.out.println(box.equals(extrudedSquare));
    }

}