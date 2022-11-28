<h1 align="center">Exception Handling</h1>
An exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.

- First created a class named MyCalulator.
- Inside the class defined a long return type function called power which takes two integer input as parameters(n and p).
- It is followed by throws Exception keyword which tells that this function expects an error to be handled.
- Using throws keyword, exceptions can be user defined.
- Inside the power function, defined if-else ladder.
- If the integers n or p are zero, then throw an exception which prints user defined message as error.
- Else if n or p is negative i.e. smaller than zero, then throw an exception which prints user defined message as error.
- Else run the code that performs the power operation.
- Inside the else block, declare and initialise a long type variable pow which is initialised to 1.
- Then defined a for loop that runs from 1 to p.
- Inside the for loop, multiply n to p till the loop terminates.
- At last return the pow variable value.
- Created the main class.
- Inside the main class, created a static final object(my_calculator) of MyCalulator class.
- Here static is used so that at time of class loading the constructor is called.
- The final keyword is used to declare that the data member or function is constant and cannot be changed.
- Inside the main function, defined a while loop, which runs till the user inputs values.
- Inside the while loop, take two integer type input from user(n and p).
- Then defined try catch block.
- Inside the try block, called the power function with n and p as the arguments using object my_calculator.
- Then printing the value returned by power function.
- Finally, inside the catch block print the exception e
