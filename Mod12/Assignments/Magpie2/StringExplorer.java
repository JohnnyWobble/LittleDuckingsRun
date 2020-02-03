/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Max Gordon
 * @version 1/30/20
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        // ----- indexOf ------
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        // ------ toLowerCase ------
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.

        // ----- trim -----
        sample = "  The quick brown fox jumped over the lazy dog.  ";
        System.out.println("sample = " + sample);

        String trimmed = sample.trim();
        System.out.println("sample.trim() = " + trimmed);
        System.out.println("After sample.trim(), sample = " + sample);
        System.out.println();


        // ----- length -----
        sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);

        int length = sample.length();
        System.out.println("sample.length() = " + length);
        System.out.println("After sample.length(), sample = " + sample);
        System.out.println();

        // ------ CompareTo -----
        String sample2 = "Bob likes to eat cake in the morning.";
        System.out.println("sample2 = " + sample2);

        int compared = sample.compareTo(sample2);
        System.out.println("sample.compareTo(sample2) = " + compared);
        System.out.println("After sample.compareTo(sample2), sample = " + sample2);
        System.out.println();

        // ------ substring ------
        String substring3 = sample.substring(3);
        String substring47 = sample.substring(14, 19);

        System.out.println("sample.substring(3) = " + substring3);
        System.out.println("sample.substring(14, 19) = " + substring47);
        System.out.println("After sample.substring(), sample = " + sample);
        System.out.println();
    }

}