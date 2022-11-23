<h1 align="center">Interface</h1>
A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism.

- First an interface named AdvancedArithmetic is created.
- Inside the interface integer return type method is defined named divisor_sum which takes an integer as parameter.
- Then a class MyCalculator is defined that implements AdvancedArithmetic interface.(the interface behaviour is implemented into the class)
- Inside the MyCalculator class instantiate the method divisor_sum.
- Inside divisor_sum, an integer variable sum is initialised to 0.
- Then a for loop is defined which runs from 1 to n.
- Inside the for loop an if condition is defined which checks if n is divisible by i or not.(in simple words calculating the divisors)
- If n is divisible by i, then add the integer to sum variable.
- Return sum variable from divisor_sum method.
- Finally main class is defined.
- Define a static method ImplementedInterfaceNames which takes the object as a parameter.
- A class array named theInterfaces is defined which is assigned the value of object's class and interface.
- A for loop is defined which runs from 0 to length of theInterfaces array.
- A string variable interfaceName is assigned the value of theInterfaces array ith index element's name.
- Then printing the interfaceName variable value.
- Inside the main function, object of MyCalculator class is allocated memory.
- Printing on screen "I implemented:".
- Calling ImplementedInterfaceNames function and passing object of MyCalculator class as argument(my_calculator).
- Take integer input from the user and store that input in integer variable n.
- Calling divisor_sum method taking n as argument.
- Printing the value that the method returns.
- Hence providing desired output.
