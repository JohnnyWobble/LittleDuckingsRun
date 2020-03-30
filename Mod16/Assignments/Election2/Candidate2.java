/**
 * Purpose: This class defines a Candidate by its name and number of votes.
 *
 * @author Max Gordon
 * @version 3/29/20
 */

public class Candidate2 {
    // instance variables
    private int numVotes;
    private String name;

    // Constructor for objects of class Candidate
    public Candidate2(String name, int numVotes) {
        // initialize instance variables
        this.name = name;
        this.numVotes = numVotes;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return numVotes;
    }

    public void setVotes(int n) {
        numVotes = n;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        return name + " received " + numVotes + " votes.";
    }
}