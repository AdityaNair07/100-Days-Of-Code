import java.io.*;

class BinaryNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        int binaryNums = 0;
        int count = 0;
        while (n > 0) {
            int t = n % 2;
            if (t == 0) {
                count = 0;
            } else {
                count++;
                binaryNums = Math.max(count, binaryNums);
            }
            n /= 2;
        }
        System.out.println(binaryNums);
    }
}
