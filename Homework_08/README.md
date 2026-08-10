# Part A: Very Short Answer Questions

1. **What is data?**

   > Data is information; it can be anything—image, text, video, numbers.



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


# Part D: Find The Error - Find and correct the mistake.

```java
int age = "20"; // declared as int but used double quotation
int age = 20;
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