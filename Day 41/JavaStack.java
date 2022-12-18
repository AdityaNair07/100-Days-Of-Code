import java.util.*;

class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            for (char c : input.toCharArray()) {
                if (!stack.isEmpty()) {
                    if (c == '}' && stack.peek() == '{')
                        stack.pop();
                    else if (c == ']' && stack.peek() == '[')
                        stack.pop();
                    else if (c == ')' && stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(c);
                } else
                    stack.push(c);
            }
            System.out.println(stack.isEmpty());
        }
        sc.close();
    }
}
