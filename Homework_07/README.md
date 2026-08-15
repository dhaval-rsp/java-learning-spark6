# Part A: Short Answer Questions

1. **What is an `exception` ?**

   > An exception is an abnormal event that disrupts the normal flow of program execution.  
   > Example: Division by zero (`ArithmeticException`).
   >
   > ```java
   > int a = 10, b = 0;
   > System.out.println(a / b); // ArithmeticException
   > ```

2. **Does exception occur at `compile time` or `runtime` ?**

   > Exceptions occur at **runtime**.  
   > Compile-time errors are detected by the compiler before execution.

3. **What is the `difference` between `compile-time` error and `runtime` exception?**

   > Compile-time error: Detected by compiler (e.g., syntax error).  
   > Runtime exception: Occurs during program execution (e.g., `NullPointerException`).
   > Example:
   >
   > ```java
   > int x; System.out.println(x); // Compile-time error: variable not initialized
   > String s = null; System.out.println(s.length()); // Runtime exception
   > ```

4. **What is the `difference` between `Error` and `Exception` ?**

   > Error: Serious problems (e.g., `OutOfMemoryError`) that cannot be recovered.  
   > Exception: Conditions that can be caught and handled.

5. **Why do we need `exception handling` ?**

   > To prevent program crashes, provide meaningful error messages, and allow recovery from unexpected conditions.

6. **What is the `use of try` block?**

   > Contains code that may throw exceptions.
   > Example:
   >
   > ```java
   > try {
   >     int a = 10 / 0;
   > } catch (ArithmeticException e) {
   >     System.out.println("Cannot divide by zero");
   > }
   > ```

7. **What is the `use of catch` block?**

   > Handles exceptions thrown in the try block.

8. **Can `try` be written `without catch` ?**

   > Yes, but only if followed by a `finally` block.
   > Example:
   >
   > ```java
   > try {
   >     System.out.println("Inside try");
   > } finally {
   >     System.out.println("Cleanup code");
   > }
   > ```

9. **Can one try block have `multiple catch` blocks?**

   > Yes, to handle different types of exceptions separately.
   > Example:
   >
   > ```java
   > try {
   >     String s = null;
   >     System.out.println(s.length());
   > } catch (NullPointerException e) {
   >     System.out.println("Null value");
   > } catch (Exception e) {
   >     System.out.println("General exception");
   > }
   > ```

10. **How many catch blocks execute for one exception?**

    > Only one matching catch block executes.

11. **Why should child exception catch block come before parent exception catch block?**

    > Because parent (`Exception`) would otherwise catch everything first, making child blocks unreachable.

12. **What is the use of `finally` block?**

    > Executes cleanup code (like closing files or releasing resources).

13. **Does finally run when exception does not occur?**

    > Yes, it always runs.

14. **Does finally mean exception is handled?**

    > No, it just ensures cleanup; handling depends on catch.

15. **What is a `checked exception`?**

    > Verified at compile time; must be handled or declared.  
    > Example: `IOException`.

16. **What is an `unchecked exception` ?**

    > Occurs at runtime; not checked by compiler.  
    > Example: `NullPointerException`.

17. **Give three `examples` of `checked` exceptions.**

    > `IOException`, `SQLException`, `ClassNotFoundException`.

18. **Give five `examples` of `unchecked` exceptions.**

    > `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`, `IllegalArgumentException`, `NumberFormatException`.

19. **What is the `use of throw` keyword?**

    > Used to explicitly throw an exception object.  
    > Example: `throw new IOException("File not found");`
    > Example:
    >
    > ```java
    > throw new IllegalArgumentException("Invalid input");
    > ```

20. **What is the `use of throws` keyword?**

    > Declares exceptions a method may throw.  
    > Example: `void readFile() throws IOException`.
    > Example:
    >
    > ```java
    > void readFile() throws IOException { ... }
    > ```

21. **What is the difference between `throw` and `throws` ?**

    > `throw`: Used inside method to throw exception.  
    > `throws`: Declares exceptions in method signature.

22. **What is a `custom exception` ?**

    > User-defined exception class extending `Exception` or `RuntimeException`.
    >
    > ```java
    > class InvalidAgeException extends Exception {
    >     InvalidAgeException(String msg) { super(msg); }
    > }
    > ```

23. **Why do we create `custom exceptions` ?**

    > To represent domain-specific errors with meaningful context.  
    > Example: `class InvalidAgeException extends Exception { }`

24. **What does `getMessage()` return?**

    > Returns description of the exception.

25. **What does `printStackTrace()` print?**

    > Prints exception type, message, and stack trace.

26. **What is `exception propagation` ?**

    > If not caught, exception moves up the call stack until handled or program terminates.

27. **What happens when finally has a return statement?**

    > It overrides return values from try/catch, which can cause confusion.
    > Example:
    >
    > ```java
    > try { return 1; } finally { return 2; } // returns 2
    > ```

28. **Why should we avoid `return inside finally` ?**

    > It can mask exceptions or alter intended return values.

29. **Why should we not `silently catch` exceptions?**

    > Because it hides problems, making debugging difficult. Always log or handle properly.
    > Example:
    >
    > ```java
    > catch(Exception e) { } // BAD practice
    > ```

30. **In backend applications, why should we show `user-friendly` error messages?**
    > To avoid exposing internal details, improve user experience, and maintain security.
    > Example: Show `"Something went wrong, please try again"` instead of stack trace.

# Part B: Find The Output

## `Question 1`

```java
public class Main {
	public static void main(String[] args) {

		try {
			int result = 10 / 0;
			System.out.println(result);
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}

		System.out.println("Program completed");
	}
}
```

```
// Answere

Cannot divide by zero
Program completed
```

## `Question 2`

```java
public class Main {
	public static void main(String[] args) {

		try {
			System.out.println("Line 1");
			System.out.println(10 / 0);
			System.out.println("Line 2");
		}
		catch (ArithmeticException e) {
			System.out.println("Exception handled");
		}

		System.out.println("Line 3");
	}
}
```

```
// Answere

Line 1
Exception handled
Line 3
```

## `Question 3`

```java
public class Main {
	public static void main(String[] args) {

		try {
			int[] numbers = {10, 20, 30};
			System.out.println(numbers[5]);
			System.out.println(10 / 0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		catch (ArithmeticException e) {
			System.out.println("Invalid division");
		}
	}
}
```

```
// Answere
Invalid index
```

## `Question 4`

```java
public class Main {
	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println(name.length());
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
```

```
// Answere

Something went wrong
Finally block
```

## `Question 5`

```java
public class Main {
	public static void main(String[] args) {
		try {
			String value = "abc";
			int number = Integer.parseInt(value);
			System.out.println(number);
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid number format");
		}
	}
}
```

```
// Answere

Invalid number format
```

## `Question 6`

```java
public class Main {
	static int test() {

		try {
			System.out.println("Inside try");
			return 10;
		}
		catch (Exception e) {
			System.out.println("Inside catch");
			return 20;
		}
		finally {
			System.out.println("Inside finally");
		}
	}

	public static void main(String[] args) {
		int result = test();
		System.out.println("Result: " + result);
	}
}
```

```
// Answere

Inside try
Inside finally
Result: 10
```

## `Question 7`

```java
public class Main {
	static int test() {

		try {
			System.out.println("Inside try");
			int result = 10 / 0;
			return 10;
		}

		catch (Exception e) {
			System.out.println("Inside catch");
			return 20;
		}

		finally {
			System.out.println("Inside finally");
		}
	}

	public static void main(String[] args) {
		int result = test();
		System.out.println("Result: " + result);
	}
}
```

```
// Answere

Inside try
Inside catch
Inside finally
Result: 20
```

## `Question 8`

```java
public class Main {
	static int test() {

		try {
			return 10;
		}

		catch (Exception e) {
			return 20;
		}

		finally {
			return 30;
		}
	}

	public static void main(String[] args) {
		System.out.println(test());
	}
}
```

```
// Answere
30
```

## `Question 9`

```java
class Calculator {

	void divide() {
		int result = 10 / 0;
		System.out.println(result);
	}
}

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		try {
			calculator.divide();
		}

		catch (ArithmeticException e) {
			System.out.println("Handled in main");
		}
	}
}
```

```
// Answere
Handled in main
```

## `Question 10`

```java
public class Main {
	public static void main(String[] args) {

		try {
			System.out.println("Try started");
		}

		finally {
			System.out.println("Finally executed");
		}
	}
}
```

```
// Answere
Try started
Finally executed
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
// Answer

// 1. Exception name: ArithmeticException
// 2. Checked or unchecked: Unchecked
// 3. Reason: Division by zero is not allowed.
// 4. Correct handling:

try {
    int result = 100 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}
```

## `Question 2`

```java
int[] marks = {80, 90, 70};
System.out.println(marks[10]);
```

```java
// Answer

// 1. Exception name: ArrayIndexOutOfBoundsException
// 2. Checked or unchecked: Unchecked
// 3. Reason: Accessing index beyond array length.
// 4. Correct handling:

try {
    System.out.println(marks[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid index! Array length is " + marks.length);
}
```

## `Question 3`

```java
String name = null;
System.out.println(name.length());
```

```java
// Answer

// 1. Exception name: NullPointerException
// 2. Checked or unchecked: Unchecked
// 3. Reason: Calling method on a null reference.
// 4. Correct handling:

try {
    System.out.println(name.length());
} catch (NullPointerException e) {
    System.out.println("Name is null, cannot call methods on it.");
}
```

## `Question 4`

```java
String value = "ten";
int number = Integer.parseInt(value);
```

```java
// Answer

// 1. Exception name: NumberFormatException
// 2. Checked or unchecked: Unchecked
// 3. Reason: String "ten" cannot be parsed into an integer.
// 4. Correct handling:

try {
    int number = Integer.parseInt(value);
} catch (NumberFormatException e) {
    System.out.println("Invalid number format: " + value);
}
```

## `Question 5`

```java
String city = "Delhi";
System.out.println(city.charAt(20));
```

```java
// Answer

// 1. Exception name: StringIndexOutOfBoundsException
// 2. Checked or unchecked: Unchecked
// 3. Reason: Index 20 is outside the valid range of the string.
// 4. Correct handling:

try {
    System.out.println(city.charAt(20));
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Invalid index! Valid range is 0 to " + (city.length() - 1));
}
```

## `Question 6`

```java
int[] numbers = new int[-5];
```

```java
// Answer

// 1. Exception name: NegativeArraySizeException
// 2. Checked or unchecked: Unchecked
// 3. Reason: Array size cannot be negative.
// 4. Correct handling:

try {
    int[] numbers = new int[-5];
} catch (NegativeArraySizeException e) {
    System.out.println("Array size cannot be negative.");
}
```

## `Question 7`

```java
Object value = "Java";
Integer number = (Integer) value;
```

```java
// Answer

// 1. Exception name: ClassCastException
// 2. Checked or unchecked: Unchecked
// 3. Reason: String cannot be cast to Integer.
// 4. Correct handling:

try {
    Object value = "Java";
    Integer number = (Integer) value;
} catch (ClassCastException e) {
    System.out.println("Invalid type casting.");
}
```

## `Question 8`

```java
FileReader reader = new FileReader("student.txt");
```

```java
// Answer

// 1. Exception name: FileNotFoundException
// 2. Checked or unchecked: Checked
// 3. Reason: File "student.txt" not found in the directory.
// 4. Correct handling:

try {
    FileReader reader = new FileReader("student.txt");
} catch (FileNotFoundException e) {
    System.out.println("File not found. Please check the path.");
}

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
// Answer

// 1. What is wrong? → Missing catch or finally block.
// 2. Why is try alone not allowed here? → Because try must be followed by catch or finally.
// 3. Correct the code:

public class Main {
    public static void main(String[] args) {
        try {
			int result = 10 / 0;
        }
		catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed.");
        }
    }
}
```

## `Question 2`

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("General exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        }
    }
}
```

```java
// Answer

// 1. What is the error? → Catch block order is wrong.
// 2. Why is the second catch unreachable? → Because Exception is parent of ArithmeticException.
// 3. Correct the catch order:

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}
```

## `Question 3`

```java
import java.io.FileReader;
public class Main {
	public static void main(String[] args) {
		FileReader reader = new FileReader("data.txt");
	}
}
```

```java
// Answer

// 1. What is the exception? → FileNotFoundException
// 2. Is it checked or unchecked? → Checked
// 3. Correct using try-catch:

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
        }
		catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

```

## `Question 4`

```java
public class Main {
	public static void main(String[] args) {
		try {
			int result = 10 / 0;
		}
		catch (Exception e) {
		}
	}
}
```

```java
Write:
// Answere

// 1. Why is this bad practice? → Catch block is empty.
// 2. What problem can happen in real project? → Exception swallowed silently, debugging becomes hard.
// 3. Rewrite with meaningful message:

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

```

## `Question 5`

```java
class VoterService {
	void checkAge(int age) {
		if (age < 18) {
			new IllegalArgumentException("Age must be 18 or above");
		}
	}
}
```

```java
// Answer

// 1. What is missing? → throw keyword.
// 2. Why will exception not be thrown? → Because object is created but not thrown.
// 3. Correct using throw:

class VoterService {
    void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }
}

```

## `Question 6`

```java
class FileService {
	void readFile() {
		FileReader reader = new FileReader("data.txt");
	}
}
```

```java
// Answer

// 1. What import is needed? → import java.io.FileReader;
// 2. What exception must be handled or declared? → FileNotFoundException
// 3. Correct using throws:

import java.io.FileReader;
import java.io.FileNotFoundException;

class FileService {
    void readFile() throws FileNotFoundException {
        FileReader reader = new FileReader("data.txt");
    }
}

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

[P1_DivisionCalculator.java](./src/P1_DivisionCalculator.java)

## `Program 2: Array Index Handler`

```
Create an integer array of 5 values.
Try to print an index entered by user.

Requirements:
	Handle ArrayIndexOutOfBoundsException .
	Handle InputMismatchException .
	Close Scanner in finally .
```

[P2_ArrayIndexHandler.java](./src/P2_ArrayIndexHandler.java)

## `Program 3: String To Number Converter`

```
Create a program that converts a String to int.
Test with:
	"123"
	"abc"
	"10a"

Handle NumberFormatException .
```

[P3_StringToNumberConverter.java](./src/P3_StringToNumberConverter.java)

## `Program 4: Null Name Checker`

```
Create a method:
	void printNameLength(String name)

If name is null, handle NullPointerException .
Then improve the same program without exception by checking:
	if (name != null)

Write which approach is better and why.
```

[P4_NullNameChecker.java](./src/P4_NullNameChecker.java)

## `Program 5: File Reader`

```
Create a program to open file:
	student.txt

Requirements:
	Use FileReader .
	Handle FileNotFoundException .
	Print meaningful message if file does not exist.
```

[P5_FileReader.java](./src/P5_FileReader.java)

## `Program 6: File Reader With Finally`

```
Create a program using FileReader .

Requirements:
	Declare FileReader reader = null .
	Open file inside try.
	Close file inside finally.
	Handle IOException while closing.
```

[P6_FileReaderWithFinally.java](./src/P6_FileReaderWithFinally.java)

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

[P7_AgeValidationUsingthrow.java](./src/P7_AgeValidationUsingthrow.java)

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

[P8_MethodWiththrows.java](./src/P8_MethodWiththrows.java)

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

[P9_CustomUncheckedException.java](./src/P9_CustomUncheckedException.java)

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

[P10_CustomCheckedException.java](./src/P10_CustomCheckedException.java)

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

[P11_LoginValidation.java](./src/P11_LoginValidation.java)

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

[P12_BackendStyleProductAPISimulation.java](./src/P12_BackendStyleProductAPISimulation.java)

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

# Part G: Concept Mapping

| \*  | Situation                                           | Concept Used          |
| --- | --------------------------------------------------- | --------------------- |
| 1   | Risky code is written here                          | try                   |
| 2   | Exception handling code is written here             | catch                 |
| 3   | Cleanup code is written here                        | finally               |
| 4   | Manually throwing exception                         | throw                 |
| 5   | Declaring exception in method signature             | throws                |
| 6   | Compiler forces handling                            | Checked Exception     |
| 7   | Compiler does not force handling                    | Unchecked Exception   |
| 8   | Wrong array index                                   | ArrayIndexOutOfBound  |
| 9   | Divide by zero                                      | ArithmeticException   |
| 10  | Invalid String to number conversion                 | NumberFormatException |
| 11  | Null reference method call                          | NullPointerException  |
| 12  | Application-specific exception                      | Custome Exception     |
| 13  | Exception moves from called method to caller method | Exception Propogation |
| 14  | Full exception details with line number             | printStackTrace       |

# Part H: Difference Questions

| \*  | `Error`                                | `Exception`                                            |
| --- | -------------------------------------- | ------------------------------------------------------ |
| 1   | Serious issues like `OutOfMemoryError` | Recoverable issues like `IOException`                  |
| 2   | Cannot be handled easily               | Can be caught and handled using try-catch              |
| 3   | Occurs due to system failure           | Occurs due to application logic or external conditions |

---

| \*  | `Compile-time error`                            | `Runtime exception`                                    |
| --- | ----------------------------------------------- | ------------------------------------------------------ |
| 1   | Detected by compiler before execution           | Occurs during program execution                        |
| 2   | Example: Missing semicolon, undeclared variable | Example: `NullPointerException`, `ArithmeticException` |
| 3   | Must be fixed before running program            | Can be handled using exception handling                |

---

| \*  | `Checked exception`                        | `Unchecked exception`                                             |
| --- | ------------------------------------------ | ----------------------------------------------------------------- |
| 1   | Checked at compile time                    | Checked at runtime only                                           |
| 2   | Must be handled or declared using `throws` | No need to declare or handle explicitly                           |
| 3   | Example: `IOException`, `SQLException`     | Example: `NullPointerException`, `ArrayIndexOutOfBoundsException` |

---

| \*  | `try`                                       | `catch`                                      |
| --- | ------------------------------------------- | -------------------------------------------- |
| 1   | Block that contains risky code              | Block that handles exceptions                |
| 2   | Cannot exist alone (needs catch or finally) | Must follow try block                        |
| 3   | Example: `try { int x=10/0; }`              | Example: `catch(ArithmeticException e){...}` |

---

| \*  | `throw`                                    | `throws`                                       |
| --- | ------------------------------------------ | ---------------------------------------------- |
| 1   | Used to actually throw an exception object | Used in method signature to declare exceptions |
| 2   | Example: `throw new IOException("Error");` | Example: `void read() throws IOException`      |
| 3   | Appears inside method body                 | Appears in method declaration                  |

---

| \*  | `final`                                                      | `finally`                                             | `finalize`                                                   |
| --- | ------------------------------------------------------------ | ----------------------------------------------------- | ------------------------------------------------------------ |
| 1   | Keyword to declare constants, prevent inheritance/overriding | Block that always executes after try-catch            | Method called by Garbage Collector before object destruction |
| 2   | Example: `final int MAX=100;`                                | Example: `finally { System.out.println("Cleanup"); }` | Example: `protected void finalize() { ... }`                 |
| 3   | Used with variables, methods, classes                        | Used with exception handling                          | Rarely used, deprecated in modern Java                       |

---

| \*  | `getMessage()`                          | `printStackTrace()`                                          |
| --- | --------------------------------------- | ------------------------------------------------------------ |
| 1   | Returns short description of exception  | Prints full details including type, message, and stack trace |
| 2   | Example: `e.getMessage()` → "/ by zero" | Example: `e.printStackTrace()` → shows line number trace     |

---

| \*  | `Specific catch`                    | `Generic catch`                        |
| --- | ----------------------------------- | -------------------------------------- |
| 1   | Catches a particular exception type | Catches all exceptions (parent class)  |
| 2   | Example: `catch(IOException e)`     | Example: `catch(Exception e)`          |
| 3   | More precise and recommended        | Less precise, may hide specific issues |

---

| \*  | `Custom checked exception`                             | `Custom unchecked exception`                                    |
| --- | ------------------------------------------------------ | --------------------------------------------------------------- |
| 1   | Extends `Exception` class                              | Extends `RuntimeException` class                                |
| 2   | Compiler forces handling                               | Compiler does not force handling                                |
| 3   | Example: `class InvalidAgeException extends Exception` | Example: `class InvalidInputException extends RuntimeException` |

---

| \*  | `Exception handling`                            | `Input validation`                                   |
| --- | ----------------------------------------------- | ---------------------------------------------------- |
| 1   | Deals with problems after they occur (reactive) | Prevents problems before they occur (proactive)      |
| 2   | Example: Catching `NumberFormatException`       | Example: Checking if input is numeric before parsing |
| 3   | Ensures program continues running               | Ensures errors don’t occur in the first place        |

# Part I: Real-World Thinking Questions

1. **In an online payment system, what exceptions can occur?**
   - `NetworkException`: Payment gateway unreachable.
   - `TimeoutException`: Slow response from bank server.
   - `InvalidCardException`: Wrong card number or expired card.
   - `InsufficientFundsException`: Not enough balance.
   - `SecurityException`: Fraud detection, invalid CVV, OTP failure.

---

2. **In a login API, why should we not show technical exception details to user?**
   - Technical details (like stack traces, SQL errors) expose sensitive system information.
   - Hackers may exploit these details to attack the system.
   - Users only need a friendly message like `"Invalid username or password"`.

---

3. **In a banking app, where can we use custom exception?**
   - For business rules enforcement.
   - Examples:
     - `InsufficientBalanceException`
     - `DailyLimitExceededException`
     - `AccountLockedException`
   - These make code more readable and clearly communicate domain-specific problems.

---

4. **In a file upload feature, which checked exceptions may occur?**
   - `IOException`: File system issues.
   - `FileNotFoundException`: File path invalid.
   - `SQLException`: If metadata stored in database.
   - `InterruptedException`: Thread interrupted during upload.

---

5. **In a backend service, why should we log exception details?**
   - Logs provide diagnostic information for developers.
   - Helps in root cause analysis when issues occur in production.
   - Ensures accountability and supports monitoring tools (like ELK, Splunk).

---

6. **Why is catching exception silently dangerous?**
   - Silent catch blocks hide errors.
   - Bugs remain undetected, leading to data corruption, security risks, and poor user experience.
   - Always log or handle exceptions meaningfully.

---

7. **Why should business exceptions have meaningful names?**
   - Names like `UnderAgeException` or `LimitExceededException` make code self-documenting.
   - Easier for developers to understand business rules.
   - Improves maintainability and debugging.

---

8. **Why is finally useful for closing resources?**
   - `finally` ensures cleanup code always runs, even if an exception occurs.
   - Useful for closing files, database connections, sockets, or releasing locks.
   - Prevents resource leaks that can crash or slow down applications.
   - Example:
     ```java
     try {
         FileReader fr = new FileReader("data.txt");
     } catch (IOException e) {
         System.out.println("File error");
     } finally {
         fr.close(); // ensures resource is closed
     }
     ```
