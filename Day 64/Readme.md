<h1 align="center">Nested Logic</h1>

- First created the main class named NestedLogic.
- Inside the class defined a static integer return type method named fine() that takes two integer arrays as parameters i.e. returnData and dueData.
- Inside the method declared and initialised an integer variable fine to 0.
- Then defined an if-else ladder.
- If element at 2nd index of returnData is greater than the element at 2nd index of dueData then fine stores 10000 and return fine value.
- Else if element at 2nd index of returnData is equal to the element at 2nd index of dueData and element at 1st index of returnData is greater than the element at 1st index of dueData then fine stores the difference between returnData 1st index element and dueData 1st index element and multiplied by 500; return fine value.
- Else if element at 2nd index of returnData is equal to the element at 2nd index of dueData and element at 1st index of returnData is equal to the element at 1st index of dueData and element at 0th index of returnData is greater than the element at 0th index of dueData.
- Then fine stores the difference between returnData first element and dueData first element and multiplied by 500; return fine value.
- Else return fine value.
- Then defined the main method.
- Inside the main method created an object of Scanner class named sc that takes user input.
- Declared an integer array named returnData of size 3.
- Then defined a for loop that runs from 0 to returnData length.
- Inside the loop returnData stores integer user input.
- Declared an integer array dueData of size 3.
- Then defined a for loop that runs from 0 to dueData length.
- Inside the loop dueData stores integer user input.
- Declared an integer variable fine that stores fine() method output that takes returnData and dueData as arguments.
- Finally printing the value of fine variable.
- Hence providing the output.