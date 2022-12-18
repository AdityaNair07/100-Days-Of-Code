<h1 align="center">Java Stack</h1>

a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.

- First created an object of Scanner class named sc that takes user input.
- Then defined a while loop that runs till the user gives input.
- Inside the while loop, created a String named input that takes String user input.
- Then created a Stack of Character type named stack.
- Then defined a for each loop that iterates through input using toCharArray function and the iterator is a character c.
- Inside the loop, defined an if condition.
- If stack is not empty then run the code inside.
- The ! is used for not and isEmpty() funtion returns true or false.
- Inside the if condition, defined if-else ladder.
- If c is equal to } and the top of stack has { ,using peek() function then use pop() function that returns the top element of the stack.
- Else if c is equal to ] and the top of stack has [ ,using peek() function then use pop() function that returns the top element of the stack.
- Else if c is equal to ) and the top of stack has ( ,using peek() function then use pop() function that returns the top element of the stack.
- Else use push() function to add c to the stack.
- After exiting the if-else ladder and the for loop, printing stack is empty or not using the isEmpty() function.
- Hence providing the output.