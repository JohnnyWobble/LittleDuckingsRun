import java.util.ArrayList;

public class FileText {

    private String fileName;
    private int fileBytes;

    private ArrayList<String> wordList; // the contents of the text file




    // constructors not shown

    // postcondition: calculates the number of bytes in this file and updates
    // the instance variable fileBytes
    public void fileSize() {

        for (int i = 0; i < wordList.size(); i++) {
            fileBytes += wordList.get(i).length();
        }
        fileBytes += wordList.size() - 1;
        wordList.get
    }

    // precondition: 0 < newWords.length < wordList.size ()
    // postcondition: elements from the newWords array are placed into consecutive
    // even index positions, including 0, of the wordlist ArrayList
    // postcondition: the value of fileBytes is updated
    public void mergeWords(String[] newWords) {

    }

    // other methods not shown

}