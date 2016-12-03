package basic.java.demo.project.PasswordEncryptDecrypt;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;


/**
 * 
 */
public class EncPassword {

    /**
     * @param args
     * @throws NoSuchAlgorithmException 
     * @throws UnsupportedEncodingException 
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        String password = "password";
        System.out.println("Password                  :  " + password);
        // Base64 Encryption and Decryption
        String base64EncPassword = base64Encrypt(password);
        System.out.println("Base64 Encrypted Password :  " + base64EncPassword);
        String base64DecPassword = base64Decrypt(base64EncPassword);
        System.out.println(new String("Base64 Decrypted Password :  " + base64DecPassword));

        // MD5 Encryption and Decryption
        String md5EncPassword = md5Encrypt(password);
        System.out.println("MD5 Encrypted Password    :  " + md5EncPassword);
        String md5DecPassword = md5Decrypt(md5EncPassword);
        System.out.println("MD5 Decrypted Password    :  " + "Cann't be Decrypted");
        
        // Scramble Encryption and Decryption
        String scrambleEncPassword = scrambleEncrypt(password);
        System.out.println("Scramble Encrypted Password    :  " + scrambleEncPassword);
        String scrambleDecPassword = scrambleDecrypt(scrambleEncPassword);
        System.out.println("Scramble Decrypted Password    :  " + scrambleDecPassword);
    }
    
    private static String scrambleEncrypt(String str) {
        String scrambleString = Scramble.encode(str).toString();
        return scrambleString;
    }
    
    private static String scrambleDecrypt(String str) {
        String scrambleString = Scramble.decode(str).toString();
        return scrambleString;
    }
    
    private static String md5Encrypt(String str) throws NoSuchAlgorithmException {
        byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
        StringBuffer s = new StringBuffer();

        // The value of the decimal number is converted into the hexadecimal
        // number
        for (int i = 0; i < digest.length; i++) {
//            System.out.println(Integer.toString(digest[i]));
            s.append(Integer.toString((digest[i] & 0xf0) >> 4, 16));
//            System.out.println(Integer.toString((digest[i] & 0xf0)>> 4, 16));
            s.append(Integer.toString(digest[i] & 0x0f, 16));
//            System.out.println(Integer.toString(digest[i] & 0x0f, 16));
        }
        // 54c35a6d182db8c9
        // 5f4dcc3b5aa765d61d8327deb882cf99
        String result = s.toString();
        return result;
    }
    
    private static String md5Decrypt(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        // MD5 Cananot be decoded because MD5 encode means converting the string
        // into bytes and then into hash codes (decimal number).
        // These hash codes are then converted to hexadecimal number with some
        // algorithms.
        String str123 = "AB";
        byte[] ret = str123.getBytes("UTF-8"); //$NON-NLS-1$

//        System.out.println(ret[0]);
        return str;
//        StringBuffer s = new StringBuffer();
//        String str123 = "4";
//        String bigInteger  = new BigInteger(str123, 16).toString(10);
//        int integer = Integer.parseInt(bigInteger);
//        System.out.println(integer);
//        System.out.println(Integer.toString((integer  << 4) | 0x0f));
//        return str;
    }
    
    private static String base64Encrypt(String str) {
        byte[] base64EncPassword = Base64.encodeBase64(str.getBytes());
        return new String(base64EncPassword);
    }
    
    private static String base64Decrypt(String str) {
        byte[] base64DecPassword = Base64.decodeBase64(str.getBytes());
        return new String(base64DecPassword);
    }

}
