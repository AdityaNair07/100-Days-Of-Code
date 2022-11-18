<h1 align="center">Pattern Checker</h1>
Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

- First we take user input using Scanner class object(in).
- The user input is parsed to integer value by using Integer class function parseInt() and assign it to integer variable testCases.
- We then define a while loop which runs till testCases is greater than 0.
- We ask user to input string value and store that value in String variable pattern.
- Now we define a try catch block.
- Inside the try block we use Pattern class method compile() which takes one argument i.e. pattern.
- The compile method compiles the given regular expression into a pattern.
- Then we print "Valid" and exit the try block.
- If the try block has any error then we move to the catch block.
- The catch block catches the exception and print "Invalid" and exit the catch block.
- Finally, we have to decrement testCases so that the while loop terminates at some point.
