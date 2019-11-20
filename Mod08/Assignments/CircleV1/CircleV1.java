/**
 * This will provide some cool functions for circles
 * 
 * @author Max Gordon
 * @version 11/18/2019
 */
import java.util.Scanner;
public class CircleV1 {
    
    // default constructor
    public CircleV1() {
    }

    public double getInput() {
        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Please input a radius: ");

        // Parse input
        double radius = input.nextDouble();

        // Check the validity of the user input
        while (radius <= 0) {
            System.out.print("Please input a radius: ");
            radius = input.nextDouble();
        }
        return radius;
    }

    public double[] getData(double radius) {

        // Calculate all of the data
        double circumference = Math.PI * 2 * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Organize the data into an array for an easy return
        double[] arr = {circumference, area, volume};

        return arr;
    }

    public String setupData(double radius, double[] dataSet) {

        // Turns the data into more readable strings
        String header = "\n\nRadius      Circumference     Area        Volume\n";
        String line =   "_________________________________________________\n";
        String fStatement = String.format("%-6.2f     %6.2f            %6.2f       %6.2f\n", radius, dataSet[0], dataSet[1], dataSet[2]);
        
        // return the concatenated strings
        return header + line + fStatement;
    }

    public static void main(String[] args) {

        // Create object
        CircleV1 circle = new CircleV1();

        // get user input
        double radius = circle.getInput();
        
        // Calculate data
        double[] dataArr = circle.getData(radius);

        // Organize data to be read
        String printData = circle.setupData(radius, dataArr);

        // Print data
        System.out.println(printData);
        
    }
}