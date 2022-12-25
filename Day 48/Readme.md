<h1 align="center">MD5</h1>

MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a 128-bit hash value. Here are some common uses for MD5:

1. To store a one-way hash of a password.
2. To provide some assurance that a transferred file has arrived intact.

- Created a main class named MD5 with main method.
- The main method checks for NoSuchAlgorithmException using throws keyword.
- Inside the main method, created an object of Scanner class named sc that takes user input.
- Then created a String variable named word that stores String user input.
- Then created an object of MessageDigest named md that stores the instance of MessageDigest class using getInstance() method.
- MD5 is passed as argument of the getInstance() method.
- update() method is used that updates the digest using the specified array of bytes, starting at the specified offset.

- Parameters:

1. the array of bytes.

2. the offset to start from in the array of bytes.

3. the number of bytes to use, starting at offset.

- Array of bytes parameter is given by using the getBytes() method of word String.
- Offset is set to 0.
- The number of bytes to use is given by the length of word String using length() method.
- Then printing object of BigInteger.
- The BigInteger constructor takes two parameters.
- Sign of number and  magnitude of the number.
- The signum is initialised to 1 i.e. positive.
- Magnitude is initialised to md.digest() output.
- The digest() method completes the hash computation by performing final operations such as padding. The digest is reset after this call is made.
- It returns the array of bytes for the resulting hash value.
- The object of BigInteger is typecasted to String type usign the toString() method that returns String representation of this BigInteger in the given radix.
- Hence providing the output.