import java.io.*;

class Result {
    public static int viralAdvertising(int n) {
        int cumulative = 2;
        int shared = 5;
        int liked = 2;
        for (int i = 2; i <= n; i++) {
            shared = liked * 3;
            liked = shared / 2;
            cumulative += liked;
        }
        return cumulative;
    }
}

class ViralAdvertising {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
