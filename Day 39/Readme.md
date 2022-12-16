<h1 align="center">Java 1D Array Part 2</h1>

- First created a static boolean return type function called canWin that takes three parameters, integer type leap, integer array game and integer i.
- Inside the function, defined an if condition that checks if i is smaller than 0 or the element in game array at index i is equal to 1.
- If yes, then return false.
- Then defined another if condition that checks if i+1 is greater than or equal to game array length or i+leap is greater than equal to game array length.
- If yes, then return true.
- Then store 1 in game array at index i.
- Then return canWin() funtion with leap, game and i+1 as parameters or leap, game and i-1 as parameters or leap, game and i+leap as parameters.
- Then inside the main method, created an object of Scanner class named sc that takes user input.
- Declared an integer variable q that stores integer user input.
- Then, defined a while loop that runs till q becomes 0.
- Inside the while loop, declared two integer variables named n and leap that takes integer user input.
- Then declared an integer array game whose size is initialised to n.
- Then, defined a for loop, that runs from 0 to n.
- Inside the loop, store the integer user input to game array.
- Finally printing the canWin() function output using ternary operator.
- If the output is true then print YES else print NO.
- Hence providing output.