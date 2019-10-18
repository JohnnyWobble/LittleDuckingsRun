/**
 * This will calculate your total daily energy expenditure
 * 
 * @author Max Gordon
 * @version 10/17/2019
 */ 

import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take in data
        System.out.print("Name:         ");
        
        String name = input.nextLine();

        System.out.print("BMR:          ");

        String bmr = input.nextLine();

        System.out.print("Gender [M/F]: ");

        String gender = input.nextLine().toUpperCase();

        while (!(gender.equals("M") || gender.equals("F"))) {
            System.out.println("[Err: Bad input]");
            System.out.print("Gender [M/F]: ");
            gender = input.nextLine().toUpperCase();
        }
        // Prints
        System.out.println("\n    Select your activity level:");
        System.out.println("[A] Resting	Sleeping, reclining");
        System.out.println("[B] Sedentary (e.g., watching TV, reading, etc.)");
        System.out.println("[C] Light (e.g., walking, laundry, walking on level ground at 2.5 – 3.0 mph");
        System.out.println("[D] Moderate (e.g., dancing, cycling, gardening, etc.)");
        System.out.println("[E] Very Active (e.g., team sports, climbing, agricultural labor, etc.)");
        System.out.println("[F] Extremely Active (e.g., full-time athletes, construction workers, etc.)");

        // Interface with user
        System.out.print("\nWhat is your choice: ");
        String choice = input.nextLine().toUpperCase();
        while (!(choice.equals("A") || choice.equals("B") || choice.equals("C") || choice.equals("D") || choice.equals("E") || choice.equals("F"))){
            System.out.println("[Err: Bad input]");
            System.out.print("What is your choice: ");
            choice = input.nextLine().toUpperCase();
        }

        double val1;
        double val2;
        double val3;
        double val4;
        

        // Calculations
        if (gender.equals("M")) {
            val1 = 1.6;
            val2 = 1.7;
            val3 = 2.1;
            val4 = 2.4;
        } else {
            val1 = 1.5;
            val2 = 1.6;
            val3 = 1.9;
            val4 = 2.2;
        }

        double bmrDouble = Double.parseDouble(bmr);
        double tdee = 0;
        double activityFactor = 0;

        if (choice.equals("A")) {
            tdee = bmrDouble;
            activityFactor = 1;
        } else if (choice.equals("B")) {
            tdee = bmrDouble * 1.3;
            activityFactor = 1.3;
        } else if (choice.equals("C")) {
            tdee = bmrDouble * val1;
            activityFactor = val1;
        } else if (choice.equals("D")) {
            tdee = bmrDouble * val2;
            activityFactor = val2;
        } else if (choice.equals("E")) {
            tdee = bmrDouble * val3;
            activityFactor = val3;
        } else if (choice.equals("F")) {
            tdee = bmrDouble * val4;
            activityFactor = val4;
        }

        tdee = (int)(tdee*10)/10.0;

        // Print results
        System.out.println("\n========================================\n");
        System.out.println("Name:            " + name);
        System.out.println("Gender:          " + gender);
        System.out.println("BMR:             " + bmr + " calories");
        System.out.println("Activity factor: " + activityFactor);
        System.out.println("TDEE:            " + tdee + " calories");
    }
}