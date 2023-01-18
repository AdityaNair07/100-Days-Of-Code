import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        arr.sort(null);
        for(Integer in : arr) {
            sum += in;
        }
        System.out.println((sum - arr.get(arr.size()-1)) + " " + (sum  - arr.get(0)));
    }
}

class MiniMaxSum{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
