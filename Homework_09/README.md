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

## Question 2

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

## Question 3

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

## Question 4

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

## Question 5

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

## Question 6

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

## Question 7

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

## Question 8

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

## Question 9

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

## Question 10

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

```java
// Answer

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

```java
// Answer

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

```java
// Answer

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

```java
// Answer

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

```java
// Answer

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

```java
// Answer

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

```java
// Answer

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

```java
// Answer

```

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

```java
// Answer

```

# Part D: Find And Fix The Problem

## Program 16: invokeAll()

```

```

```

```

[](./src)

## Program 17: invokeAny()

```

```

```

```

[](./src)

# Part E: Coding Practice

## Program 1: Create Thread Using Runnable

```

```

```

```

[](./src)

## Program 2: Create Thread Using Runnable

```

```

```

```

[](./src)

## Program 3: start() vs run()

```

```

```

```

[](./src)

## Program 4: Download Then Process

```

```

```

```

[](./src)

## Program 5: Order Processing With join()

```

```

```

```

[](./src)

## Program 6: Race Condition Demo

```

```

```

```

[](./src)

## Program 7: Ticket Booking With synchronized

```

```

```

```

[](./src)

## Program 8: Ticket Booking With ReentrantLock

```

```

```

```

[](./src)

## Program 9: Wallet Debit With tryLock()

```

```

```

```

[](./src)

## Program 10: FixedThreadPool Email Sender

```

```

```

```

[](./src)

## Program 11: SingleThreadExecutor Audit Log

```

```

```

```

[](./src)

## Program 12: ScheduledExecutorService

```

```

```

```

[](./src)

## Program 13: Callable And Future

```

```

```

```

[](./src)

## Program 14: Payment Status With Callable

```

```

```

```

[](./src)

## Program 15: Dashboard Loading

```

```

```

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

| `A.`       | `Array`                          | `ArrayList`                                    |
| ---------- | -------------------------------- | ---------------------------------------------- |
| Definition | Fixed-size data structure        | Resizable collection class                     |
| Size       | Cannot grow/shrink               | Grows/shrinks dynamically                      |
| Type       | Can store primitives and objects | Stores only objects (use wrapper classes)      |
| Example    | `int[] arr = new int[5];`        | `ArrayList<Integer> list = new ArrayList<>();` |

---

| `B.`               | `ArrayList`                       | `LinkedList`                         |
| ------------------ | --------------------------------- | ------------------------------------ |
| Internal Structure | Dynamic array                     | Doubly linked list                   |
| Access             | Fast random access (`get(index)`) | Slow random access (traverses nodes) |
| Insert/Delete      | Costly (shifting elements)        | Efficient (adjusts links)            |
| Example            | `new ArrayList<>()`               | `new LinkedList<>()`                 |

---

| `C.`       | `List`                                | `Set`                              |
| ---------- | ------------------------------------- | ---------------------------------- |
| Duplicates | Allowed                               | Not allowed                        |
| Order      | Maintains insertion order             | Depends on implementation          |
| Example    | `List<String> l = new ArrayList<>();` | `Set<String> s = new HashSet<>();` |

---

| `D.`        | `HashSet`           | `LinkedHashSet`                          |
| ----------- | ------------------- | ---------------------------------------- |
| Order       | No order guaranteed | Maintains insertion order                |
| Performance | Slightly faster     | Slightly slower due to order maintenance |
| Example     | `new HashSet<>()`   | `new LinkedHashSet<>()`                  |

---

| `E.`    | `HashSet`           | `TreeSet`                       |
| ------- | ------------------- | ------------------------------- |
| Order   | No order guaranteed | Stores elements in sorted order |
| Nulls   | Allows one null     | Does not allow null             |
| Example | `new HashSet<>()`   | `new TreeSet<>()`               |

---

| `F.`     | `HashMap`           | `LinkedHashMap`                   |
| -------- | ------------------- | --------------------------------- |
| Order    | No order guaranteed | Maintains insertion order of keys |
| Use Case | Fast lookup         | Predictable iteration order       |
| Example  | `new HashMap<>()`   | `new LinkedHashMap<>()`           |

---

| `G.`        | `HashMap`           | `TreeMap`                   |
| ----------- | ------------------- | --------------------------- |
| Order       | No order guaranteed | Keys stored in sorted order |
| Performance | Faster              | Slower due to sorting       |
| Example     | `new HashMap<>()`   | `new TreeMap<>()`           |

---

| `H.`      | `Queue`                                  | `Stack`                             |
| --------- | ---------------------------------------- | ----------------------------------- |
| Principle | FIFO (First In First Out)                | LIFO (Last In First Out)            |
| Example   | `Queue<Integer> q = new LinkedList<>();` | `Stack<Integer> s = new Stack<>();` |

---

| `I.`    | `PriorityQueue`         | `Normal Queue`           |
| ------- | ----------------------- | ------------------------ |
| Order   | Based on priority       | Based on insertion order |
| Example | `new PriorityQueue<>()` | `new LinkedList<>()`     |

---

| `J.`     | `Comparable`                                   | `Comparator`                         |
| -------- | ---------------------------------------------- | ------------------------------------ |
| Method   | `compareTo()`                                  | `compare()`                          |
| Ordering | Natural ordering                               | Custom ordering                      |
| Location | Inside class                                   | Separate class/object                |
| Example  | `class Student implements Comparable<Student>` | `Collections.sort(list, comparator)` |

---

| `K.`        | `Iterator`                               | `Enhanced for loop`      |
| ----------- | ---------------------------------------- | ------------------------ |
| Flexibility | Allows remove while iterating            | Only read access         |
| Syntax      | `Iterator<String> it = list.iterator();` | `for(String s : list)`   |
| Example     | `it.remove()`                            | Not possible in for-each |

---

| `L.`       | `Collection`                                | `Collections`                     |
| ---------- | ------------------------------------------- | --------------------------------- |
| Definition | Root interface of collection framework      | Utility class with static methods |
| Example    | `Collection<String> c = new ArrayList<>();` | `Collections.sort(list);`         |

# Part H: Real-World Thinking Questions

1. **In a login system, where can we use HashMap ?**
2. **In a course platform, where can we use ArrayList ?**
3. **In uploaded CSV email validation, why can LinkedHashSet be useful?**
4. **In a support system, why can PriorityQueue be useful?**
5. **In a report sorted by date, why can TreeMap be useful?**
6. **In product search result, why is ArrayList usually enough?**
7. **In role management, why is HashSet useful?**
   Genie Ashwani
8. **In API response, why might order matter?**
9. **Why should we not select collections by habit?**
10. **Why is understanding internal working important for backend developers?**

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
