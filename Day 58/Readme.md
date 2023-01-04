<h1 align="center">Linked List</h1>

A Node class is provided for you in the editor. A Node object has an integer data field, data, and a Node instance pointer, next, pointing to another node (i.e.: the next node in the list).

A Node insert function is also declared in your editor. It has two parameters: a pointer, head, pointing to the first node of a linked list, and an integer, data, that must be added to the end of the list as a new Node object.

- First created a class named Node.
- Inside declared an Integer variable data and declared a Node type variable called next.
- Then created a constructor that takes integer d as parameter.
- Inside constructor stored d in data variable and initialised next variable to null.
- Then created the main class named Linked_List.
- Created a public static Node type method named insert that takes Node head and integer data variable as parameter.
- Inside the created Node object named temp; constructor that takes data as argument.
- Defined an if condition that checks head is equal to null.
- If yes then store temp value in head and return head.
- Then created another Node named current which stores head value.
- Then defined a while loop that runs till current next value is not equal to null.
- Inside the loop, updating the current value to current next value.
- Then updated current next value to temp and return head.
- Then created public static void return type method named display that takes Node head as parameter.
- Inside the method created Node start that is initialised to head.
- Then defined a while loop that runs till start is not equal to null.
- Inside the loop printing the start data and updating start value to start next value.
- Then created the main method.
- Inside the main method created an object of Scanner class named sc that takes user input.
- Then created Node head and initialised it to null.
- Then declared an integer variable N that takes integer user input.
- Defined a while loop that runs till N is greater than 0.
- Inside the loop declared an integer variable e that takes integer user input.
- head stores the value of insert() method.
- The insert() method takes head and e as arguments.
- Using display() method to display head value.
- Hence providing the output.