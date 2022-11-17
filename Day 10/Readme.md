<h1 align="center">Anagrams</h1>
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

_import java.util.Arrays_

- First we define a boolean function isAnagram which takes two parameters and return a boolean value.
- Then inside this function, we declare a boolean variable named anagram which is initialized to true.
- Then we define an if-else condition where we check if the length of string a and b are equal or not.
- If the lengths are equal then we proceed further else we initialise anagram as false and return anagram.
- Inside the condition we first make the strings to lowercase by using function toLowerCase().
- We then declare two character arrays which are given value of the strings converted into character arrays using the toCharArray() function.
- Now we sort these arrays by using sort() function of Arrays class.
- After this we define another if-else condition, now that the character arrays (char_a,char_b) are sorted, we check if those are equal or not.
- We use the equals() method of Arrays class.
- If the arrays are equal we return anagram, else we initialise anagram to false and return anagram.
- Hence at the end of the function we return anagram which will be initialized to true or false according to the conditions mentioned above.
