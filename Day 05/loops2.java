import java.util.*;
import java.io.*;

class loops2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        // taking user input for number of test cases
        int t = in.nextInt();
        // defining a for loop that runs for number of test cases
        for (int i = 0; i < t; i++) {
            // taking input from user
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // defining another for loop that runs n-1 times
            for (int j = 0; j < n; j++) {
                // updating value of a by adding 2 to the power j multiplied by value of b
                a += (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            // printing the result of test cases
            System.out.println();
        }
        in.close();
    }
}
