import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class currencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        /*
         * creating object of NumberFormat class and using getCurrencyInstance method
         * with Locale.country_name as parameter
         */
        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n1.format(payment);

        // craeting a new locale ---- as locale class doesn't contain India as a value
        NumberFormat n2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n3.format(payment);
        NumberFormat n4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n4.format(payment);

        // printing the outputs
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
