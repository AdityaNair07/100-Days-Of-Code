<h1 align="center">Static initializer block</h1>

#Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

#A static initialization block is a normal block of code enclosed in braces, { }, and preceded by the static keyword. Here is an example:

static {
// whatever code is needed for initialization goes here
}
A class can have any number of static initialization blocks, and they can appear anywhere in the class body. The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.

- Let's talk about the code.
- First we created a static block inside the main class.
- Then we create an object of Scanner class that is used to take user inputs.
- After this we declare two variables and store user inputs in them.
- Then we define an if else condition, in which we check if the user inputs are greater than 0 or not (basically we are checking if the input is negative or not)
- If the inputs are positive then we declare a variable area which is the multiplication of user inputs.(area = breadth\*height)
- And print the value of area variable.
- If any of the user inputs is negative we enter the else block and print exception.
- This makes the static block.
- Hence giving us the desired output.
