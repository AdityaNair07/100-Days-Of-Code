import java.io.*;
import java.util.stream.*;

class Result {

    public static int bitwiseAnd(int N, int K) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int result = i & j;
                if (result < K && result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

}

class BitwiseAND {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(br.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = br.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                bw.write(String.valueOf(res));
                bw.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        br.close();
        bw.close();
    }
}
