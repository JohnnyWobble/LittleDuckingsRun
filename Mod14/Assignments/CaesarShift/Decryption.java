/**
 * Mostly a pseudo-class, it just renames a method, and negates the key
 * 
 * @author Max Gordon
 * @version 02/11/2020
 */

public class Decryption extends Encryption {
    public Decryption(int o) {
        super(-o);
    }

    public static String decrypt(String encryptedText, int key) {
        return Encryption.encrypt(encryptedText, key);
    }
}