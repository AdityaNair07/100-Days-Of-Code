<h1 align="center">Java Covariant Return Type</h1>

Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.

Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a return type that is some subclass of the original return type. It is best practice to use the @Override annotation when overriding a superclass method.

- Created a class named Flower.
- Inside the class created a String return type method named whatsYourName that returns String "I have many names and types".
- Then created a class named Jasmine that inherits Flower class properties and functions using extends keyword.
- Inside the class, override the method whatsYourName that returns "Jasmine".
- Then created a class named Lily that inherits Flower class properties and functions using extends keyword.
- Inside the class, override the method whatsYourName that returns "Lily".
- Then created a class named Region.
- Inside the class, created a Flower type method named yourNationalFlower that returns an object of Flower class.
- Created a class named WestBengal that inherits Region class properties and functions using extends keyword.
- Inside the class, override the yourNationalFlower method by returning an object of Jasmine class.
- Created a class named AndhraPradesh that inherits Region class properties and functions using extends keyword.
- Inside the class, override the yourNationalFlower method by returning an object of Lily class.
- Then created a main class with main method.
- Inside the main method created a BufferedReader class object that takes user input using InputStreamReader object.
- Then created a String variable s that reads the input and stores the input by removing the whitespaces before and after the input.
- Then created an object of Region class named region that is initialised to null.
- Then defined a switch statement that takes s variable as key.
- Then defined cases.
- The first case checks if the key is "WestBengal".
- Then, region object stores the object of WestBengal class and breaks the condition.
- The second case checks if the key is "AndhraPradesh".
- Then, region obejct stores the object of AndhraPradesh class and breaks the condition.
- Then created a Flower class object that stores the value returned by yourNationalFlower() method using region object.
- Finally printing the output of whatsYourName() method using flower object.
- Hence providing the output.

