# Part A: Short Answer Questions

1. **What is a `class` ?**

   > A class is a user‑defined blueprint or template that describes the structure and behavior of objects.\
   > It defines fields (data) and methods (actions).

2. **What is an `object` ?**

   > An object is an instance of a class.\
   > It represents a real‑world entity with state (fields/variables) and behavior (methods).

3. **Why is a class called a `blueprint` ?**

   > Because it provides the design or plan for creating objects.\
   > Just like a house blueprint guides construction, a class guides object creation.

4. **What is a field or instance `variable` ?**

   > A variable defined inside a class but outside methods. Each object gets its own copy of these.

5. **What is a `reference` variable?**

   > A variable that stores the memory address (reference) of an object, not the object itself.

6. **What does the `new` keyword do?**

   > Used to create (instantiate) objects from a class.\
   > It allocates memory in JVM and returns a reference to the object.

7. **What is the `dot` operator used for?**

   > Used to access fields and methods of an object. Example: car.colour or car.start().

8. **Can one class be used to create `multiple objects` ?**

   > Yes. A single class can be used to create many objects, each with its own state.

9. **Does each object have a `separate` copy of its instance fields?**

   > Yes. Each object has its own copy of instance variables, so changing one object’s field doesn’t affect another.

10. **What is a method?**

    > A block of code inside a class that performs a specific task.

11. **Why do we use methods?**

    > To reuse code\
    > To organize logic\
    > To make programs modular and readable

12. **What is the difference between method `declaration` and method `call` ?**

    > Declaration: Defines the method (its name, parameters, return type, body).\
    > Example: int add(int a, int b) { return a+b; }\
    > Call: Executes the method.\
    > Example: add(5, 3);

13. **What is a `parameter` ?**

    > A variable defined in the method declaration to accept input.\
    > Example: int a, int b in add(int a, int b).

14. **What is an `argument` ?**

    > The actual value passed when calling a method.\
    > Example: 5, 3 in add(5, 3).

15. **What does `void` mean?**

    > Means the method does not return any value.

16. **What does the `return` statement do?**

    > Ends method execution and optionally returns a value to the caller.

17. **What is a `local variable` ?**

    > Declared inside a method and exists only while the method runs.

18. **What is the difference between a `local variable` and an `instance variable` ?**

    > Local: Exists only inside a method, temporary.\
    > Instance: Exists inside a class, tied to the object, persists as long as the object exists.

19. **What happens when `two reference` variables point to the same object?**

    > Both refer to the same memory location.\
    > Changes made through one reference are visible through the other.

    ```java
    class Car {
    String color;
    }

    public class Main {
    	public static void main(String[] args) {
    		// Create one Car object
    		Car car1 = new Car();
    		car1.color = "Red";

    		// Make car2 point to the same object as car1
    		Car car2 = car1;

    		// Change color using car2
    		car2.color = "Blue";

    		// Print color using both references
    		System.out.println("car1 color: " + car1.color); // Output: Blue
    		System.out.println("car2 color: " + car2.color); // Output: Blue
    	}
    }
    ```

20. **What happens when we access a field or method using a null reference?**
    > Causes a NullPointerException because the reference doesn’t point to any actual object in memory.

# Part B: Identify The Parts

```java
Study the code:

class Student {
	String name;
	int marks;

	void displayDetails() {
		System.out.println(name);
		System.out.println(marks);
	}
}

public class Main {
	public static void main(String[] args) {

		Student student = new Student();

		student.name = "Rahul";
		student.marks = 85;

		student.displayDetails();
	}
}
```

```
Identify:
	1. Class name = Student class & Main class
	2. Reference variable = student
	3. Object-creation expression = Student student = new Student();
	4. Instance fields = name, marks
	5. Method name = displayDetails()
	6. Method call = student.displayDetails();
	7. Uses of the dot operator = student.name = "Rahul", student.marks = 85, student.displayDetails()
```

# Part C: Find The Output

## `Question 1`

```java
class Student {
	String name;
	int marks;
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();

		System.out.println(student.name);
		System.out.println(student.marks);
	}
}
```

```java
// Answere
Null
0
```

## `Question 2`

```java
class Car {
	String color;
	int speed;
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car();

		car.color = "Red";
		car.speed = 120;

		System.out.println(car.color);
		System.out.println(car.speed);
	}
}
```

```java
// Answere
Red
120
```

## `Question 3`

```java
class Student {
	String name;
}

public class Main {
	public static void main(String[] args) {
		Student first = new Student();
		Student second = new Student();

		first.name = "Rahul";
		second.name = "Priya";

		first.name = "Amit";

		System.out.println(first.name);
		System.out.println(second.name);
	}
}
```

```java
// Answere
Amit
Priya
```

## `Question 4`

```java
class Student {
	String name;
}

public class Main {
	public static void main(String[] args) {
		Student first = new Student();
		first.name = "Rahul";

		Student second = first;
		second.name = "Amit";

		System.out.println(first.name);
		System.out.println(second.name);
	}
}
```

```java
// Answere
Amit
Amit
```

## `Question 5`

```java
class Counter {
	int count;

	void increase() {
		count++;
	}
}

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();

		counter.increase();
		counter.increase();
		counter.increase();

		System.out.println(counter.count);
	}
}
```

```java
// Answere
3
```

## `Question 6`

```java
class Calculator {
	void add(int a, int b) {
		System.out.println(a + b);
	}
}

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(20, 30);
	}
}
```

```java
// Answere
50
```

## `Question 7`

```java
class Calculator {
	int multiply(int a, int b) {
		return a * b;
	}
}

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(4, 5);

		System.out.println(result);
	}
}
```

```java
// Answere
20
```

## `Question 8`

```java
class BankAccount {
	double balance;

	void deposit(double amount) {
		balance += amount;
	}
}

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.balance = 1000;

		account.deposit(500);
		account.deposit(250);

		System.out.println(account.balance);
	}
}
```

```java
// Answere
1750.0
```

# Part D: Find And Correct The Error

## `Question 1`

```java
class Student {
	String name;
}

public class Main {
	public static void main(String[] args) {
		Student student;
		student.name = "Rahul";
	}
}
```

```java
// Answere

object not created properly

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Rahul";
	}
}
```

## `Question 2`

```java
class Car {
	String color;
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		color = "Blue";

		System.out.println(car.color);
	}
}
```

```java
// Answere

variable not accessed properly

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Blue";

		System.out.println(car.color);
	}
}
```

## `Question 3`

```java
class Calculator {

	int add(int a, int b) {
		int result = a + b;
	}
}
```

```java
// Answere

method not declared with return

class Calculator {

	int add(int a, int b) {
		return result = a + b;
	}
}
```

## `Question 4`

```java
class Calculator {

	void add(int a, int b) {
		return a + b;
	}
}
```

```java
// Answere

improper retrun type

class Calculator {

	int add(int a, int b) {
		return a + b;
	}
}
```

## `Question 5`

```java
class Student {

	void display(String name, int age) {
		System.out.println(name);
		System.out.println(age);
	}

}
public class Main {
	public static void main(String[] args) {

		Student student = new Student();
		student.display(20, "Rahul");
	}
}
```

```java
// Answere

incorrect argument position during call

student.display("Rahul", 20);
```

## `Question 6`

```java
class Student {
	String name;
}

public class Main {
	public static void main(String[] args) {
		Student student = null;
		System.out.println(student.name);
	}
}
```

```java
// Answere

method called without object creation

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.name);
	}
}
```

# Part E: Class And Object Programs

## `Program 1: Student Details`

```
Create a Student class containing:
	String name;
	int rollNumber;
	int age;
	int marks;

In another class containing main :
	1. Create a Student object.
	2. Assign field values using the dot operator.
	3. Print all details
```

[P1.java](./src/P1)

## `Program 2: Multiple Students`

```
Create three Student objects with different names, roll numbers, and marks.
Print the details of all three objects.
```

[P2.java](./src/P2)

## `Program 3: Car Details`

```
Create a Car class containing:
	String brand;
	String model;
	String color;
	double price;

Create two objects and print their details
```

[P3.java](./src/P3)

## `Program 4: Employee Details`

```
Create an Employee class containing:
	int employeeId;
	String employeeName;
	double monthlySalary;

Create an object and calculate annual salary inside main .
```

[P4.java](./src/4)

## `Program 5: Product Details`

```
Create a Product class containing:
	String name;
	double price;
	int quantity;

Create an object and calculate total price
```

[P5.java](./src/P5)

# Part F: Method Programs

## `Program 1: Student Method`

```
Add a method to the Student class:
	void displayDetails()

The method should print all fields of the current object
```

[PM1.java](./src/PM1)

## `Program 2: Calculator`

```
Create a Calculator class with methods:
	int add(int a, int b)
	int subtract(int a, int b)
	int multiply(int a, int b)
	double divide(double a, double b)

Create an object and call every method.
```

[PM2.java](./src/PM2)

## `Program 3: Rectangle`

```
Create a Rectangle class containing:
	double length;
	double width;

Add methods:
	double calculateArea()
	double calculatePerimeter()
```

[PM3.java](./src/PM3)

## `Program 4: Bank Account`

```
Create a BankAccount class containing:
	String accountHolder;
	double balance;

Add methods:
	void deposit(double amount)
	void withdraw(double amount)
	void displayBalance()

Do not allow withdrawal when the amount is greater than the balance.
```

[PM4.java](./src/PM4)

## `Program 5: Product Service`

```
Add a method:
	double calculateTotal()

It should return:
	price * quantity
```

[PM5.java](./src/PM5)

## `Program 6: Pass Or Fail`

```
Create a Student class with a marks field.
Add:
	String getResult()

Return "Pass" when marks are at least 40; otherwise return "Fail"
```

[PM6.java](./src/PM6)

# Part G: Method-Type Practice

```
Write one example for each type:
	1. No parameter and no return value
	2. Parameters and no return value
	3. No parameter and a return value
	4. Parameters and a return value

Use a Calculator , Student , or Message class.
```

[PM1.java](./src/PM1)

# Part H: Combined Challenges

## `Challenge 1: Highest Marks`

```
Create three Student objects.
Use if-else inside main to print the student with the highest marks.

```

[C1.java](./src/C1)

## `Challenge 2: Salary Update`

```
Create an Employee class with:
	String name;
	double salary;

Add:
	void addBonus(double percentage)

The method should update the object's salary.
```

[C2.java](./src/C2)

## `Challenge 3: Inventory`

```
Create a Product class with:
	String name;
	int stock;

Add methods:
	void addStock(int quantity)
	void sell(int quantity)

Do not allow sales greater than available stock.
```

[C3.java](./src/C3)

## `Challenge 4: Object Array`

```
Create a Student array that stores three Student objects.
Assign fields without constructors and use a loop to print every student's details.

Hint:
	Student[] students = new Student[3];
	students[0] = new Student();
	students[1] = new Student();
	students[2] = new Student();
```

[C4.java](./src/C4)

## `Challenge 5: Array Parameter`

```
Create a class NumberService .

Add:
	int calculateSum(int[] numbers)

Call it by passing an integer array.
```

[C5.java](./src/C5)

# Part I: Oral Revision

1. **What is the difference between a class and an object?**

   > Class: A blueprint or template (defines structure and behavior).\
   > Object: A real instance created from that blueprint (has actual data and can perform actions).

2. **Which keyword creates an object?**

   > The new keyword. Example: Car myCar = new Car();

3. **What is stored in a reference variable?**

   > The memory address (reference) of the object, not the object itself.

4. **How do we access a field from another class?**

   > By creating an object and using the dot operator.

   ```java
   Car myCar = new Car();
   myCar.color = "Red";  // accessing field
   ```

5. **What is the difference between a field and a local variable?**

   > Field (instance variable): Declared inside a class, belongs to the object, exists as long as the object exists.\
   > Local variable: Declared inside a method, exists only while the method runs.

6. **What is the difference between a parameter and an argument?**

   > Parameter: Placeholder variable in the method definition.\
   > Example: void greet(String name) → name is the parameter.\
   > Argument: Actual value passed when calling the method.\
   > Example: greet("Dhaval") → "Dhaval" is the argument.

7. **What does void mean?**

   > It means the method does not return any value.

8. **Why do methods use return ?**

   > To send a value back to the caller and end the method’s execution.

   ```java
   int add(int a, int b) {
   return a + b; // returns result
   }
   ```

9. **Can two reference variables point to the same object?**

   > Yes. If obj2 = obj1;, both point to the same memory location. Changes through one are visible through the othe

10. **What exception occurs when a null reference is used?**
    > NullPointerException. This happens when you try to access a field or method on a reference that doesn’t point to any object.
