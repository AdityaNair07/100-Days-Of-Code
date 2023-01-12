import java.util.Scanner;

class RunningTimenComplexity {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int iterationCount = 0; iterationCount < testCases; iterationCount++) {
            int inputNumber = sc.nextInt();
            boolean isPrime = isPrime(inputNumber);
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}