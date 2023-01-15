<h1 align="center">Diagonal Difference</h1>

- First created a class named Result.
- Inside the class defined a static integer return type method named diagonalDifference() that takes List of List of type Integer (arr) as parameter.
- Inside the method declared two integer variables ld and rd; initialised to 0.
- Defined a for loop that runs from 0 to arr length using size() method.
- Inside the loop adding arr element at (i,i) index to ld variable using get() method following another get() method.
- Inside the loop adding arr element at ith index and (arr size - 1- i)th index to rd variable using get() method following another get() method that takes arr size - 1 -i as argument.
- The method returns the absolute value of the difference between ld and rd using abs() method of Math package.
- Then declared the main class with main method.
- Inside the main method created an object of BufferedReader named br that takes user input using object of InputStreamReader.
- Created an object of BufferedWriter named bw that shows the output using object of FileWriter object.
- Declared an integer variable n that stores user input after type casting it to Integer using parseInt() method.
- Declared a List of List of Integer type named arr.
- Iterating through arr elements and storing integer user input in it.
- Declared an integer variable result that stores diagonalDifference() method output that takes arr as argument.
- Finally printing the result value using write() method.
- Hence providing the output. 