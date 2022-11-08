import java.io.*;
import java.util.*;

public class string_token {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        // deleting all the whitespaces in front or rear of the string
        s = s.trim();

        // if the string length is 0 print 0
        if (s.length() == 0) {
            System.out.println(0);
            System.exit(0);
        }
        // splitting the string from the expression we don't need
        String[] s1 = s.split("[!,?._'@ ]+");

        // printing the length of only alphabets array
        System.out.println(s1.length);

        // printing the elements of array
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }
}
