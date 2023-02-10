<h1 align="center">Making Anagrams</h1>

- First created a class named Result.
- Inside the class defined a static integer method makingAnagrams() that takes String variable s1 and s2 as parameters.
- Inside the method declared an integer variable count that is initialised to 0.
- Then declared two integer arrays a and b of size 26.
- Then defined a for loop that runs from 0 to s1 length.
- Inside the loop the element at (ith character of s1 - 'a')th position of array a is incremented.
- Then defined a for loop that runs from 0 to s2 length.
- Inside the loop the element at (ith character of s2 - 'a')th position of array b is incremented.
- Then defined another for loop that runs from 0 to length of a.
- Inside the loop defined an if condition that checks if ith element of a and b are not equal.
- If the condition is true then inside, defined another if condition that checks if ith element of a is greater than ith element of b or if ith element of b is greater than ith element of a; then count the absolute difference between the elements is added to count variable.
- The method returns count value.
- Hence providing the output.