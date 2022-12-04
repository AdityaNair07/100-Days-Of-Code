import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialNum = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < initialNum; i++) {
            numbers.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if (query.equals("Insert")) {
                numbers.add(sc.nextInt(), sc.nextInt());
            } else {
                numbers.remove(sc.nextInt());
            }
        }
        for (Integer integer : numbers) {
            System.out.print(integer + " ");
        }
        sc.close();
    }
}
