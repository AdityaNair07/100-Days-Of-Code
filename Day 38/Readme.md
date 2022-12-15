<h1 align="center">Java BigDecimal</h1>

Java's BigDecimal class can handle arbitrary-precision signed decimal numbers.

Given an array, s, of n real number strings, sort them in descending order. Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values, then they must be listed in the same order as they were received as input.

- First import BigDecimal from java.math package.
- Inside the main method created an object of Scanner class named sc that takes user input.
- Declared an integer variable named n that takes integer user input.
- Declared a String array named s wich has the size n+2.
- Then defined a for loop that runs from 0 to n.
- Inside the loop, take user input and storing it into String array s sequentially.
- Then defined another for loop, that runs from 0 to n.
- Inside the loop defined another loop that runs from i to 0.
- Inside this loop, defined an if condition that compares two BigDecimal objects.
- The object of BigDecimal at index j-1 of String array s is compared to the object of BigDecimal at index j of String array s.
- And checked if the comparison is less than 0 or not.
- If yes then run the code inside the if condition.
- Then inside the if condition perform basic swapping operation.
- Declared a String variable named temp that stores the element of String array s of j-1 index.
- Then, the element of String array s of j-1 index stores the element at j index.
- Then, the element of String array s of j index stores the value of temp variable.
- After exiting this loop, defined another for loop that runs from 0 to n.
- Inside the loop, printing the elements of String array s.
- Hence providing the ouput.