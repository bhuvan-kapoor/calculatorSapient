# calculatorSapient
**Calculator.java**
- There is a class for calculator where the addition is happening.
- We are taking 2 strings to perform this activity so as to compensate for the million/billion of digits without space complexity.
- The code has a few bugs where negative integer, strings, and other data type errors and exceptions are not handled.

**CalculatorTest.java**
- An object of class calculator is created.
- DataProvider is created for positive, negative as well as exception handling.
- The exception-handling part is commented out for a better understanding that the code has bugs.
- Positive has cases where there is no 'e' representation like a calculator and the exact number is returned. Negative has an 'e' representation that fails.

**Commented part in CalculatorTest.java**
- This part is where the code would break to indicate the bugs.
- This is data type validation where exceptions should be handled.
- 

