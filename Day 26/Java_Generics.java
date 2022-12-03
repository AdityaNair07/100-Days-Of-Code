import java.util.*;

public class Java_Generics {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add("Hello");
        arr.add("World");
        printArray(arr);
    }

    static <E> void printArray(List<E> e) {
        e.forEach(System.out::println);
    }
}
