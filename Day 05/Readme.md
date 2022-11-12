<h1 align="center">Loops</h1>

printing series
(a+2^0*b),(a+2^0*b+2^1*b),(a+2^0*b+2^1*b).....(a+2^0*b+2^1*b+.....2^n-1*b)

- First we ask the user to input how many test cases he wants.
- Then we store that input in integer variable t.
- We declare a for loop which runs number of times user wants i.e. t times.
- We ask user to input three integer variables a,b and n for t times.
- Then we declare another for loop which runs from 0 to n-1 i.e. n-1 times.
- Inside the for loop, we perform an operation.
- In the operation we first calculate 2 to the power j and multiply the result with b.
- The result obtained is then added to a.
- And we print value of a.
- Note that we are printing value of a and then adding a space as well.
- After the loop runs for j=0 we get a=2^0*b i.e. 1*b.
- For j=1 we get a=(2^0*b)+(2^1*b) i.e. a=1*b+2*b.
- This process will update value of a and print it n-1 times.
- After exiting this for loop, we go to the next line.
- Hence, working on the next test case.
