# Part A: Short Answer Questions

1. **What is an array in Java?**
	>a/
	>a/
	
2. **Why is array index starting from 0 ?**
	>a/
	>a/
	
3. **What happens if we access an invalid array index?**
	>a/
	>a/
	
4. **What is the difference between array length and last index?**
	>a/
	>a/
	
5. **Why do we use loops with arrays?**
	>a/
	>a/
	
6. **Can an array store objects?**
	>a/
	>a/
	
7. **What is a constructor?**
	>a/
	>a/
	
8. **Why do we use constructors?**
	>a/
	>a/
	
9. **What is the difference between a default constructor and a parameterized constructor?**
	>a/
	>a/
	
10. **What is constructor overloading?**
	>a/
	>a/
	
11. **Can a constructor have a return type?**
	>a/
	>a/
	
12. **What is the use of this keyword?**
	>a/
	>a/
	
13. **What is the difference between this and this() ?**
	>a/
	>a/
	
14. **What is inheritance?**
	>a/
	>a/
	
15. **What is the use of extends keyword?**
	>a/
	>a/
	
16. **What is the use of super keyword?**
	>a/
	>a/
	
17. **What is the difference between super and super() ?**
	>a/
	>a/
	
18. **Why does parent constructor execute before child constructor?**
	>a/
	>a/
	
19. **What is method overriding?**
	>a/
	>a/
	
20. **What is the difference between method overloading and method overriding?**
	>a/
	>a/
	
21. **What is encapsulation?**
	>a/
	>a/
	
22. **Why should fields usually be private?**
	>a/
	>a/
	
23. **What is polymorphism?**
	>a/
	>a/
	
24. **What is abstraction?**
	>a/
	>a/
	
25. **Why is OOP useful in backend development?**
	>a/
	>a/
	


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

```

# Part D: Coding Practice

## `Program 1: Array Maximum`

```
Create an integer array of 5 numbers and print the largest number.
Example:
	Input array: 12, 45, 23, 67, 34
	Output: 67
```

[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

## `Program 2: Count Even And Odd Numbers`

```
Create an integer array and count how many numbers are even and how many are odd.
Expected output format:
	Even count: 3
	Odd count: 2
```

## `Program 3: Student Array`

```
Create a Student class with:
	name
	marks
	parameterized constructor
	showDetails() method
	
In main , create an array of 3 Student objects and print details of all students using a loop.

```

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

## `Program 8: Method Overriding`

```
Create a class Account with method:
	void calculateInterest()

Create two child classes:
	SavingsAccount
	CurrentAccount
	
Override calculateInterest() in both child classes.
```

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



# Part E: Concept Mapping

|Situation |Concept Used|
|----------|------------|
|Protecting balance from direct access||
|Child class reusing parent class fields||
|Same method name with different parameters||
|Same method name in parent and child class||
|Calling parent constructor from child constructor||
|Referring to current object field||
|Storing many student objects together||
|Hiding internal implementation details||

# Part F: Real-World Thinking Questions

1. **In a food delivery app, what classes can you identify?**
2. **In a banking app, why should account balance be private?**
3. **In an e-learning app, why can Student and Trainer extend User ?**
4. **In a payment system, why can pay() behave differently for UPI, card, and cash?**
5. **In a college system, where can we use arrays of objects?**
