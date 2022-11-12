<h1 align="center">Data types</h1>

- In this question we ask user input for test cases i.e how many test cases would the user like to check.
- Now we run a piece of code t times i.e the number of test cases user mentioned.
- We define a for loop which runs for t times.
- Inside the for loop, we declare a try catch block.
- Inside the try block, we ask user to input a number(in the program long)
- Now we print on the screen that the number can be fitted in:
- After this we declare a few if conditional statements for the range of data types.
- We first check if the number entered by the user lies between -128 and 128(i.e range of byte data type).....yes, then we print that the number can be fitted in byte datatype.
- We first check if the number entered by the user lies between -2^15 and 2^15(i.e range of short data type).....yes, then we print that the number can be fitted in short datatype.
- We first check if the number entered by the user lies between -2^31 and 2^31(i.e range of integer data type).....yes, then we print that the number can be fitted in integer datatype.
- We first check if the number entered by the user lies between -2^63 and 2^63(i.e range of long data type).....yes, then we print that the number can be fitted in long datatype.
- After going through all the if conditions, if the number does not satisfy any of conditions we exit from the try block and get inside the catch block.
- Inside the catch block we print that the number entered by the user can not be fitted anywhere.
- Finally we get the output as in which data types the number entered by the user can be fitted.
