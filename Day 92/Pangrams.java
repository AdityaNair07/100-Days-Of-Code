import java.io.*;

class Result {
    public static String pangrams(String s) {
        String s1[] = s.split(" ");
        String p = "";
        String panagram = "";
        int count = 0;
        boolean bool[] = new boolean[26];
        for (int i = 0; i < s1.length; i++) {
            p += s1[i];
        }
        p = p.toLowerCase();
        for (int i = 0; i < p.length(); i++) {
            bool[p.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < bool.length; i++) {
            if (bool[i] == true) {
                count++;
            }
        }
        if (count == bool.length) {
            panagram = "pangram";
        } else {
            panagram = "not pangram";
        }
        return panagram;
    }
}

class Pangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
