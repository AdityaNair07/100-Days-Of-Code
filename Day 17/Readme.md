<h1 align="center">Overriding</h1>
When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones).

Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.

- First a parent/superclass is defined named Sports.
- Inside the Sports class a String return type method named getName is defined that returns "Generic Sports".
- Another method named getNumberOfTeamMembers which has a return type void prints the value that getName method returns.
- Then another class is defined named Soccer that acts as a sub class or child class of Sports class.
- Soccer class inherits the properties and behaviour of Sports class by extends keyword.
- Inside the Soccer class update the methods of super class by defining same name methods in the sub class.
- @Override is an annotation which is not neccessary to write but it prevents error and tells that the code is overridden.
- The getName method is defined which returns "Soccer class".
- The getNumberOfTeamMembers method prints the value getName method returns.
- Hence those two methods get overridden.
- Finally in the main class, objects of both classes are created (c1,c2)to show the functionality of overriding.
- Then call the getName and getNumberOfTeamMembers methods by using superclass object and print the output.
- Then call the getName and getNumberOfTeamMembers methods by using subclass object and print the output.
- Hence proving the output to understand the overriding mechanism.
