import java.math.BigDecimal;
import java.util.*;

class Java_BigDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (new BigDecimal(s[j - 1]).compareTo(new BigDecimal(s[j])) < 0) {
                    String temp = s[j - 1];
                    s[j - 1] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}