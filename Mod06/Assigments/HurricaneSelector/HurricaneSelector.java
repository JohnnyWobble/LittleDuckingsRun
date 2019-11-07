/**
 * This will show some interesting data about some hurricanes
 *
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

        // Calculate max, min, and average for pressure
        int presMin = Integer.MAX_VALUE;
        int presMax = Integer.MIN_VALUE;
        int presTot = 0;
        double presAve = 0.0;

        for(int i = 0; i < pressures.length; i++) {
            if (pressures[i] < min) {
                min = pressures[i];
            }
            if (pressures[i] > max) {
                max = pressures[i];
            }
            catTot += pressures[i];
        }
        presAve = 

        // Calculate max, min, and average for speed
        int speMin = Integer.MAX_VALUE;
        int speMax = Integer.MIN_VALUE;
        int speTot = 0;
        double speAve = 0.0;

        for(int i = 0; i < windSpeedsMPH.length; i++) {
            if (windSpeedsMPH[i] < min) {
                min = windSpeedsMPH[i];
            }
            if (windSpeedsMPH[i] > max) {
                max = windSpeedsMPH[i];
            }
            catTot += windSpeedsMPH[i];
        }

        // Calculate max, min, and average for catagories
        int catMin = Integer.MAX_VALUE;
        int catMax = Integer.MIN_VALUE;
        int catTot = 0;
        double catAve = 0.0;

        for(int i = 0; i < category.length; i++) {
            if (category[i] < min) {
                min = category[i];
            }
            if (category[i] > max) {
                max = category[i];
            }
            catTot += category[i];
        }

        // Title sequence
        System.out.println();
        System.out.println("                           Hurricanes " + year1 + " - " + year2);
        System.out.println();
        System.out.println("   Year   Hurricane       Category      Pressure (mb)     Wind Speed (mph)");
        System.out.println(" _____________________________________________________________________________");

        // Output te data in a pretty fashion
        for (int i = 0; i < years.length; i++) {
            if (years[i] != 0) {
                System.out.printf("|  %d\t%-12s\t%3d\t\t%4d\t\t  %8.2f            |%n", years[i], names[i], category[i], pressures[i], windSpeedsMPH[i]);
            }
        }
        System.out.println("|_____________________________________________________________________________|");
        System.out.println();
        System.out.printf("\tAverage:            %3.1f");

        //continue program below
    }
}