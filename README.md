#Homework 03

This assignment involves calculating entropy of passwords.

You will clone this repository from github.  Instructions for doing that will be in canvas as well as being discussed in class.

The github repo already contains a partially written program and partially written texts.  You will need to get all parts of the program functioning and write unit tests for all methods that return a value.

##Password Entropy

Entropy is a measure of how hard it would be to guess a password.  There are several ways of calculating entropy.  The different methods tend to give slightly different numbers, but Entropy is really just an estimate.  The formula we will use is probably not the best formula, but it is straightforward and serves our purposes.

###E = log2(R<sup>(L-1)</sup>)

    where 
    E is an integer representing the maximum entropy. (Truncate the decimal part; don't round) 
    R is the range of the characters. 
        range is 26 if only lower case letters are used 
        range is 52 if upper and lower case letters are used 
        range is 62 if upper, lower, and digits are used. 
        range is 67 if upper, lower, digits, and 5 special characters are used. 
        range is 72 if upper, lower, digits, and 10 special characters are used.

####Range
To calculate range, set range to 0

* Add 26 if there is 1 or more upper case characters
* Add 26 if there is 1 or more lower case characters
* Add 10 if there is 1 or more digits (0 through 9)
* Add 1 for each special character in the set "`~!@#$%^&*()-_=+[{]}\|;:'",<.>/?</.>" If a character occurs more than once, it is only counted 1 time.

###Log<sub>2</sub>

Java does not have a built-in method for logs in base 2.  However, you may calculate a base 2 log by using the following formula.

    double result = Math.log(number) / Math.log(2));

You will need to do some unit tests on your log2(number) method.  Here are some useful values.  You may use a calculator to get some additional values to test.  You should have at least 20 values tested in the log2() test.

+ Log2(1)  is 0.000000
+ Log2(2)  is 1.000000
+ Log2(3)  is 1.584963
+ Log2(4)  is 2.000000
+ Log2(5)  is 2.321928
+ Log2(16) is ________ (You should be able to figure this out)
+ Log2(0)  is -Infinity
+ Log2(-1) is NaN (Not a number)
+ Log2(.5) is -1
+ Log2(.25)is -2
+ Log2(0.12345) is-3.01800125841
+ Log2(45.3) is 5.50143914516

##Running Tests

There are currently a couple of unit tests written for you.   However, the tests will fail.  When a test fails the error is usually in the code, but it can be in the test.  In this case I am telling you up front that the errors are in the tests.