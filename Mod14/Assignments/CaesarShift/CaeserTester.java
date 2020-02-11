import java.util.Scanner;

/**
 * This will run the Encryption and Decryption class for the user so they can encrypt and decrypt stuff
 * 
 * @author Max Gordon
 * @version 02/10/2020
 */

public class CaeserTester {
    public static void main(String[] args) {
        Encryption enc = new Encryption(getKey());
        Decryption dec = new Decryption(enc.getOffset());

        System.out.println("The new alphabet is: " + Encryption.makeCipherAlphabet(enc.getOffset()));

        String command = userChoice();
        while (!command.equals("q")) {
            if (command.equals("e")) {
                System.out.println(Encryption.encrypt(getInput("encrypt"), enc.getOffset()));
            } else {
                System.out.println(Decryption.decrypt(getInput("decrypt"), dec.getOffset()));
            }
            if (doesUserWantToQuit()) {
                break;
            }
        }
    }

    public static String userChoice() {
        String choice = "";
        Scanner in = new Scanner(System.in);

        System.out.print("[E]ncrypt or [D]ecrypt or [Q]uit: ");
        choice = in.next();
        while (!choice.equalsIgnoreCase("e") && !choice.equalsIgnoreCase("d") && !choice.equalsIgnoreCase("q")) {
            System.out.print("[Error: bad input] ");
            choice = in.next();
        }
        return choice.toLowerCase();
    }

    public static int getKey() {
        Scanner in = new Scanner(System.in);
        System.out.print("How far do you want to shift: ");
        return in.nextInt() % 26;
    }

    public static String getInput(String say) {
        Scanner in = new Scanner(System.in);
        System.out.print("What do you want to " + say + ": ");
        return in.nextLine();
    }

    public static boolean doesUserWantToQuit() {
        Scanner in = new Scanner(System.in);
        System.out.print("Continue [Y/n]: ");
        String choice = in.nextLine().toLowerCase();
        return choice.equals("n");
    }
}