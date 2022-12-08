<h1 align="center">Java Factory Pattern</h1>

A factory is simply an object that returns another object from some other method call, which is assumed to be "new".

In this problem, you are given an interface Food. There are two classes Pizza and Cake which implement the Food interface, and they both contain a method getType().

The main function in the Main class creates an instance of the FoodFactory class. The FoodFactory class contains a method getFood(String) that returns a new instance of Pizza or Cake according to its parameter.

- First an interface named Food is created with an abstract method named getType of String type.
- Then a class named Pizza is created that implements the interface Food.
- Inside this class, implemented the abstract method getType which returns a String.
- Then, a class named Cake is created that implements Food interface.
- Inside this class, implemented the abstract method getType which returns a String.
- Then created another class named FoodFactory.
- Inside the class, created a Food return type method named getFood with a String parameter named order.
- This method returns an object, following a condition that the parameter String is equal to the String "pizza".
- If yes, then return a Pizza class object.
- Else return a Cake class object.
- Then inside the the main method, defined a try catch block.
- Inside the try block created a Scanner class object to take user input.
- Then created a FoodFactory object named foodFactory.
- Created a Food object named food that is initialised to the output of method getFood().
- Then printing the class name by using getClass() method.
- Then printing the output of getType() method.
- After exiting the try block, inside the catch block printing "Unsuccessful termination".
- Hence providing the output.