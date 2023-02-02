<h1 align="center">Equalize Array</h1>

- First created a class Result.
- Inisde the class defined a static integer return type method equalizeArray() that takes List of integer type arr as parameter.
- Inside the method declared an integer variable c that is initialised to 0.
- Then defined a for loop that runs from 0 to size of arr.
- Inside the loop declared and initialised an integer variable count to 1.
- Defined another loop that runs from i+1 to arr size.
- Inside the loop defined an if condition.
- If the ith element of arr is equal to jth element of arr then count value is incremented.
- Then defined an if condition for the outer loop; if count value is greater than c then c stores count value.
- The method returns arr size - c as output.
- Inside the main method of the main class, created an object of BufferedReader br that takes user input using object of InputStreamReader.
- Then created an object of BufferedWriter bw that provides output using FileWriter object.
- Declared an integer variable n that takes integer user input.
- Declared a List of integer type arr that stores integer inputs.
- Declared an integer variable result that stores the output of equalizeArray() method that takes arr as argument.
- Finally printing result value using write() method.