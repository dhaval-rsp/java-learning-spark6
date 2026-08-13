# Part A: Short Questions

1. **What is a `loop` ?**

   > A loop is a programming construct that repeats a block of code until a condition is met.

2. **What are the `three` main parts of a loop?**

   > Initialization → set a starting value.\
   > Condition → check whether to continue.\
   > Update → change the value each iteration.

3. **When should we use a `for` loop?**

   > Use when the number of iterations is known in advance (e.g., run 10 times, loop through an array).

4. **When should we use a `while` loop?**

   > Use when the number of iterations is not known beforehand and depends on a condition (e.g., keep asking until user enters valid input).

5. **Which loop executes `at least once` ?**

   > The do‑while loop always runs at least once because the condition is checked after execution.

6. **What is an `infinite` loop?**

   > A loop that never ends because its condition is always true or never updated.

7. **What does `break` do?**

   > Immediately exits the loop, skipping the remaining iterations.

8. **What does `continue` do?**

   > Skips the current iteration and moves to the next one.

9. **What is a nested loop?**

   > A loop inside another loop. Example: iterating rows and columns in a matrix.

10. **What is a `class` ?**

    > A blueprint for creating objects. It defines properties (fields) and behaviors (methods).

11. **What is an `object` ?**

    > An instance of a class. Example: Car myCar = new Car();

12. **What is a field or `instance variable` ?**

    > A variable defined inside a class that holds data specific to each object.

13. **What does the `new` keyword do?**

    > It creates a new object in memory based on a class.\
    > New keyword creates memory in JVM for object based on a class.

14. **What is a reference variable?**

    > A variable that points to an object’s memory location instead of holding the actual object.\
    > Reference variable means it does not contain actual information but the address of actual data\
    > Student s = new Student(); --> s is reference variable

15. **What is the dot operator used for?**
    > To access members (fields, methods) of an object. Example: myCar.startEngine();

# Part B: Find The Output

## `Question 1`

```java
for (int i = 1; i <= 5; i++) {
	System.out.print(i + " ");
}
```

```java
// Answere
1 2 3 4 5
```

## `Question 2`

```java
for (int i = 10; i >= 2; i -= 2) {
	System.out.print(i + " ");
}
```

```java
// Answere
10 8 6 4 2
```

## `Question 3`

```java
int i = 1;

while (i <= 5) {
	System.out.print(i * i + " ");
	i++;
}
```

```java
// Answere
1 4 9 16 25
```

## `Question 4`

```java
int i = 10;

do {
	System.out.println(i);
	i++;
}
while (i < 5);
```

```java
// Answere
10
```

## `Question 5`

```java
for (int i = 1; i <= 6; i++) {
	if (i == 4) {
		continue;
	}

	System.out.print(i + " ");
}
```

```java
// Answere
1 2 3 5 6
```

## `Question 6`

```java
for (int i = 1; i <= 10; i++) {
	if (i == 5) {
		break;
	}

	System.out.print(i + " ");
}
```

```java
// Answere
1 2 3 4
```

## `Question 7`

```java
int sum = 0;

for (int i = 1; i <= 5; i++) {
	sum += i;
}

System.out.println(sum);
```

```java
// Answere
15
```

## `Question 8`

```java
for (int row = 1; row <= 3; row++) {
	for (int column = 1; column <= 2; column++) {
		System.out.print("* ");
	}

	System.out.println();
}
```

```java
// Answere
* *
* *
* *
```

## `Question 9`

```java
class Student {
	String name;
	int age;
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();

		student.name = "Rahul";
		student.age = 20;

		System.out.println(student.name);
		System.out.println(student.age);
	}
}
```

```java
// Answere
Rahul
20
```

## `Question 10`

```java
class Product {
	String name;
	double price;
}

public class Main {
	public static void main(String[] args) {
		Product first = new Product();
		Product second = new Product();

		first.name = "Laptop";
		first.price = 50000;

		second.name = "Mouse";
		second.price = 500;

		first.price = 48000;

		System.out.println(first.price);
		System.out.println(second.price);
	}
}
```

```java
// Answere
48000
500
```

# Part C: Find And Correct The Error

## `Question 1`

```java
for (int i = 1; i <= 5; i--) {
	System.out.println(i);
}
```

```java
// i updating in minus so loop never ends - becomes infinite loop - made i++

for (int i = 1; i <= 5; i++) {
	System.out.println(i);
}
```

## `Question 2`

```java
int i = 1;

while (i <= 5) {
	System.out.println(i);
}
```

```java
// need i++ condition after print

int i = 1;

while (i <= 5) {
	System.out.println(i);
	i++
}
```

## `Question 3`

```java
for (int i = 0; i < 5; i++);
{
	System.out.println("Java");
}
```

```java
// remove semicolon after for's bracket

for (int i = 0; i < 5; i++)
{
	System.out.println("Java");
}
```

## `Question 4`

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
// object creation was not proper - need to use new keyword

class Student {
	String name;
}

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Rahul";
	}
}
```

## `Question 5`

```java
class Car {
	String color;
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		color = "Red";

		System.out.println(car.color);
	}
}

```

```java
// properties need to be accessed using dot operator

class Car {
	String color;
}

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		car.color = "Red";

		System.out.println(car.color);
	}
}

```

# Part D: Loop Programs

## `Program 1: Number Series`

```
Print numbers from 20 to 1 using a for loop.
```

[P1_NumberSeries.java](./src/P1_NumberSeries.java)

## `Program 2: Reverse Series`

```
Print numbers from 20 to 1 using a while loop.
```

[P2_ReverseSeries.java](./src/P2_ReverseSeries.java)

## `Program 3: Even And Odd Numbers`

```
Print:
	even numbers from 1 to 50
	odd numbers from 1 to 50
```

[P3_EvenAndOddNumbers.java](./src/P3_EvenAndOddNumbers.java)

## `Program 4: Multiplication Table`

```
Create a variable:
	int number = 7;
Print its multiplication table from 1 to 10.
```

[P4_MultiplicationTable.java](./src/P4_MultiplicationTable.java)

## `Program 5: Sum Of Numbers`

```
Find the sum of numbers from 1 to 100.
```

[P5_SumOfNumbers.java](./src/P5_SumOfNumbers.java)

## `Program 6: Factorial`

```
Find the factorial of 5 .
```

[P6_Factorial.java](./src/P6_Factorial.java)

## `Program 7: Divisible Numbers`

```
Print numbers from 1 to 100 that are divisible by both 3 and 5.
```

[P7_DivisibleNumbers.java](./src/P7_DivisibleNumbers.java)

## `Program 8: Break And Continue`

```
Print numbers from 1 to 20:
	skip 7 using continue
	stop the loop when the number becomes 15
```

[P8_BreakAndContinue](./src/P8_BreakAndContinue.java)

## `Program 9: Square Pattern`

```
Print:
	* * * *
	* * * *
	* * * *
	* * * *
```

[P9_SquarePattern.java](./src/P9_SquarePattern.java)

## `Program 10: Increasing Pattern`

```
Print:
	*
	* *
	* * *
	* * * *
	* * * * *
```

[P10_IncreasingPattern.java](./src/P10_IncreasingPattern.java)

# Part E: Class And Object Programs

## `Program 1: Student`

```
Create a Student class containing:
	String name;
	int rollNumber;
	int age;
	int marks;

In another class containing main :
	1. Create a Student object.
	2. Assign values using the dot operator.
	3. Print all values.
```

[P11_Student.java](./src/P11_Student.java)

## `Program 2: Two Students`

```
Create two Student objects.
Store different names, roll numbers, and marks in both objects.
Print both student records.
```

[P12_TwoStudents.java](./src/P12_TwoStudents.java)

## `Program 3: Car`

```
Create a Car class containing:
	String brand;
	String color;
	double price;

Create two Car objects in another class and print their details.
```

[P13_Car.java](./src/P13_Car.java)

## `Program 4: Product`

```
Create a Product class containing:
	String name;
	double price;
	int quantity;

Create an object and calculate:
	total price = price * quantity
```

[P14_Product.java](./src/P14_Product.java)

## `Program 5: Employee`

```
Create an Employee class containing:
	int employeeId;
	String employeeName;
	double monthlySalary;
Create an object and calculate annual salary.
```

[P15_Employee](./src/P15_Employee.java)

## `Program 6: Bank Account`

```
Create a BankAccount class containing:
	String accountHolder;
	String accountNumber;
	double balance;

Create an object, assign values, and print account details.
```

[P16_BankAccount.java](./src/P16_BankAccount.java)

# Part F: Combined Logic Challenges

## `Challenge 1: Store Multiple Students`

```
Create a Student class.
Inside main , create three Student objects and assign different values.
Print the student who has the highest marks using if-else .
```

[C1_StoreMultipleStudents.java](./src/C1_StoreMultipleStudents.java)

## `Challenge 2: Product Stock`

```
Create a Product class with:
	String name;
	double price;
	int stock;

Create three Product objects.
Print only products whose stock is greater than zero.
```

[C2_ProductStock.java](./src/C2_ProductStock.java)

## `Challenge 3: Employee Bonus`

```
Create an Employee class with:
	String name;
	double salary;
	int experience;

If experience is 5 years or more, add a 10% bonus.
Print the final salary.
```

[C3_EmployeeBonus.java](./src/C3_EmployeeBonus.java)

## `Challenge 4: Objects In An Array`

```
Create a Student array that can store three Student objects.

Create and place three objects in the array.

Use a loop to print every student's name and marks.
Hint:
	Student[] students = new Student[3];
```

[C4_ObjectsInAnArray.java](./src/C4_ObjectsInAnArray.java)

# Part G: Oral Revision

1. **When should we use for instead of while ?**

   > Use a for loop when the number of iterations is known in advance (e.g., counting from 1 to 10, iterating through an array).\
   > Use a while loop when the number of iterations depends on a condition that may change unpredictably (e.g., keep asking for input until it’s valid).

2. **Why does do-while execute at least once?**

   > Because the condition is checked after the loop body runs. The body executes first, then the condition decides whether to repeat.

3. **What causes an infinite loop?**

   > Condition is always true (e.g., while (true)).\
   > Update step is missing or incorrect (e.g., forgetting i++).\
   > Logic error that prevents the condition from ever becoming false.

4. **What is the difference between break and continue ?**

   > break → exits the loop completely, skipping all remaining iterations.\
   > continue → skips only the current iteration, then moves to the next one.

5. **What is the role of the outer and inner loop?**

   > uter loop controls the number of overall repetitions (e.g., rows).\
   > Inner loop runs inside each outer loop iteration (e.g., columns).\
   > Together, they handle multi‑dimensional tasks like printing grids or processing matrices.

6. **What is the difference between a class and an object?**

   > Class → blueprint or template (defines structure and behavior).\
   > Object → actual instance created from that blueprint.

7. **Which statement creates an object?**

   > Using the new keyword:

   ```java
   Car myCar = new Car();
   ```

8. **How do we access a field from another class?**

   > By using the dot operator with a reference variable:

   ```java
   myCar.color;
   ```

9. **Can one class create multiple objects?**

   > Yes. A single class can be used to create many objects, each with its own data.

   ```java
   Car car1 = new Car();
   Car car2 = new Car();
   ```

10. **Does each object have separate instance-variable values?**
    > Yes. Each object maintains its own copy of instance variables.\
    > Example:
    ```java
    car1.color = "Red";
    car2.color = "Blue";
    → different values for different objects.
    ```
