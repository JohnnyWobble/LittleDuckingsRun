
/**
 * This class demonstrates polymorphism with
 * object declarations and the static method
 * to print values.
 *
 * @author Max
 * @version 2/3/20
 */
public class ShapesTester2
{
    public static void polyMorph(Rectangle2 r)
    {
        System.out.println("For " + r.getName() + ": ");
        System.out.println("    length is " + r.getLength());
        System.out.println("    width is " + r.getWidth());
    }

    public static void main (String []args)
    {
        Rectangle2 rectangle = new Rectangle2(2, 4);
        Box2 box = new Box2(4,10,4);

        polyMorph(rectangle);
        System.out.println();

        polyMorph(box);
        // System.out.println("    height is " + box.getHeight());
        // System.out.println(box);
        System.out.println("    height is " + ((Box2)box).getHeight() );
    }
}