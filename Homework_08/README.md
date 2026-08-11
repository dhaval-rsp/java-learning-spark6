# Part A: Short Answer Questions

1. **What is a thread?**
   > a\
2. **What is multithreading?**
   > a\
3. **What is the difference between process and thread?**
   > a\
   > a\
   
4. **Why do backend applications need multithreading?**
   > a\
   > a\
   
5. **What is the main thread?**
   > a\
   > a\

6. **How can we get the current thread name?**
   > a\
   
7. **What are two basic ways to create a thread in Java?**
   > a\
   
8. **What is the use of run() method?**
   > a\
   
9. **What is the use of start() method?**
   > a\
   > a\
   
10. **What is the difference between start() and run() ?**
    > a\
    > a\
	
11. **Can we start the same thread object twice?**
    > a\
    > a\

12. **What is the use of sleep() ?**
    > a\
    > a\
	
13. **Why does sleep() need exception handling?**
    > a\
    > a\
	
14. **What is the use of join() ?**
    > a\
    > a\
	
15. **Where can we use join() in a real project?**
    > a\
    > a\
	
16. **Does thread priority guarantee execution order?**
    > a\
    > a\
	
17. **What is a daemon thread?**
    > a\
    > a\
	
18. **What is a race condition?**
    > a\
    > a\
	
19. **Why does race condition happen?**
    > a\
    > a\
	
20. **What is the use of synchronized ?**
    > a\
    > a\
	
21. **What is the difference between synchronized method and synchronized block?**
    > a\
    > a\
	
22. **What is ReentrantLock ?**
    > a\
    > a\
	
23. **Why do we write unlock() inside finally ?**
    > a\
    > a\
	
24. **What is the use of tryLock() ?**
    > a\
    > a\
	
25. **What is the difference between synchronized and Lock ?**
    > a\
    > a\
	
26. **What is Executor Framework?**
    > a\
    > a\
	
27. **Why is ExecutorService better than creating raw threads again and again?**
    > a\
    > a\
	
28. **What is FixedThreadPool?**
    > a\
    > a\
	
29. **What is SingleThreadExecutor?**
    > a\
    > a\
	
30. **What is ScheduledExecutorService?**
    > a\
    > a\
	
31. **What is the difference between execute() and submit() ?**
    > a\
    > a\
	
32. **What is Callable ?**
    > a\
    > a\
	
33. **What is Future ?**
    > a\
    > a\
	
34. **What is the use of future.get() ?**
    > a\
    > a\
	
35. **What is the difference between invokeAll() and invokeAny() ?**
    > a\
    > a\

# Part B: Find The Output

## `Question 1`

```java
public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	}
}
```

```java
// Answere

```

## `Question 2`

```java
class MyThread extends Thread {
	public void run() {
		System.out.println("Running in " + Thread.currentThread().getName());
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();

		t1.run();
		t1.start();
	}
}
```

```
Write:
	Which line runs in main thread?
	Which line runs in new thread?
```

```java
// Answere

```

## `Question 3`

```java
class NumberThread extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(getName() + " " + i);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		NumberThread t1 = new NumberThread();
		NumberThread t2 = new NumberThread();

		t1.setName("Thread-A");
		t2.setName("Thread-B");

		t1.start();
		t2.start();
	}
}
```

```
Write:
	Is exact output order guaranteed?
```

```java
// Answere

```

## `Question 4`

```java
class MyThread extends Thread {
	public void run() {
		System.out.println("Thread running");
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		t1.start();
	}
}
```

```
Write:
	What exception will occur and why?
```

```java
// Answere

```

## `Question 5`

```java
class DownloadTask extends Thread {
	public void run() {
		System.out.println("Downloading file");
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		DownloadTask task = new DownloadTask();
		task.start();
		task.join();

		System.out.println("Download completed, now processing");
	}
}
```

```java
// Answere

```

## `Question 6`

```java
class Counter {
	int count = 0;

	void increment() {
		count++;
	}
}

class CounterTask extends Thread {
	Counter counter;

	CounterTask(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 1; i <= 1000; i++) {
			counter.increment();
		}
	}
}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		CounterTask t1 = new CounterTask(counter);
		CounterTask t2 = new CounterTask(counter);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(counter.count);
	}
}
```

```
Write:
	Expected value is 2000.
	Can actual output be less than 2000? Why?
```

```java
// Answere

```

## `Question 7`

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 1; i <= 4; i++) {
			int taskNumber = i;
			executor.submit(() -> {
				System.out.println("Task " + taskNumber + " by "
				+ Thread.currentThread().getName());
			});
		}

		executor.shutdown();
	}
}
```

```
Write:
	How many worker threads are in the pool?
	Is task order guaranteed?
```

```java
// Answere

```

## `Question 8`

```java
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newSingleThreadExecutor();

		Callable<Integer> task = () -> 10 + 20;

		Future<Integer> future = executor.submit(task);

		System.out.println(future.get());

		executor.shutdown();
	}
}
```

```java
// Answere

```

# Part C: Find And Fix The Problem

## `Question 1`

```java
class MyThread extends Thread {
	public void run() {
		System.out.println("Running");
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.run();
	}
}
```

```
Write:
	1. Is this multithreading?
	2. What is the mistake?
	3. Correct the code.
```

```
// Answere

```

## `Question 2`

```java
class MyThread extends Thread {
	public void run() {
		System.out.println("Running");
	}
}

public class Main {
	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.start();
		t1.start();
	}
}
```

```
Write:
	1. What exception occurs?
	2. Why does it happen?
	3. Correct the code.
```

```
// Answere

```

## `Question 3`

```java
class Counter {
	int count = 0;

	void increment() {
		count++;
	}
}
```

```
Two threads are using same Counter object.

Write:
	1. What problem can happen?
	2. Correct using synchronized method.
	3. Correct using synchronized block.
```

```
// Answere

```

## `Question 4`

```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
	int count = 0;
	Lock lock = new ReentrantLock();

	void increment() {
		lock.lock();
		count++;
	}
}
```

```
Write:
	1. What is wrong?
	2. Why can this block other threads?
	3. Correct using try-finally .
```

```
// Answere

```

## `Question 5`

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(() -> System.out.println("Task completed"));
	}
}
```

```
Write:
	1. What is missing?
	2. Why can program keep running?
	3. Correct the code.
```

```
// Answere

```

## `Question 6`

```java
Future<String> f1 = executor.submit(task1);
System.out.println(f1.get());

Future<String> f2 = executor.submit(task2);
System.out.println(f2.get());
```

```
Write:
	1. What is the design problem?
	2. Why does it reduce parallel benefit?
	3. Rewrite better approach
```

```
// Answere

```

# Part D: Coding Practice

## Program 1: Create Thread Using Thread Class

```
Create class NumberThread that extends Thread .
It should print numbers from 1 to 5.
Create two thread objects and start both.

Write:
	Is output order fixed?
```

## Program 2: Create Thread Using Runnable

```
Create class EmailTask that implements Runnable .
Inside run() , print:
	Sending email by <thread-name>
	
Create 3 threads using same EmailTask style and start them
```

## Program 3: start() vs run()

```
Create a thread and call:
	thread.run();
	thread.start();

Print current thread name inside run() .
Explain the difference.
```

## Program 4: Download Then Process

```
Create DownloadThread .
It should print:
	Downloading file...
	Download completed

Main thread should wait for download thread using join() .
After that print:
	Processing downloaded file
```

## Program 5: Order Processing With join()

```
Create three threads:
	PaymentTask
	InvoiceTask
	EmailTask
	
Rules:
	1. Payment should complete first.
	2. Invoice should generate after payment.
	3. Email should send after invoice.

Use join() to control order
```

## Program 6: Race Condition Demo

```
Create Counter class with:
	int count
	increment() method
	
Create two threads. Each thread should increment count 10000 times.
First run without synchronization.
Then fix using synchronized.

Write:
	What was the wrong output?
	What changed after synchronized?
```

## Program 7: Ticket Booking With synchronized

```
Create class TicketBooking :
	availableSeats = 1
	method bookTicket(String userName)

Create two user threads:
	Rahul
	Priya

Both should try to book ticket.
Use synchronized to avoid overbooking.
```

## Program 8: Ticket Booking With ReentrantLock

```
Create the same ticket booking example using:
	ReentrantLock

Rules:
	Use lock() .
	Use unlock() inside finally .
	Explain why finally is required.
```

## Program 9: Wallet Debit With tryLock()

```
Create class Wallet :
	balance = 5000
	method debit(String userName, double amount)

Use tryLock()

Rules:
	If lock is available, debit amount if balance is enough.
	If lock is not available, print "Please try again" .
	Create two threads trying to debit wallet.
```

## Program 10: FixedThreadPool Email Sender

```
Create array of 10 email ids.

Use:
	Executors.newFixedThreadPool(3)

Submit email sending tasks.

Print:
	Sending email to <email> by <thread-name>
```

## Program 11: SingleThreadExecutor Audit Log

```
Use:
	Executors.newSingleThreadExecutor()
	
Submit these tasks:
	Order created
	Payment completed
	Invoice generated
	Email sent

Explain why SingleThreadExecutor is useful here.
```

## Program 12: ScheduledExecutorService

```
Use ScheduledExecutorService to print:
	Checking payment status

after 3 seconds.
Then create another program to print same message every 5 seconds.
```

## Program 13: Callable And Future

```
Create MarksCalculator using Callable<Integer> .
It should return total marks of 5 subjects.
Submit using ExecutorService and print total using Future .
```

## Program 14: Payment Status With Callable

```Create PaymentStatusTask implements Callable<String> .
It should take orderId and return:
	Payment SUCCESS for order <orderId>
	
Use Future to get result.
```

## Program 15: Dashboard Loading

```
Create three Callable tasks:
	loadProfile
	loadOrders
	loadWallet
	
Each task should sleep for different time and return a message.
Run all using FixedThreadPool of 3.

Print all results and then:
	Dashboard ready
```

## Program 16: invokeAll()

```
Use invokeAll() for three Callable tasks:
	total students
	total courses
	total payments
Print all results.
```

## Program 17: invokeAny()

```
Create three Callable tasks:
	Provider A
	Provider B
	Provider C
Each returns price message.
Use invokeAny() and print first successful result.
```
[P1_PersonalDetails.java](./src/P1_PersonalDetails.java)

# Part E: Concept Mapping

```
Complete the table:
```

| \*  | Situation                           | Concept Used |
| --- | ----------------------------------- | ------------ |
| 1   | New path of execution               |              |
| 2   | Method that contains thread task    |              |
| 3   | Method that creates new thread      |              |
| 4   | Pause current thread                |              |
| 5   | Wait for another thread to finish   |              |
| 6   | Output order can change             |              |
| 7   | Multiple threads changing same data |              |
| 8   | Protect shared data simply          |              |
| 9   | Lock only small critical section    |              |
| 10  | Manual advanced locking             |              |
| 11  | Try lock without waiting forever    |              |
| 12  | Pool of reusable worker threads     |              |
| 13  | One worker, ordered execution       |              |
| 14  | Fixed number of worker threads      |              |
| 15  | Run task after delay                |              |
| 16  | Task that returns value             |              |
| 17  | Future result of task               |              |
| 18  | Run many tasks and get all result   |              |
| 19  | Get one successful result           |              |

# Part F: Difference Questions

| \*  | Process | Thread |
| --- | ------- | ------ |
| 1   | hi      | hi     |
| 2   | hello   | hello  |

| \*  | Thread | Runnable |
| --- | ------ | -------- |
| 1   | hi     | hi       |
| 2   | hello  | hello    |

| \*  | start() | run() |
| --- | ------- | ----- |
| 1   | hi      | hi    |
| 2   | hello   | hello |

| \*  | sleep() | join() |
| --- | ------- | ------ |
| 1   | hi      | hi     |
| 2   | hello   | hello  |

| \*  | User thread | Daemon thread |
| --- | ----------- | ------------- |
| 1   | hi          | hi            |
| 2   | hello       | hello         |

| \*  | Synchronized method | Synchronized block |
| --- | ------------------- | ------------------ |
| 1   | hi                  | hi                 |
| 2   | hello               | hello              |

| \*  | synchronized | ReentrantLock |
| --- | ------------ | ------------- |
| 1   | hi           | hi            |
| 2   | hello        | hello         |

| \*  | lock() | tryLock() |
| --- | ------ | --------- |
| 1   | hi     | hi        |
| 2   | hello  | hello     |

| \*  | execute() | submit() |
| --- | --------- | -------- |
| 1   | hi        | hi       |
| 2   | hello     | hello    |

| \*  | Runnable | Callable |
| --- | -------- | -------- |
| 1   | hi       | hi       |
| 2   | hello    | hello    |

| \*  | FixedThreadPool | SingleThreadExecutor |
| --- | --------------- | -------------------- |
| 1   | hi              | hi                   |
| 2   | hello           | hello                |

| \*  | FixedThreadPool | CachedThreadPool |
| --- | --------------- | ---------------- |
| 1   | hi              | hi               |
| 2   | hello           | hello            |

| \*  | shutdown() | shutdownNow() |
| --- | ---------- | ------------- |
| 1   | hi         | hi            |
| 2   | hello      | hello         |

| \*  | invokeAll() | invokeAny() |
| --- | ----------- | ----------- |
| 1   | hi          | hi          |
| 2   | hello       | hello       |

[P6_MiniProject.java](./src/P6_MiniProject.java)

# Part H: Mini Project

```

Create a mini backend-style order processing simulation.

Classes:
Order - orderId - customerName - amount
PaymentTask implements Callable<String> - returns payment status

InvoiceTask implements Callable<String> - returns invoice status

EmailTask implements Runnable - sends confirmation email
Requirements: 1. Use ExecutorService. 2. Payment task should return result using Future. 3. Invoice should run after payment success. 4. Email should run after invoice generation. 5. Print thread name in every task. 6. Shutdown ExecutorService properly.
Expected output style:
Payment SUCCESS for order 101 by pool-1-thread-1
Invoice generated for order 101 by pool-1-thread-2
Email sent to Rahul by pool-1-thread-3
Order processing completed

```

```

```
