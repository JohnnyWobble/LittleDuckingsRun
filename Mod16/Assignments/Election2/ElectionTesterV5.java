/**
 * 
 * @author Max Gordon
 * @version 03/29/2020
 */

public class ElectionTesterV5 {
    public static void main(String[] args) {
        Candidate2[] candidates = {new Candidate2("Bob", 31), new Candidate2("Phil", 9), new Candidate2("Bill", 28), new Candidate2("Mary", 43), new Candidate2("Sara", 12)};

        showData(candidates);

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
        candidates = insertAt(candidates, 3, "Anna", 29);
        showTable(candidates, countVotes(candidates));

        System.out.println("\n\n\t<-< Before Anna, add Dobby, 38 >->");
        candidates = insertBefore(candidates, "Anna", "Dobby", 38);
        showTable(candidates, countVotes(candidates));
    }

    public static void showData(Candidate2[] candidates) {
        System.out.println("Raw election data:\n");
        for (Candidate2 c : candidates) {
            System.out.println(c.toString());
        }
    }

    public static int countVotes(Candidate2[] candidates) {
        int votes = 0;

        for (Candidate2 c : candidates) {
            votes += c.getVotes();
        } 

        return votes;
    }

    public static void showTable(Candidate2[] candidates, int totalVotes) {
        System.out.println("\nName      Votes     Percentage of vote");
        System.out.println("---------------------------------------------");

        for (Candidate2 c : candidates) {
            System.out.printf("%-10s%4d%15.2f%%%n", c.getName(), c.getVotes(), (c.getVotes() * 100.0)/totalVotes);
        }

        System.out.println("\nTotal votes: " + totalVotes);
    }

    public static void changeName(Candidate2[] candidates, String find, String change) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(find)) {
                candidates[i].setName(change);
            }
        }
    }

    public static void changeData(Candidate2[] candidates, String find, String changeName, int changeVotes) {
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(find)) {
                candidates[i].setVotes(changeVotes);
            }
        }

        changeName(candidates, find, changeName);
    }

    public static Candidate2[] insertAt(Candidate2[] candidates, int index, String name, int votes) {
        Candidate2[] newArray = new Candidate2[candidates.length + 1];
        int add = 0;

        for (int i = 0; i < candidates.length; i++) {
            if (index == i) {
                add = 1;
                newArray[i] = new Candidate2(name, votes);
            }
            newArray[i + add] = candidates[i];
        }

        return newArray;
    }

    public static Candidate2[] insertBefore(Candidate2[] candidates, String nameBefore, String name, int votes) {
        int index = -1;

        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i].getName().equals(nameBefore)) {
                index = i;
            }
        }
        return insertAt(candidates, index, name, votes);
    }
}