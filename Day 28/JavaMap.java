import java.util.*;

public class JavaMap {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int phone = sc.nextInt();
            phoneBook.put(name, phone);
            sc.nextLine();
        }
        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}