# Part A: Short Answer Questions

1. **What is a local variable?**

   > A local variable is declared inside a method, constructor, or block.  
   > It exists only during the execution of that method.  
   > Example:
   >
   > ```java
   > void show() {
   >     int x = 10; // local variable
   >     System.out.println(x);
   > }
   > ```

2. **Where is a local variable declared?**

   > Inside methods, constructors, or blocks.  
   > Example: inside a `for` loop or method body.

3. **Does a local variable get a default value?**

   > No, it must be explicitly initialized before use.  
   > Example:
   >
   > ```java
   > void show(){
   > int x; // not initialized
   > System.out.println(x); // ERROR
   > }
   > ```

4. **What is an instance variable?**

   > A variable declared inside a class but outside methods, constructors, or blocks.  
   > It belongs to the object.  
   > Example:
   >
   > ```java
   > class Student {
   >     String name; // instance variable
   > }
   > ```

5. **Why is an instance variable called object-level variable?**

   > Because each object of the class gets its own copy of the variable.

6. **What is a static variable?**

   > A variable declared with the `static` keyword.  
   > It belongs to the class, not to individual objects.

7. **Why is a static variable called class-level variable?**

   > Because only one copy exists for the entire class, shared by all objects.

8. **What is the difference between instance variable and static variable?**

   > Instance variable → belongs to object, each object has its own copy.  
   > Static variable → belongs to class, shared among all objects.

9. **How should we access a static variable?**

   > Using the class name.  
   > Example: `ClassName.variableName`

10. **What is a static method?**

    > A method declared with the `static` keyword.  
    > It belongs to the class and can be called without creating an object.

11. **Can a static method directly access an instance variable? Why?**

    > No, because instance variables belong to objects, and static methods belong to the class.

12. **Can a static method directly access a static variable?**

    > Yes, because both belong to the class.

13. **Why is the main method static in Java?**

    > Because it must run without creating an object of the class.

14. **What is a static block?**

    > A block of code inside a class declared with `static`.  
    > Used to initialize static variables.

15. **How many times does a static block execute?**

    > Only once, when the class is loaded into memory.

16. **What is the difference between static block and constructor?**

    > Static block → runs once when class loads, initializes static variables.  
    > Constructor → runs every time an object is created, initializes instance variables.

17. **What is an access modifier?**

    > A keyword that defines the visibility/scope of a class, method, or variable.

18. **Name all four access levels in Java.**

    > `public`, `protected`, `default`, `private`

19. **Is default an access modifier keyword?**

    > No, it is not a keyword. It means no modifier is specified.

20. **What is the use of private?**

    > Restricts access to within the same class.

21. **What is the use of protected?**

    > Allows access within the same package and subclasses.

22. **What is a non-access modifier?**

    > Modifiers that define behavior, not visibility.  
    > Examples: `static`, `final`, `abstract`, `synchronized`.

23. **What is the use of final variable?**

    > Its value cannot be changed once assigned.  
    > Example: `final int MAX = 100;`

24. **What is the use of final method?**

    > It cannot be overridden by subclasses.

25. **What is the use of final class?**

    > It cannot be inherited.  
    > Example: `final class Utility { }`

26. **What is an abstract class?**

    > A class declared with `abstract` keyword.  
    > It may contain abstract methods (without body).

27. **Can we create object of abstract class directly?**

    > No, but we can create objects of its subclasses.

28. **What is an abstract method?**

    > A method declared without implementation (no body).  
    > Example: `abstract void draw();`

29. **Can an abstract class have constructor?**

    > Yes, it can have a constructor to initialize common fields.

30. **What is an interface?**

    > A collection of abstract methods (and constants).  
    > Example:
    >
    > ```java
    > interface Animal {
    >     void sound();
    > }
    > ```

31. **Why do we use interface?**

    > To achieve abstraction and multiple inheritance in Java.

32. **Which keyword is used to implement an interface?**

    > `implements`

33. **Can one class implement multiple interfaces?**

    > Yes, a class can implement multiple interfaces.

34. **What is the difference between abstract class and interface?**

    > Abstract class → can have both abstract and concrete methods, supports single inheritance.  
    > Interface → only abstract methods (before Java 8), supports multiple inheritance.

35. **When should we use abstract class and when should we use interface?**
    > Use abstract class when classes share common state + behavior.  
    > Use interface when you want to define a contract that multiple classes can implement.

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

```
// Answere

null
because instance variable not given value, only object created hence will return default values
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

```
// Answere
1 1
1 2
1 3

new Counter() is creating new object in jvm so, the instance count everytime increasing from 0 --> 1,
but for the static count since variable is created one time only and shared by all object so that counter is increased whenever object is created first 0 --> 1, then 1 --> 2 then 2 --> 3
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

```
// Answere
Rahul Genie Ashwani
Priya Genie AShwani
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

```
// Answere
Static block --> static block executes atleast once
Constructor
Constructor
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

```
// Answere
30
20

no need of object here as the method is static
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

```
// Answere
User constructor
Student constructor

user const called because super() is invisible in child
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

```
// Answere
Paid using UPI
Receipt printed
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

```
// Answere
Printing
Scanning
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
//	1. Variable 'age' not have been initialized.
//  2. Local variables in Java do not get default values.They must be explicitly initialized before use.
// 3. Correct the code.

public class Main {
    public static void main(String[] args) {
        int age = 20; // initialized
        System.out.println(age);
    }
}

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
//	1. name is instance [non-static] variable and used by static method which is not allowed
//	2. Because 'name' is an instance variable, and static methods belong to the class. They cannot directly access object-level variables.
//	3. correct code

class Student {
	String name = "Rahul";

	static void showName(Student s) {
		System.out.println(s.name); // passing object reference
	}
}
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
//	1. 'balance' is public, so it can be set to invalid values (like negative). This breaks encapsulation.
//  2. Use 'private'.
//	3. new code

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Balance: " + account.getBalance());
    }
}
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
//	1. Cannot inherit from final class 'Parent'.
//	2. Because 'final' class cannot be extended.
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
//	1. Cannot override the final method 'show' from Parent.
//	2. A final method cannot be overridden in subclasses.
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
//	1. Class 'Car' must implement abstract method 'start()'.
//	2. Because Car is a concrete class, so it must provide implementation for all abstract methods.
//	3. Correct code

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}
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
//	1. 'pay()' in UpiPayment is not public; attempting to assign weaker access privileges.
//  2. Because all interface methods are implicitly public, so implementation must be public.

interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
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
//  1. Cannot instantiate abstract class 'Shape'.
//	2. No, abstract classes cannot be instantiated directly.

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(); // abstract reference, concrete object
        shape.draw();
    }
}
```

## Summary Table: Common Errors and Fixes

| **Error Type**                         | **Cause**                                                          | **Fix / Solution**                                                     |
| -------------------------------------- | ------------------------------------------------------------------ | ---------------------------------------------------------------------- |
| Uninitialized Local Variable           | Local variables do not get default values.                         | Explicitly initialize before use.                                      |
| Static Method Accessing Instance Field | Static methods belong to class, instance fields belong to objects. | Pass object reference or make the field static if appropriate.         |
| Public Field Encapsulation Issue       | Public fields can be set to invalid values.                        | Use `private` modifier and provide getter/setter methods.              |
| Inheriting from Final Class            | Final classes cannot be extended.                                  | Remove `final` keyword or avoid inheritance.                           |
| Overriding Final Method                | Final methods cannot be overridden.                                | Do not override; use method as-is or create new method in subclass.    |
| Abstract Method Not Implemented        | Concrete class must implement all abstract methods.                | Provide implementation in subclass or declare subclass as abstract.    |
| Interface Method Not Public            | Interface methods are implicitly public.                           | Ensure implemented methods are declared `public`.                      |
| Instantiating Abstract Class           | Abstract classes cannot be directly instantiated.                  | Use subclass object with abstract class reference.                     |
| Default Access Modifier Misunderstood  | `default` is not a keyword; it means no modifier specified.        | Use explicit modifiers (`public`, `private`, `protected`) when needed. |

| Static Block

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

[P1_LocalAndInstanceVariable.java](./src/P1_LocalAndInstanceVariable.java)

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

[P2_StaticInstituteName.java](./src/P2_StaticInstituteName.java)

## `Program 3: Object Counter`

```
Create a Student class with:
	static variable studentCount
	constructor that increases studentCount
	static method showTotalStudents()
```

[P3_ObjectCounter.java](./src/P3_ObjectCounter.java)

## `Program 4: Utility Calculator`

```
Create a Calculator class with static methods:
	add(int a, int b)
	subtract(int a, int b)
	multiply(int a, int b)
	divide(int a, int b)
Call all methods using class name
```

[P4_UtilityCalculator.java](./src/P4_UtilityCalculator.java)

## `Program 5: Static Block`

```
Create a class DatabaseConfig with:
	static variable databaseName
	static block that initializes databaseName
	static method showDatabaseName()

Call showDatabaseName() from main method.
```

[P5_StaticBlock.java](./src/P5_StaticBlock.java)

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

[P6_EncapsulationWithAccessModifier.java](./src/P6_EncapsulationWithAccessModifier.java)

## `Program 7: Final Variable`

```
Create a class Exam with:
	final variable MAX_MARKS = 100
	method showMaxMarks()

Try to change MAX_MARKS and write the error reason in comments.
```

[P7_FinalVariable.java](./src/P7_FinalVariable.java)

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

[P8_AbstractClass.java](./src/P8_AbstractClass.java)

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

[P9_ConstructorInAbstractClass.java](./src/P9_ConstructorInAbstractClass.java)

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

[P10_Interface.java](./src/P10_Interface.java)

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

[P11_MultipleInterfaces.java](./src/P11_MultipleInterfaces.java)

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

[P12_PaymentSystem.java](./src/P12_PaymentSystem.java)

# Part E: Concept Mapping

| \*  | Situation                                   | Concept Used                |
| --- | ------------------------------------------- | --------------------------- |
| 1   | Variable declared inside method             | local variable              |
| 2   | Variable belongs to every object separately | instance variable           |
| 3   | Common variable shared by all objects       | class variable              |
| 4   | Method called using class name              | static method               |
| 5   | Block runs once when class loads            | static block                |
| 6   | JVM calls main without object               | static method               |
| 7   | Data accessible only inside same class      | private class               |
| 8   | Value cannot be changed                     | final variable              |
| 9   | Method cannot be overridden                 | final method                |
| 10  | Class cannot be inherited                   | private class / final class |
| 11  | Class contains incomplete method            | abstract class              |
| 12  | Method without body                         | abstract mehthod            |
| 13  | Contract followed by class                  | Implementation              |
| 14  | One class implements two capabilities       | interface                   |

# Part F: Difference Questions

| \*  | `Local variable`                         | `Instance variable`                           |
| --- | ---------------------------------------- | --------------------------------------------- |
| 1   | Declared inside method/constructor/block | Declared inside class but outside methods     |
| 2   | Exists only during method execution      | Exists as long as object exists               |
| 3   | Must be initialized before use           | Automatically initialized with default values |
| 4   | Stored in stack memory                   | Stored in heap memory                         |

---

| \*  | `Instance variable`           | `Static variable`                   |
| --- | ----------------------------- | ----------------------------------- |
| 1   | Belongs to each object        | Belongs to the class                |
| 2   | Each object has its own copy  | Only one copy shared by all objects |
| 3   | Accessed via object reference | Accessed via class name             |
| 4   | Lifecycle tied to object      | Lifecycle tied to class loading     |

---

| \*  | `Static method`                           | `Instance method`                             |
| --- | ----------------------------------------- | --------------------------------------------- |
| 1   | Belongs to the class                      | Belongs to the object                         |
| 2   | Can be called without creating object     | Requires object creation                      |
| 3   | Cannot directly access instance variables | Can access both static and instance variables |
| 4   | Example: `Math.sqrt()`                    | Example: `obj.display()`                      |

---

| \*  | `Static block`                      | `Constructor`                         |
| --- | ----------------------------------- | ------------------------------------- |
| 1   | Runs once when class is loaded      | Runs every time an object is created  |
| 2   | Used to initialize static variables | Used to initialize instance variables |
| 3   | No arguments allowed                | Can take arguments                    |
| 4   | Executes before main method         | Executes after object creation        |

---

| \*  | `private`                             | `public`                 |
| --- | ------------------------------------- | ------------------------ |
| 1   | Accessible only within the same class | Accessible from anywhere |
| 2   | Highest restriction                   | No restriction           |
| 3   | Used for encapsulation                | Used for exposing APIs   |

---

| \*  | `Access modifier`                                   | `Non-access modifier`                                   |
| --- | --------------------------------------------------- | ------------------------------------------------------- |
| 1   | Controls visibility (scope)                         | Controls behavior (lifecycle, inheritance, threading)   |
| 2   | Examples: `public`, `private`, `protected`, default | Examples: `static`, `final`, `abstract`, `synchronized` |

---

| \*  | `Final variable`               | `Final method`               | `Final class`                     |
| --- | ------------------------------ | ---------------------------- | --------------------------------- |
| 1   | Value cannot change (constant) | Cannot be overridden         | Cannot be subclassed              |
| 2   | Example: `final int MAX=100;`  | Example: `final void show()` | Example: `final class Utility {}` |

---

| \*  | `Abstract class`                | `Concrete class`                        |
| --- | ------------------------------- | --------------------------------------- |
| 1   | May contain abstract methods    | Contains only fully implemented methods |
| 2   | Cannot be instantiated directly | Can be instantiated                     |
| 3   | Used for abstraction            | Used for actual implementation          |

---

| \*  | `Abstract method`                | `Normal method`             |
| --- | -------------------------------- | --------------------------- |
| 1   | Declared without body            | Declared with body          |
| 2   | Must be implemented by subclass  | Already implemented         |
| 3   | Example: `abstract void draw();` | Example: `void draw(){...}` |

---

| \*  | `Abstract class`                     | `Interface`                                                                   |
| --- | ------------------------------------ | ----------------------------------------------------------------------------- |
| 1   | Can have abstract + concrete methods | Before Java 8: only abstract methods; Java 8+ allows default & static methods |
| 2   | Can have instance variables          | Only constants (`public static final`)                                        |
| 3   | Supports single inheritance          | Supports multiple inheritance                                                 |
| 4   | Constructor allowed                  | No constructor                                                                |

---

| \*  | `extends`                                             | `implements`                                   |
| --- | ----------------------------------------------------- | ---------------------------------------------- |
| 1   | Used for class inheritance (or interface inheritance) | Used for implementing an interface             |
| 2   | A class can extend only one class                     | A class can implement multiple interfaces      |
| 3   | Example: `class Car extends Vehicle`                  | Example: `class UpiPayment implements Payment` |

---

| \*  | `Interface inheritance`                     | `Class inheritance`                      |
| --- | ------------------------------------------- | ---------------------------------------- |
| 1   | Achieved using `extends` between interfaces | Achieved using `extends` between classes |
| 2   | Supports multiple inheritance               | Supports single inheritance              |
| 3   | Interfaces cannot have constructors         | Classes can have constructors            |
| 4   | Example: `interface A extends B, C`         | Example: `class Child extends Parent`    |

# Part G: Real-World Thinking Questions

1. **In a school application, which data should be instance variable and which data can be static?**
   - Instance variables: Student name, roll number, marks (unique per student).
   - Static variables: School name, total number of students (common for all).

2. **Why should bank account balance be private?**
   - To protect sensitive financial data.
   - Prevents direct modification from outside the class.
   - Ensures controlled access through methods like `deposit()` and `withdraw()`.

3. **Why can a calculator utility method be static?**
   - Because it does not depend on object state.
   - Example: `Math.sqrt()` can be called directly without creating an object.

4. **Why should some rules be made final?**
   - To prevent modification of critical business rules.
   - Example: Interest rate cap or maximum withdrawal limit.

5. **Why can Payment be an interface?**
   - Different payment methods (UPI, Card, NetBanking) can implement their own logic.
   - Defines a contract (`pay()`) that all payment types must follow.

6. **Why can BasePayment be an abstract class?**
   - It can provide common code (like transaction logging).
   - Abstract methods allow subclasses to define specific payment behavior.

7. **Why does Java allow multiple interfaces but not multiple classes?**
   - Multiple interfaces → supports multiple inheritance of type (no conflict, only method signatures).
   - Multiple classes → may cause ambiguity (diamond problem), so not allowed.

8. **In backend projects, why do we usually code using interface reference?**
   - Promotes loose coupling and flexibility.
   - Allows switching implementations (e.g., `Payment` could be UPI or Card) without changing client code.
   - Makes testing easier by using mock implementations.
