# Part A: Very Short Answer Questions

1. **What is data?**

   > Data is information; it can be anything—image, text, video, numbers.

2. **What is a data type?**

   > A data type is a classification of data that tells the compiler or interpreter how to use the values of that type.

3. **What is a variable?**

   > A variable is a `named storage` location in memory that holds a value of a specific data type.

4. **Why do we need variables in Java?**

   > We need variables in Java `to store` and manipulate data during program execution.\
   > Also variable help us to use data repeatatively in program with just its variable name\

5. **What is an identifier?**

   > An identifier is a name given to a variable, method, class, or any other user-defined item in Java.

6. **Is every variable name an identifier?**

   > Yes, every variable name is an identifier.

7. **Can a variable name start with a number?**

   > No, a variable name cannot start with a number.

8. **Can a variable name contain spaces?**
   > No, a variable name cannot contain spaces.
9. **Which data type is used for whole numbers?**

   > The `int` data type is used for whole numbers.

10. **Which data type is used for decimal numbers?**

    > The `double`, `float` data type is used for decimal numbers.

11. **Which data type is used for true/false values?**

    > The `boolean` data type is used for true/false values.

12. **Which data type is used for a single character?**

    > The `char` data type is used for a single character.

13. **Which data type is used for text?**

    > The `String` data type is used for text.

14. **What is the difference between char and String?**

    > The `char` data type is used for a single character, while the `String` data type is used for a sequence of characters or you can assign zero character in string.\
    > String e.g = "", "A", "Aa" | string allows `null` and it is non-premitive\
    > char e.g = 'A', 'B' | char cannot be null and it is premitive\

15. **What is the difference between = and == ? Write only basic meaning.**
    > The `=` operator is used for assignment, while the `==` operator is used for comparison.\
    > int age = 10; so we assigned 10 into age variable | 20 == 11; this is comparing \
    > For Primitives (e.g., int, char, double): `==` compares the actual values stored in memory.\
    > For Objects: `==` compares the memory references. It checks if both reference variables point to the exact same object instance on the heap\

# Part B: Identify The Data Type

| Value        | Correct Data Type |
| ------------ | ----------------- |
| 25           | int               |
| 99.50        | double            |
| 'A'          | char              |
| "A"          | String            |
| true         | boolean           |
| "true"       | String            |
| 50000        | int               |
| 88.75        | double            |
| '9'          | char              |
| "9876543210" | String            |

# Part C: Valid Or Invalid Variable Names

`First Character: Must start with a Unicode letter (A-Z, a-z), a dollar sign ($), or an underscore (_). It cannot start with a digit.`\

`Subsequent Characters: Can include letters, digits (0-9), underscores (_), and dollar signs ($).`\

`No Special Characters: You cannot use symbols like @, #, !, %, or hyphens (-).`\

`No Whitespace: Spaces are strictly forbidden within a variable name.`\

`Case Sensitivity: Java is case-sensitive. The variables itemCount, ItemCount, and itemcount are completely different identifiers.`\

`No Reserved Keywords: You cannot use official Java keywords (e.g., int, class, public, if, void) or literals like true, false, and null`\

1. int age = 20;

   > valid

2. int 1age = 20;

   > invalid , identifier cannot start with numbers

3. String studentName = "Rahul";

   > valid

4. double product price = 99.50;

   > invalid, white space not allowed

5. char grade = 'A';

   > valid

6. boolean isPassed = true;

   > valid

7. int class = 10;

   > valid

8. String city_name = "Delhi";

   > valid

9. int totalMarks = 450;

   > valid

10. double @salary = 50000.50;
    > invalid, indentifier cannot start with special character\

# Part D: Find The Error - Find and correct the mistake.

```java
int age = "20"; // declared as int but used double quotation
int age = 20;
```

```java
String name = 'Rahul'; // string works with double quote
String name = "Rahul";
```

```java
char grade = "A"; // char works with single quote
char grade = 'A';
```

```java
boolean isPassed = "true"; // boolean takes true false without quote
boolean isPassed = true;
```

```java
double price = 99.50 // valid
```

```java
int student age = 21; // identifier takes no white space
int studentAge = 21;
```

```java
int marks;
System.out.println(marks); // cannot print marks if this is block level variable
```

# Part E: Output Questions

## `Q.1`

```java
public class OutputOne {
 public static void main(String[] args) {
 int age = 20;
 System.out.println(age);
 }
}
```

```java
// Answere
20
```

## `Q.2`

```java
public class OutputTwo {
 public static void main(String[] args) {
 String name = "Amit";
 int age = 22;
 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 }
}
```

```java
// Answere
Name: Amit
Age: 22
```

## `Q.3`

```java
public class OutputThree {
 public static void main(String[] args) {
 int number = 10;
 number = 20;
 number = 30;
 System.out.println(number);
 }
}
```

```java
// Answere
30
```

## `Q.4`

```java
public class OutputFour {
 public static void main(String[] args) {
 char grade = 'A';
 String section = "A";
 System.out.println(grade);
 System.out.println(section);
 }
}
```

```java
// Answere
A
A
```

## `Q.5`

```java
public class OutputFive {
 public static void main(String[] args) {
 int maths = 80;
 int science = 90;
 int english = 85;
 int total = maths + science + english;
 System.out.println("Total Marks: " + total);
 }
}
```

```java
// Answere
Total Marks: 255
```

# Part F: Coding Practice

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

## `Program 2: Student Details`

```
Create variables for:
student name
   roll number
   age
   marks
   grade
   pass status
Print all details.
```

[P2_StudentDetails.java](./src/P2_StudentDetails.java)

## `Program 3: Product Details`

```
Create variables for:
   product name
   price
   quantity
   availability status
Print all details.
```

[P3_ProductDetails.java](./src/P3_ProductDetails.java)

## `Program 4: Employee Details`

```
Create variables for:
   employee name
   employee id
   salary
   department
   permanent employee status
Print all details.
```

[P4_EmployeeDetails.java](./src/P4_EmployeeDetails.java)

## `Program 5: Mobile Details`

```
Create variables for:
   brand
   model
   price
   RAM
   5G support status
Print all details.
```

[P5_MobileDetails.java](./src/P5_MobileDetails.java)

# Part G: Mini Project

```
Create a Java program named StudentProfile .
Store and print:
   student name
   roll number
   college name
   course name
   semester
   Java marks
   database marks
   web technology marks
   total marks
   percentage
   grade
   pass status
```

```java
Hint:

   int total = javaMarks + databaseMarks + webTechnologyMarks;
   double percentage = total / 3.0;
```

[P6_MiniProject.java](./src/P6_MiniProject.java)

# Part H: Challenge Questions

```
These are optional but recommended.
	1. Why should mobile number usually be stored as String ?
	2. Why is "99.50" not a double ?
	3. Why is "true" not a boolean ?
	4. What happens when we assign a new value to the same variable?
	5. Write five meaningful variable names using camelCase.
```