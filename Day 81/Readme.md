<h1 align="center">Bill Division</h1>

- First created a class Result.
- Inside the class defined a static void return type method bonAppetit() that takes List of integer type bill, integer variables k and b as parameters.
- Inside the method declared two integer variables sum and actual_sum that are initialised to 0.
- Defined a for loop that runs from 0 to size of list.
- Inside the loop defined an if condition that checks if the ith element of bill is equal to the kth element of bill.
- If yes then continue.
- Else sum stores the addition of all elements in bill list.
- Then actual_sum stores the half of sum value.
- Then defined an if-else condition.
- If b is equal to actual_sum then printing Bon Appetit.
- Else printing the difference between b and actual_sum.
- Then created the main class with main method.
- Inside the main method created object of BufferedReader br that takes user input using object of InputStreamReader.
- Declared a String array firstMultipleInput that stores user input.
- Declared two integer variables n and k that stores first and second index elements of firstMultipleInput array respectively.
- Declared a list of integer type bill that stores integer user input.
- Declared an integer variable b that stores integer user input.
- Finally printing the output of bonAppetit() method that takes bill, k and b as arguments.
- Hence providing the output.