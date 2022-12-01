<h1 align="center">Subarray</h1>

- First we created the main method within the main class.
- Then we declared and initialised a variable n which stores the user input.
- We declared an integer type array named arr which is of size n.
- We then defined a for loop, which runs from 0 to n.
- Inside the loop, we integer user input and store those inputs into the elements at indices(i) specified by the loop.
- Then we declared two integer variables sum and count and initialised them to zero(0)
- We then defined a nested for loop.
- The outer for loop runs from 0 to n.
- The inner for loop runs from i to n.
- Inside the inner loop, we add the sum variable value and the element at index j.
- We then store the sum of them into the sum variable(updating the sum variable value)
- Then there is an if condition that checks if the sum is less than 0 or not.
- If it is less than 0 then count is incremented.
- After the inner loop is defined, we update the value of sum variable to 0 inside the outer loop.
- Finally we print the value that the count variable holds.
