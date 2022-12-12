<h1 align="center">Java Reflection Attribute</h1>

JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of public fields of a class using getDeclaredMethods().

- First, created a Student class.
- Inside the class declared private variables String name, String id and String email.
- Then, defined a String return type method named getName() that returns name.
- Defined a String return type method named getId() that returns id.
- Defined a String return type method named getEmail() that returns email.
- Defined a void return type method setName that takes String parameter.
- Inside the method this keyword is used to access name variable.
- Defined a void return type method setId that takes String parameter.
- Inside the method this keyword is used to access id variable.
- Defined a void return type method setEmail that takes String parameter.
- Inside the method this keyword is used to access email variable.
- Then, defined the main class with main method.
- Inside the main method, created a Class type variable student which stores name of a class using student.class.
- Then created a Method type of array named methods which stores the methods inside the student class.
- Then created an arraylist of String type named methodList.
- Then, defined a for each loop that iterates through the methods array.
- Inside the loop, adding the names of elements of methods array to arrayList named methodList.
- Sorting the elements of arrayList named methodList using Collections sort method.
- Then, defined a for each loop that iterates through methodList and prints the elements.
- Hence providing the output.