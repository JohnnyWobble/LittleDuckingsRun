import org.w3c.dom.css.Rect;

/**
 * This class defines a Rectangle object using length and width. The toString
 * method has been added.
 *
 *
 * @author Max Gordon
 * @version 2/5/20
 */
public class Rectangle4 {
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w) {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength() {
        return length;
    }

    // return the width
    public int getWidth() {
        return width;
    }

    // String to display when object is printed.
    @Override
    public String toString() { 
        return "Rectangle - " + length + " X " + width; 
    }

    public boolean equals(Rectangle4 other) {
        return (length == other.getLength() && width == other.getWidth());
    }
}