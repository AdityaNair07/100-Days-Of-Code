import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_HashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String n = pair_left[i] + "_" + pair_right[i];
            set.add(n);
            System.out.println(set.size());
        }
        sc.close();
    }
}