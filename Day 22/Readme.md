<h1 align="center">Try Catch Block</h1>
Exception handling is the process of responding to the occurrence, during computation, of exceptions – anomalous or exceptional conditions requiring special processing – often changing the normal flow of program execution.

Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

- First created a main class with main method.
- The main method is followed by throws exception keyword that tells the compiler that exception is to be handled in this method.
- Defined a try block.
- Inside the try block, take two integer inputs from user and store them in two integer variables x and y.
- Now defined another try-catch block inside try block.
- Inside the inner try block, print the output of x divided by y.
- Then defined the inner catch block, which expects an arithmetic exception to occur.
- If arithmetic exception occurs, then print the exception.
- Now that the inner try-catch is defined, the outer catch block is defined.
- The outer catch block expects an input mismatch exception.
- If input mismatch exception occurs, then print the exception.
- Hence, providing the desired output.
