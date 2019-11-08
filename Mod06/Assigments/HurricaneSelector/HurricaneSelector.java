/**
 * This will show some interesting data about some hurricanes
 * 
 * @author Max Gordon
 * @version 11/6/2019
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class HurricaneSelector {
    public static void main(String[] args) throws IOException {
        //read data from text file & put in an array
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        Scanner input = new Scanner(System.in);
        int numValues = 0;

        // Take input from the user
        System.out.print("What is the range of data you want to see from 1995 to 2015?[YYYY YYYY] ");
        int year1 = input.nextInt();
        int year2 = input.nextInt();

        while (!(year1 <= year2 && year1 >= 1995 && year2 <= 2015)) {
            System.out.print("What is the range of data you want to see from 1995 to 2015?[YYYY YYYY] ");
            year1 = input.nextInt();
            year2 = input.nextInt();
        }

        input.close();

        //count number of lines in text file
        while (inFile.hasNextLine() ) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeedsKTS = new double[numValues];
        double [] windSpeedsMPH = new double[numValues];
        String [] names = new String[numValues];
        int [] category = new int[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() ) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeedsKTS[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        // Category counts
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;

        // Cut the arrays to match inputted years
        for (int i = 0; i < years.length; i++) {
            if (years[i] < year1 || years[i] > year2) {
                years[i] = 0;
            } else {
                windSpeedsMPH[i] = windSpeedsKTS[i] * 1.151;
                if (windSpeedsMPH[i] <= 95) {
                    cat1++;
                    category[i] = 1;
                } else if (96 <= windSpeedsMPH[i] && windSpeedsMPH[i] <= 110) {
                    cat2++;
                    category[i] = 2;
                } else if (111 <= windSpeedsMPH[i] && windSpeedsMPH[i] <= 129) {
                    cat3++;
                    category[i] = 3;
                } else if (130 <= windSpeedsMPH[i] && windSpeedsMPH[i] <= 156) {
                    cat4++;
                    category[i] = 4;
                } else if (157 <= windSpeedsMPH[i]) {
                    cat5++;
                    category[i] = 5;
                }
            }
        }

        double length = 0.0;

        // Calculate max, min, and average for pressure
        int presMin = Integer.MAX_VALUE;
        int presMax = Integer.MIN_VALUE;
        int presTot = 0;
        double presAve = 0.0;

        length = 0.0;

        for(int i = 0; i < pressures.length; i++) {
            if (years[i] != 0) {
                if (pressures[i] < presMin) {
                    presMin = pressures[i];
                }
                if (pressures[i] > presMax) {
                    presMax = pressures[i];
                }
                presTot += pressures[i];
                length++;
            }
        }
        presAve = presTot / length;

        // Calculate max, min, and average for speed
        double speMin = (double)Integer.MAX_VALUE;
        double speMax = (double)Integer.MIN_VALUE;
        int speTot = 0;
        double speAve = 0.0;

        length = 0.0;

        for(int i = 0; i < windSpeedsMPH.length; i++) {
            if (years[i] != 0) {
                if (windSpeedsMPH[i] < speMin) {
                    speMin = windSpeedsMPH[i];
                }
                if (windSpeedsMPH[i] > speMax) {
                    speMax = windSpeedsMPH[i];
                }
                speTot += windSpeedsMPH[i];
                length++;
            }
        }
        speAve = speTot / length;

        // Calculate max, min, and average for catagories
        int catMin = Integer.MAX_VALUE;
        int catMax = Integer.MIN_VALUE;
        int catTot = 0;
        double catAve = 0.0;

        length = 0.0;

        for(int i = 0; i < category.length; i++) {
            if (years[i] != 0) {
                if (category[i] < catMin) {
                    catMin = category[i];
                }
                if (category[i] > catMax) {
                    catMax = category[i];
                }
                catTot += category[i];
                length++;
            }
        }
        catAve = catTot / length;

        // Title sequence
        System.out.println();
        System.out.println("                           Hurricanes " + year1 + " - " + year2);
        System.out.println();
        System.out.println("   Year        Hurricane      Category       Pressure (mb)    Wind Speed (mph)");
        System.out.println(" _____________________________________________________________________________");

        // Output the data in a pretty fashion
        for (int i = 0; i < years.length; i++) {
            if (years[i] != 0) {
                System.out.printf("|  %d\t\t%-12s\t%3d\t\t%4d\t\t  %8.2f    |%n", years[i], names[i], category[i], pressures[i], windSpeedsMPH[i]);
            }
        }
        System.out.println("|_____________________________________________________________________________|\n");
        System.out.printf("\t\tAverage:          %3.1f  \t\t%6.1f\t\t  %8.2f%n", catAve, presAve, speAve);
        System.out.printf("\t\tMaximum:          %1d     \t%4d\t\t  %8.2f%n", catMax, presMax, speMax);
        System.out.printf("\t\tMinimum:          %1d     \t%4d\t\t  %8.2f%n", catMin, presMin, speMin);
        System.out.println();
        System.out.println();
        System.out.println("Summary of categories:");
        System.out.printf("\tCat 1: %2d%n", cat1);   
        System.out.printf("\tCat 2: %2d%n", cat2);   
        System.out.printf("\tCat 3: %2d%n", cat3);   
        System.out.printf("\tCat 4: %2d%n", cat4);   
        System.out.printf("\tCat 5: %2d%n", cat5);   

        // Write data
        File outFile = new File("HurricaneData.txt");
        outFile.createNewFile();

        PrintWriter printFile = new PrintWriter(outFile);

        // Write all of the data
        printFile.println("Hurricanes " + year1 + " - " + year2);
        printFile.println();
        printFile.println("Summary of categories:");
        printFile.printf("\tCat 1: %2d%n", cat1);   
        printFile.printf("\tCat 2: %2d%n", cat2);   
        printFile.printf("\tCat 3: %2d%n", cat3);   
        printFile.printf("\tCat 4: %2d%n", cat4);   
        printFile.printf("\tCat 5: %2d%n", cat5);   

        printFile.close();

    }
}
