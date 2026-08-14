# Part A: Short Answer Questions

1. **What is an `array` in Java?**

   > An array is a collection of elements of the same type.  
   > It stores values in contiguous memory locations.  
   > Each element can be accessed using an index.

2. **Why is array `index starting` from 0 ?**

   > Index starts from 0 because the first element is stored at the base memory address.  
   > The index acts as an offset from that base address.  
   > So the first element has offset 0, the second has offset 1, and so on.

   ```
   target address = base starting address + (index * size of element)
   	=  2000a + (0 * 4) --> 2000a
   	=  2000a + (1 * 4) --> 2004a
   	=  2000a + (2 * 4) --> 2008a
   	=  2000a + (3 * 4) --> 2012a
   ```

3. **What happens if we access an `invalid` array index?**

   > Java checks bounds at runtime.  
   > If you try to access an index outside the valid range, it throws an exception.  
   > Specifically, you get an `ArrayIndexOutOfBoundsException`.\
   > In simple words the index you are trying to access is not available.

4. **What is the `difference` between array `length` and `last index` ?**

   > `length` gives the total number of elements in the array.  
   > The last index is always `length - 1`.  
   > Example: For an array of length 5, valid indices are 0 to 4.

5. **Why do we use `loops with arrays` ?**

   > Arrays often store multiple values.  
   > Loops help us process each element efficiently.  
   > Without loops, we would need repetitive code for each index.\
   > Since loop runs sequencially and array stores element in continuous memory, naturally loop makes it easy to access the arrays.

6. **Can an array store objects?**

   > Yes, arrays can store objects as well as primitive types.  
   > Each element holds a reference to an object.  
   > Example: `Student[] students = new Student[50];`

7. **What is a `constructor` ?**

   > A constructor is a special method in a class.  
   > It is used to initialize objects when they are created.  
   > It has the same name as the class and no return type.

8. **Why do we use constructors?**

   > To set initial values for object fields.  
   > To ensure proper setup when an object is created.  
   > They make object creation easier and cleaner.  
   > It makes code more shorter as we dont have to access variable using dot operator.

9. **What is the `difference` between a default `constructor` and a `parameterized` constructor?**

   > Default constructor has no parameters and sets default values.  
   > Parameterized constructor takes arguments to set custom values.  
   > Example: `Car()` vs `Car(String color)`.  
   > Parameterized constructor takes variable values during creation so no need of dot operator.

10. **What is `constructor overloading` ?**

    > Having multiple constructors in the same class.  
    > Each constructor has a different parameter list.  
    > This allows flexible ways of creating objects.  
    > `Car(String colour)` | `Car(String brand)`

11. **Can a constructor have a `return` type?**

    > No, constructors do not have a return type.  
    > Even `void` is not allowed.  
    > They only initialize objects.

12. **What is the use of `this keyword` ?**

    > Refers to the current object.  
    > Helps distinguish between instance variables and local variables.  
    > Can also be used to call other methods of the same object.

13. **What is the difference between `this` and `this()` ?**

    > `this` refers to the current object instance.  
    > `this()` calls another constructor in the same class.  
    > Both are useful but serve different purposes.

14. **What is inheritance?**

    > A mechanism where one class derives properties and behaviors from another.  
    > Promotes code reuse and hierarchy.  
    > Example: `class Student extends User`.

15. **What is the use of `extends` keyword?**

    > Used to declare inheritance.  
    > It makes a class a child of another class.  
    > Example: `class Dog extends Animal`.

16. **What is the use of `super` keyword?**

    > Refers to the parent class.  
    > Can be used to access parent fields and methods.  
    > Also used to call the parent constructor.

17. **What is the difference between `super` and `super()` ?**

    > `super` refers to parent class members.  
    > `super()` calls the parent class constructor.  
    > Both connect child class to parent class functionality.

18. **Why does parent constructor execute before child constructor?**

    > Because the parent part of the object must be initialized first.  
    > Ensures that inherited fields are ready before child adds its own.  
    > This maintains proper object construction order.

19. **What is method overriding?**

    > When a child class provides its own implementation of a parent method.  
    > The method signature remains the same.  
    > Allows specialized behavior in the child class.

20. **What is the difference between method overloading and method overriding?**

    > **Overloading**: Same method name, different parameter list, within the same class.  
    > **Overriding**: Same method name and parameters, but redefined in child class.  
    > Overloading is compile‑time, overriding is runtime.

21. **What is encapsulation?**

    > Wrapping data and methods together in a class.  
    > Restricting direct access to fields.  
    > Achieved using private fields and public getters/setters.

22. **Why should fields usually be private?**

    > To protect data from unauthorized changes.  
    > To enforce controlled access through methods.  
    > This ensures data integrity and security.

23. **What is polymorphism?**

    > The ability of one method name to perform different actions.  
    > Achieved through method overloading and overriding.  
    > Makes code flexible and extensible.

24. **What is abstraction?**

    > Hiding implementation details and showing only essential features.  
    > Achieved using abstract classes and interfaces.  
    > Helps focus on "what" rather than "how".  
    > Hiding complex code & providing user simple & useful inputs to use the program.

25. **Why is OOP useful in backend development?**
    > It organizes code into reusable classes and objects.  
    > Makes complex systems easier to manage.  
    > Supports scalability, maintainability, and modular design.

# Part B: Find The Output

## `Question 1`

```java
public class Main {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40};

		System.out.println(numbers[0]);
		System.out.println(numbers[2]);
		System.out.println(numbers.length);
	}
}
```

```java
// Answere
10
30
4
```

## `Question 2`

```java
public class Main {
	public static void main(String[] args) {
		int[] marks = {70, 80, 90};

		for (int i = 0; i < marks.length; i++) {
			marks[i] = marks[i] + 5;
		}

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
}
```

```java
// Answere
75
85
95
```

## `Question 3`

```java
class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[2];

		students[0] = new Student("Rahul", 85);
		students[1] = new Student("Priya", 92);

		System.out.println(students[0].name);
		System.out.println(students[1].marks);
	}
}
```

```java
// Answere
Rahul
92
```

## `Question 4`

```java
class Product {
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	void show() {
		System.out.println(name + " " + price);
	}
}

public class Main {
	public static void main(String[] args) {
		Product product = new Product("Laptop", 55000);
		product.show();
	}
}
```

```java
// Answere
Laptop 55000.0
```

## `Question 5`

```java
class Student {
		String name;
		int age;
		String course;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	Student(String name, int age, String course) {
		this(name, age);
		this.course = course;
	}

	void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(course);
	}
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student("Amit", 21, "Java");
		student.show();
	}
}
```

```java
// Answere
Amit
21
Java
```

## `Question 6`

```java
class Employee {
	Employee() {
		System.out.println("Employee constructor");
	}
}

class Developer extends Employee {
	Developer() {
		System.out.println("Developer constructor");
	}
}

public class Main {
	public static void main(String[] args) {
		Developer developer = new Developer();
	}
}
```

```java
// Answere
Employee constructor
Develper constructor
```

## `Question 7`

```java
class Employee {
	String company = "Parent Company";
}

class Developer extends Employee {
	String company = "Child Company";

	void showCompany() {
		System.out.println(company);
		System.out.println(super.company);
	}
}

public class Main {
	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.showCompany();
	}
}
```

```java
// Answere
Child Company
Parent Company
```

## `Question 8`

```java
class Payment {
	void pay() {
		System.out.println("Generic payment");
	}
}

class UpiPayment extends Payment {
	void pay() {
		System.out.println("UPI payment");
	}
}

public class Main {
	public static void main(String[] args) {
		Payment payment = new UpiPayment();
		payment.pay();
	}
}
```

```java
// Answere
UPI payment
```

# Part C: Find And Fix The Error

## `Question 1`

```java
public class Main {
	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		System.out.println(numbers[3]);
	}
}
```

```java
// Write:
//	1. What is the error?
//	2. Why does it happen?
//	3. Correct the code.

// Answere
// The error is ArrayIndexOutOfBoundsException.
// It happens because valid indices are 0, 1, 2 but code tries to access index 3.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        System.out.println(numbers[2]); // last valid index
    }
}
```

## `Question 2`

```java
class Student {
	String name;
	int age;

	Student(String name, int age) {
		name = name;
		age = age;
	}
}

```

```java
// Write:
//	1. What is wrong in the constructor?
//	2. What will be stored in object fields?
//	3. Correct the code using this .

// Answere
// The constructor assigns parameters to themselves instead of object fields.
// Object fields will remain with default values (null for String, 0 for int).

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

## `Question 3`

```java
class A {
	A() {
		System.out.println("A");
	}
}

class B extends A {
	B() {
		System.out.println("B");
		super();
	}
}
```

```java
// Write:
//	1. What is the error?
//	2. Why is it an error?
//	3. Correct the code.

// Answere
// The error is call to super must be first statement in constructor.
// It happens because super() must be the first line in the child constructor.

class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        super(); // must be first
        System.out.println("B");
    }
}
```

## `Question 4`

```java
class Parent {
	void show() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void show(int number) {
		System.out.println("Child");
	}
}

```

```java
//Is this method overriding or method overloading?
//Explain your answer.

// This is method overloading, not overriding.
// Overloading: same method name but different parameter list.
// Overriding: same method signature in parent and child.
// Here, show() vs show(int number) → different parameters → overloading.

```

## `Question 5`

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
//	2. Which OOP concept can solve it?
//	3. Rewrite the class using private field and methods.

// Answere
// The design problem is that balance is public and can be set to invalid values.
// Encapsulation (private fields + controlled access) solves it.

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw");
        }
    }

    public double getBalance() {
        return balance;
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

# Part D: Coding Practice

## `Program 1: Array Maximum`

```
Create an integer array of 5 numbers and print the largest number.
Example:
	Input array: 12, 45, 23, 67, 34
	Output: 67
```

[P1_ArrayMaximum.java](./src/P1_ArrayMaximum.java)

## `Program 2: Count Even And Odd Numbers`

```
Create an integer array and count how many numbers are even and how many are odd.
Expected output format:
	Even count: 3
	Odd count: 2
```

[P2_CountEvenAndOddNumers.java](./src/P2_CountEvenAndOddNumers.java)

## `Program 3: Student Array`

```
Create a Student class with:
	name
	marks
	parameterized constructor
	showDetails() method

In main , create an array of 3 Student objects and print details of all students using a loop.

```

[P3_StudentArray.java](./src/P3_StudentArray.java)

## `Program 4: Product Bill`

```
Create a Product class with:
	name
	price
	Genie Ashwani
	quantity
	parameterized constructor
	calculateTotal() method
	showBill() method
Create 3 products and print the total bill amount.
```

[P4_ProductBill.java](./src/P4_ProductBill.java)

## `Program 5: Constructor Overloading`

```
Create an Employee class with:
	id
	name
	salary

Create two constructors:
	Employee(int id, String name)
	Employee(int id, String name, double salary)

If salary is not provided, store salary as 15000 .
```

[P5_ConstructorOverloading.java](./src/P5_ConstructorOverloading.java)

## `Program 6: this() Practice`

```
Create a Course class with:
	courseName
	duration
	fees

Create two constructors:
	Course(String courseName, int duration)
	Course(String courseName, int duration, double fees)

Call the first constructor from the second constructor using this() .

```

[P6_thisPractice.java](./src/P6_thisPractice.java)

## `Program 7: Inheritance Practice`

```
Create a parent class Vehicle with:
	brand
	speed
	constructor
	showVehicleDetails() method

Create a child class Car with:
	fuelType
	constructor
	showCarDetails() method

Use super() to call parent constructor
```

[P7_InheritancePractice.java](./src/P7_InheritancePractice.java)

## `Program 8: Method Overriding`

```
Create a class Account with method:
	void calculateInterest()

Create two child classes:
	SavingsAccount
	CurrentAccount

Override calculateInterest() in both child classes.
```

[P8_MethodOverriding.java](./src/P8_MethodOverriding.java)

## `Program 9: Encapsulation`

```
Create a BankAccount class with private fields:
	accountNumber
	balance

Create methods:
	deposit(double amount)
	withdraw(double amount)
	getBalance()

Rules:
	Deposit only positive amount.
	Withdraw only if balance is enough.
	Direct balance access should not be allowed
```

[P9_Encapsulation.java](./src/P9_Encapsulation.java)

## `Program 10: Mini OOP System`

```
Create an online learning system.
Parent class:
	User
	- name
	- email
	- constructor
	- showProfile()

Child class 1:
Student extends User
	- courseName
	- constructor
	- showProfile()

Child class 2:
Trainer extends User
	- subject
	- constructor
	- showProfile()

Requirements:
	1. Use super() in child constructors.
	2. Use super.showProfile() inside child showProfile() .
	3. Create one Student object and one Trainer object.
	4. Print both profiles.
```

[P10_MiniOOPSystem.java](./src/P10_MiniOOPSystem.java)

# Part E: Concept Mapping

| Situation                                         | Concept Used                | Why it fits                                                         |
| ------------------------------------------------- | --------------------------- | ------------------------------------------------------------------- |
| Protecting balance from direct access             | Constructor, Getter, Setter | Balance is private → only accessible through controlled methods.    |
| Child class reusing parent class fields           | Inheritence                 | Child inherits fields/methods from parent, avoiding duplication.    |
| Same method name with different parameters        | Overloading                 | Multiple versions of a method, distinguished by parameter list.     |
| Same method name in parent and child class        | Inheritence                 | Child redefines parent’s method to provide specialized behavior.    |
| Calling parent constructor from child constructor | super() keyword             | Ensures parent’s initialization runs before child’s.                |
| Referring to current object field                 | this keyword                | Distinguishes current object’s fields from local variables.         |
| Storing many student objects together             | array                       | Arrays hold multiple instances of the same class type.              |
| Hiding internal implementation details            | Abstraction                 | Exposes only essential features, hides complex logic from the user. |

# Part F: Real-World Thinking Questions

1. **In a food delivery app, what classes can you identify?** > User (common info like name, phone, address)\

   > Customer (extends User, adds order history)\
   > DeliveryPartner (extends User, adds vehicle details, delivery status)\
   > Restaurant (menu, ratings, location)\
   > Order (items, price, status)\
   > Payment (method, transaction ID)\
   > Pincode class\
   > State class\
   > District class\
   > Food category class\
   > notication class\

2. **In a banking app, why should account balance be private?**

   > To protect sensitive financial data from unauthorized access.\
   > Prevents direct manipulation (e.g., someone setting balance = 1,000,000).\
   > Access is controlled through methods like deposit() and withdraw(), ensuring business rules are followed.

3. **In an e-learning app, why can Student and Trainer extend User ?**

   > Both share common attributes (name, email, login).\
   > Inheritance allows reuse of these fields and methods.\
   > Student may add enrolledCourses, Trainer may add subjectsTaught.\
   > This avoids duplication and keeps code organized.

4. **In a payment system, why can pay() behave differently for UPI, card, and cash?**

   > This is polymorphism.\
   > Same method name (pay()), but different implementations depending on the payment type.\
   > Example:
   >
   > > UPI → validate UPI ID\
   > > Card → check card number & CVV\
   > > Cash → mark as “Cash on Delivery”\
   >
   > Makes the system flexible and extensible.

5. **In a college system, where can we use arrays of objects?**
   > To store multiple entities of the same type.\
   > Examples:
   >
   > > Student[] students = new Student[100]; → list of all students in a class.\
   > > Course[] courses = new Course[10]; → list of courses offered.\
   > > Faculty[] facultyMembers = new Faculty[20]; → list of professors.\
   >
   > Arrays of objects help manage collections efficiently.
