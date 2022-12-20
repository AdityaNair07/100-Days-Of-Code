<h1 align="center">Java Regex</h1>

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

- First created a class named MyRegex.
- Inside the class declared a String variable named limit.
- The limit variable stores the values that are allowed in an I.P address.
- The values allowed are given as String inside parenthesis().
- \d is used to find digit in the pattern.
- d{1,2} Matches any string that contains a sequence of 1 to 2 d's.
- d{1,2}|(0|1) Find a match for any one of the patterns separated by | 
- [0-4] is used to find character from the range 0 to 4.
- Then declared a String variable named pattern that stores limit variable value with "\\." string concatenated.
- After exiting this class, defined the main class with main method.
- Inside the main method, created an object of Scanner class named sc that takes user input.
- Then, defined a while loop, that runs till user provides input.
- Inside the loop, declared a String variable called IP that stores user String input.
- Then printing boolean output, using the matches method of String class.
- Inside the matches method passed pattern variable using object of MyRegex class.
- Hence providing the output.