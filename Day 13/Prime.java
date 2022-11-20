import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Prime {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        BigInteger b = new BigInteger(n);

        if (b.isProbablePrime(1)) {
            System.out.print("prime");
        } else {
            System.out.print("not prime");
        }
        sc.close();
    }
}
