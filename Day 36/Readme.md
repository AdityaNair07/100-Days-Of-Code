<h1 align="center">Java Regex - Dupicate Words</h1>

Use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence I love Love to To tO code. Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?

- First import regex methods under java.util package.
- Inside the main class with main method.
- Declare a String variable named regex which stores the value "\\b(\\w+)(?:\\W+\\1\\b)+".
- Then, declared a Pattern variable named p which stores the case insensitive patterns using the compile method of Pattern class.
- Created an object named sc of Scanner class to take user input.
- Declared an integer variable named numSentences which stores the user input type casted into Integer using parseInt method.
- Then defined a while loop that runs till the numSentences variable value gets 0.
- Inside the loop, created a String variable named input that stores String user input.
- Then, created a Matcher type variable named m which stores the the value that matches input variable value from p using matcher() method.
- Then, defined another while loop, which runs for a condition till the condition is true using m.find() method.
- Inside the loop, updating the input variable by replacing all the m values to another m values grouped together using group() method.
- After exiting the inner while loop, printing the input variable.
- Hence providing the output.