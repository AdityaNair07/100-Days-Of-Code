<h1 align="center">Abstract Class</h1>
A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses.

- First an abstract class is defined named Book.
- Inside that clas a String variable named title is declared.
- An abstract void method named setTitle is defined taking a String parameter(s).
- A String return type method getTitle is defined which returns the title.
- After the abstract class another class is defined named MyBook.
- MyBook class inherits (extends) the abstract class Book.
- Inside MyBook class instantiate the setTitle method which takes string s as parameter.
- The setTitle method assign the value of String s passed as parameter to String variable title.
- At last the main class is defined having main method.
- We take uer input using Scanner class.
- The user gives String input and that is assigned to title variable.
- Create an object of MyBook class.
- Now call setTitle method in which title variable is passed as argument.
- Print the output of getTitle method.
- Finally providing the desired output.
