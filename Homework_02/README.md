[Part A: Short Answer Questions](#part-a-short-answer-questions)
[Part B: Find The Output](#part-b-find-the-output)
[Part C: Find And Correct The Error](#part-c-find-and-correct-the-error)
[Part D: Coding Practice](#part-d-coding-practice)
[Part E: Slightly Challenging Questions](#part-e-slightly-challenging-questions)
[Part F: Oral Revision Questions](#part-f-oral-revision-questions)

# Part A: Short Answer Questions

1.  **What is an operator?**

    > An operator is a symbol that performs an operation.\
    > Example: + adds two numbers. other operators are `+`, `-`, `*`, `/`, `%`

2.  **What is an operand?**

    > An operand is the value or variable on which the operator acts.\
    > Example: In `5 + 3`, both `5` and `3` are operands.

3.  **What is the difference between `=` and `==` ?**

    > `=` → Assignment operator (stores a value in a variable).\
    > Example: `x = 10` assigns `10 to x`.\
    > `==` → Comparison operator (checks equality).\
    > Example: `x == 10` returns true if `x is 10`.

4.  **What does `%` operator return?**

    > The modulus operator `%` returns the remainder of division.\
    > Example: `10 % 3 = 1`.

5.  **What is the difference between `&&` and `||` ?**

    > `&&` → Logical AND (true only if both conditions are true).\
    > `||` → Logical OR (true if any one condition is true).

6.  **What does `!` operator do?**

    > The NOT operator `!` reverses the condition.\
    > Example: `!(x > 5)` → true if x is not greater than 5.

7.  **What is the difference between `a++` and `++a` ?**

    > `a++` → Post‑increment (use value first, then increase).\
    > `++a` → Pre‑increment (increase first, then use value).

    ```java
    int d = 6;
    int c = 5;

    int a = ++d; // d=7, a=7
    int b = c++; // c=6, b=5
    ```

8.  **What is a `control` statement?**

    > A control statement directs program execution based on conditions.\
    > Examples: if, else, switch, loops.

9.  **What is a `condition`?**

    > A condition is a `boolean expression` that evaluates to true or false.\
    > Example: (a > b).

10. **When do we use `if-else` ?**

    > Used when checking one condition.\

    ```java
    if (a > b) {
      System.out.println("a is bigger");
    } else {
      System.out.println("b is bigger");
    }
    ```

11. **When do we use `else-if` ?**

    > Used when checking multiple conditions sequentially.\

    ```java
    if (a > b) {
    statement
    }
    else if (a == b) {
    statement
    }
    else{
    statement
    }
    ```

12. **When do we use `switch` ?**

    > Used when comparing one variable against many possible values.\

    ```java
    switch(day) {
         case 1: System.out.println("Monday"); break;
         case 2: System.out.println("Tuesday"); break;
         default: System.out.println("Invalid day");
    }
    ```

13. **Why do we use `break` inside `switch` ?**

    > `break` stops execution after a matching case.\
    > Without it, program continues into the next case (fall‑through).

14. **What is the use of `default` in `switch` ?**

    > `default` executes when no case matches.\
    > Acts like the `“else”` of switch.

15. **What is `nested if` ?**

    > An if inside another if. Used for deeper checks.\

    ```java
    if (a > b) {
       if (a > b + 50) {
          System.out.println("a is much bigger");
       }
       else {
          System.out.println("a is bigger");
       }
    }
    else {
       System.out.println("a is smaller");
    }
    ```

# Part B: Find The Output

## `Q.1`

```java
public class OutputOne {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a / b);
        System.out.println(a % b);
    }
}
```

```java
// Answere
3
1
```

## `Q.2`

```java
public class OutputTwo {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println("10" + 20);
        System.out.println("Sum: " + 10 + 20);
        System.out.println("Sum: " + (10 + 20));
    }
}
```

```java
// Answere
30
1020
Sum: 1020
Sum: 30
```

## `Q.3`

```java
public class OutputThree {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;

        System.out.println(a);
        System.out.println(b);
    }
}
```

```java
// Answere
6
5
```

## `Q.4`

```java
public class OutputFour {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;

        System.out.println(a);
        System.out.println(b);
    }
}
```

```java
// Answere
6
6

/*

1. int a = 5; → initializes a with 5.
2. int b = ++a; → pre‑increment:
      a is incremented first → a = 6.
      Then the value of a (which is 6) is assigned to b.
      → b = 6.
3. System.out.println(a); → prints 6.
4. System.out.println(b); → prints 6.

*/
```

## `Q.5`

```java
public class OutputFive {
    public static void main(String[] args) {
        int a = 10;

        a += 5;   // a = a + 5 → 15
        a *= 2;   // a = a * 2 → 30
        a -= 10;  // a = a - 10 → 20

        System.out.println(a);
    }
}
```

```java
// Answere
20
```

## `Q.6`

```java
public class OutputSix {
    public static void main(String[] args) {
        int marks = 35;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
```

```java
// Answere
Fail
```

## `Q.7`

```java
public class OutputSeven {
    public static void main(String[] args) {
        int number = 11;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

```java
// Answere
Odd
```

## `Q.8`

```java
public class OutputEight {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 75) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
```

```java
// Answere
A
```

## `Q.9`

```java
public class OutputNine {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

```java
// Answere
Wednesday
```

## `Q.10`

```java
public class OutputTen {
   public static void main(String[] args) {
      int day = 2;

      switch (day) {
         case 1:
            System.out.println("Monday");
         case 2:
            System.out.println("Tuesday");
         case 3:
            System.out.println("Wednesday");
         default:
            System.out.println("Invalid day");
      }
   }
}
```

```java
// Answere
Tuesday
Wednesday
Invalid day
```

# Part C: Find And Correct The Error

## `Q.1`

```java
int age == 20; //comparator used to assign value into variable

int age = 20;
```

## `Q.2`

```java
if (age >= 18);
{
   System.out.println("Eligible");
}
// no age variable defined so no meaning of condition, define age variable with value.
```

## `Q.3`

```java
int marks = 50;

if marks >= 40 {
   System.out.println("Pass");
}
// invalid syntax

if (marks >=40 ) {
   System.out.println("Pass");
}
```

## `Q.4`

```java
int day = 1;

switch day {
   case 1:
      System.out.println("Monday");
      break;
}
// invalid syntax

switch (day) {
   case 1:
      System.out.println("Monday");
      break;
}
```

## `Q.5`

```java
int number = 10;

if (number % 2 = 0) {
   System.out.println("Even");
}
// invalid condition, use comparator for value check

if (number % 2 == 0) {
   System.out.println("Even");
}

```

# Part D: Coding Practice

## `Program 1: Simple Calculator`

```
Create two integer variables and print:
    addition
    subtraction
    multiplication
    division
    remainder
```

[P1_SimpleCalculator.java](./src/P1_SimpleCalculator.java)

## `Program 2: Even Or Odd`

```
Create one integer variable and check whether it is even or odd.
```

[P2_EvenOrOdd.java](./src/P2_EvenOrOdd.java)

## `Program 3: Voting Eligibility`

```
Create an age variable.
If age is greater than or equal to 18, print:
    Eligible to vote
Otherwise print:
    Not eligible to vote
```

[P3_VotingEligibility.java](./src/P3_VotingEligibility.java)

## `Program 4: Pass Or Fail`

```
Create a marks variable.
If marks are greater than or equal to 40, print Pass , otherwise print Fail .
```

[P4_PassOrFail.java](./src/P4_PassOrFail.java)

## `Program 5: Grade Calculator`

```
Create a marks variable and print grade:
```

| Marks | Grade |
| ----- | ----- |
| >= 90 | A+    |
| >= 75 | A     |
| >= 60 | B     |
| >= 40 | C     |
| < 40  | Fail  |

[P5_GradeCalculator.java](./src/P5_GradeCalculator.java)

## `Program 6: Positive, Negative, Or Zero`

```
Create one integer variable.
Print:
    Positive number
    Negative number
    Zero
```

[P6_PositiveNegativeOrZero.java](./src/P6_PositiveNegativeOrZero.java)

## `Program 7: Largest Of Two Numbers`

```
Create two integer variables and print which number is greater.
If both numbers are equal, print:
    Both numbers are equal
```

[P7_LargestOfTwoNumbers.java](./src/P7_LargestOfTwoNumbers.java)

## `Program 8: Largest Of Three Numbers`

```
Create three integer variables and find the largest number.
```

[P8_LargestOfThreeNumbers.java](./src/P8_LargestOfThreeNumbers.java)

## `Program 9: Login Check`

```
Create:
    String username = "admin";
    String password = "1234";
If both are correct, print:
    Login successful
Otherwise print:
    Invalid login
Note: For now, you may use == . Later we will learn .equals() for String comparison.
```

[P9_LoginCheck.java](./src/P9_LoginCheck.java)

## `Program 10: Discount Eligibility`

```
Create:
    boolean isStudent = true;
    boolean isSeniorCitizen = false;
If student or senior citizen, print:
    Discount available
Otherwise print:
    No discount
```

[P10_DiscountEligibility.java](./src/P10_DiscountEligibility.java)

## `Program 11: Day Name Using Switch`

```
Create an integer variable day .
Print day name:
For any other value, print:
    Invalid day
```

| Value | Day       |
| ----- | --------- |
| 1     | Monday    |
| 2     | Tuesday   |
| 3     | Wednesday |
| 4     | Thursday  |
| 5     | Friday    |
| 6     | Saturday  |
| 7     | Sunday    |

[P11_DayNameUsingSwitch.java](./src/P11_DayNameUsingSwitch.java)

## `Program 12: Simple Menu Using Switch`

```
Create an integer variable choice .
Print:
For any other choice, print:
    Invalid choice
```

| Choice | Message        |
| ------ | -------------- |
| 1      | Add money      |
| 2      | Withdraw money |
| 3      | Check balance  |
| 4      | Exit           |

[P12_SimpleMenuUsingSwitch.java](./src/P12_SimpleMenuUsingSwitch.java)

# Part E: Slightly Challenging Questions

## `Challenge 1: Electricity Bill`

```
Create variable:
    int units = 180;

Calculate bill:
    First 100 units: 5 rupees per unit
    Next units: 8 rupees per unit

Example:
For 180 units:
    100 * 5 + 80 * 8
```

[C1_ElectricityBill.java](./src/C1_ElectricityBill.java)

## `Challenge 2: Simple ATM Withdrawal`

```
Create:
    int balance = 5000;
    int withdrawAmount = 2000;

If withdraw amount is less than or equal to balance, print:
    Withdrawal successful
    Remaining balance: 3000

Otherwise print:
    Insufficient balance
```

[C2_SimpleATMWithdrawal.java](./src/C2_SimpleATMWithdrawal.java)

## `Challenge 3: Number Divisible By 3 And 5`

```
Create one integer variable.
Check:
    divisible by both 3 and 5
    divisible only by 3
    divisible only by 5
    not divisible by 3 or 5
```

[C3_NumberDivisibleBy3And5.java](./src/C3_NumberDivisibleBy3And5.java)

## `Challenge 4: Simple Calculator Using Switch`

```
Create:
    int a = 20;
    int b = 5;
    char operator = '+';

Use switch on operator.
Support:
+
-
*
/
%
```

[C4_SimpleCalculatorUsingSwitch.java](./src/C4_SimpleCalculatorUsingSwitch.java)

# Part F: Oral Revision Questions

1.  **What does `%` return?**

    > % is the modulus operator.\
    > It returns the remainder after division.\

    ```
    Example:
    10 % 3 = 1 (since 10 ÷ 3 = 3 remainder 1)
    15 % 4 = 3 (since 15 ÷ 4 = 3 remainder 3)
    ```

2.  **What is output of 10 / 3 ?**

    > In most programming languages (like Java, C, C++), dividing two integers gives an integer result (fraction is discarded). \
    > 10 / 3 = 3 (not 3.33, because decimals are cut off).\
    > If you use floating-point numbers:\
    > 10.0 / 3.0 = 3.333...

3.  **What is difference between `=` and `==` ?**

    > = → Assignment operator (used to assign values).\
    > Example: x = 5 means store value 5 in variable x.\
    > == → Comparison operator (used to check equality).\
    > Example: x == 5 checks if x is equal to 5.

4.  **What does `&&` mean?**

    > && is the logical AND operator.\
    > It returns true only if both conditions are true.

    ```
    Example:
    (5 > 3 && 10 > 2) → true
    (5 > 3 && 2 > 10) → false
    ```

5.  **What does `||` mean?**

    > || is the logical OR operator.\
    > It returns true if at least one condition is true.\

    ```
    Example:
    (5 > 3 || 2 > 10) → true
    (2 > 5 || 1 > 10) → false
    ```

6.  **What happens if `if` condition is false?**

    > If the condition inside if is false, the code inside the if block is skipped.\

    ```java
    if (5 < 3) {
    System.out.println("True");
    }
    ```

7.  **Why do we use `else-if` ?**

    > To check multiple conditions one after another.\

    ```java
    if (marks >= 90) {
        grade = "A";
    } else if (marks >= 75) {
        grade = "B";
    } else {
        grade = "C";
    }
    ```

8.  **Why do we use `break` in `switch` ?**

    > break stops execution after a matching case is found.\
    > Without break, program continues executing the next cases (called fall-through).

9.  **What happens if `break` is `missing` in switch?**

    > The program will continue executing all following cases until it finds a break or reaches the end.

    ```java
    int day = 2;
    switch(day) {
    case 1: System.out.println("Monday");
    case 2: System.out.println("Tuesday");
    case 3: System.out.println("Wednesday");
    }
    // output
    //Tuesday
    //Wednesday
    ```

10. **When should we use `switch` instead of `if-else` ?**
    > Use switch when you are checking one variable against many fixed values.
    ```java
    switch(color) {
    case "red": System.out.println("Stop");
    case "green": System.out.println("Go");
    case "yellow": System.out.println("Wait");
    }
    ```
