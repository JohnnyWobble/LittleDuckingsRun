import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Max Gordon
 * @version 02/20/2020
 */

public class FrequencyAnalysis {
    private int[] counts = new int[26];
    private String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private String fileData;
    
    private String inFileName;
    private String outFileName;
    private File iFile;
    private File oFile;
    private PrintWriter outFile;
    private Scanner inFile;

    public FrequencyAnalysis() {
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
            this.fileData += inFile.nextLine();
        }
    }


}