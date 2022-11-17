import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean anagram = true;
        if (a.length() == b.length()) {
            a = a.toLowerCase();
            b = b.toLowerCase();
            char char_a[] = a.toCharArray();
            char char_b[] = b.toCharArray();
            Arrays.sort(char_a);
            Arrays.sort(char_b);
            if (Arrays.equals(char_a, char_b)) {
                return anagram;
            } else
                anagram = false;
        } else
            anagram = false;
        return anagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
