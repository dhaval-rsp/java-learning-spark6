# Part A: Short Answer Questions

1. **What is an exception?**
2. **Does exception occur at compile time or runtime?**
3. **What is the difference between compile-time error and runtime exception?**
4. **What is the difference between Error and Exception?**
5. **Why do we need exception handling?**
6. **What is the use of try block?**
7. **What is the use of catch block?**
8. **Can try be written without catch ?**
9. **Can one try block have multiple catch blocks?**
10. **How many catch blocks execute for one exception?**
11. **Why should child exception catch block come before parent exception catch block?**
12. **What is the use of finally block?**
13. **Does finally run when exception does not occur?**
14. **Does finally mean exception is handled?**
15. **What is a checked exception?**
16. **What is an unchecked exception?**
17. **Give three examples of checked exceptions.**
18. **Give five examples of unchecked exceptions.**
19. **What is the use of throw keyword?**
20. **What is the use of throws keyword?**
21. **What is the difference between throw and throws ?**
22. **What is a custom exception?**
23. **Why do we create custom exceptions?**
24. **What does getMessage() return?**
25. **What does printStackTrace() print?**
26. **What is exception propagation?**
27. **What happens when finally has a return statement?**
28. **Why should we avoid return inside finally ?**
29. **Why should we not silently catch exceptions?**
30. **In backend applications, why should we show user-friendly error messages?**


# Part B: Find The Output

## `Question 1`

```java

```

```java
// Answere

```

## `Question 2`

```java

```

```java
// Answere

```

## `Question 3`

```java

```

```java
// Answere

```

## `Question 4`

```java

```

```java
// Answere

```

## `Question 5`

```java

```

```java
// Answere

```

## `Question 6`

```java

```

```java
// Answere

```

## `Question 7`

```java

```

```java
// Answere

```

## `Question 8`

```java

```

```java
// Answere

```

## `Question 9`

```java

```

```java
// Answere

```

## `Question 10`

```java

```

```java
// Answere

```


# Part C: Identify The Exception

```
For each code, write:
	1. Exception name
	2. Checked or unchecked
	3. Reason
	4. Correct handling
```

## `Question 1`

```java
int result = 100 / 0;
```

```java
// Answere

```

## `Question 2`

```java
int[] marks = {80, 90, 70};
System.out.println(marks[10]);
```

```java
// Answere

```

## `Question 3`

```java
String name = null;
System.out.println(name.length());
```

```java
// Answere

```

## `Question 4`

```java
String value = "ten";
int number = Integer.parseInt(value);
```

```java
// Answere

```

## `Question 5`

```java
String city = "Delhi";
System.out.println(city.charAt(20));
```

```java
// Answere

```

## `Question 6`

```java
int[] numbers = new int[-5];
```

```java
// Answere

```

## `Question 7`

```java
Object value = "Java";
Integer number = (Integer) value;
```

```java
// Answere

```

## `Question 8`

```java
FileReader reader = new FileReader("student.txt");
```

```java
// Answere

```



# Part D: Find And Fix The Error


## `Question 1`

```java
public class Main {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
		}
	}
}
```

```java
Write:
	1. What is wrong?
	2. Why is try alone not allowed here?
	3. Correct the code.

// Answere

```

## `Question 2`

```java

```

```java
// Answere

```

## `Question 3`

```java

```

```java
// Answere

```

## `Question 4`

```java

```

```java
// Answere

```

## `Question 5`

```java

```

```java
// Answere

```

## `Question 6`

```java

```

```java
// Answere

```

## `Question 7`

```java

```

```java
// Answere

```

## `Question `

```java

```

```java
// Answere

```


# Part E: Coding Practice

## `Program 1: Division Calculator`

```
Create a program that divides two numbers.
Requirements:
	If second number is zero, handle ArithmeticException .
	Print meaningful message.
	Print "Program completed" at the end.
```

[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

## `Program 2: Array Index Handler`

```
Create an integer array of 5 values.
Try to print an index entered by user.

Requirements:
	Handle ArrayIndexOutOfBoundsException .
	Handle InputMismatchException .
	Close Scanner in finally .
```

## `Program 3: String To Number Converter`

```
Create a program that converts a String to int.
Test with:
	"123"
	"abc"
	"10a"
	
Handle NumberFormatException .
```

## `Program 4: Null Name Checker`

```
Create a method:
	void printNameLength(String name)

If name is null, handle NullPointerException .
Then improve the same program without exception by checking:
	if (name != null)

Write which approach is better and why.
```

## `Program 5: File Reader`

```
Create a program to open file:
	student.txt
	
Requirements:
	Use FileReader .
	Handle FileNotFoundException .
	Print meaningful message if file does not exist.
```

## `Program 6: File Reader With Finally`

```
Create a program using FileReader .

Requirements:
	Declare FileReader reader = null .
	Open file inside try.
	Close file inside finally.
	Handle IOException while closing.
```

## `Program 7: Age Validation Using throw`

```
Create class VoterService .
Method:
	void checkAge(int age)
	
Rules:
	If age is less than 18, throw IllegalArgumentException .
	Otherwise print "Allowed to vote" .
	Handle exception in main method.
```

## `Program 8: Method With throws`

```
Create class FileService.

Method:
	void readFile() throws FileNotFoundException

In main method:
	Create object of FileService .
	Call readFile() .
	Handle exception using try-catch.

```

## `Program 9: Custom Unchecked Exception`

```
Create custom exception:
	ProductNotFoundException extends RuntimeException

Create class ProductService with method:
	void findProduct(int productId)

Rules:
	If product id is not 101 , throw ProductNotFoundException .
	Otherwise print "Product found" .
	Handle exception in main method.
```


## `Program 10: Custom Checked Exception`

```
Create custom exception:
	InsufficientBalanceException extends Exception

Create class BankAccount with:
	balance
	constructor
	withdraw(double amount) throws InsufficientBalanceException

Rules:
	If amount is greater than balance, throw custom exception.
	Otherwise deduct balance and print remaining balance.
	Handle exception in main method.
```

## `Program 11: Login Validation`

```
Create custom unchecked exception:
	InvalidLoginException

Create class LoginService with:
	void login(String username, String password)

Rules:
	Correct username: "admin"
	Correct password: "java123"
	If username or password is wrong, throw InvalidLoginException .
	Handle exception in main method.
```

## `Program 12: Backend-Style Product API Simulation`

```
Create:
	ProductNotFoundException
	InvalidProductIdException
	ProductService
	Main

In ProductService , create method:
	void getProductById(int productId)

Rules:
	If productId is less than or equal to 0, throw InvalidProductIdException .
	If productId is not 101, throw ProductNotFoundException .
	If productId is 101, print product details.

In main method:
	Call service method inside try.
	Use multiple catch blocks.
	Print user-friendly messages.
```


# Part F: Return With Try-Catch-Finally

## `Program 1: Personal Details`

```
Create variables for:
   name
   age
   city
   course
Print all details.
```

[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

# Part G: Concept Mapping

| \*  | Situation                                           | Concept Used |
| --- | --------------------------------------------------- | ------------ |
| 1   | Risky code is written here                          |              |
| 2   | Exception handling code is written here             |              |
| 3   | Cleanup code is written here                        |              |
| 4   | Manually throwing exception                         |              |
| 5   | Declaring exception in method signature             |              |
| 6   | Compiler forces handling                            |              |
| 7   | Compiler does not force handling                    |              |
| 8   | Wrong array index                                   |              |
| 9   | Divide by zero                                      |              |
| 10  | Invalid String to number conversion                 |              |
| 11  | Null reference method call                          |              |
| 12  | Application-specific exception                      |              |
| 13  | Exception moves from called method to caller method |              |
| 14  | Full exception details with line number             |              |


# Part H: Difference Questions

| \*  | Error | Exception |
| --- | ------- | ------ |
| 1   | hi      | hi     |
| 2   | hello   | hello  |

| \*  | Compile-time error | Runtime exception |
| --- | ------ | -------- |
| 1   | hi     | hi       |
| 2   | hello  | hello    |

| \*  | Checked exception | Unchecked exception |
| --- | ------- | ----- |
| 1   | hi      | hi    |
| 2   | hello   | hello |

| \*  | try | catch |
| --- | ------- | ------ |
| 1   | hi      | hi     |
| 2   | hello   | hello  |

| \*  | throw | throws |
| --- | ----------- | ------------- |
| 1   | hi          | hi            |
| 2   | hello       | hello         |

| \*  | final | finally | finalize |
| --- | ------------------- | ------------------ |--|
| 1   | hi                  | hi                 | |
| 2   | hello               | hello              | |

| \*  | getMessage() | printStackTrace() |
| --- | ------------ | ------------- |
| 1   | hi           | hi            |
| 2   | hello        | hello         |

| \*  | Specific catch | generic catch |
| --- | ------ | --------- |
| 1   | hi     | hi        |
| 2   | hello  | hello     |

| \*  | Custom checked exception | custom unchecked exception |
| --- | --------- | -------- |
| 1   | hi        | hi       |
| 2   | hello     | hello    |

| \*  | Exception handling | input validation |
| --- | -------- | -------- |
| 1   | hi       | hi       |
| 2   | hello    | hello    |

# Part I: Real-World Thinking Questions

1. **In an online payment system, what exceptions can occur?**
2. **In a login API, why should we not show technical exception details to user?**
3. **In a banking app, where can we use custom exception?**
4. **In a file upload feature, which checked exceptions may occur?**
5. **In a backend service, why should we log exception details?**
6. **Why is catching exception silently dangerous?**
7. **Why should business exceptions have meaningful names?**
8. **Why is finally useful for closing resources?**