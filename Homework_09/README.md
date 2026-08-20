# Part A: Short Answer Questions

1. **`Why` do we need `Collections` when arrays already exist?**

   > Arrays have fixed size and limited functionality. Collections are dynamic, flexible, and provide built‑in methods for searching, sorting, and manipulating data.
   >
   > Example:  
   > `int[] arr = new int[5]; // fixed size`  
   > `ArrayList<Integer> list = new ArrayList<>(); // grows dynamically`

2. **What is the difference between `Collection` and `Collections` ?**

   > `Collection` is an **interface** (root of the collection hierarchy).  
   > `Collections` is a **utility class** with static methods like `sort()`, `reverse()`, `shuffle()`.
   >
   > Example:  
   > `Collections.sort(list);`

3. **Why do we use `generics` in Collections?**

   > Generics provide **type safety** and avoid runtime errors.  
   > Without generics, collections can store mixed types, leading to `ClassCastException`.
   >
   > Example:  
   > `List<String> names = new ArrayList<>();`

4. **Why can we write `ArrayList<Integer>` but not `ArrayList<int>` ?**

   > Collections store **objects**, not primitives.  
   > `int` is a primitive, while `Integer` is its wrapper class.
   >
   > Example:  
   > `ArrayList<Integer> list = new ArrayList<>();`

5. **Why do professional developers write `List<String> names = new ArrayList<>();` ?**

   > They program to the **interface (`List`)** instead of the implementation (`ArrayList`).  
   > This makes code flexible and easy to change later.
   >
   > Example:  
   > `List<String> names = new LinkedList<>(); // easy swap`

6. **What is the difference between `List`, `Set`, `Queue`, and `Map` ?**

   | Type  | Allows Duplicates | Order Maintained | Example Classes           |
   | ----- | ----------------- | ---------------- | ------------------------- |
   | List  | Yes               | Yes              | ArrayList, LinkedList     |
   | Set   | No                | Depends          | HashSet, TreeSet          |
   | Queue | Yes               | FIFO/LIFO        | PriorityQueue, ArrayDeque |
   | Map   | Keys unique       | Depends          | HashMap, TreeMap          |

7. **Which collection allows duplicates and maintains insertion order?**

   > `List` (e.g., `ArrayList`, `LinkedList`)

8. **Which collection removes duplicates but does not guarantee order?**

   > `HashSet`

9. **Which collection removes duplicates and keeps insertion order?**

   > `LinkedHashSet`

10. **Which collection removes duplicates and keeps sorted order?**

    > `TreeSet`

11. **Which collection is best for key‑value lookup?**

    > `HashMap`

12. **Which Map maintains insertion order?**

    > `LinkedHashMap`

13. **Which Map stores keys in sorted order?**

    > `TreeMap`

14. **What is the internal data structure of ArrayList?**

    > Dynamic array

15. **What is the internal data structure of LinkedList?**

    > Doubly linked list

16. **What happens internally when ArrayList becomes full?**

    > A new larger array is created, and old elements are copied into it.

17. **Why is ArrayList fast for `get(index)` ?**

    > Because it uses array indexing (direct access).

18. **Why is LinkedList slower for index‑based access?**

    > It must traverse nodes one by one until the index is reached.

19. **What is the internal working of HashSet?**

    > HashSet uses a `HashMap` internally. Elements are stored as keys, with a dummy value.

20. **Why are `equals()` and `hashCode()` important for HashSet?**

    > They ensure uniqueness.  
    > HashSet uses `hashCode()` to find bucket and `equals()` to check equality.

21. **What is a HashMap bucket?**

    > A bucket is a slot where entries with the same hash are stored.

22. **What is collision in HashMap?**

    > When two keys have the same hash and end up in the same bucket.

23. **What is load factor in HashMap?**

    > The ratio of number of elements to bucket capacity.  
    > It decides when to resize.

24. **What is the default load factor of HashMap?**

    > `0.75`

25. **What happens when HashMap crosses threshold?**

    > It resizes (doubles capacity) and rehashes entries.

26. **What is Comparable?**

    > An interface used to define **natural ordering** of objects.  
    > Example: `class Student implements Comparable<Student>`

27. **What is Comparator?**

    > An interface used to define **custom ordering** of objects.  
    > Example: `Collections.sort(list, comparator);`

28. **What is the difference between Comparable and Comparator?**

    | Feature  | Comparable    | Comparator     |
    | -------- | ------------- | -------------- |
    | Method   | `compareTo()` | `compare()`    |
    | Ordering | Natural       | Custom         |
    | Location | Inside class  | Separate class |

29. **What is Iterator?**

    > An object used to traverse collections one element at a time.  
    > Example:
    >
    > ```java
    > Iterator<String> it = list.iterator();
    > while(it.hasNext()) {
    >     System.out.println(it.next());
    > }
    > ```

30. **Why can `ConcurrentModificationException` occur?**

    > It occurs when a collection is modified while iterating using an iterator.  
    > Example: removing elements directly from list while iterating.

# Part B: Choose The Correct Collection

```
For each situation, write:
	1. Collection name
	2. Reason
	3. Small example
```

## `Question 1`

```
Store list of students in a batch.
Order matters.
Duplicate names are allowed.
```

**Answer: List (ArrayList)**

- **Reason:** Maintains insertion order and allows duplicates.
- **Example:**

  ```java
  List<String> students = new ArrayList<>();
  students.add("Alice");
  students.add("Bob");
  students.add("Alice"); // duplicate allowed
  ```

## `Question 2`

```
Store unique email ids from registration form.
Order does not matter.
```

**Answer: HashSet**

- **Reason:** Ensures uniqueness, order not guaranteed.
- **Example:**
  ```java
  Set<String> emails = new HashSet<>();
  emails.add("a@gmail.com");
  emails.add("b@gmail.com");
  emails.add("a@gmail.com"); // duplicate ignored
  ```

## `Question 3`

```
Remove duplicate uploaded emails but keep original upload order.
```

**Answer: LinkedHashSet**

- **Reason:** Removes duplicates and preserves insertion order.
- **Example:**
  ```java
  Set<String> emails = new LinkedHashSet<>();
  emails.add("a@gmail.com");
  emails.add("b@gmail.com");
  emails.add("a@gmail.com"); // duplicate ignored, order kept
  ```

## `Question 4`

```
Store unique roll numbers in sorted order.
```

**Answer: TreeSet**

- **Reason:** Stores unique elements in ascending sorted order.
- **Example:**
  ```java
  Set<Integer> rollNumbers = new TreeSet<>();
  rollNumbers.add(103);
  rollNumbers.add(101);
  rollNumbers.add(102);
  // Output: [101, 102, 103]
  ```

## `Question 5`

```
Store productId and Product object for fast search by id.
```

**Answer: HashMap**

- **Reason:** Provides fast key‑value lookup.
- **Example:**
  ```java
  Map<Integer, String> products = new HashMap<>();
  products.put(101, "Laptop");
  products.put(102, "Phone");
  System.out.println(products.get(101)); // Laptop
  ```

## `Question 6`

```
Store monthly sales where month keys should be sorted.
```

**Answer: TreeMap**

- **Reason:** Keys are stored in sorted order.
- **Example:**
  ```java
  Map<String, Integer> sales = new TreeMap<>();
  sales.put("March", 300);
  sales.put("January", 100);
  sales.put("February", 200);
  // Keys sorted: {January=100, February=200, March=300}
  ```

## `Question 7`

```
Process support tickets by priority.
```

**Answer: PriorityQueue**

- **Reason:** Processes elements based on priority (smallest/largest first).
- **Example:**
  ```java
  Queue<Integer> tickets = new PriorityQueue<>();
  tickets.add(3); // low priority
  tickets.add(1); // high priority
  tickets.add(2);
  System.out.println(tickets.poll()); // 1 (highest priority)
  ```

## `Question 8`

```
Implement browser back button behavior.
```

**Answer: Stack (ArrayDeque used as stack)**

- **Reason:** Follows LIFO (Last In First Out).
- **Example:**
  ```java
  Deque<String> history = new ArrayDeque<>();
  history.push("Page1");
  history.push("Page2");
  history.push("Page3");
  System.out.println(history.pop()); // Page3
  ```

## `Question 9`

```
Store API response data in the same order as database query returned.
```

**Answer: List (ArrayList)**

- **Reason:** Maintains insertion order exactly as received.
- **Example:**
  ```java
  List<String> response = new ArrayList<>();
  response.add("Row1");
  response.add("Row2");
  response.add("Row3");
  ```

## `Question 10`

```
Count frequency of each word in a paragraph.
```

**Answer: HashMap**

- **Reason:** Stores word as key and frequency as value.
- **Example:**
  ```java
  Map<String, Integer> wordCount = new HashMap<>();
  String[] words = {"apple", "banana", "apple"};
  for(String w : words) {
  	wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
  }
  // Output: {apple=2, banana=1}
  ```

# Part C: Find The Output

## `Question 1`

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Rahul");
		names.add("Priya");
		names.add("Rahul");

		System.out.println(names);
		System.out.println(names.get(1));
	}
}
```

```
// Answer

// Insertion order maintained + Duplicate Allowed

[Rahul, Priya, Rahul]
Priya
```

## `Question 2`

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();

		names.add("Rahul");
		names.add("Priya");
		names.add("Rahul");

		System.out.println(names.size());
		System.out.println(names);
	}
}

//Is output order guaranteed?
```

```
// Answer

// Order not guaranteed + No Duplicate

2
[Rahul, Priya]
```

## `Question 3`

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<>();

		names.add("Rahul");
		names.add("Priya");
		names.add("Amit");
		names.add("Rahul");

		System.out.println(names);
	}
}
```

```
// Answer

// Insertion order maintained + No Duplicate

[Rahul, Priya, Amit]
```

## `Question 4`

```java
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();

		numbers.add(50);
		numbers.add(10);
		numbers.add(30);
		numbers.add(10);

		System.out.println(numbers);
	}
}
```

```
// Answer

// Sorted (natural order or comparator) + No Duplicate

[10, 30, 50]
```

## `Question 5`

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<>();

		marks.put("Rahul", 85);
		marks.put("Priya", 92);
		marks.put("Rahul", 95);
		System.out.println(marks.get("Rahul"));

		System.out.println(marks.size());
	}
}
```

```java
// Answer

// Order not guaranteed + No Duplicate (keys must be unique, values can repeat)

95
2
```

## `Question 6`

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(103, "Amit");
		map.put(101, "Rahul");
		map.put(102, "Priya");

		System.out.println(map);
	}
}
```

```
// Answer

// Insertion order maintained + No Duplicate (keys must be unique, values can repeat)

{103=Amit, 101=Rahul, 102=Priya}
```

## `Question 7`

```java
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();

		map.put(103, "Amit");
		map.put(101, "Rahul");
		map.put(102, "Priya");

		System.out.println(map);
	}
}
```

```
// Answer

// Sorted (by keys, natural order or comparator) + No Duplicate (keys must be unique, values can repeat)

{101=Rahul, 102=Priya, 103=Amit}
```

## `Question 8`

```java
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();

		queue.offer(50);
		queue.offer(10);
		queue.offer(30);

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
```

```
// Answer

// Sorted by priority (natural order or comparator) + Duplicate Allowed
10
30
50
```

## `Question 9`

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<>();

		stack.push("Page-1");
		stack.push("Page-2");
		stack.push("Page-3");

		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
}
```

```
// Answer

// Insertion order maintained (FIFO/LIFO depending on usage) + Duplicate Allowed

Page-3
Page-2
```

| Feature              | pop()                                 | peek()                                        |
| -------------------- | ------------------------------------- | --------------------------------------------- |
| Action               | Removes and returns the head element. | Returns the head element without removing it. |
| Empty Deque Behavior | Throws NoSuchElementException.        | Returns null.                                 |
| Equivalence          | Equivalent to removeFirst().          | Equivalent to peekFirst().                    |

## `Question 10`

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(30);
		numbers.add(10);
		numbers.add(20);

		Collections.sort(numbers);
		Collections.reverse(numbers);

		System.out.println(numbers);
	}
}
```

```
// Answer

// Insertion order maintained + Duplicate Allowed

[30, 20, 10]
```

# Part D: Find And Fix The Problem

## `Question 1`

```java
ArrayList<int> numbers = new ArrayList<>();
```

```
Write:
	1. What is the error?
	2. Why primitive type is not allowed in generics?
	3. Correct the code.
```

[](./src)

## `Question 2`

```java
import java.util.HashSet;
import java.util.Set;

class Student {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Main {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();

		students.add(new Student(101, "Rahul"));
		students.add(new Student(101, "Rahul"));

		System.out.println(students.size());
	}
}
```

```
Write:
	1. Why can output be 2 ?
	2. What is missing in Student class?
	3. Correct using equals() and hashCode() based on id .
```

[](./src)

## `Question 3`

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Rahul");
		names.add("Priya");
		names.add("Amit");

		for (String name : names) {
			if (name.equals("Priya")) {
				names.remove(name);
			}
		}
	}
}
```

```
Write:
	1. What exception can occur?
	2. Why does it happen?
	3. Correct using Iterator.
```

[](./src)

## `Question 4`

```java
import java.util.Set;
import java.util.TreeSet;

class Product {
	int id;
	String name;
}

public class Main {
	public static void main(String[] args) {
		Set<Product> products = new TreeSet<>();
		products.add(new Product());
	}
}
```

```
Write:
	1. What problem can happen?
	2. Why does TreeSet need sorting logic?
	3. Correct using Comparator.
```

[](./src)

## `Question 5`

```java
Map<Integer, String> map = new HashMap<>();
map.put(101, "Rahul");
map.put(101, "Priya");
```

```
Write:
	1. How many entries are stored?
	2. Which value remains?
	3. Why?
```

[](./src)

# Part E: Coding Practice

## `Program 1: Student List`

```
Create a Student class with:
	id
	name
	marks

Create an ArrayList<Student>.

Add 5 students.

Print all students using enhanced for loop.
```

[](./src)

## `Program 2: Search Student By Id`

```
Using the same student list, search student by id.

If found, print student details.

If not found, print:
	Student not found

Write:
	Is ArrayList the fastest structure for id lookup?
	Which collection would be better?
```

[](./src)

## `Program 3: Unique Emails`

```
Create a list with duplicate email ids.

Remove duplicates using HashSet .

Print unique emails.

Write:
	Is order guaranteed?
```

[](./src)

## `Program 4: Unique Emails With Order`

```
Repeat Program 3 using LinkedHashSet .

Print emails in original order.
```

[](./src)

## `Program 5: Sorted Roll Numbers`

```
Create a TreeSet<Integer> for roll numbers.

Add roll numbers in random order.

Print sorted roll numbers.
```

[](./src)

## `Program 6: Product Lookup Using HashMap`

```
Create Product class with:
	id
	name
	price

Create:
	Map<Integer, Product> products = new HashMap<>();

Store 5 products.

Search product by id.
```

[](./src)

## `Program 7: Word Frequency Counter`

```
Given:
	java spring java sql spring java

Use HashMap<String, Integer> to count frequency.

Expected output idea:
	java = 3
	spring = 2
	sql = 1
```

[](./src)

## `Program 8: Character Frequency Counter`

```
Given:
	banana

Use HashMap<Character, Integer> to count each character.
```

[](./src)

## `Program 9: Shopping Cart`

```
Create a shopping cart using:
	List<Product>

Add 4 products.

Calculate total bill.

Then explain:
	Why List is suitable here?
```

[](./src)

## `Program 10: Support Ticket Priority`

```
Create class SupportTicket with:
	ticketId
	title
	priority

Use PriorityQueue<SupportTicket> .

Lower priority number means higher priority.

Process tickets based on priority.
```

[](./src)

## `Program 11: Browser History`

```
Use ArrayDeque<String> as stack.
Push:
	Home
	Courses
	Java
	Collections

Use pop() to go back.

Print current page after going back.
```

[](./src)

## `Program 12: Sort Students By Marks`

```
Create Student class with:
	id
	name
	marks

Use Comparator to sort students by marks ascending.

Then sort by marks descending.
```

[](./src)

## `Program 13: Sort Products By Price Then Name`

```
Create Product class with:
	id
	name
	price

Sort products:
	1. By price ascending
	2. If price is same, by name alphabetically

Use Comparator
```

[](./src)

## `Program 14: Comparable Practice`

```
Create Employee class implementing Comparable<Employee>.

Natural sorting should be by employee id.

Create list of employees and sort using:
	Collections.sort(employees);
```

[](./src)

## `Program 15: Course Management Mini Data`

```
Use different collections:
	1. ArrayList<String> for enrolled students
	2. HashSet<String> for unique emails
	3. HashMap<Integer, String> for course id and course name
	4. TreeSet<Integer> for sorted roll numbers
	5. LinkedHashSet<String> for uploaded emails without duplicates but same order

Print all data.
```

[](./src)

# Part F: Internal Working Questions

1. **How does ArrayList grow internally?**

   > When ArrayList becomes full, it creates a new array with **1.5 times** the old capacity and copies old elements into it.  
   > Example: Capacity 10 → grows to 15.

2. **What is the difference between size and capacity?**

   > **Size** = number of elements currently stored.  
   > **Capacity** = maximum elements it can hold before resizing.  
   > Example: `ArrayList` with capacity 10 but size 7.

3. **Why is inserting in middle of ArrayList slower?**

   > Because elements after the insertion index must be shifted one position to the right.  
   > Example: Inserting at index 2 in `[A, B, C, D]` → shifts `C, D`.

4. **How does LinkedList store data internally?**

   > As a **doubly linked list** where each node has data, a reference to the previous node, and a reference to the next node.  
   > Example: `Node(data, prev, next)`

5. **Why is LinkedList slower for get(index)?**

   > It must traverse nodes one by one until the index is reached.  
   > Example: `list.get(50)` → starts from head/tail and walks through 50 nodes.

6. **How does HashSet check duplicates?**

   > HashSet uses **hashCode()** to find the bucket and then **equals()** to check equality. If both match, element is considered duplicate.

7. **Why does HashSet need hashCode() and equals()?**

   > To ensure uniqueness.  
   > `hashCode()` decides bucket, `equals()` confirms equality.  
   > Example: Two objects with same hash but different equals → stored separately.

8. **How does HashMap store key-value pairs?**

   > HashMap stores entries in **buckets** using the key’s hashCode. Each bucket may contain a linked list or tree of entries.

9. **What is a bucket in HashMap?**

   > A bucket is a slot in the internal array where entries with the same hash are grouped.

10. **What is collision in HashMap?**

    > When two different keys generate the same hash and end up in the same bucket.  
    > Example: `key1.hashCode() == key2.hashCode()`

11. **What is load factor?**

    > Ratio of number of elements to capacity.  
    > Example: Capacity 16, size 12 → load factor = 12/16 = 0.75.

12. **What happens during HashMap resizing?**

    > Capacity doubles, and all entries are **rehash**ed into new buckets.

13. **Why is TreeMap sorted?**

    > Because it uses a **Red‑Black Tree** internally, which keeps keys in sorted order.

14. **Why does PriorityQueue use heap?**

    > Heap ensures efficient retrieval of the smallest/largest element in **O(log n)** time.  
    > Example: Min‑heap → `poll()` always gives smallest element.

15. **Why can HashMap be faster than TreeMap for lookup?**
    > HashMap lookup is **O(1)** average (direct bucket access).  
    > TreeMap lookup is **O(log n)** (tree traversal).

# Part G: Difference Questions

| _`A.`_     | _`Array`_                        | _`ArrayList`_                                  |
| ---------- | -------------------------------- | ---------------------------------------------- |
| Definition | Fixed-size data structure        | Resizable collection class                     |
| Size       | Cannot grow/shrink               | Grows/shrinks dynamically                      |
| Type       | Can store primitives and objects | Stores only objects (use wrapper classes)      |
| Example    | `int[] arr = new int[5];`        | `ArrayList<Integer> list = new ArrayList<>();` |

---

| _`B.`_             | _`ArrayList`_                     | _`LinkedList`_                       |
| ------------------ | --------------------------------- | ------------------------------------ |
| Internal Structure | Dynamic array                     | Doubly linked list                   |
| Access             | Fast random access (`get(index)`) | Slow random access (traverses nodes) |
| Insert/Delete      | Costly (shifting elements)        | Efficient (adjusts links)            |
| Example            | `new ArrayList<>()`               | `new LinkedList<>()`                 |

---

| _`C.`_     | _`List`_                              | _`Set`_                            |
| ---------- | ------------------------------------- | ---------------------------------- |
| Duplicates | Allowed                               | Not allowed                        |
| Order      | Maintains insertion order             | Depends on implementation          |
| Example    | `List<String> l = new ArrayList<>();` | `Set<String> s = new HashSet<>();` |

---

| _`D.`_      | _`HashSet`_         | _`LinkedHashSet`_                        |
| ----------- | ------------------- | ---------------------------------------- |
| Order       | No order guaranteed | Maintains insertion order                |
| Performance | Slightly faster     | Slightly slower due to order maintenance |
| Example     | `new HashSet<>()`   | `new LinkedHashSet<>()`                  |

---

| _`E.`_  | _`HashSet`_         | _`TreeSet`_                     |
| ------- | ------------------- | ------------------------------- |
| Order   | No order guaranteed | Stores elements in sorted order |
| Nulls   | Allows one null     | Does not allow null             |
| Example | `new HashSet<>()`   | `new TreeSet<>()`               |

---

| _`F.`_   | _`HashMap`_         | _`LinkedHashMap`_                 |
| -------- | ------------------- | --------------------------------- |
| Order    | No order guaranteed | Maintains insertion order of keys |
| Use Case | Fast lookup         | Predictable iteration order       |
| Example  | `new HashMap<>()`   | `new LinkedHashMap<>()`           |

---

| _`G.`_      | _`HashMap`_         | _`TreeMap`_                 |
| ----------- | ------------------- | --------------------------- |
| Order       | No order guaranteed | Keys stored in sorted order |
| Performance | Faster              | Slower due to sorting       |
| Example     | `new HashMap<>()`   | `new TreeMap<>()`           |

---

| _`H.`_    | _`Queue`_                                | _`Stack`_                           |
| --------- | ---------------------------------------- | ----------------------------------- |
| Principle | FIFO (First In First Out)                | LIFO (Last In First Out)            |
| Example   | `Queue<Integer> q = new LinkedList<>();` | `Stack<Integer> s = new Stack<>();` |

---

| _`I.`_  | _`PriorityQueue`_       | _`Normal Queue`_         |
| ------- | ----------------------- | ------------------------ |
| Order   | Based on priority       | Based on insertion order |
| Example | `new PriorityQueue<>()` | `new LinkedList<>()`     |

---

| _`J.`_   | _`Comparable`_                                 | _`Comparator`_                       |
| -------- | ---------------------------------------------- | ------------------------------------ |
| Method   | `compareTo()`                                  | `compare()`                          |
| Ordering | Natural ordering                               | Custom ordering                      |
| Location | Inside class                                   | Separate class/object                |
| Example  | `class Student implements Comparable<Student>` | `Collections.sort(list, comparator)` |

---

| _`K.`_      | _`Iterator`_                             | _`Enhanced for loop`_    |
| ----------- | ---------------------------------------- | ------------------------ |
| Flexibility | Allows remove while iterating            | Only read access         |
| Syntax      | `Iterator<String> it = list.iterator();` | `for(String s : list)`   |
| Example     | `it.remove()`                            | Not possible in for-each |

---

| _`L.`_     | _`Collection`_                              | _`Collections`_                   |
| ---------- | ------------------------------------------- | --------------------------------- |
| Definition | Root interface of collection framework      | Utility class with static methods |
| Example    | `Collection<String> c = new ArrayList<>();` | `Collections.sort(list);`         |

# Part H: Real-World Thinking Questions

1. **In a login system, where can we use HashMap ?**

   > HashMap can store **username → password** or **userId → userObject** for fast lookup.  
   > Example:
   >
   > ```java
   > Map<String, String> loginData = new HashMap<>();
   > loginData.put("alice", "password123");
   > System.out.println(loginData.get("alice")); // password123
   > ```

2. **In a course platform, where can we use ArrayList ?**

   > ArrayList can store list of **courses, lessons, or enrolled students** where order matters and duplicates are allowed.  
   > Example:
   >
   > ```java
   > List<String> courses = new ArrayList<>();
   > courses.add("Java Basics");
   > courses.add("SQL Fundamentals");
   > ```

3. **In uploaded CSV email validation, why can LinkedHashSet be useful?**

   > LinkedHashSet removes duplicates but keeps the **original upload order**.  
   > Example:
   >
   > ```java
   > Set<String> emails = new LinkedHashSet<>();
   > emails.add("a@gmail.com");
   > emails.add("b@gmail.com");
   > emails.add("a@gmail.com"); // duplicate ignored
   > ```

4. **In a support system, why can PriorityQueue be useful?**

   > PriorityQueue processes tickets based on **priority** (e.g., urgent first).  
   > Example:
   >
   > ```java
   > Queue<Integer> tickets = new PriorityQueue<>();
   > tickets.add(3); // low priority
   > tickets.add(1); // high priority
   > System.out.println(tickets.poll()); // 1
   > ```

5. **In a report sorted by date, why can TreeMap be useful?**

   > TreeMap stores keys in **sorted order**, perfect for chronological reports.  
   > Example:
   >
   > ```java
   > Map<String, Integer> report = new TreeMap<>();
   > report.put("2026-01-01", 100);
   > report.put("2026-01-03", 300);
   > report.put("2026-01-02", 200);
   > // Keys sorted automatically
   > ```

6. **In product search result, why is ArrayList usually enough?**

   > Search results are shown in order and duplicates may exist. ArrayList maintains order and allows duplicates.  
   > Example:
   >
   > ```java
   > List<String> results = new ArrayList<>();
   > results.add("Laptop");
   > results.add("Laptop"); // duplicate allowed
   > ```

7. **In role management, why is HashSet useful?**

   > Roles must be **unique** (e.g., Admin, User, Manager). HashSet ensures no duplicates.  
   > Example:
   >
   > ```java
   > Set<String> roles = new HashSet<>();
   > roles.add("Admin");
   > roles.add("User");
   > roles.add("Admin"); // ignored
   > ```

8. **In API response, why might order matter?**

   > Clients often expect data in the same order as database query. Using **List** preserves insertion order.  
   > Example:
   >
   > ```java
   > List<String> response = new ArrayList<>();
   > response.add("Row1");
   > response.add("Row2");
   > ```

9. **Why should we not select collections by habit?**

   > Each collection has different strengths. Wrong choice can cause **performance issues** or incorrect behavior.  
   > Example: Using ArrayList for frequent middle insertions → slow.

10. **Why is understanding internal working important for backend developers?**
    > Backend systems handle large data. Knowing internal working helps in **choosing the right collection** for speed, memory, and correctness.  
    > Example: HashMap for fast lookup, TreeMap for sorted data, LinkedHashSet for order + uniqueness.

# Part I: Mini Project

```
Create a small **Student Course Management System**

Classes:
--------
Student
	- id
	- name
	- email
	- marks

Course
	- id
	- name
	- students

Use these collections:
--------------
ArrayList<Student> -> store students in a course
HashSet<String> -> prevent duplicate emails
HashMap<Integer, Student> -> search student by id
TreeSet<Integer> -> sorted marks
PriorityQueue<Student> -> process lowest marks students first for extra class

Requirements:
----------------------
	1. Add at least 5 students.
	2. Reject duplicate emails.
	3. Search student by id.
	4. Print students sorted by marks using Comparator.
	5. Print unique emails.
	6. Process students for extra class based on lowest marks first.
	7. Explain why each collection was used.
```

[](./src)
