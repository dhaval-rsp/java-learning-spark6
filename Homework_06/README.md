# Part A: Short Answer Questions

1. **What is a local variable?**
	>a\
	>a\
	
2. **Where is a local variable declared?**
	>a\
	>a\
	
3. **Does a local variable get a default value?**
	>a\
	>a\
	
4. **What is an instance variable?**
	>a\
	>a\
	
5. **Why is an instance variable called object-level variable?**
	>a\
	>a\
	
6. **What is a static variable?**
	>a\
	>a\
	
7. **Why is a static variable called class-level variable?**
	>a\
	>a\
	
8. **What is the difference between instance variable and static variable?**
	>a\
	>a\
	
9. **How should we access a static variable?**
	>a\
	>a\
	
10. **What is a static method?**
	>a\
	>a\
	
11. **Can a static method directly access an instance variable? Why?**
	>a\
	>a\
	
12. **Can a static method directly access a static variable?**
	>a\
	>a\
	
13. **Why is the main method static in Java?**
	>a\
	>a\
	
14. **What is a static block?**
	>a\
	>a\
	
15. **How many times does a static block execute?**
	>a\
	>a\
	
16. **What is the difference between static block and constructor?**
	>a\
	>a\
	
17. **What is an access modifier?**
	>a\
	>a\
	
18. **Name all four access levels in Java.**
	>a\
	>a\
	
19. **Is default an access modifier keyword?**
	>a\
	>a\
	
20. **What is the use of private ?**
	>a\
	>a\
	
21. **What is the use of protected ?**
	>a\
	>a\
	
22. **What is a non-access modifier?**
	>a\
	>a\
	
23. **What is the use of final variable?**
	>a\
	>a\
	
24. **What is the use of final method?**
	>a\
	>a\
	
25. **What is the use of final class?**
	>a\
	>a\
	
26. **What is an abstract class?**
	>a\
	>a\
	
27. **Can we create object of abstract class directly?**
	>a\
	>a\
	
28. **What is an abstract method?**
	>a\
	>a\
	
29. **Can an abstract class have constructor?**
	>a\
	>a\
	
30. **What is an interface?**
	>a\
	>a\
	
31. **Why do we use interface?**
	>a\
	>a\
	
32. **Which keyword is used to implement an interface?**
	>a\
	>a\
	
33. **Can one class implement multiple interfaces?**
	>a\
	>a\
	
34. **What is the difference between abstract class and interface?**
	>a\
	>a\
	
35. **When should we use abstract class and when should we use interface?**
	>a\
	>a\



# Part B: Find The Output

## `Question 1`

```java
class Student {
	String name;
	int age;
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		
		System.out.println(student.name);
		System.out.println(student.age);
	}
}
```

```java
// Answere
```

## `Question 2`

```java
class Counter {
	int instanceCount = 0;
	static int staticCount = 0;
	
	Counter() {
		instanceCount++;
		staticCount++;
		
		System.out.println(instanceCount + " " + staticCount);
	}
}

public class Main {
	public static void main(String[] args) {
		new Counter();
		new Counter();
		new Counter();
	}
}
```

```java
// Answere
```

## `Question 3`

```java
class Student {
	String name;
	static String instituteName = "Genie Academy";
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Rahul";
		s2.name = "Priya";
		
		Student.instituteName = "Genie Ashwani";
		
		System.out.println(s1.name + " " + s1.instituteName);
		System.out.println(s2.name + " " + s2.instituteName);
	}
}
```

```java
// Answere
```

## `Question 4`

```java
class Demo {
	static {
		System.out.println("Static block");
	}

	Demo() {
		System.out.println("Constructor");
	}
}

public class Main {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
	}
}
```

```java
// Answere
```

## `Question 5`

```java
class Calculator {
	static int add(int a, int b) {
		return a + b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println(Calculator.add(10, 20));
		System.out.println(Calculator.multiply(5, 4));
	}
}
```

```java
// Answere
```

## `Question 6`

```java
abstract class User {
	User() {
		System.out.println("User constructor");
	}
}

class Student extends User {
	Student() {
		System.out.println("Student constructor");
	}
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
	}
}

```

```java
// Answere
```

## `Question 7`

```java
abstract class Payment {
	abstract void pay();
	
	void printReceipt() {
		System.out.println("Receipt printed");
	}
}

class UpiPayment extends Payment {
	void pay() {
		System.out.println("Paid using UPI");
	}
}

public class Main {
	public static void main(String[] args) {
		Payment payment = new UpiPayment();
		
		payment.pay();
		payment.printReceipt();
	}
}

```

```java
// Answere
```

## `Question 8`

```java
interface Printable {
	void print();
}

interface Scannable {
	void scan();
}

class PrinterMachine implements Printable, Scannable {
	public void print() {
		System.out.println("Printing");
	}
	
	public void scan() {
		System.out.println("Scanning");
	}
}

public class Main {
	public static void main(String[] args) {
		PrinterMachine machine = new PrinterMachine();
		
		machine.print();
		machine.scan();
	}
}
```

```java
// Answere
```


# Part C: Find And Fix The Error

## `Question 1`

```java
public class Main {
	public static void main(String[] args) {
		int age;
		System.out.println(age);
	}
}
```

```java
// Write:
//	1. What is the error?
//	2. Why does it happen?
//	3. Correct the code.

// Answere
```

## `Question 2`

```java
class Student {
	String name = "Rahul";
	
	static void showName() {
		System.out.println(name);
	}
}
```

```java
// Write:
//	1. What is the error?
//	2. Why cannot static method directly access name ?
//	3. Correct the code by passing object reference.

// Answere
```

## `Question 3`

```java
class BankAccount {
	public double balance;
}

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.balance = -50000;
		System.out.println(account.balance);
	}
}
```

```java
// Write:
//	1. What is the design problem?
//	2. Which modifier can protect balance ?
//	3. Rewrite using private variable and public methods

// Answere
```

## `Question 4`

```java
final class Parent {
}

class Child extends Parent {
}

```

```java
// Write:
//	1. What is the error?
//	2. Why is inheritance not allowed here?

// Answere
```

## `Question 5`

```java
class Parent {
	final void show() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("Child");
	}
}

```

```java
// Write:
//	1. What is the error?
//	2. What does final method mean?

// Answere
```

## `Question 6`

```java
abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle {
}
```

```java
// Write:
//	1. What is the error?
//	2. Why must Car implement start() ?
//	3. Correct the code.

// Answere
```

## `Question 7`

```java
interface Payment {
	void pay();
}

class UpiPayment implements Payment {
	void pay() {
		System.out.println("Paid using UPI");
	}
}
```

```java
// Write:
//	1. What is the error?
//	2. Why should the implemented method be public ?
//	3. Correct the code

// Answere
```

## `Question 8`

```java
abstract class Shape {
}

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape();
	}
}
```

```java
// Write:
//	1. What is the error?
//	2. Can we create object of abstract class directly?
//	3. How can we use abstract class reference correctly?

// Answere
```



# Part D: Coding Practice

## `Program 1: Local And Instance Variable`

```
Create a Student class with:
	instance variable name
	instance variable marks
	method showResult()
	
Inside showResult() , create a local variable result .
If marks are greater than or equal to 40, store "Pass" in result , otherwise store "Fail" .

Print student name, marks, and result.
```

[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

## `Program 2: Static Institute Name`

```
Create a Student class with:
	instance variable rollNumber
	instance variable name
	static variable instituteName
	method showDetails()
	
Create 3 student objects and print details.
Change institute name using class name and print details again
```

## `Program 3: Object Counter`

```
Create a Student class with:
	static variable studentCount
	constructor that increases studentCount
	static method showTotalStudents()
```

## `Program 4: Utility Calculator`

```
Create a Calculator class with static methods:
	add(int a, int b)
	subtract(int a, int b)
	multiply(int a, int b)
	divide(int a, int b)
Call all methods using class name
```

## `Program 5: Static Block`

```
Create a class DatabaseConfig with:
	static variable databaseName
	static block that initializes databaseName
	static method showDatabaseName()
	
Call showDatabaseName() from main method.
```

## `Program 6: Encapsulation With Access Modifier`

```
Create a BankAccount class with:
	private variable accountNumber
	private variable balance
	constructor
	public method deposit(double amount)
	public method withdraw(double amount)
	public method getBalance()
	
Rules:
	Deposit only positive amount.
	Withdraw only if balance is enough.
	Balance should not be directly accessible outside the class.
```

## `Program 7: Final Variable`

```
Create a class Exam with:
	final variable MAX_MARKS = 100
	method showMaxMarks()
	
Try to change MAX_MARKS and write the error reason in comments.
```

## `Program 8: Abstract Class`

```
Create an abstract class Shape with:
	abstract method calculateArea()
	normal method showMessage()
	
Create child classes:
	Circle
	Rectangle
	
Implement calculateArea() in both child classes.
```


## `Program 9: Constructor In Abstract Class`

```
Create an abstract class User with:
	instance variable name
	constructor to initialize name
	normal method showName()
	
Create child class Student with:
	instance variable course
	constructor using super(name)
	method showStudentDetails()
	
Create object of Student and print details
```

## `Program 10: Interface`

```
Create an interface NotificationService with:
	void send(String message);

Create two classes:
	EmailService
	SmsService

Both classes should implement NotificationService .
In main method, create interface reference and call both implementations.
```

## `Program 11: Multiple Interfaces`

```
Create two interfaces:
	Printable
		- print()
	Scannable
		- scan()
		
Create class PrinterMachine that implements both interfaces.
Call both methods from main method.
```

## `Program 12: Payment System`

```
Create:

interface PaymentGateway
	- pay(double amount)

abstract class BasePayment
	- static appName
	- transactionId
	- constructor
	- printReceipt()

class UpiPayment extends BasePayment implements PaymentGateway
	- upiId
	- constructor
	- pay(double amount)

class CardPayment extends BasePayment implements PaymentGateway
	- cardNumber
	- constructor
	- pay(double amount)
	
In main method:
	1. Create one UPI payment object.
	2. Create one card payment object.
	3. Use PaymentGateway reference.
	4. Call pay() method.

```



# Part E: Concept Mapping

| \*  | Situation                                  | Concept Used |
| --- | -------------------------------------------| ------------ |
| 1   | Variable declared inside method            |              |
| 2   | Variable belongs to every object separately|              |
| 3   | Common variable shared by all objects      |              |
| 4   | Method called using class name             |              |
| 5   | Block runs once when class loads           |              |
| 6   | JVM calls main without object              |              |
| 7   | Data accessible only inside same class     |              |
| 8   | Value cannot be changed                    |              |
| 9   | Method cannot be overridden                |              |
| 10  | Class cannot be inherited                  |              |
| 11  | Class contains incomplete method           |              |
| 12  | Method without body                        |              |
| 13  | Contract followed by class                 |              |
| 14  | One class implements two capabilities      |              |


# Part F: Difference Questions

| \*  | Local variable | Instance variable |
| --- | -------------- | ----------------- |
| 1   | hi      | hi     |
| 2   | hello   | hello  |

| \*  | Instance variable | Static variable |
| --- | ------ | -------- |
| 1   | hi     | hi       |
| 2   | hello  | hello    |

| \*  | Static method | Instance method |
| --- | ------- | ----- |
| 1   | hi      | hi    |
| 2   | hello   | hello |

| \*  | Static block | Constructor |
| --- | ------- | ------ |
| 1   | hi      | hi     |
| 2   | hello   | hello  |

| \*  | private | public |
| --- | ----------- | ------------- |
| 1   | hi          | hi            |
| 2   | hello       | hello         |

| \*  | Access modifier | Non-access modifier |
| --- | ------------------- | ------------------ |
| 1   | hi                  | hi                 |
| 2   | hello               | hello              |

| \*  |  Final variable | Final method | Final class |
| --- | ------------ | ------------- | ------------- |
| 1   | hi           | hi            | |
| 2   | hello        | hello         | |

| \*  | Abstract class | Concrete class |
| --- | ------ | --------- |
| 1   | hi     | hi        |
| 2   | hello  | hello     |

| \*  | Abstract method | Normal method |
| --- | --------- | -------- |
| 1   | hi        | hi       |
| 2   | hello     | hello    |

| \*  | Abstract class | Interface |
| --- | -------- | -------- |
| 1   | hi       | hi       |
| 2   | hello    | hello    |

| \*  | extends | implements |
| --- | --------------- | -------------------- |
| 1   | hi              | hi                   |
| 2   | hello           | hello                |

| \*  | Interface inheritance | Class inheritance |
| --- | --------------- | ---------------- |
| 1   | hi              | hi               |
| 2   | hello           | hello            |


# Part G: Real-World Thinking Questions

1. **In a school application, which data should be instance variable and which data can be static?**
2. **Why should bank account balance be private?**
3. **Why can a calculator utility method be static?**
4. **Why should some rules be made final?**
5. **Why can Payment be an interface?**
6. **Why can BasePayment be an abstract class?**
7. **Why does Java allow multiple interfaces but not multiple classes?**
8. **In backend projects, why do we usually code using interface reference?**