import java.io.*;
import java.util.stream.*;

class Result {
    public static String funnyString(String s) {
        int a[] = new int[s.length() - 1];
        int b[] = new int[s.length() - 1];
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            s2 = s.charAt(i) + s2;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                a[i] = Math.abs((int) s.charAt(i) - (int) s.charAt(j));
                b[i] = Math.abs((int) s2.charAt(i) - (int) s2.charAt(j));
                i++;
            }
        }
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (a[i] == b[i]) {
                count++;
            }
        }
        if (count == b.length) {
            return "Funny";
        } else {
            return "Not Funny";
        }
    }
}

class FunnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.funnyString(s);

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
