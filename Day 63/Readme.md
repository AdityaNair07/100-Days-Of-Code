<h1 align="center">More Linked List</h1>

- First created a Node class.
- Inside the class declared an integer variable data and Node type variable next.
- Then created a constructor that takes integer variable d as parameter.
- Inside the constructor data stores d value and next is initialised to null.
- Then created the main class named MoreLinkedList.
- Inside the class defined a static Node type method named removeDuplicates() that takes Node head as parameter.
- Inside the method defined an if condition.
- If head is equal to null or head next is equal to null then return head.
- Created a Set of integer type named visited and called the HashSet constructor.
- Declared Node type variables current and previous; current stores head value and previous is initialised to null.
- Defined a while loop that runs till current is not equal to null.
- Inside the loop defined an if-else condition.
- If visited contains current data then previous next stores current next value.
- Else adding current data to previous next and previous stores current value.
- current stores current next value.
- The method returns head.
- Then defined static Node type method named insert() that takes Node head and integer data as parameter.
- Inside the method declared Node p with data as parameter.
- Then defined an if-else ladder.
- If head is equal to null then head stores p value.
- Else if head next is equal to null then head next stores p value.
- Else declared Node start that stores head value.
- Defined a while loop that runs till start next is not equal to null.
- Inside the loop, start stores start next value.
- start next stores p value.
- The method returns head.
- Then defined static void display() method that takes Node head as parameter.
- Inside the method declared Node start that stores head value.
- Defined a while loop that runs till start is not equal to null.
- Inside the loop printing start data and updating start to start next value.
- Finally inside the main method created an object of Scanner class named sc that takes user input.
- Node head is initialised to null.
- Then declared integer variable T that takes integer user input.
- Defined a while loop that runs till T becomes 0.
- Inside the loop integer variable ele takes integer user input and head stores the output of insert() method that takes head and ele as arguments.
- head stores removeDuplicates() method output that takes head as argument.
- Finally display() method is called and passed head as argument.
- Hence providing the output. 