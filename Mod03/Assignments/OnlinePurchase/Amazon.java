/**
 * This will interact with the user and generate an e-receipt
 * 
 * @author Max Gordon
 * @version 10/11/2019
 */ 
import java.util.Scanner;

public class Amazon {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Name
        System.out.println("Hi! Welcome to Amazon! How can I help you?\n");
        System.out.print("Please enter your first and last name: ");
        
        String userFirstName = input.next();
        String userLastName = input.nextLine();

        // Date
        System.out.print("Hi " + userFirstName + ". Please enter today's date (MM/DD/YYYY): ");

        String date = input.nextLine();

        // Type of item
        System.out.print("Please enter the item you want to purchase: ");

        String item = input.nextLine();

        // Cost
        System.out.print("Please enter the cost of the " + item + ": ");

        String cost_str = input.nextLine();

        // Number of items
        System.out.print("Please enter the total number of " + item + "s do you want: ");

        String numberOfItems_str = input.nextLine();

        // credit card
        System.out.print("Please enter your credit card number (#####-###-####): ");

        String creditCardNum = input.nextLine();

        // pin
        System.out.print("Please edit your PIN (####): ");

        String pin = input.nextLine();

        System.out.print("\n ----- Please wait while your order is being processed -----\n|");  // Start loading
        for (int i = 0; i < 59; i++) {
            System.out.print('=');
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        };
        System.out.print("|");  // done

        System.out.println("\n\nYour e-receipt:\n\n");
        System.out.println(date.substring(0, 2) + "-" + date.substring(3, 5) + "-" + date.substring(6, 10));
        System.out.println("Order Number: " + userFirstName.substring(0, 1) + userLastName.substring(1, 2) + date.substring(0, 2) + date.substring(3, 5));
        System.out.println("\n    " + userFirstName.substring(0, 1) + "." + userLastName);
        System.out.println("    Account:        #####-###-" + creditCardNum.substring(10, 14));
        System.out.println("    Item:           " + item);
        System.out.println("    Item Count:     " +  numberOfItems_str);
        System.out.println("    Price Per Item: " + cost_str);
        System.out.println("    Total Cost:     " + ( Integer.parseInt(numberOfItems_str) * Double.parseDouble(cost_str)));
        System.out.println("\n  You will be billed $" + ( Integer.parseInt(numberOfItems_str) * Double.parseDouble(cost_str)));
        System.out.println("\nHave a nice day!");
    }
}
