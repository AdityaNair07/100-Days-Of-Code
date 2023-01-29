import java.io.*;
import java.util.stream.*;

class Result {
    public static int utopianTree(int n) {
        int height = 1;
        if (n == 0)
            return height;
        else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0)
                    height++;
                else
                    height *= 2;
            }
        }
        return height;
    }

}

class UtopianTree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.utopianTree(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
