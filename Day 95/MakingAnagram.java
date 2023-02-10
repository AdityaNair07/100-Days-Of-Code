import java.io.*;
import java.util.*;

class Result {
    public static int makingAnagrams(String s1, String s2) {
        int count = 0;
        int a[] = new int[26];
        int b[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            b[s2.charAt(i) - 'a']++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (a[i] > b[i] || a[i] < b[i]) {
                    count += Math.abs(a[i] - b[i]);
                    // System.out.println(Math.abs(a[i] - b[i]));
                    // count++;
                }
            }
        }
        return count;
    }
}

class MakingAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
