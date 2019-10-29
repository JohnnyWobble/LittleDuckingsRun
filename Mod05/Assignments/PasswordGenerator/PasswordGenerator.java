/**
 * This will generate a secure password for you
 * 
 * @author Max Gordon
 * @version 10/23/2019
 */ 
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class PasswordGenerator {
    public static void main(String[] args) throws IOException {

        File file = new File("passwords.txt");
        file.createNewFile();
        Scanner input = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(file);

        System.out.println(" _____________________________________________________");
        System.out.println("|                                                     |");
        System.out.println("|  [1] Lowercase Letter                               |");
        System.out.println("|  [2] Upper and Lowercase Letters                    |");
        System.out.println("|  [3] Uppercase, Lowercase, and numbers              |");
        System.out.println("|  [4] Uppercase, Lowercase, numbers, and symbols     |");
        System.out.println("|  [5] Quit                                           |");
        System.out.println("|_____________________________________________________|"); 

        while (true) {

            System.out.print("\nEnter selection [1-5]: ");

            // tmp data
            String selection = input.nextLine();

            // Get selection
            while (!(selection.equals("1") || selection.equals("2") || selection.equals("3") || selection.equals("4") || selection.equals("5"))){
                System.out.print("Err: Bad input\nEnter selection [1-5]: ");
                selection = input.nextLine();
            }

            if (selection.equals("5")) {
                break;
            }

            System.out.print("\nHow long will you password be [more then 5]: ");

            // tmp data
            String length = "";
            int lengthInt = 0;

            // Get password length
            while (true) {
                length = input.nextLine();
                for (char lengthChar: length.toCharArray()) {
                    if (!Character.isDigit(lengthChar)) {
                        System.out.print("Err: Bad input\nHow long will you password be [>6]: ");
                        continue;
                    }
                }
                if (Integer.parseInt(length) < 6) {
                    System.out.print("Err: Bad input\nHow long will you password be [>6]: ");
                    continue;
                } else {
                    lengthInt = Integer.parseInt(length);
                    break;
                }
            }

            // tmp Data
            double rand = 0;
            int counter = 0;

            // Make Passwords
            while (counter < lengthInt) {
                rand = Math.random();

                // Lower
                if (selection.equals("1")) {
                    rand = (int)(rand * 26) + 97;
                    outFile.print((char)rand);


                // Upper and Lower
                } else if (selection.equals("2")) {
                    rand = (int)(rand * 52) + 65;
                    if (rand > 90) {
                        rand += 7;
                    }
                    outFile.print((char)rand);

                // Upper, Lower, and Numbers
                } else if (selection.equals("3")) {
                    rand = (int)(rand * 62) + 48;
                    if (rand > 57) {
                        rand += 7;
                        if (rand > 90){
                            rand += 6;
                        }
                    }
                    outFile.print((char)rand);

                // Upper, Lower, Numbers, and Symbols
                } else if (selection.equals("4")) {
                    rand = (int)(rand * 78) + 48;
                    outFile.print((char)rand);
                }
                counter++;
            }

            // Add passwords to a \n separated list
            outFile.print("\n");
        }
        outFile.close();

        Scanner inFile = new Scanner(file);

        // Print data
        System.out.println("\n\nThank you for using PasswordGenerator!\n");
        System.out.println(" --- Passwords ---\n");
        while (inFile.hasNextLine()) {
            System.out.println(inFile.nextLine());
        }
        inFile.close();
        input.close();
        
    }
}