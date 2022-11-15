<h1 align="center">Currency formatter</h1>

The Java Platform provides a number of classes that perform locale-sensitive operations. For example, the NumberFormat class formats numbers, currency, and percentages in a locale-sensitive manner. Classes such as NumberFormat have several convenience methods for creating a default object of that type. For example, the NumberFormat class provides these three convenience methods for creating a default NumberFormat object:

     NumberFormat.getInstance()
     NumberFormat.getCurrencyInstance()
     NumberFormat.getPercentInstance()

Each of these methods has two variants; one with an explicit locale and one without; the latter uses the default FORMAT locale:
NumberFormat.getInstance(myLocale)
NumberFormat.getCurrencyInstance(myLocale)
NumberFormat.getPercentInstance(myLocale)

A Locale is the mechanism for identifying the kind of object (NumberFormat) that you would like to get. The locale is just a mechanism for identifying objects, not a container for the objects themselves.

- First we take user input and store that value in a double variable named 'payment'.
- Then we create an object of 'NumberFormat' class.
- We create 4 objects as we want 4 types of currencies.
- We create the object n1 for US currency and use the getCurrencyInstance() method of the NumberFormat class.
- This method takes a parameter Locale as object.
- Then the Locale object can call the country name.
- In the next step we create a string named 'us' which is initialised to object of NumberFormat class which then calls format function.
- The format function takes a parameter, here we give payment as the argument.
- Note that we have to make new Locale for indian currency.
- We create new Locale and give two parameters in it i.e. "en" for English, "IN" for India.
- And we repeat steps 4 - 8 for other currencies.
- Finally, we print the string defined above containing the different currencies.
- Hence, giving us the output.
