<h1 align="center">Java Deque</h1>

A double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();

- First import ArrayDeque, Deque, HashSet, Scanner and Set from util package.
- Then created a main class with main method.
- Inside the main method, created an object of Scanner class named sc that takes user input.
- Then created a Set of integer type using HashSet constructor.
- Then created a Deque using ArrayDeque constructor.
- Declared two Integer variables n and m that stores Integer user input.
- Declared and initialised an Integer variable max to 0.
- Then defined a for loop that runs from 0 to n.
- Inside the loop, declared an Integer variable named num that stores Integer user input.
- Then added the num variable value to the deque using add() method.
- Also added the num variable value to the set using add() method.
- Then defined an if condition that checks if deque size is equal to m variable value using size() method.
- If yes, then defined another if condition that checks if the set size is greater than max variable value using size() method.
- If yes, then max variable stores set size value.
- Then declared an Integer variable x that stores the first element of deque using removeFirst() method.
- The element is type casted to Integer and stored in x.
- Then defined another if condition that checks if the deque does not contain x variable value.
- If yes, then remove the x variable value from set using remove() method.
- Finally after exiting the for loop, printing the max variable value.
- Hence providing the output.