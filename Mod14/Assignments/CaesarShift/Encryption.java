/**
 * This is the main class doing work, this does all of the encryption and the alphabet stuff
 * 
 * @author Max Gordon
 * @version 02/10/2020
 */

public class Encryption {
    public static final String[] BASE_ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int offset;

    public Encryption(int o) {
        offset = o;
    }

    public int getOffset() {
        return offset;
    }

    public static String encrypt(String plainText, int offset) {
        String encrypted = "";

        for (int i = 0; i < plainText.length(); i++) {
            int key = getNum(plainText.substring(i, i + 1));

            if (key == -1) {
                encrypted += plainText.substring(i, i + 1);
            } else {
                encrypted += BASE_ALPHABET[(26 + key + offset) % 26];
            }
        }
        return encrypted;
    }

    private static int getNum(String chara) {
        for (int i = 0; i < BASE_ALPHABET.length; i++) {
            if (BASE_ALPHABET[i].equals(chara)) {
                return i;
            }
        }
        return -1;
    }

    public static String makeCipherAlphabet(int key) {
        String alphaString = "";

        for (String c : BASE_ALPHABET) {
            alphaString += BASE_ALPHABET[(26 + getNum(c) + key) % 26] + " ";
        }
        return alphaString;
    }
}