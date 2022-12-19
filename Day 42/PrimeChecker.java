import java.util.*;

class Prime {
    public void checkPrime(Integer... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean isPrime(int num) {
        if (num < 2 || num % 2 == 0 && num != 2) {
            return false;
        } else if (num == 2) {
            return true;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeChecker {

    public static void main(String[] args) throws Exception {
        Prime prime = new Prime();
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        prime.checkPrime(numbers[numbers.length - 5]);
        prime.checkPrime(numbers[numbers.length - 5], numbers[numbers.length - 4]);
        prime.checkPrime(numbers[numbers.length - 5],
                numbers[numbers.length - 4], numbers[numbers.length - 3]);
        prime.checkPrime(numbers[numbers.length - 5],
                numbers[numbers.length - 4], numbers[numbers.length - 3],
                numbers[numbers.length - 2], numbers[numbers.length - 1]);
        sc.close();
    }
}