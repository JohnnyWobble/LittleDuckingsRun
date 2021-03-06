/**
 * This class defines a Box object by extending Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Max Gordon
 * @version 2/5/20
 */
public class Box4 extends Rectangle4 {
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int length, int width, int height) {
        // call superclass
        super(length, width);

        // initialize instance variables
        this.height = height;
    }

    // return the height
    public int getHeight() {
        return this.height;
    }

    // String to display when object is printed.
    @Override
    public String toString() { 
        return "Box - " + getLength() +" X " + getWidth() + " X " + this.height; 
    }

    public boolean equals(Box4 other) {
        return (getLength() == other.getLength() && getWidth() == other.getWidth() && this.height == other.getHeight());
    }
}