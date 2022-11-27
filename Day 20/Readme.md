<h1 align="center">Iterator Class</h1>
Java Iterator class can help you to iterate through every element in a collection.

- First created the main class Iterator_class.
- Then defined a static Iterator function called func which takes an ArrayList as parameter.(mylist)
- Inside this function, created an Iterator object it that is initialised to constructor of Iterator class called by mylist.
- Then defined a while loop which checks whether the iterator has any next input or not by using the method hasNext() which returns true or false.
- Inside while loop, created object named element which stores the value user provides.
- The element object stores any value the user provides by using next() method.
- Then defined an if condition, where it is checked that the element value is equal to "###" or not.
- If it is equal, then break the loop and return it object.
- Then inside the main method, create an ArrayList named mylist and allocate memory to it.
- Take two integer inputs from the user(n,m).
- Then defined a for loop which runs from 0 to n.
- Inside the loop, add the user input to mylist.
- Then add "###" to mylist.
- Defined another for loop which runs from 0 to m.
- Inside the loop, add the user input to mylist.
- Then create an Iterator object it which stores the value returned by function (func) which is given mylist as the argument.
- Defined a while loop, which checks whether it object has any value to be stored or not.
- Inside the while loop, an object named element is created which stores the value user inputs.
- Then type cast the object element to String.
- Finally print the type casted value of element.
