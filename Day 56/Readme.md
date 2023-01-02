<h1 align="center">Binary Numbers</h1>

Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.

Example

n = 125

The binary representation of 125 is 1111101. In base 10, there are 5 and 1 consecutive ones in two groups. Print the maximum, 5.

- First created the main class with main method.
- Inside the main method created an object of BufferedReader class named br that takes user input using InputStreamReader object.
- Then declared an Integer variable n that takes user input and removes whitespaces from the beginning and end.
- Then type cast the input to Integer using parseInt() method.
- Declared two Integer variable binaryNums and count that are initialised to 0.
- Then defined a while loop that runs till n is greater than 0.
- Inside the loop, created an Integer variable t that stores n%2 result.
- Then defined an if-else condition.
- If t is equal to 0 then count is initialised to 0.
- Else count is incremented and binaryNums stores the output of maximum of count and binaryNums using max() method of Math package.
- Updating n value by dividing it by 2.
- Then printing the value of binaryNums.
- Hence providing the output.