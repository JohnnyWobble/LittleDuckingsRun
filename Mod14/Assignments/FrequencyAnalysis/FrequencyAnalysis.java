import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays; 

/**
 * 
 * @author Max Gordon
 * @version 02/20/2020
 */

public class FrequencyAnalysis {
    private int[] counts = new int[26];
    private char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private String fileData = "";
    private int totalLetters = 0;
    private int[] shifts = new int[26]; 
    private double[] frequency = new double[26];
    
    private String inFileName;
    private String outFileName;
    private File iFile;
    private File oFile;
    private PrintWriter outFile;
    private Scanner inFile;

    public FrequencyAnalysis() {
        Arrays.fill(counts, 0);
    }

    public void setInFile(String inFileName) throws FileNotFoundException {
        this.inFileName = inFileName;
        this.iFile = new File(this.inFileName);
        this.inFile = new Scanner(iFile);
    }

    public void setOutFile(String outFileName) throws IOException, FileNotFoundException {
        this.outFileName = outFileName;
        this.oFile = new File(this.outFileName);

        this.oFile.createNewFile();
        this.outFile = new PrintWriter(oFile);
    }

    public void readFile() {
        while (this.inFile.hasNextLine()) {
            this.fileData += inFile.nextLine().toLowerCase();
        }
    }

    public String getInputData() {
        return this.fileData;
    }

    public double[] getFrequencyData() {
        for (int i = 0; i < counts.length; i++) {
            frequency[i] = 100. * counts[i] / totalLetters;
        }
        return frequency;
    }

    // public int[] order() {
    //     for (int i = 0; i < shifts.length; i++) {

    //     }
    // }

    public void generateFrequencyData() {
        for (int idx = 0; idx < this.fileData.length(); idx++) {
            char ch = this.fileData.charAt(idx);
            if (indexOfChar(ch) != -1) {
                this.totalLetters++;
                counts[indexOfChar(ch)] += 1;
            }
        }
    }

    public void displayFrequencyData() {
        System.out.println("\n       " + this.inFileName);
        System.out.println("----------------------------");

        for (int i = 0; i < letters.length; i++) {
            System.out.printf("%c: %3d occurrences - %4.1f%%\n", this.letters[i], counts[i], 100.*counts[i]/totalLetters);
        }
    }

    public int indexOfChar(char chr) {
        for (int i = 0; i < this.letters.length; i++) {
            if (letters[i] == chr) {
                return i;
            }
        }
        return -1;
    }

    public void outputFrequencyData() {
        
        for (int i = 0; i < letters.length; i++) {
            this.outFile.printf("%c: %3d occurrences - %4.1f%%\n", this.letters[i], counts[i], 100.*counts[i]/totalLetters);
        }
    }

    public void close() {
        this.inFile.close();
        this.outFile.close();
    }

    public void showData() {
        for (char c: letters) {
            System.out.print(c + "     ");
        }
        System.out.println();
        for (double d: frequency) {
            System.out.printf("%-6.2f", d);
        }
        System.out.println("\n");
    }

    // public String compareTo(FrequencyAnalysis other) {
    //     double[] otherFreq = other.getFrequencyData();


    // }
}