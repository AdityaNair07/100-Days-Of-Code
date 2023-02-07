<h1 align="center">Pangrams</h1>

- First created a class Result.
- Inside the class defined a static String return type method panagrams() that takes String s as parameter.
- Inside the method declared a String array s1 that stores s.split() value.
- Then declared two empty strings p and panagram.
- Then declared an integer variable count that is initialised to 0.
- Then declared a boolean array bool of length 26.
- Then defined a for loop that runs 0 to length of s1.
- Inside the loop elements of s1 are added to p.
- Then p is updated to lowercase using toLowerCase() method.
- Then defined a for loop that runs from 0 to length of p.
- Inside the loop at "character at ith position of p - 'a'" true value is inserted.
- Then defined another for loop that runs from 0 to length of bool array.
- Inside the loop defined if condition that checks if the ith element is true.
- If yes then count value is incremented.
- Then defined if-else condition that checks if count is equal to length of bool array.
- If yes then panagram stores "panagram" value.
- Else panagram stores "not panagram" value.
- The method returns panagram value.