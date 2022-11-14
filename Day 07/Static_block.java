import java.io.*;
import java.util.*;

public class Static_block {
    // static block
    static {
        Scanner sc = new Scanner(System.in);
        // taking user inputs
        int b = sc.nextInt();
        int h = sc.nextInt();

        // checking if the input is greater than 0 or not
        if (b > 0 && h > 0) {
            int area = b * h;
            System.out.println(area);
        } else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }

    public static void main(String[] args) {

    }
}
