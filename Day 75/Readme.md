<h1 align="center">Designer Pdf Viewer</h1>

- First created a class Result.
- Inside the class defined a static integer return type method named designerPdfViewer() that takes List of Integer type h and a String word.
- Inside the method declared an integer variable max that is initialised to 0.
- Then defined a for loop that runs from 0 to word length.
- Inside the loop defined an if condition.
- The index of character at ith position - 97 is accessed in the list; if it is greater than max then store the value in max variable.
- The method returns max * word length using length() method.
- Then created the main class with main method.
- Inside the main method created an object of BufferedReader br that takes user input using object of InputStreamReader.
- Created an object of BufferedWriter bw provides output using object of FIleWriter.
- Declared a list of Integer h that stores user input after removing the regular expressions.
- Declared a String word that takes String user input.
- Declared an integer variable result that stores designerPdfViewer() method output that takes h and word as arguments.
- Finally printing the value of result.