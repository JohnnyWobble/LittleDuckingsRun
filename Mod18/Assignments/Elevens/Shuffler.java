import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 *
 *
 * @author Max Gordon
 * @version 4/21/2020
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call to each
     * sorting procedure. Change this value to your code.
     */
    private static final int SHUFFLE_COUNT = 5;

    /**
     * Tests shuffling methods.
     * 
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
        int[] values1 = { 0, 1, 2, 3 };
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            values1 = perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
        int[] values2 = { 0, 1, 2, 3 };
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            values2 = selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
     * splits the deck in half, then interleaves the cards in one half with the
     * cards in the other.
     * 
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static int[] perfectShuffle(int[] values) {
        int[] shuffled = new int[values.length];
        int j, i;
        for (j = 0, i = 1; i < values.length; i += 2, j++) {
            shuffled[j] = values[i];
        }
        for (j = j, i = 0; i < values.length; i += 2, j++) {
            shuffled[j] = values[i];
        }
        return shuffled;
    }

    /**
     * Apply an "efficient selection shuffle" to the argument. The selection shuffle
     * algorithm conceptually maintains two sequences of cards: the selected cards
     * (initially empty) and the not-yet-selected cards (initially the entire deck).
     * It repeatedly does the following until all cards have been selected: randomly
     * remove a card from those not yet selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid searching
     * for an as-yet-unselected card.
     * 
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static int[] selectionShuffle(int[] values) {
        int[] newValues = new int[values.length];
        Random r = new Random();

        List<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < values.length; i ++) {
            indexes.add(i);
        }
        for (int num : values) {
            newValues[indexes.remove(r.nextInt(indexes.size()))] = num;
        }
        return newValues;
    }

    public static void showArray(int[] arr) {
        System.out.print("[");
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println("]");
    }
}