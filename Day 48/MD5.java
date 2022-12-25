import java.util.*;
import java.math.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(word.getBytes(), 0, word.length());
        System.out.println(new BigInteger(1, md.digest()).toString(16));
        sc.close();
    }
}
