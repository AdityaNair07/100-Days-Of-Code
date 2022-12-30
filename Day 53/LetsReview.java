import java.io.*;
import java.util.*;

class LetsReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        for (int i = 0; i < n; i++) {
            s = sc.next();
            String even = "";
            String odd = "";
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even += s.substring(j, j + 1);
                } else if (j % 2 == 1) {
                    odd += s.substring(j, j + 1);
                }
            }
            System.out.print(even + " " + odd + "\n");
        }
    }
}