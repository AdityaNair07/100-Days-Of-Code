<h1 align="center">Beautiful Days At Movies</h1>

- First created a class Result.
- Inside the class defined a static integer return type method reverse() that takes integer variable n as parameter.
- Inside the method declared an integer variable a that is initialised to 0.
- Defined a while loop that runs till n is greater than 0.
- Inside the loop declared an integer variable rem that stores the remainder of n after dividing it by 10.
- Then a stores a * 10 + rem value.
- n value is decremented by dividing by 10.
- Then method returns a.
- Then defined a static integer return type method beautifulDays() that takes integer variables i,j and k as parameters.
- Inside the method declared an integer variable count that is initialised to 0.
- Then defined a while loop that runs till i gets greater than j.
- Inside the loop defined an if-else condition.
- if the absolute difference of i and reverse of i is equal to 0 then count value is incremented.
- Else if the absolute difference of i and reverse of i is divisible by k then count value is incremented.
- i value is incremented.
- The method returns count value.
- Inside the main method of the main class, created object of BufferedReader br that takes user input using InputStreamReader object.
- Then created object of BufferedWriter bw that provides output using FileWriter object.
- Declared String array firstMultipleInput that stores user input.
- Declared integer variables i,j and k that stores first, second and third elements of firstMultipleInput array respectively.
- Declared an integer variable result that stores the output of beautifulDays() method that takes i,j and k as arguments.
- Finally printing the value of result using write() method.
- Hence providing the output. 