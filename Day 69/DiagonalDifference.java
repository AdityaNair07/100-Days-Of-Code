import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int ld = 0;
        int rd = 0;

        for (int i = 0; i < arr.size(); i++) {
            ld += arr.get(i).get(i);
            rd += arr.get(i).get(arr.size() - 1 - i);
        }
        return Math.abs(ld - rd);
    }
}

class DiagonalDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(br.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.close();
    }
}
