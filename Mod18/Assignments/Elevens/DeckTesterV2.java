/**
 * This is a class that tests the Deck class.
 *
 * < Your Name > < Today's Date >
 */

public class DeckTesterV2 {
    /**
     * The main method in this class checks the Deck operations for consistency.
     * 
     * @param args is not usemyDeck.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        /* Uncomment blocks of code to test the Deck class */

        String[] myRanks = { "queen", "two", "jack", "seven" };
        String[] mySuits = { "heart", "spade", "diamond" };
        int[] myPointValues = { 12, 2, 11, 7 };
        DeckV2 deck = new DeckV2(myRanks, mySuits, myPointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString: \n" + deck.toString());
        System.out.println("  isEmpty: " + deck.isEmpty());
        System.out.println("  size: " + deck.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + deck.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + deck.toString());
        System.out.println("  isEmpty: " + deck.isEmpty());
        System.out.println("  size: " + deck.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining Cards ****");
        while (!deck.isEmpty()) {
            deck.deal();
        }

        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + deck.toString());
        System.out.println("  isEmpty: " + deck.isEmpty());
        System.out.println("  size: " + deck.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + deck.deal());
        System.out.println();
        System.out.println();

        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

        System.out.println("\n**** 52 Card Deck shuffle Tests ****");
        String[] ranks52 = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        String[] suits52 = {"spades", "diamonds", "cloves", "hearts"};
        int[] pointValues52 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        DeckV2 deck52 = new DeckV2(ranks52, suits52, pointValues52);

        System.out.println("*** The Starting Deck *** ");
        System.out.println("  toString: \n" + deck52.toString());
        System.out.println("  isEmpty: " + deck52.isEmpty());
        System.out.println("  size: " + deck52.size());
        System.out.println();
        System.out.println();

        System.out.println("*** The Deck After Dealing a Card ***" );
        System.out.println("  deal: " + deck52.deal());
        System.out.println("  toString:\n" + deck52.toString());
        System.out.println("  isEmpty: " + deck52.isEmpty());
        System.out.println("  size: " + deck52.size());

        System.out.println("*** Shuffling the Deck ***");
        deck52.shuffle();
        System.out.println("  toString: " + deck52.toString());

    }
}