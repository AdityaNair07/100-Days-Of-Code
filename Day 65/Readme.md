<h1 align="center">Testing</h1>

Your company needs a function that meets the following requirements:

1. For a given array of  integers, the function returns the index of the element with the minimum value in the array. If there is more than one element with the minimum value, it returns the smallest one.
2. If an empty array is passed to the function, it raises an exception. A colleague has written this method. The implementation in Python is listed below. Implementations in other languages can be found in the code template.

- First created a class named Testing.
- Inside the class defined a static integer return type method named minimum_index() that takes integer array (seq) as parameter.
- Inside the method defined an if condition.
- If seq length is equal to 0 then throw a user defined exception named IllegalArgumentException using throw new keywords and displaying a message.
- Then declared an integer variable min_idx that is initialised to 0.
- Then defind a for loop that runs from 1 to length of seq i.e. traverse through the array.
- Inside the loop defined an if condition.
- If element at i index is smaller than element at mid_idx index of seq then min_idx is updated to i.
- The method returns min_idx.
- Then declared a static class named TestDataEmptyArray.
- Inside the class declared a static integer array return type method named get_array().
- The method returns a new array of size 0.
- Then declared a static class named TestDataUniqueValues.
- Inside the class declared a static integer array return type method named get_array().
- The method returns a new array with 1 and 2 as its elements.
- Also defined a static integer return type method named get_expected_result() that returns 0.
- Then declared a static class named TestDataExactlyTwoDifferentMinimums.
- Inside the class defined a static integer array return type method named get_array() which returns a new integer array with 1,1,2,3 and 4 as its elements.
- Also defined a static integer method named get_expected_result() that returns 0.
- Then defined a static void return type method named TestWithEmptyArray().
- Inside the method defined a try-catch block.
- Inside the try block created an integer array named seq that stores TestDataEmptyArray get_array() method output.
- Declared an integer variable named result that stores minimum_index() method output that takes seq as argument.
- Catch block catches the user defined exception.
- Then defined a new Exception named AssertionError that diplays a message.
- Then defined a static void return type method named TestWithUniqueValues().
- Inside the method declared an integer array named seq that stores TestWithUniqueValues get_array() method output.
- Then defined an if condition.
- If seq length is smaller than 2 then throw new user defined exception named AssertionError that displays a message.
- Then declared an Integer array tmp of size seq length.
- Defined a for loop that runs from 0 to seq length.
- Inside the loop tmp stores the value of elements of seq array.
- The defined an if condition that checks, if the LinkedHashSet of Integer type that takes the tmp as parameter does not have size equal to seq length.
- Then throw new Exception AssertionError that displays a message.
- Declared an integer variable expected_result that stores TestDataUniqueValues get_expected_result() method output.
- Declared an integer variable result that stores output of minimum_index() method that takes seq as argument.
- Then defined an if condition that checks if result is not equal to expected_result.
- Then throw new Exception AssertionError that displays a message.
- Defined a static void return type TestWithExactlyTwoDifferentMinimums() method.
- Inside the method declared an integer array seq that stores TestDataExactlyTwoDifferentMinimums get_array() method output.
- Then defined an if condition that checks if seq length is smaller than 2.
- If yes then throw new Exception AssertionError that displays a message.
- Declared an integer array tmp that stores seq object using clone() method.
- tmp is sorted using Arrays sort() method.
- Then defined an if condition that checks first element and second element of tmp are equal and tmp length is equal to 2 or element at 1st index of tmp is smaller than the element at index 2.
- If this condition is false then throw new Exception AssertionError that displays a message.
- Declared an integer variable expected_result that stores TestDataExactlyTwoDifferentMinimums get_get_expected_result() method output.
- Declared an integer result that stores minimum_index() method output that takes seq as argument.
- Defined an if condition that checks if result is not equal to expected_result.
- Then throw new Exception AssertionError that diplays a message.
- Finally defined the main method.
- Inside the main method calling the methods and printing "OK".
- Hence providing the output.