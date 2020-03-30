/**
 * 
 * @author Max Gordon
 * @version 03/29/2020
 */

public class ElectionTesterV3 {
    public static void main(String[] args) {
        Candidate[] candidates = {new Candidate("Bob", 31), new Candidate("Phil", 9), new Candidate("Bill", 28), new Candidate("Mary", 43), new Candidate("Sara", 12)};

        showData(candidates);
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\t<-< Changing Bill to Gabe >->\n");

        changeName(candidates, "Bill", "Gabe");
        showData(candidates);
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\t<-< Changing Sara's votes to 22 >->\n");

        changeData(candidates, "Sara", "Sara", 22);
        showData(candidates);
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\t<-< Changing Bob to Doug and his votes to 38 >->\n");

        changeData(candidates, "Bob", "Doug", 38);
        showData(candidates);
        showTable(candidates, countVotes(candidates));
    }

    public static void showData(Candidate[] candidates) {
        System.out.println("Raw election data:\n");
        for (Candidate c : candidates) {
            System.out.println(c.toString());
        }
    }

    public static int countVotes(Candidate[] candidates) {
        int votes = 0;

        for (Candidate c : candidates) {
            votes += c.getVotes();
        } 

        return votes;
    }

    public static void showTable(Candidate[] candidates, int totalVotes) {
        System.out.println("\n\n\nName      Votes     Percentage of vote");
        System.out.println("---------------------------------------------");

        for (Candidate c : candidates) {
            System.out.printf("%-10s%4d%15.2f%%%n", c.getName(), c.getVotes(), (c.getVotes() * 100.0)/totalVotes);
        }

        System.out.println("\nTotal votes: " + totalVotes);
    }

    public static void changeName(Candidate[] candidates, String find, String change) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(find)) {
                candidates[i].setName(change);
            }
        }
    }

    public static void changeData(Candidate[] candidates, String find, String changeName, int changeVotes) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(find)) {
                candidates[i].setVotes(changeVotes);
            }
        }

        changeName(candidates, find, changeName);
    }
}