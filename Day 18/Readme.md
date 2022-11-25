<h1 align="center">Overriding 2</h1>
When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

- First define a class BiCycle in which string return type function(define_me) is defined that returns a string("a vehicle with pedals").
- Define another class named MotorCycle which inherits(extends) all properties and behaviour of BiCycle class.
- MotorCycle class is subclass and BiCycle class is superclass.
- Inside the subclass, override the define_me function by returning different string("a cycle with an engine").
- Inside the subclass, define a constructor i.e. a no return type function with same name as the class.
- Inside the constructor, print the output of define_me funtion.
- Declare a string named temp and initialise it to the superclass define_me function.
- This is done by using super keyword, which is used to access the superclass data members and member functions.
- Temp stores the value of define_me function of superclass.(super.define_me)
- Print the output of temp with a string.
- Finally, defined the main class and main method.
- Created the object of MotorCycle class.
- As it has a constructor, it will be called automatically.
- Hence providing the output.
