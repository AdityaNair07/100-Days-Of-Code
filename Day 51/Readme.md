<h1 align="center">Java SHA-256</h1>

Secure Hash Algorithm 2 (SHA-2) is a set of cryptographic hash functions designed by the National Security Agency (NSA). It consists of six identical hashing algorithms (i.e., SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224, SHA-512/256) with a variable digest size. SHA-256 is a 256-bit (32 byte) hashing algorithm which can calculate a hash code for an input of up to 264-1 bits. It undergoes 64 rounds of hashing and calculates a hash code that is a 64-digit hexadecimal number.

- First import security package and math package.
- Then created the main class with the main method.
- Inside the main method created an object of Scanner class named sc that takes user input.
- Then declared a String variable named s that takes String user input.
- Then defined a try-catch block.
- Inside the try block, created an object of MessageDigest class named md that stores the output of getInstance() method.
- The getInstance() method returns a MessageDigest object that implements the specified digest algorithm here SHA-256.
- Then declared a byte array named message that stores the output of digest() method.
- digest() method performs a final update on the digest using the specified array of bytes, then completes the digest computation.
- The specified array of bytes is accessed by using getBytes() method.
- Then declared an object of BigInteger named n that stores sign and magnitude of number.
- Then declared a String named hashtext that stores the value of n typecasted to String using toString() method.
- Then defined a while loop that runs till the length of hashtext is less than 64.
- Inside the loop, updating the hashtext value by adding 0 to it till loop terminates.
- Then printing the value of hashtext.
- Inside the catch block printing the NoSuchAlgorithmException exception caught.
- Hence providing the output.