<h1 align="center">Java BitSet</h1>

Java's BitSet class implements a vector of bit values (i.e.: false(0) or true()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0, perform a series of M operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

- First created an object(sc) of Scanner class to take user input.
- Then declared an integer variable named length that takes integer user input.
- And another integer variable numOfOperations takes integer user input.
- Then two BitSet bitSet1 and bitSet2 are created having size of the value stored in length variable.
- Then created an array of BitSet named bitSets and stored bitSet1 and bitSet2 in it.
- Created a String variable named operation which is initialised to an empty string.
- After that two integer variables firstArg and secondArg is initialised to 0.
- Then defined a for loop that runs from 0 to numOfOperations.
- Inside the loop, take String user input and store it in operation variable; take integer user inputs and store them in firstArg and secondArg respectively.
- Then defined a switch statement that takes operation variable as the key.
- Inside the switch statement, cases are defined.
- Inside the first case if the key matches "AND" then, this operation performs a logical AND of this target bit set with the argument bit set.
- This bit set is modified so that each bit in it has the value true if and only if it both initially had the value true and the corresponding bit in the bit set argument also had the value true.
- Then exit the case using break.
- Inside the second case if the key matches "OR" then, this operation performs a logical OR of this bit set with the bit set argument.
- This bit set is modified so that a bit in it has the value true if and only if it either already had the value true or the corresponding bit in the bit set argument has the value true.
- Then exit the case using break.
- Inside the third case if the key matches "XOR" then, this operation performs a logical XOR of this bit set with the bit set argument.
- This bit set is modified so that a bit in it has the value true if and only if one of the following statements holds:
- The bit initially has the value true, and the corresponding bit in the argument has the value false.
- The bit initially has the value false, and the corresponding bit in the argument has the value true.
- Then exit the case using break.
- Inside the fourth case if the key matches "FLIP" then, this operation sets the bit at the specified index to the complement of its current value.
- Then exit the case using break.
- Inside the fifth case if the key matches "SET" then, this operation sets the bit at the specified index to true.
- Then exit the case using break.
- After exiting the switch statement, printing the output using print format function.
- Using System.out.printf, using %d to print bitSet1 and bitSet2 values.
- Using the cardinality function return the number of bits set to true in the BitSets bitSet1 and bitSet2 respectively.
- Hence, displaying the output.