<h1 align="center">Migratory Birds</h1>

- First created a class Result.
- Inside the class defined a static integer return type method migratoryBirds() that takes List of Integer arr as parameter.
- Inside the method created an integer array t of size 100.
- Declared an integer variable birdType that is initialised to 0.
- Then defined a for loop that runs from 0 to arr size.
- Inside the loop the element at the value of ith index of arr is incremented.
- Then defined a for loop that runs from 1 to t length.
- Inside the loop defined an if condition that checks if the element at birdType index is smaller than the element at ith index.
- Then birdType stores i.
- The method returns birdType value.
- Inside the main method of the main class, created object of BufferedReader br that takes user input using object of InputStreamReader.
- Then created object of BufferedWriter bw that provides output using object of FileWriter object.
- Declared an integer variable arrCount that stores integer user input.
- Declared List of Integer type arr that stores integer values.
- Then declared an integer variable result that stores migratoryBirds() method output that takes arr as argument.
- Finally printing the value of result using write() method.
- Hence providing the output.