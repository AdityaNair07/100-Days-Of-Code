<h1 align="center">Tag Content Extractor</h1>

In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

1. The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

2. Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

3. Tags can consist of any printable characters.

- First import regex package.
- Inside the main method of the main class, created an object named sc of Scanner class that takes user input.
- Then, created an Integer variable named testCases which stores the user input type casted to Integer.
- Then, defined a while loop that runs till the testCases becomes 0.
- Inside the loop, created a String variable named line that takes user input.
- Another String variable named regex stores the value "<(.+)>(([^<>]+))</\\1>".
- Then, created a Pattern type variable named pattern which stores the compiled value of regex variable using the compile method.
- Then, created a Matcher type variable named matcher which stores the matching values of line variable using the matcher method.
- Then defined an if else condition.
- If condition checks if matcher has values to iterate or not using find() method of Matcher.
- Inside the if condition, matcher is reset using reset() method.
- Then, defined a while loop that runs till matcher variable has values using find() method.
- Inside the while loop, printing the matcher values by grouping them in 2.
- Else, printing None.
- After exiting the if-else conditions decrementing the testCases variable value.
- Hence providing the output.