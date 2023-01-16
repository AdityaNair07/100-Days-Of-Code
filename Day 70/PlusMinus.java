import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        int negative = 0, positive = 0, zeros = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                negative++;
            } else if (arr.get(i) > 0) {
                positive++;
            } else {
                zeros++;
            }
        }
        float result1 = (float) positive / arr.size();
        float result2 = (float) negative / arr.size();
        float result3 = (float) zeros / arr.size();
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        List<Integer> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        br.close();
    }
}
