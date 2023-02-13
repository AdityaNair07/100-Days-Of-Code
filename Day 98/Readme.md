<h1 align="center">Two Strings</h1>

- First created a class Result.
- Inside the class defined a static String return type method twoStrings() that takes two String variables s1 and s2 as parameter.
- Inside the method declared two integer arrays bool1 and bool2 of size 26.
- Then declared an empty String variable s and an integer variable count initialised to 0.
- Then defined a for loop that runs from 0 to length of s1.
- Inside the loop incrementing the value at index, character at ith index - 'a' of bool1 array.
- Then defined another for loop that runs from 0 to length of s2.
- Inside the loop incrementing the value at index, character at ith index - 'a' of bool2 array.
- Then declared a for loop that runs from 0 to length of bool1.
- Inside the loop defined an if condition that checks if ith element of bool1 and bool2 are not equal to 0.
- Then defined another if condition that checks if ith element of bool1 is greater than or equal to that of bool2 or if ith element of bool1 is smaller than or equal to that of bool2.
- If yes then count value is incremented then break the loop.
- Then defined an if-else condition that checks if count value is greater than or equal to 1.
- If yes then s stores YES as String, else NO is stored.
- The method return s value.
- Hence providing the output.