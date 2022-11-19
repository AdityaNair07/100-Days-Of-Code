import java.util.Scanner;

public class Substring_comp {

    public static String getSmallestAndLargest(String s, int k) {
        // substring starts from 0 and ends at k index
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String str;

        // loop runs from 0 to s.length()-k
        for (int i = 0; i <= s.length() - k; i++) {
            // str is assigned value of substring from i to i+k index
            str = s.substring(i, i + k);

            // comparing smallest variable to str if it's greater than 0 or not
            if (smallest.compareTo(str) > 0) {
                smallest = str;
            }

            // comparing largest variable to str if it's smaller than 0 or not
            if (largest.compareTo(str) < 0) {
                largest = str;
            }
        }
        // returning smallest and largest values
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // taking user input for string s and integer k
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        // printing the output of the function
        System.out.println(getSmallestAndLargest(s, k));
    }
}