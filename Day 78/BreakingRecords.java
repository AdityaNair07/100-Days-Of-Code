import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int lowestRecord = scores.get(0);
        int highestRecord = scores.get(0);
        int lowestRecordCount = 0;
        int highestRecordCount = 0;
        List<Integer> records = new ArrayList<>();

        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > highestRecord) {
                highestRecord = scores.get(i);
                highestRecordCount++;
            } else if (scores.get(i) < lowestRecord) {
                lowestRecord = scores.get(i);
                lowestRecordCount++;
            }
        }
        records.add(highestRecordCount);
        records.add(lowestRecordCount);

        return records;
    }

}

class BreakingRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
