<h1 align="center">Regex, Patterns and Intro to Databases</h1>

a database table, Emails, which has the attributes First Name and Email ID. Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in @gmail.com.

- First created the main class with the main method.
- Inside the main method created an object of BufferedReader class named br that takes user input using object of InputStreamReader.
- Declared an integer variable N that takes user input after removing the whitespaces before and after the input using trim() method; type casting the input to Integer using parseInt() method.
- Declared a Vector of type String named mail_Name_Vector.
- IntStream method range() is used that returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1; 0 and N are passed as the arguments.
- Defined a forEach loop.
- Inside the loop defined a try-catch block.
- Inside the try block, declared a String array named firstMultipleInput that stores user input and replacing the regular expression; splitting the input using split() method.
- Declared String firstName that stores element at 0th index of firstMultipleInput array.
- Declared String emailID that stores element at 1st index of firstMultipleInput array.
- Declared a String array named emailSplStrings that stores the output of emailID after splitting on @ expression using split() method.
- Defined an if condition that checks if emailSplStrings element at 1st index is equal to gmail.com and the firstName length is smaller than or equal to 20.
- If yes then firstName is added to mail_Name_Vector.
- Inside the catch block, defined a new exception RuntimeException.
- Then sorting mail_Name_Vector using sort() method of Collections package.
- Then defined for each loop that iterates through the mail_Name_Vector.
- Finally printing the elements of mail_Name_Vector.
- Hence providing the output.