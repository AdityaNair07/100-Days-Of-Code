<h1 align="center">2D </h1>
An hourglass in an array is a portion shaped like this:

a b c
\td
e f g

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1 1 1 0 1 0 0
\t1 \t0 \t0
1 1 1 1 1 0 1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

- First created the main class with main method.
- Declared and initialised a 2d array called arr that has 6x6 configuration.
- Then declared an integer variable called max that is initialised to the minimum value an integer can hold i.e. -2147483648.
- Defined a for loop, which runs from 0 to 6.
- Nested the for loop, the inner loop runs from 0 to 6.
- Inside the inner loop, take integer user input and store them in the array indices that the loop specifies.
- Then defined another nested for loop, that will perform the operation in the 2d array that the user just inputted.
- This nested loop outer loop and inner loop, runs from 0 t0 4.
- The sum holds array elements that are creating hourglass pattern.
- The sum of elements at index [0,0][0,1][0,2][1,1][2,0][2,1][2,2] is stored in sum variable.
- The sum variable gets updated inside the loop and covers the whole 2d array to find hourglass pattern sum.
- Then an if condition is defined which checks if the sum variable value is greater than that of max variable.
- If yes the assign the sum variable value to max variable.
- Finally print the max variable value.
- Hence giving the desired output.
