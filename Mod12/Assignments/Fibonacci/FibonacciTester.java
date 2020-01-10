import java.util.Scanner;

/**
 * This class will use Fibonacci.java to calculate the fibonacci sequence
 * 
 * @author Max Gordon
 * @version 01/10/2020
 */

public class FibonacciTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Element to calculate (\"q\" to quit): ");

            String userInput = input.nextLine();
    
            if (userInput.equalsIgnoreCase("q")) {
                break;
            }

            int inputInt =  Integer.parseInt(userInput);

            if (inputInt < 0) {
                System.out.println("\n[Please input a valid number (>0)] ");
                continue;
            }

            Fibonacci sequence = new Fibonacci(inputInt);
    
            System.out.println("\t" + sequence.calc());
    
        }
    }
}