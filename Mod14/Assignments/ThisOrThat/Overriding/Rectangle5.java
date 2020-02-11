import org.w3c.dom.css.Rect;

/**
 * This class defines a Rectangle object using length and width. The toString
 * method has been added.
 *
 *
 * @author Max Gordon
 * @version 2/5/20
 */
public class Rectangle5 {
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle5(int length, int width) {
        // initialize instance variables
        this.length = length;
        this.width = width;
    }

    // return the height
    public int getLength() {
        return this.length;
    }

    // return the width
    public int getWidth() {
        return this.width;
    }

    // String to display when object is printed.
    @Override
    public String toString() { 
        return "Rectangle - " + this.length + " X " + this.width; 
    }

    public boolean equals(Rectangle5 other) {
        return (this.length == other.getLength() && this.width == other.getWidth());
    }
}