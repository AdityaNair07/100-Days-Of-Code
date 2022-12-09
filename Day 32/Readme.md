<h1 align="center">Java Sort</h1>

Given a list of student information: ID, FirstName, and CGPA. The task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

- First, created a class named Student.
- Inside the class, declared private variables of integer type named id, String type named fname and double type named cgpa.
- Then defined a constructor that takes id, fname and cgpa as the parameters.
- Inside the constructor, called a super constructor with the super keyword.
- Then used this keyword to access id, fname and cgpa variables.
- After exiting the constructor, created an integer return type of method named getId that returns id.
- Then created a String return type method named getFname that returns fname. 
- Then created a double return type method named getCgpa that returns cgpa.
- Inside the main method, created an object of Scanner class to take user input.
- Then, declared an integer variable named testCases which takes String user input and Parse it into Integer type.
- Then, created a List named studentList that takes Student class as parameter.
- Then, defined a while loop, that runs for the condition that testCases value is greater than 0.
- Inside the while loop, declared Integer variable named id that takes Integer user input.
- And a String variable named fname that takes String user input.
- And a Double variable named cgpa that takes Double user input.
- Then, created an object of Student class named st and inside the constructor id, fname and cgpa is given.
- Then, added the object into the list studentList using add method.
- Then, decrementing the testCases value.
- Then, using the Collection class sort method.
- Inside the sort method, studentList is given as the argument.
- And the other argument is the object of Comparator class of type Student.
- Inside the Comparator object, defined an Integer return type method named compare that takes two parameters i.e. objects of Student class s1 and s2.
- Inside the method, defined an if-else ladder condition.
- Inside the if condition, check if s1 cgpa is not equal to s2 cgpa.
- If the condition is true, return s2 cgpa - s1 cgpa and type cast the result to Integer type.
- Else if s1 Fname is not equal to s2 Fname, then return result of s1 Fname compared to s2 Fname.
- Else, return s1 id - s2 id.
- After exiting the if-else conditions, defined a for each loop.
- The loop runs for iterables of studentList.
- Inside the loop, printing the Fname using the Student class object st.
- Hence providing the output.