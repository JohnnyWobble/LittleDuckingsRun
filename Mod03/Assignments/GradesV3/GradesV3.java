/**
 * This is a basic representation of a grade calculator with inputs
 * 
 * @author Max Gordon
 * @version 10/9/19
 */
import java.util.Scanner;


public class GradesV3 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);
        
        // Arrays to store data
        String strArr[] = {"", "", "", "", "", "", "", "", "", ""};
        double doubleArr[] = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        // Get the name
        System.out.print("Name: ");
        String userName = input.nextLine();

        // Get tests
        System.out.println("Enter the subject then the score of the test (up to 10 tests), e.g. 'Math 97', then enter 'done' to finish");
        int counter = 0;

        // First input, its like this so it can check for "done" easier
        System.out.print("> ");
        strArr[counter] = input.next();

        // Subsequent inputs
        while (counter < 9 && !strArr[counter].equals("done")) {
            doubleArr[counter] = input.nextDouble();
            counter++;

            // technically this is the start of the visual loop
            System.out.print("> ");
            strArr[counter] = input.next();
            if (counter == 9) {
                doubleArr[counter] = input.nextDouble();
            };
        };

        // variable used for calculating the test stuff
        int testNumber = 0;
        double totalPoints = 0;
        double score;
        double average = 0.0;
        String nameOfTest;

        // prints iteratively
        for (int i = 0; i < 10; i++) {
            if (doubleArr[i] == 0.0) {
                break;
            }
            testNumber++;
            score = doubleArr[i];
            nameOfTest = strArr[i];
            totalPoints += score;
            average = totalPoints/testNumber;

            // Print the data
            System.out.println(nameOfTest + " test: " + score +  "   Total Points: " + totalPoints + "   Average Score: " + average);
        };

        // Final scores
        System.out.println("\n--------- Total for " + userName + " ---------\n");
        System.out.println("Of " + testNumber + " test(s), your average was " + average + " with a total of " + totalPoints + " points!");
    }
}