/**
 * Annual Weather description:
 * 
 * @author Max Gordon
 * @version 10/1/19
 *
 */
import java.util.Scanner;

public class AnnualWeatherV1 {
    public static void main (String [ ] args) {

        //Declare and initialize variables
        Scanner input = new Scanner(System.in);
        String city = "Miami";
        String state = "Florida";

        // Dynamic Values
        double aveTemp = 0.0;
        double totalTemp = 0.0;
        double totalPrecip = 0.0;


        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec." };


        System.out.print("Do you want to input custom data [Y/N]: ");
        String yn = input.nextLine();

        while (!yn.equalsIgnoreCase("y") && !yn.equalsIgnoreCase("n")) {
            yn = input.nextLine();
        }

        // Arrays for Miami
        Double [] temperature = {68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};     //initialize with Fahrenheit values
        Double [] precipitation = {1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};      //initialize with inch values

        // Arrays for Tallahassee
        // double [] temperature = {51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};     //initialize with Fahrenheit values
        // double [] precipitation = {66.2, 67.2, 70.6, 73.8, 78.2, 81.2, 82.5, 82.8, 81.7, 78.1, 73.1, 68.3};      //initialize with inch values

        if (yn.equalsIgnoreCase("y")) {

            // Get temperature-precipitation data
            System.out.print("Add your temperature data: ");
            for (int i = 0; i < 12; i++) {
                temperature[i] = input.nextDouble();
            }
            System.out.print("Add your precipitation data: ");
            for (int i = 0; i < 12; i++) {
                precipitation[i] = input.nextDouble();
            }

            // Get City-state data
            System.out.print("What is the city and state for this data: ");
            city = input.next();
            System.out.println();
            System.out.print("What state is that city in: ");
            state = input.nextLine();

        }

        
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
    

        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println("_____________________________________________________");

        // Calculate and print data
        for(int index = 0; index < temperature.length; index++) {
            totalTemp += temperature[index];
            totalPrecip += precipitation[index];

            System.out.printf("%s\t\t%f\t\t%f%n", month[index], temperature[index], precipitation[index]);
  
        }

        System.out.println("_____________________________________________________\n");

        aveTemp = (int)((totalTemp / temperature.length) * 100) / 100.0;

        // Print final data
        System.out.println("Average Temperature: " + aveTemp + "    Total Precipitation: " + totalPrecip);

        input.close();
    }//end main
}//end class