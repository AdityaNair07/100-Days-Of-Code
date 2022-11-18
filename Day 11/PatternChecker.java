import java.util.Scanner;
import java.util.regex.*;

public class PatternChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // takes user input and parse it to Integer
        int testCases = Integer.parseInt(in.nextLine());

        // declare a while loop for testcases
        while (testCases > 0) {
            // input from user
            String pattern = in.nextLine();

            // define try and catch
            try {
                // using Pattern class method compile() with parameter pattern i.e. user input
                Pattern.compile(pattern);
                // print valid
                System.out.println("Valid");
            } catch (Exception e) {
                // print invalid if the pattern throws exception
                System.out.println("Invalid");
            }
            // decrementing testCases to end loop
            testCases--;
        }
        in.close();
    }
}
