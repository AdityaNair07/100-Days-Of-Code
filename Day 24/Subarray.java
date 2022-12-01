import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        System.out.println(count);
        sc.close();
    }
}
