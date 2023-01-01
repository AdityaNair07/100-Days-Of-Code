import java.io.*;

class Result {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class Recursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(br.readLine().trim());

        int result = Result.factorial(n);

        bw.write(String.valueOf(result));
        bw.newLine();

        br.close();
        bw.close();
    }
}
