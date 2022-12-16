import java.util.Scanner;

public class Java_1DArray {

    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;
        game[i] = 1;
        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1)
                || canWin(leap, game, i + leap);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            int leap = sc.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = sc.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        sc.close();
    }
}