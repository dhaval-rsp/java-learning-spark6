# Part A: Short Questions

1. **What is a loop?**
	>a\
	>
	
2. **What are the three main parts of a loop?**
	>a\
	>
	
3. **When should we use a for loop?**
	>a\
	>
	
4. **When should we use a while loop?**
	>a\
	>
	
5. **Which loop executes at least once?**
	>a\
	>
	
6. **What is an infinite loop?**
	>a\
	>
	
7. **What does break do?**
	>a\
	>
	
8. **What does continue do?**
	>a\
	>
	
9. **What is a nested loop?**
	>a\
	>
	
10. **What is a class?**
	>a\
	>
	
11. **What is an object?**
	>a\
	>
	
12. **What is a field or instance variable?**
	>a\
	>
	
13. **What does the new keyword do?**
	>a\
	>
	
14. **What is a reference variable?**
	>a\
	>
	
15. **What is the dot operator used for?**
	>a\
	>

# Part B: Find The Output

## `Question 1`

```java
for (int i = 1; i <= 5; i++) {
	System.out.print(i + " ");
}
```

```java
// Answere

```

## `Question 2`

```java
for (int i = 10; i >= 2; i -= 2) {
	System.out.print(i + " ");
}
```

```java
// Answere

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

```

# Part C: Find And Correct The Error

## `Question 1`

```java
for (int i = 1; i <= 5; i--) {
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

## `Question 3`

```java
for (int i = 0; i < 5; i++);
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

# Part D: Loop Programs

## `Program 1: Number Series`

```
int age == 20; //comparator used to assign value into variable

int age = 20;
```
[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

## `Program 2: Reverse Series`

```
Print numbers from 20 to 1 using a while loop.
```

## `Program 3: Even And Odd Numbers`

```
Print:
	even numbers from 1 to 50
	odd numbers from 1 to 50
```

## `Program 4: Multiplication Table`

```
Create a variable:
	int number = 7;
Print its multiplication table from 1 to 10.
```

## `Program 5: Sum Of Numbers`

```
Find the sum of numbers from 1 to 100.
```

## `Program 6: Factorial`

```
Find the factorial of 5 .
```
## `Program 7: Divisible Numbers`

```
Print numbers from 1 to 100 that are divisible by both 3 and 5.
```

## `Program 8: Break And Continue`

```
Print numbers from 1 to 20:
	skip 7 using continue
	stop the loop when the number becomes 15
```

## `Program 9: Square Pattern`

```
Print:
	* * * *
	* * * *
	* * * *
	* * * *
```

## `Program 10: Increasing Pattern`

```
Print:
	*
	* *
	* * *
	* * * *
	* * * * *
```

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
[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

## `Program 2: Two Students`

```
Create two Student objects.
Store different names, roll numbers, and marks in both objects.
Print both student records.
```

## `Program 3: Car`

```
Create a Car class containing:
	String brand;
	String color;
	double price;

Create two Car objects in another class and print their details.
```

## `Program 4: Product`

```
Create a Product class containing:
	String name;
	double price;
	int quantity;

Create an object and calculate:
```

## `Program 5: Employee`

```
Create an Employee class containing:
	int employeeId;
	String employeeName;
	double monthlySalary;
Create an object and calculate annual salary.
```

## `Program 6: Bank Account`

```
Create a BankAccount class containing:
	String accountHolder;
	String accountNumber;
	double balance;

Create an object, assign values, and print account details.
```

# Part F: Combined Logic Challenges

## `Challenge 1: Store Multiple Students`

```
Create a Student class.
Inside main , create three Student objects and assign different values.
Print the student who has the highest marks using if-else .
```
[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

## `Challenge 2: Product Stock`

```
Create a Product class with:
	String name;
	double price;
	int stock;

Create three Product objects.
Print only products whose stock is greater than zero.
```

## `Challenge 3: Employee Bonus`

```
Create an Employee class with:
	String name;
	double salary;
	int experience;

If experience is 5 years or more, add a 10% bonus.
Print the final salary.
```

## `Challenge 4: Objects In An Array`

```
Create a Student array that can store three Student objects.

Create and place three objects in the array.

Use a loop to print every student's name and marks.
Hint:
	Student[] students = new Student[3];
```


# Part G: Oral Revision

1. **When should we use for instead of while ?**
2. **Why does do-while execute at least once?**
3. **What causes an infinite loop?**
4. **What is the difference between break and continue ?**
5. **What is the role of the outer and inner loop?**
6. **What is the difference between a class and an object?**
7. **Which statement creates an object?**
8. **How do we access a field from another class?**
9. **Can one class create multiple objects?**
10. **Does each object have separate instance-variable values?**
