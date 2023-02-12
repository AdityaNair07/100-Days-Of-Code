import java.io.*;

class Result {
    public static long strangeCounter(long t) {

        long strangeCounter = 3;
        long timerCount = 1;

        while (t > timerCount && (timerCount + strangeCounter) <= t) {
            timerCount += strangeCounter;
            strangeCounter *= 2;
        }

        return strangeCounter - (t - timerCount);
    }
}

class StrangeCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.strangeCounter(t);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
