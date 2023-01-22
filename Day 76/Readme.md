<h1 align="center">Viral Advertising</h1>

- First created a class Result.
- Inside the class defined a static integer return type method viralAdvertising() that takes integer variable n as parameter.
- Inside the method declared integer variables cumulative that is initialised to 2, shared that is initialised to 5 and liked that is initialised to 2.
- Then defined a for loop that runs from 2 to n.
- Inside the loop shared stores the value of liked multiplied by 3 (liked * 3).
- liked stores the value of shared divided by 2 (shared/2).
- liked is added to cumulative.
- The method returns the value of cumulative variable.
- Then created the main class with the main method.
- Inside the main method created an object of BufferedReader br that takes user input using InputStreamReader.
- Created an object of BufferedWriter bw that provides output using object of FileWriter.
- Declared an integer variable n that takes user input and typecast it into integer using parseInt()  method.
- Declared an integer variable result that stores the output of viralAdvertising() method that takes n as argument.
- Finally printing the value of result using write() method.
- Hence providing the output.