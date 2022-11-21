import java.util.*;
import java.math.BigInteger;
// importing BigInteger class 

public class Biginteger {

    public static void main(String[] args) {

        // taking user input in string format
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // creating Biginteger Objects and passing the inputs a,b as arguments in the
        // constructors
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);

        // performing addition and multiplication of the two objects data and printing
        // the output
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
        sc.close();
    }
}
