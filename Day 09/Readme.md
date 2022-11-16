<h1 align="center">Date and Time</h1>
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

Sample Input:

08 05 2015

Sample Output:

WEDNESDAY

Explanation:

The day on August 5th 2015 was WEDNESDAY.

- First we create an object of class Calendar and use the getInstance method.
- Then we set the object of Calendar class i.e. c by using set method.
- Here we decrement month by 1 because the month index starts from 0.
- Then we create an object for Date class i.e. date and use the getTime method to get time.
- In the next step, we create a string object i.e. dayWeekText and create a new SimpleDateFormat method with "EEEE" as argument.
- Also we use format function in which date object is given as input.
- Finally we return dayWeekText in upper case.
