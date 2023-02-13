import java.io.*;
import java.util.stream.*;

class Result {
    public static String twoStrings(String s1, String s2) {
        int bool1[] = new int[26];
        int bool2[] = new int[26];
        String s = "";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            bool1[(s1.charAt(i) - 'a')]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            bool2[(s2.charAt(i) - 'a')]++;
        }
        for (int i = 0; i < bool1.length; i++) {
            if (bool1[i] != 0 && bool2[i] != 0) {
                if (bool1[i] >= bool2[i] || bool1[i] <= bool2[i]) {
                    count++;
                    break;
                }
            }
        }
        if (count >= 1) {
            s = "YES";
        } else {
            s = "NO";
        }
        return s;
    }
}

class TwoStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
