 package Mod02.Assignments.CalculationsV6;
/**
 * This displays a few equations and examples of math 
 * @author Max Gordon
 * @version 9/18/19
 */

public class CalculationsV6 {
    public static void main(String[ ] args) {

        
        int d = 65/10;

        System.out.println(d);

        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;

        // Declare double variables
        double dNum1 =43.21;
        double dNum2 = 3.14;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();


        // Declare integer variables
        int iNum3 = 11;
        int iNum4 = 9;
        int iNum5 = 25;

        // Declare double variables
        double dNum3 = 3.14;
        double dNum4 = 10.0;


        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum4 + " - " + iNum5 + " = " + (iNum3 - iNum4 - iNum5));
        System.out.println(dNum3 + " - " + dNum4 + " = " + (dNum3 - dNum4));
        System.out.println();

        // Declare integer variables
        int iNum6 = 25;
        int iNum7 = 9;

        // Declare double variables
        double dNum5 = 3.14;
        double dNum6 = 10.0;
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum6 + " * " + iNum7 + " = " + (iNum7 * iNum6)); 
        System.out.println(dNum5 + " * " + dNum6 + " * " + dNum6 + " = " + (dNum5 * dNum6 * dNum6));
        System.out.println();

        // Define integer variables
        int iNum8 = 9;
        int iNum9 = 25;
        
        // Define double variables
        double dNum7 = 43.21;
        double dNum8 = 10.0;

        // Division
        System.out.println("Division");
        System.out.println( iNum8 + " / " + iNum9 + " = " + (iNum8 / iNum9));
        System.out.println( dNum7 + " / " + dNum8 +  " = " + (dNum7 / dNum8));
        System.out.println();

        // Define integer variables
        int iNum10 = 11;
        int iNum11 = 9;

        // Declare double variables
        double dNum9 = 10.0;
        double dNum10 = 3.24;

        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum10 + " % " + iNum11 + " = " + (iNum10 % iNum11));
        System.out.println( dNum9 + " % " + dNum10 + " = " + (dNum9 % dNum10));
        System.out.println();

        // Define integer variables
        int iNum12 = 3;
        int iNum13 = 29;
        int iNum14 = 15;
        int iNum15 = 7;

        // 2.03 Additional int Equations
        System.out.println("Additional int equations");
        System.out.println( iNum12 + " * ( " + iNum13 + " / " + iNum14 + " ) + " + iNum15 + " = " + (iNum12 * (iNum13 / iNum14) + iNum15));
        System.out.println( iNum14 + " - " + iNum12 + " + " + iNum15 + " = " + (iNum14 - iNum12 + iNum15));
        System.out.println( iNum13 + " % " + iNum12 + " % " + iNum15 + " = " + (iNum13 % iNum12 % iNum15));
        System.out.println();

        // Declare double variables
        double dNum11 = 4.56;
        double dNum12 = 17.32;
        double dNum13 = 12.98;
        double dNum14 = 0.83;
        double dNum15 = 9.37;
        double dNum16 = 23.72;

        //2.04 Additional double Equations
        System.out.println("Addition double equations");
        System.out.println( dNum11 + " * " + dNum12 + " + " + dNum13 + " = " + (dNum11 * dNum12 + dNum13));
        System.out.println( dNum14 + " % " + dNum15 + " - " + dNum11 + " = " + (dNum14 % dNum15 - dNum11));
        System.out.println( dNum16 + " / " + dNum15 + " * " + dNum11 + " = " + (dNum16 / dNum15 * dNum11));
        System.out.println();
    }
}