import java.util.*;

// abstract class that has abstract method 
abstract class Book {
    // string variable title
    String title;

    // abstract method taking string parameter
    abstract void setTitle(String s);

    // String return type method
    String getTitle() {
        return title;
    }

}

// MyBook class extends abstract class Book
class MyBook extends Book {

    // instantiating abstract method
    void setTitle(String s) {
        // title variable is assigned string s value
        title = s;
    }
}

public class Abstract_class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking string input from user
        String title = sc.nextLine();

        // allocating memory for MyBook object
        MyBook new_novel = new MyBook();

        // calling setTitle method and giving title as argument
        new_novel.setTitle(title);

        // printing the output of getTitle method
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();

    }
}