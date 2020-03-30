import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Max Gordon
 * @version 03/29/2020
 */

public class ElectionTesterV6 {
    public static void main(String[] args) {
        List<Candidate2> candidates = new ArrayList<Candidate2>();
        candidates.add(new Candidate2("Bob", 31));
        candidates.add(new Candidate2("Phil", 9));
        candidates.add(new Candidate2("Mary", 43));
        candidates.add(new Candidate2("Sara", 12));
        candidates.add(new Candidate2("Bill", 28));

        showTable(candidates, countVotes(candidates));

        System.out.println("\n\n\t<-< Changing Bill to Gabe >->");
        changeName(candidates, "Bill", "Gabe");
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\n\t<-< Changing Sara's votes to 22 >->");
        changeData(candidates, "Sara", "Sara", 22);
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\n\t<-< Changing Bob to Doug and his votes to 38 >->");
        changeData(candidates, "Bob", "Doug", 38);
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\n\t<-< In position 3, add Anna, 29 >->");
        insertAt(candidates, 3, "Anna", 29);
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\n\t<-< Before Anna, add Dobby, 38 >->");
        insertBefore(candidates, "Anna", "Dobby", 38);
        showTable(candidates, countVotes(candidates));
    }

    public static void showData(List<Candidate2> candidates) {
        System.out.println("Raw election data:\n");
        for (Candidate2 c : candidates) {
            System.out.println(c.toString());
        }
    }

    public static int countVotes(List<Candidate2> candidates) {
        int votes = 0;

        for (Candidate2 c : candidates) {
            votes += c.getVotes();
        } 

        return votes;
    }

    public static void showTable(List<Candidate2> candidates, int totalVotes) {
        System.out.println("\nName      Votes     Percentage of vote");
        System.out.println("---------------------------------------------");

        for (Candidate2 c : candidates) {
            System.out.printf("%-10s%4d%15.2f%%%n", c.getName(), c.getVotes(), (c.getVotes() * 100.0)/totalVotes);
        }

        System.out.println("\nTotal votes: " + totalVotes);
    }

    public static void changeName(List<Candidate2> candidates, String find, String change) {
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getName().equals(find)) {
                candidates.get(i).setName(change);
            }
        }
    }

    public static void changeData(List<Candidate2> candidates, String find, String changeName, int changeVotes) {
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getName().equals(find)) {
                candidates.get(i).setVotes(changeVotes);
            }
        }

        changeName(candidates, find, changeName);
    }

    public static void insertAt(List<Candidate2> candidates, int index, String name, int votes) {
        candidates.add(index, new Candidate2(name, votes));
    }

    public static void insertBefore(List<Candidate2> candidates, String nameBefore, String name, int votes) {
        int index = -1;

        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getName().equals(nameBefore)) {
                index = i;
            }
        }
        insertAt(candidates, index, name, votes);;
    }
}