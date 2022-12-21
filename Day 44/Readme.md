<h1 align="center">Valid Username Regular Expression</h1>

A username is considered valid if all the following constraints are satisfied:

The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z].

- First created a class named UsernameValidator.
- Inside the class, created a static final String variable named regularExpression that stores expressions in String format.
- ^	finds a match as the beginning of a string.
- $	finds a match at the end of the string.
- [] specifies the range.
- {} matches any string that contains a sequence specified in it.
- After exiting this class, created the main class with main method.
- Inside the main class, declared a static final Scanner object named sc that takes user input.
- Inside the main method, declared an Integer variable named n that stores String user input and parse it into Integer type.
- Then defined a while loop that runs till n becomes 0.
- Inside the loop, created a String variable named userName that stores  String user input.
- Then, defined an if-else condition.
- If condition checks that the userName variable value matches the regularExpression variable value of UsernameValidator class using the matches function.
- If the condition returns true then print "Valid".
- Else print "Invalid".
- Hence providing the output. 