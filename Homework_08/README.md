# Part A: Short Answer Questions

1. **What is a `thread` ?**

   > A thread is a lightweight unit of execution within a process.  
   > Example: In Java, `Thread t = new Thread();`

2. **What is `multithreading` ?**

   > Multithreading is the ability of a program to run multiple threads concurrently.  
   > Example: A web server handling multiple client requests at the same time.

3. **What is the `difference` between `process` and `thread` ?**

   > Process → Independent execution unit with its own memory.  
   > Thread → Subset of a process, shares memory/resources with other threads.

4. **Why do backend applications need multithreading?**

   > To handle multiple client requests simultaneously, improve throughput, and keep servers responsive.

5. **What is the `main` thread?**

   > The default thread that starts when a Java program runs (`public static void main`).

6. **How can we get the current thread name?**

   ```java
   System.out.println(Thread.currentThread().getName());
   ```

7. **What are two basic ways to create a thread in Java?**

   > Extend `Thread` class and override `run()`.\
   > Implement Runnable interface and pass it to a Thread.\

8. **What is the use of run() method?**

   > Contains the code that the thread executes.\

9. **What is the use of start() method?**

   > Starts a new thread and internally calls `run()` asynchronously.\

10. **What is the difference between start() and run() ?**

    > `start()` → Creates a new thread and executes `run()` in parallel.\
    > `run()` → Just a normal method call, no new thread is created.\

11. **Can we start the same thread object twice?**

    > ❌ No, it throws `IllegalThreadStateException`.

12. **What is the use of sleep()?**

    > Pauses the current thread for a given time.

    ```java
    Thread.sleep(1000); // sleep for 1 second
    ```

13. **Why does `sleep()` need exception handling?**

    > It throws `InterruptedException` if another thread interrupts it.

14. **What is the use of `join()` ?**

    > Makes one thread wait until another finishes execution.

15. **Where can we use `join()` in a real project?**

    > Example: Waiting for worker threads to finish before aggregating results in a report.

16. **Does thread priority guarantee execution order?**

    > ❌ No, it’s only a hint to the scheduler.

17. **What is a `daemon` thread?**

    > A background thread that runs until all user threads finish (e.g., garbage collector).

18. **What is a `race` condition?**

    > When multiple threads access shared data simultaneously and results depend on timing.

19. **Why does race condition happen?**

    > Lack of synchronization on shared resources.

20. **What is the use of `synchronized` ?**

    > Ensures only one thread can access a block/method at a time.

21. **What is the difference between `synchronized method` and `synchronized block` ?**

    > Method → Locks the entire method.  
    > Block → Locks only the specific section of code.

22. **What is `ReentrantLock` ?**

    > A lock with advanced features (fairness, tryLock, interruptible locking).

23. **Why do we write `unlock()` inside finally?**

    > To ensure lock release even if exceptions occur.

24. **What is the use of `tryLock()` ?**

    > Attempts to acquire lock without waiting; returns `true` if successful.

25. **What is the difference between synchronized and Lock?**

    > `synchronized` → Implicit, simpler, JVM-managed.  
    > `Lock` → Explicit, more flexible, supports features like tryLock, fairness.

26. **What is `Executor` Framework?**

    > High-level API to manage thread pools instead of manual thread creation.

27. **Why is ExecutorService better than creating raw threads again and again?**

    > Reuses threads, reduces overhead, provides better control.

28. **What is `FixedThreadPool` ?**

    > Pool with a fixed number of threads.

    ```java
    ExecutorService pool = Executors.newFixedThreadPool(5);
    ```

29. **What is `SingleThreadExecutor` ?**

    > Executes tasks sequentially with one thread.

30. **What is ScheduledExecutorService?**

    > Executes tasks after a delay or periodically.

    ```java
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    ```

31. **What is the difference between execute() and submit()?**

    > `execute()` → Runs a task, no result returned.  
    > `submit()` → Runs a task and returns a `Future`.

32. **What is Callable?**

    > Similar to `Runnable` but returns a value and can throw exceptions.

33. **What is `Future` ?**

    > Represents the result of an asynchronous computation.

34. **What is the use of `future.get()` ?**

    > Retrieves the result of a `Callable`; blocks until computation finishes.

35. **What is the difference between invokeAll() and invokeAny()?**
    > `invokeAll()` → Runs multiple tasks, waits for all to finish, returns list of Futures.  
    > `invokeAny()` → Runs multiple tasks, returns result of the first successful one, cancels others.

# Part B: Find The Output

## `Question 1`

```java
public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	}
}
```

```
// Answere

main --> as program running from main thread
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

```
// Answere

Running in main --> as t1.run is calling method from main
Running in Thread-0 --> as t1.start actually creating new thread
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

```
// Answere

Order is not guaranteed here, because in run method simple 1 to 3 loop is running
When we create t1.start and t2.start thread JVM call both thread randomly

Thread-A 1
Thread-A 3
Thread-A 2
Thread-B 1
Thread-B 2
Thread-B 3
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

```
// Answere

IllegalThreadStateException exception because with same object t1 we are creating thread 2 times

sometime when first t1 executed then it will give "Thread running" after that again generates exception

In short for second call there will be exception so if second call executes first then direct exception other wise one time thread will run
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

```
// Answere

Downloading file
Download completed, now processing
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

```
// Answere

It is race condition,
Since increment method is without synchronization race will occur which means increment codition called by both thread simultaneosly.
Due to race condtion both thread will try to increase counter from 0 --> 1 only but originally suppose one thread increased 0 --> 1 then second has to increas from 1 --> 2
But since both are unaware about each other they will increase in same number so output will not be exact 2000
It will be less than 2000
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

```
// Answere
we have given 2 worker thread in pool
Order of task is not guaranteed

Task 2 by pool-1-thread-2
Task 1 by pool-1-thread-1
Task 3 by pool-1-thread-2
Task 4 by pool-1-thread-1
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

```
// Answere
30
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

1. Is this multithreading?
   No.
   In the given code, `t1.run()` is called directly. That’s just a normal method call on the main thread.
   No new thread is created, so the program is still.

2. What is the mistake?
   The mistake is calling `run()` instead of `start()`.
   - `run()` → Executes like a normal method, no new thread.
   - `start()` → Creates a new thread and internally calls `run()` on that new thread.
```

```java
// 3. Correct the code.
class MyThread extends Thread {
	public void run() {
		System.out.println("Running");
	}
}

public class Main {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();  // ✅ Correct way to start a new thread
	}
}
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

```java
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

```java
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

```java
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

```java
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

```java
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

[](./src)

## Program 2: Create Thread Using Runnable

```
Create class EmailTask that implements Runnable .
Inside run() , print:
	Sending email by <thread-name>

Create 3 threads using same EmailTask style and start them
```

[](./src)

## Program 3: start() vs run()

```
Create a thread and call:
	thread.run();
	thread.start();

Print current thread name inside run() .
Explain the difference.
```

[](./src)

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

[](./src)

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

[](./src)

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

[](./src)

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

[](./src)

## Program 8: Ticket Booking With ReentrantLock

```
Create the same ticket booking example using:
	ReentrantLock

Rules:
	Use lock() .
	Use unlock() inside finally .
	Explain why finally is required.
```

[](./src)

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

[](./src)

## Program 10: FixedThreadPool Email Sender

```
Create array of 10 email ids.

Use:
	Executors.newFixedThreadPool(3)

Submit email sending tasks.

Print:
	Sending email to <email> by <thread-name>
```

[](./src)

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

[](./src)

## Program 12: ScheduledExecutorService

```
Use ScheduledExecutorService to print:
	Checking payment status

after 3 seconds.
Then create another program to print same message every 5 seconds.
```

[](./src)

## Program 13: Callable And Future

```
Create MarksCalculator using Callable<Integer> .
It should return total marks of 5 subjects.
Submit using ExecutorService and print total using Future .
```

[](./src)

## Program 14: Payment Status With Callable

```Create PaymentStatusTask implements Callable<String> .
It should take orderId and return:
	Payment SUCCESS for order <orderId>

Use Future to get result.
```

[](./src)

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

[](./src)

## Program 16: invokeAll()

```
Use invokeAll() for three Callable tasks:
	total students
	total courses
	total payments
Print all results.
```

[](./src)

## Program 17: invokeAny()

```
Create three Callable tasks:
	Provider A
	Provider B
	Provider C
Each returns price message.
Use invokeAny() and print first successful result.
```

[](./src)

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
