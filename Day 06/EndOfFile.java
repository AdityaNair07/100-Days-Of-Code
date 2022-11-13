import java.io.*;
import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            try {
                String n = sc.nextLine();
                count++;
                System.out.println(count + " " + n);
            } catch (Exception e) {
                break;
            }
        }
    }
}
