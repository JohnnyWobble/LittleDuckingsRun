/**
 * This is a basic representation of a grade calculator
 * 
 * @author Max Gordon
 * @version 10/1/19
 */

 public class GradesV2 {
     public static void main(String[] args) {
         
        //local variables
        int numTests = 0;      //counts number of tests
        // int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade

        // test grades
        int test1 = 95;
        int test2 = 73;
        int test3 = 91;
        int test4 = 82;
        int test5 = 95;
        int test6 = 96;
        int test7 = 68;
        int test8 = 87;
        int test9 = 99;

        int arr1[] = {test1, test2, test3, test4, test5, test6, test7, test8, test9} ;

        // print scores
        for (int testGrade : arr1) {
            numTests++;
            totalPoints += testGrade;
            average = (double)totalPoints/numTests;
            System.out.println("Test # " + numTests + "   Test Grade: " + testGrade + "   Total Points: " + totalPoints + "   Average Score: " + average);
        }        
        
     }
 }