<h1 align="center">Divisible Sum Pairs</h1>

- First created a class Result.
- Inside the class defined a static integer return type method named divisibleSumPairs() that takes integer variables n and k & a list of integer type ar as parameters.
- Inside the method declared an integer variable count that is initialised to 0.
- Defined a for loop that runs from 0 to ar size.
- Inside the loop defined a for loop that runs from 0 to ar size.
- Inside the inner loop defined an if condition that checks if i is smaller than j and the sum of element at ith index & jth index is divisible by k.
- If both conditions are true then count value is incremented.
- The method returns count value.
- Created the main class with main method.
- Inside the main method created the object of BufferedReader br that takes user input using object of InputStreamReader.
- Then created an object of BufferedWriter bw that provides output using object of FileWriter.
- Declared a String array firstMultipleInput that stores user input.
- Declared two integer variables n and k that stores the first and second element of firstMultipleInput respectively.
- Declared a list of integer type ar that stores integer user input.
- Then declared an integer variable result that stores the output of divisibleSumPairs() method that takes n,k and ar as arguments.
- Finally printing the value of result variable using write() method.
- Hence providing the output.