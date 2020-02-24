import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author Max Gordon
 * @version 02/20/2020
 */

public class FrequencyAnalysisTester {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("What file will the frequency analysis be based on: ");
        String baseFile = in.nextLine();

        System.out.print("What file will be deciphered: ");
        String cypherFile = in.nextLine();
        // frequency("plaintext");
        // frequency("subset");
        var base = frequency(baseFile);
        var cypher = frequency(cypherFile); 

        base.showData();
        cypher.showData();
    }

    public static FrequencyAnalysis frequency(String name) throws FileNotFoundException, IOException {
        FrequencyAnalysis freq = new FrequencyAnalysis();
        freq.setInFile(name + ".txt");
        freq.setOutFile(name + "Freq.txt");
        freq.readFile();
        // System.out.println(freq.getInputData());
        freq.generateFrequencyData();
        freq.outputFrequencyData();
        freq.displayFrequencyData();
        freq.getFrequencyData();
        freq.close();
        return freq;
    }
}