/**
 * This is a class that tests the Card class.
 *
 * < Your Name > < Today's Date >
 */

public class CardTester {
    /**
     * The main method in this class checks the Card operations for consistency.
     * 
     * @param args is not used.
     */
    public static void main(String[] args) {

        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

        // Establish new cards
        Card aceHearts = new Card("ace", "hearts", 1);
        Card threeDiamonds = new Card("three", "diamonds", 3);
        Card nineSpades = new Card("nine", "spades", 9);

        // Test card 1 and methods
        System.out.println("**** Tests Card 1: ace of hearts ****");
        System.out.println("  rank: " + aceHearts.rank());
        System.out.println("  suit: " + aceHearts.suit());
        System.out.println("  pointValue: " + aceHearts.pointValue());
        System.out.println("  toString: " + aceHearts.toString());
        System.out.println();

        // Test card 2
        System.out.println("**** Tests Card 2: three of diamonds ****");
        System.out.println("  rank: " + threeDiamonds.rank());
        System.out.println("  suit: " + threeDiamonds.suit());
        System.out.println("  pointValue: " + threeDiamonds.pointValue());
        System.out.println("  toString: " + threeDiamonds.toString());
        System.out.println();

        // Test card 3
        System.out.println("**** Tests Card 3: nine of spades ****");
        System.out.println("  rank: " + nineSpades.rank());
        System.out.println("  suit: " + nineSpades.suit());
        System.out.println("  pointValue: " + nineSpades.pointValue());
        System.out.println("  toString: " + nineSpades.toString());
        System.out.println();

        // Test matches() method
        System.out.println("**** Matches test ****");
        System.out.println("matches: " + aceHearts.matches(aceHearts));
        System.out.println("no matches: " + threeDiamonds.matches(nineSpades));

    }
}