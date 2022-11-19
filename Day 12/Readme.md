<h1 align="center">Substring Comparison</h1>
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

A<B<........Y<Z<a<b<..........y<z

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.

- The getSmallestAndLargest() function takes two arguments as input i.e. a string(s) and the length of substring(k).
- Inside the getSmallestAndLargest() function with string return type, we declare three string variables i.e. smallest, largest and str.
- We initialise the smallest and largest variables as substring of the given string by using the substring function of String class.
- The substring function takes two arguments to calculate the substring of a string i.e. start index and end index.
- We provide the start index as 0 and end index as k.
- Then we define a for loop that starts from 0 and runs till the length of string -k (s.length-k) times.
- Inside the for loop, we update the value of variable str to substring of string s from i as start index and i+k as end index.
- Then we declare an if condition which compares smallest variable to the str variable and checks if the result is greater than 0 or not.
- If the result is greater than 0, smallest variable is assigned the value of str variable and exit the condition.
- Then we declare an if condition which compares largest variable to the str variable and checks if the result is smaller than 0 or not.
- If the result is smaller than 0, largest variable is assigned the value of str variable and exit the condition.
- Then we exit the for loop and return smallest and largest variables.
- Hence giving us the output.
