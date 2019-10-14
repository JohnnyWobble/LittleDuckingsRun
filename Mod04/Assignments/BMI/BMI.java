/**
 * A program to calculate the BMI of the user
 * 
 * @author Max Gordon
 * @version 10/14/2019
 */ 

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Data collection
        System.out.print("Name (First Last):              ");
        
        String firstName = input.next();
        String lastName = input.nextLine();
        String name = firstName + lastName;

        System.out.print("Weight in pounds:               ");

        String weightLB = input.nextLine();

        System.out.print("Enter your height (e.g. 5 7):   ");

        String heightFoot = input.next();
        String heightInch = input.nextLine();
        
        // Data calculation
        double weightKG = (int)(Double.parseDouble(weightLB) * 10 / 2.205) / 10.0;

        double totalHeightInch = Double.parseDouble(heightInch) + (Double.parseDouble(heightFoot) * 12);
        double heightM = (int)(totalHeightInch * 10 / 39.37) / 10.0;

        double bmi = (int)(weightKG / Math.pow(heightM, 2) * 10) / 10.0;
        
        String status = "";

        // BMI category decision
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (18.5 <= bmi && bmi <= 24.9) {
            status = "Normal";
        } else if (25 <= bmi && bmi <= 29.9) {
            status = "Overweight";
        } else if (29.9 < bmi) {
            status = "Obese";
        }

        // Final print
        System.out.println("\n ------------- BMI ------------- \n");
        System.out.println("Name:          " + firstName + lastName);
        System.out.println("Height (m):    " + heightM);
        System.out.println("Weight (kg):   " + weightKG);
        System.out.println("BMI:           " + bmi);
        System.out.println("Category:      " + status);
    }
}