import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MyRegex {
    String limit = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = limit + "\\." + limit
            + "\\." + limit
            + "\\." + limit;
}

class JavaRegex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        sc.close();
    }
}