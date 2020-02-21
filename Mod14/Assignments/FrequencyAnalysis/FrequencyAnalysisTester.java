import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

/**
 * 
 * @author Max Gordon
 * @version 02/20/2020
 */

public class FrequencyAnalysisTester {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // frequency("plaintext");
        // frequency("subset");
        frequency("cyphertext");
    }

    public static void frequency(String name) throws FileNotFoundException, IOException {
        FrequencyAnalysis freq = new FrequencyAnalysis();
        freq.setInFile(name + ".txt");
        freq.setOutFile(name + "Freq.txt");
        freq.readFile();
        // System.out.println(freq.getInputData());
        freq.generateFrequencyData();
        freq.outputFrequencyData();
        freq.displayFrequencyData();
        freq.close();
    }
}