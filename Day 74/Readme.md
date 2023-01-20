<h1 align="center">The Hurdle Race</h1>

- First created a class named Result.
- Inside the class defined a static integer return type method hurdleRace() that takes integer k and list of type integer height as parameters.
- Inside the method declared an integer variable result that stores the last indexed element of the list height.
- Then defined a for loop that runs from 0 to size of the list.
- Inside the loop defined an if condition that checks if the element at ith index is greater than result value.
- If yes then store the element to result variable.
- Then defined an if-else condition.
- If k is greater than result, the method returns 0.
- Else returns result-k as output.
- Then declared the main class with the main method.
- Inside the main method created an object of BufferedReader br that takes user input using InputStreamReader object.
- Created an object of BufferedWriter bw that provides output using the object of FileWriter object.
- Declared a String array firstMultipleInput that stores user input after removing regular expressions.
- Declared an integer variable n that stores the first element of firstMultipleInput array.
- Declared an integer variable k that stores the second element of firstMultipleInput array.
- Declared a list of integer type height that stores integer variables given by user.
- Declared an integer variable result that stores the output of hurdleRace() method that takes k and height as arguments.
- Finally printing the value of result using the write() method.