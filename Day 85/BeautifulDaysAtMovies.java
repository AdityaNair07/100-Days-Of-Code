import java.io.*;

class Result {
    public static int reverse(int n) {
        int a = 0;
        while (n > 0) {
            int rem = n % 10;
            a = (a * 10) + rem;
            n /= 10;
        }
        return a;
    }

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        while (i <= j) {
            if (Math.abs(i - reverse(i)) == 0) {
                count++;
            } else if ((Math.abs(i - reverse(i))) % k == 0) {
                count++;
            }
            i++;
        }
        return count;
    }

}

class BeautifulDaysAtMovies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
