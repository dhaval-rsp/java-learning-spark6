[Access ALL Readme file](#access-all-readme-file)

# java-learning-spark6

Learning JAVA from basic to advance level on code for success platform

# Access ALL Readme file

[HW 1 Readme](./Homework_01/README.md) |
[HW 2 Readme](./Homework_02/README.md) |
[HW 3 Readme](./Homework_03/README.md) |
[HW 4 Readme](./Homework_04/README.md) |
[HW 5 Readme](./Homework_05/README.md) |  
[HW 6 Readme](./Homework_06/README.md) |
[HW 7 Readme](./Homework_07/README.md) |
[HW 8 Readme](./Homework_08/README.md) |
[HW 9 Readme](./Homework_09/README.md) |

# My Questions

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q1.] basics of 'toString()' 
</span>
</summary>

**In Java, `toString()` is a method that returns a string representation of an object.  
By default, it shows the class name followed by the object’s hash code, but you can override it to display meaningful details about the object.**

### 🔹 Default Behavior

- Defined in **`java.lang.Object`**, the root of all Java classes.
- Signature:

  ```java
  public String toString()
  ```

- Default implementation:
  ```java
  return getClass().getName() + "@" + Integer.toHexString(hashCode());
  ```
- Example:

  ```java
  class Person {
      String name;
      int age;
  }

  Person p = new Person();
  System.out.println(p.toString());
  ```

  **Output:** `Person@5e8c92f4` (class name + hex hash code) [GeeksForGeeks](https://www.geeksforgeeks.org/java/object-tostring-method-in-java/)

### 🔹 Why Override `toString()`

- **Debugging:** Provides human-readable info about object state.
- **Logging:** Makes logs more informative.
- **Collections:** When printing lists/maps, `toString()` is automatically called on elements.
- `Example of Overriding`

  ```java
  class Person {
      String name;
      int age;

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      @Override
      public String toString() {
          return "Person{name='" + name + "', age=" + age + "}";
      }
  }

  public class Main {
      public static void main(String[] args) {
          Person p = new Person("Alice", 25);
          System.out.println(p); // calls toString()
      }
  }
  ```

**Output:** `Person{name='Alice', age=25}` [javaspring.net](https://www.javaspring.net/blog/object-tostring-method-in-java/)

### 🔹 Best Practices

- **Include key fields** that describe the object’s state.
- **Avoid sensitive data** (e.g., passwords, tokens).
- **Keep it concise** (fit in one log line).
- **Use `String.format()` or `StringBuilder`** for readability.
- For **Java Records**, `toString()` is auto-generated:

  ```java
  record User(String name, int age) {}
  System.out.println(new User("Alice", 30));
  // Output: User[name=Alice, age=30]
  ```

  [javawithus.com](https://javawithus.com/learn/methods/tostring/)

### 🔹 Comparison Table

| **Aspect**           | **Default `toString()`** | **Overridden `toString()`**      |
| -------------------- | ------------------------ | -------------------------------- |
| Output Format        | `ClassName@HexHashCode`  | Custom string with field values  |
| Readability          | Low (not human-friendly) | High (shows actual object state) |
| Debugging Usefulness | Minimal                  | Very useful for logs & debugging |
| Example Output       | `Person@15db9742`        | `Person{name='Alice', age=25}`   |

### 🔹 Key Takeaways

- **Always override `toString()`** in custom classes for clarity.
- Default output is only useful for identifying object identity, not state.
- Good `toString()` implementations save time in debugging and logging.

</details>

---

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q2.] freqMap.put(w, freqMap.getOrDefault(w, 0)+1);
</span>
</summary>

```java
import java.util.*;

public class P7_WordFrequencyCounter {
    public static void main(String[] args) {

        // Given input string
        String input = "java spring java sql spring java";

        // splitting into words
        String[] words = input.split(" ");

        // HashMap to store frequency
        Map<String, Integer> freqMap = new HashMap<>();

        // counting frequency
        for (String w : words) {
            freqMap.put(w, freqMap.getOrDefault(w, 0)+1);
        }

        // printing count
        System.out.println("Word Frequencies");
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
```

### 🔹 Counting frequency

```java
for (String w : words) {
    freqMap.put(w, freqMap.getOrDefault(w, 0)+1);
}
```

- **`for (String w : words)`**  
  → This loop goes through each word in the `words` array one by one.  
  Example: first `"java"`, then `"spring"`, then `"java"` again, etc.

- **`freqMap.getOrDefault(w, 0)`**  
  → Look inside the map (`freqMap`) to see if the word `w` is already stored.
  - If yes → return its current count.
  - If no → return `0` (default value).

- **`+1`**  
  → Add 1 because we just saw this word again.

- **`freqMap.put(w, ...)`**  
  → Save the updated count back into the map.  
  Example:
  - First time `"java"` → count becomes 1.
  - Next time `"java"` → count becomes 2.
  - Next time `"java"` → count becomes 3.

👉 In short: this loop **counts how many times each word appears**.

### 🔹 Printing the result

```java
System.out.println("Word Frequencies");
for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
```

- **`System.out.println("Word Frequencies");`**  
  → Just prints a heading so the output looks neat.

- **`for (Map.Entry<String, Integer> entry : freqMap.entrySet())`**  
  → Go through each word–count pair stored in the map.
  - `entry.getKey()` → the word (like `"java"`).
  - `entry.getValue()` → the count (like `3`).

- **`System.out.println(entry.getKey() + " = " + entry.getValue());`**  
  → Print the word and its count in the format:
  ```
  java = 3
  spring = 2
  sql = 1
  ```

👉 In short: this loop **prints each word with its frequency**.

✅ **Summary in plain words:**

- The first loop **counts** how many times each word shows up.
- The second loop **prints** those counts nicely.

Would you like me to also show a **dry run table** (step-by-step map changes after each word) so you can literally see how `"java spring java sql spring java"` builds the counts?

</details>

---

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q3.]
</span>
</summary>

</details>

---

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q4.]
</span>
</summary>

</details>

---

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q5.]
</span>
</summary>

</details>

---

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q6.]
</span>
</summary>

</details>

---

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q7.]
</span>
</summary>

</details>

---

<details>

<summary>
<span style="
  font-size:1.7em; 
  font-family:monospace; 
  font-weight:bold; ">
[Q8.]
</span>
</summary>

</details>

---
