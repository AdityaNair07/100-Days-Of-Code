<h1 align="center">Minimum Distances</h1>

- First created a class Result.
- Inside the class defined a static integer return type method minimumDistances() that takes List of Integer type a as parameter.
- Inside the method declared a variable min that stores the max value of Integer.
- Then defined a for loop that runs from 0 to size of a.
- Inside the loop defined another loop that runs from i+1 to size of a.
- Inside the inner loop defined an if condition.
- If the ith element and the jth element difference is equal to 0 and the absolute difference between i and j is less than min.
- If yes then min stores the absolute difference of i and j and breaks the loop.
- Then defined an if condition that checks if min is equal to maximum value of Integer.
- If yes then min value is updated to -1.
- The method returns min value.
- Inside the main method of the main class created an object of BufferedReader br that takes user input using object of InputStreamReader.
- Then created object of BufferedWriter bw that provides output using FileWriter object.
- Then declared an integer variable n that stores integer user input.
- Then created a list of Integer type a that stores integer inputs.
- Declared an integer variable result that stores minimumDistances() method output that takes a as argument.
- Finally printing the result value using write() method.
- Hence providing the output.