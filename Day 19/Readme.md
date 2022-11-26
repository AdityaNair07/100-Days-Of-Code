<h1 align="center">InstanceOf</h1>
The Java instanceof operator is used to test if the object or instance is an instance of the specified type or not.

In this problem we have three classes:

Student class
Rockstar class
Hacker class

In the main method, we populated an ArrayList with several instances of these classes. count method calculates how many instances of each type is present in the ArrayList. The code prints three integers, the number of instance of Student class, the number of instance of Rockstar class, the number of instance of Hacker class.

- First define three empty classes Student, Rockstar and Hacker.
- Then define the main class.
- Inside the main class, define a static String return type method called count which takes an ArrayList as parameter.
- Inside the method, declare and initialise three integer variables, a,b and c to 0(zero)
- Then define a for loop which runs from 0 to size of the ArrayList(mylist).
- Then define an Object type variable called element.
- Element stores the value of mylist elements at i index while inside the loop.
- It is assigned elements of ArrayList by using get() method which takes index i as input.
- Then define three if conditions.
- If element is an instance of Student then, increment a variable by 1.
- If element is an instance of Rockstar then, increment b variable by 1.
- If element is an instance of Hacker then, increment c variable by 1.
- For this use instanceof keyword which returns true or false according to the instance/object of a class. If the object/instance is not of a specified class it returns false else returns true.
- Then type cast the integer variables a,b and c to String using Integer class toString method which takes one argument.
- Assign the string of type casted variables to a String variable result.
- Return result.
- Inside the main method, create an ArrayList mylist.
- Take an integer input from user and store it in t intger variable.
- Define a for loop which runs from 0 to t.
- Take String user input and store it in String variable s.
- Define three if conditions.
- If String s is equal to "Student", then add instance of Student class into mylist.
- If String s is equal to "Rockstar", then add instance of Student class into mylist.
- If String s is equal to "Hacker", then add instance of Student class into mylist.
- Finally print the output of count method taking mylist as argument.
