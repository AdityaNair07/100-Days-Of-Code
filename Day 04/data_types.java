import java.util.*;
import java.io.*;

class data_types {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                // taking user input
                long x = sc.nextLong();
                // printing where x can be fitted in
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x < 128)// range of byte
                    System.out.println("* byte");
                if (x >= (Math.pow(-2, 15)) && x <= (Math.pow(2, 15)) - 1)// range of short
                    System.out.println("* short");
                if (x >= (Math.pow(-2, 31)) && x <= (Math.pow(2, 31)) - 1)// range of int
                    System.out.println("* int");
                if (x >= (Math.pow(-2, 63)) && x <= (Math.pow(2, 63)) - 1)// range of long
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
