import java.util.Scanner;   

public class Testing1 {
    public static void main(String[ ] args) {
        // Scanner in = new Scanner(System.in);/
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        System.out.println(firstName);
        

        // System.out.println("Please enter a sentence: ");
        // String firstWord = in.next();
        // String restOfLine = in.nextLine();
        // System.out.println("First word: " + firstWord);
        // System.out.println("Rest of sentence: " + restOfLine);
        // String sentence = firstWord + restOfLine;
        // System.out.println("Whole sentence: " + sentence);
        // print("'" + restOfLine + "'");
        
    }

    public static void print(String str) {
        System.out.println(str);
    }
}