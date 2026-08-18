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

	/*
	1. What exception occurs?
		- java.lang.IllegalThreadStateException

	2. Why does it happen?
		- A thread can only be started once.
		- After calling start(), the thread enters the "RUNNABLE" state and eventually "TERMINATED".
		- Calling start() again on the same thread object is illegal because a terminated thread cannot be restarted.

	3. Correct the code.
		- Create a new thread object if you want to start another thread.
		- Do not call start() twice on the same thread instance.
	*/
```

```java
// Answere
class MyThread extends Thread {
    public void run() {
        System.out.println("Running");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();   // ✅ valid

        // ❌ t1.start(); // would throw IllegalThreadStateException

        // ✅ Correct way: create a new thread object
        MyThread t2 = new MyThread();
        t2.start();
    }
}
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

	/*
	1. What problem can happen?
		- Two threads using the same Counter object may update 'count' simultaneously.
		- This causes a race condition: increments can overlap, leading to lost updates.
		- Example: If count = 5, two threads increment at the same time, final result may still be 6 instead of 7.

	2. Correct using synchronized method.
		- Mark the increment() method as synchronized.
		- This ensures only one thread can execute increment() at a time.

	3. Correct using synchronized block.
	- Use a synchronized block to lock only the critical section.
	- This gives more granular control and can improve performance.
```

```java
// synchronized method
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

// synchronized block
class Counter {
    int count = 0;

    void increment() {
        synchronized (this) {
            count++;
        }
    }
}
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

	/*
	1. What is wrong?
		- The code acquires the lock using lock.lock() but never releases it.
		- Without unlock(), the lock remains held forever.

	2. Why can this block other threads?
		- Locks are exclusive: only one thread can hold it at a time.
		- If unlock() is not called, other threads trying to acquire the lock will wait indefinitely.
		- This causes a deadlock-like situation where no other thread can proceed.

	3. Correct using try-finally.
		- Always release the lock in a finally block.
		- This ensures the lock is freed even if an exception occurs inside the critical section.
	*/
```

```java
// Answere
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    int count = 0;
    Lock lock = new ReentrantLock();

    void increment() {
        lock.lock();  // acquire lock
        try {
            count++;
        } finally {
            lock.unlock();  // always release lock
        }
    }
}
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

	/*
	1. What is missing?
		- The code does not call executor.shutdown().
		- Without shutdown, the thread pool remains alive, waiting for new tasks.

	2. Why can program keep running?
		- Threads created by Executors.newFixedThreadPool() are non‑daemon threads.
		- Non‑daemon threads keep the JVM alive until they are terminated.
		- Since shutdown() is not called, the JVM does not exit even after the task completes.

	3. Correct the code.
		- Always call shutdown() (or shutdownNow()) after submitting tasks.
		- Optionally, use awaitTermination() to wait for tasks to finish.
	*/
```

```java
// Answere
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> System.out.println("Task completed"));

        // ✅ Properly shut down the executor
        executor.shutdown();

        // ✅ Optionally wait for tasks to finish
        if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
    }
}
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


	1. What is the design problem?
		- The code calls f1.get() immediately after submitting task1.
		- This blocks the main thread until task1 finishes before task2 is even submitted.
		- As a result, tasks run sequentially instead of concurrently.

	2. Why does it reduce parallel benefit?
		- Because task2 is submitted only after task1 completes.
		- Even though an ExecutorService is used, the blocking get() prevents parallel execution.
		- The benefit of multiple threads is lost.

	3. Rewrite better approach
		- Submit all tasks first, then collect results later.
		- This allows tasks to run in parallel.
	*/
```

```java
// Answere
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> task1 = () -> {
            Thread.sleep(1000);
            return "Task1 done";
        };
        Callable<String> task2 = () -> {
            Thread.sleep(1000);
            return "Task2 done";
        };

        // ✅ Submit both tasks first
        Future<String> f1 = executor.submit(task1);
        Future<String> f2 = executor.submit(task2);

        // ✅ Collect results later (parallel execution)
        System.out.println(f1.get());
        System.out.println(f2.get());

        executor.shutdown();
    }
}
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

```
Output cannot be fixed as both thread works together

	1 by Thread-1
	2 by Thread-1
	1 by Thread-0
	2 by Thread-0
	3 by Thread-0
	3 by Thread-1
	4 by Thread-0
	4 by Thread-1
	5 by Thread-0
	5 by Thread-1
```

[P1_CreateThreadUsingThreadClass.java](./src/P1_CreateThreadUsingThreadClass.java)

## Program 2: Create Thread Using Runnable

```
Create class EmailTask that implements Runnable .
Inside run() , print:
	Sending email by <thread-name>

Create 3 threads using same EmailTask style and start them
```

```
- it will print "Sending email 1 by Thread-0" from 1 to 5 total 10 times , 5 times from each thread
- Output order is not guaranteed
- both thread printing Sending email 1 by Thread-1 and so on

	Sending email 1 by Thread-1
	Sending email 1 by Thread-0
	Sending email 2 by Thread-0
	Sending email 2 by Thread-1
	Sending email 3 by Thread-0
	Sending email 4 by Thread-0
	Sending email 5 by Thread-0
	Sending email 3 by Thread-1
	Sending email 4 by Thread-1
	Sending email 5 by Thread-1
```

[P2_CreateThreadUsingRunnable.java](./src/P2_CreateThreadUsingRunnable.java)

## Program 3: start() vs run()

```
Create a thread and call:
	thread.run();
	thread.start();

Print current thread name inside run() .
Explain the difference.
```

```
- run will print Sending email 1 by main & start will print Sending email 1 by Thread-0
- output order is guaranteed as main thread called first [e.run] Thread-0 called later which actual do the parallelism
- output order wont be guarnteed if you call e.start() because then it will initiate parallelism and main thread after that also start working
- main thread calling run method, e.start() creates Thread-0

	thread.run();
	thread.start();
------------------------------
	Sending email 1 by main
	Sending email 2 by main
	Sending email 3 by main
	Sending email 4 by main
	Sending email 5 by main
	Sending email 1 by Thread-0
	Sending email 2 by Thread-0
	Sending email 3 by Thread-0
	Sending email 4 by Thread-0
	Sending email 5 by Thread-0

	thread.start();
	thread.run();
------------------------------
	Sending email 1 by main
	Sending email 2 by main
	Sending email 1 by Thread-0
	Sending email 2 by Thread-0
	Sending email 3 by Thread-0
	Sending email 4 by Thread-0
	Sending email 5 by Thread-0
	Sending email 3 by main
	Sending email 4 by main
	Sending email 5 by main
```

[P3_startVSrun.java](./src/P3_startVSrun.java)

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

```
- prints stament one by one "Downloading file...", "Download completed", "Processing downloaded file"
- Output cannot be changed because for child thread the print statement is in order, download first then complete
- And for main thread we have used join statement which means it will wait for download/child thread to finish its work then proceed to print main thread stament
- main thread prints statement "Processing downloaded file" & first two statement printed by download thead
- in real life this is useful for this purpose only to make sure file should open once it is downloaded not before that

	Downloading file...
	Download completed
	Processing downloaded file
```

[P4_DownloadThenProcess.java](./src/P4_DownloadThenProcess.java)

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

```
- Payment done, Invoice generated, email sent, I am main thread
- Order cannot be changed as join is used after every thread executed which make sure one thread finishes first before starting second
- Payment thread prints "payment completed", Invoice thread prints "invoice generated", email thread prints "email sent", main thread prints "I am main"
- In real life we can use this method to control flow of certain thread but in limit other wise it wont be any use of multithreading

	Payment completed by Payment-Thread
	Invoice generated by Invoice-Thread
	Email sent by Email-Thread
	All child Thread done I am main thread
```

[P5_OrderProcessingWithjoin.java](./src/P5_OrderProcessingWithjoin.java)

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

```
- expected output will be less than 2000 without synchronized block
- No output oreder as single lines
- both thread doing work and increasing counter simultaneously
- After synchronizing the block, the count++ block got synchronized which means at a time only one thread can look its value which ultemately make sure counting done properly,
- earlier both thread was checking same value like 5 at counter and then increasing it to 6 which is incorrect - one thread should do 5 --> 6 and second thread should do 6 --> 7
- with synchronized we made sure at a time only one thread can view value of counter to avoid incorrect increment

```

[P6_RaceConditionDemo.java](./src/P6_RaceConditionDemo.java)

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

```
- Rahul is booking ticket then Priya could not check bookTicket method as it is synchronized
- priya try again, meanwhile Rahul booking successful, now Priya can enter into bookTicket method and proceed
- output is guaranteed as synchronized is used
- t1 booking ticket for Rahul t2 booking ticket for Priya
- synchronized (this) is protecting ticket booking logic which make sures at a time only one person can book ticket which make sures number of tickets booked = number of people booked
- in real life we use this kinda logic for ticket booking, wallet debit credit, payment service etc etc.

	Rahul is booking ticket
	Rahul booking successful
	Priya no seat available
```

[P7_TicketBookingWithsync.java](./src/P7_TicketBookingWithsync.java)

## Program 8: Ticket Booking With ReentrantLock

```
Create the same ticket booking example using:
	ReentrantLock

Rules:
	Use lock() .
	Use unlock() inside finally .
	Explain why finally is required.
```

```
- jay & jatin books ticket together >> suppose jay got lock he moves forward >> jatin got message of que >> jay books successfully & unlock the lock >> now jatin move forwards
- output is guaranteed as lock used
- t1 booking ticket for jay t2 booking ticket for jatin
- lock is protecting ticket booking logic which make sures at a time only one person can book ticket which make sures number of tickets booked = number of people booked
- in real life we use this kinda logic for ticket booking, wallet debit credit, payment service etc etc.
```

[P8_TicketBookingWithReentrantLock.java](./src/P8_TicketBookingWithReentrantLock.java)

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

```

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

| \*  | Situation                           | Concept Used               |
| --- | ----------------------------------- | -------------------------- |
| 1   | New path of execution               | `start()` method           |
| 2   | Method that contains thread task    | `run()` method             |
| 3   | Method that creates new thread      | `Thread` + `start()`       |
| 4   | Pause current thread                | `sleep()`                  |
| 5   | Wait for another thread to finish   | `join()`                   |
| 6   | Output order can change             | Thread scheduling          |
| 7   | Multiple threads changing same data | Race condition             |
| 8   | Protect shared data simply          | `synchronized` keyword     |
| 9   | Lock only small critical section    | Synchronized block         |
| 10  | Manual advanced locking             | `ReentrantLock`            |
| 11  | Try lock without waiting forever    | `tryLock()`                |
| 12  | Pool of reusable worker threads     | Executor Framework         |
| 13  | One worker, ordered execution       | `SingleThreadExecutor`     |
| 14  | Fixed number of worker threads      | `FixedThreadPool`          |
| 15  | Run task after delay                | `ScheduledExecutorService` |
| 16  | Task that returns value             | `Callable`                 |
| 17  | Future result of task               | `Future`                   |
| 18  | Run many tasks and get all result   | `invokeAll()`              |
| 19  | Get one successful result           | `invokeAny()`              |

# Part F: Difference Questions

| \*  | `Process`                                             | `Thread`                                                    |
| --- | ----------------------------------------------------- | ----------------------------------------------------------- |
| 1   | Independent execution unit with its own memory space. | Lightweight unit inside a process, shares memory/resources. |
| 2   | More resource‑intensive, slower to create.            | Less resource‑intensive, faster to create.                  |
| 3   | Communication between processes is complex (IPC).     | Communication between threads is easy (shared memory).      |
| 4   | Crash of one process does not affect others.          | Crash of one thread can affect the whole process.           |

---

| \*  | `Thread`                                                 | `Runnable`                                                |
| --- | -------------------------------------------------------- | --------------------------------------------------------- |
| 1   | A class you extend to create a thread.                   | An interface you implement, then pass to a Thread object. |
| 2   | Cannot extend another class if already extending Thread. | Allows multiple inheritance (via interfaces).             |
| 3   | Less flexible, tightly coupled.                          | More flexible, promotes loose coupling.                   |
| 4   | Directly represents a thread of execution.               | Represents a task to be executed by a thread.             |

---

| \*  | `start()`                                              | `run()`                                       |
| --- | ------------------------------------------------------ | --------------------------------------------- |
| 1   | Creates a new thread and calls `run()` asynchronously. | Normal method call, no new thread created.    |
| 2   | Executes in parallel with other threads.               | Executes sequentially in the same thread.     |
| 3   | Can be called only once per thread object.             | Can be called multiple times like any method. |
| 4   | Throws `IllegalThreadStateException` if called twice.  | No exception, just executes normally.         |

---

| \*  | `sleep()`                               | `join()`                                         |
| --- | --------------------------------------- | ------------------------------------------------ |
| 1   | Pauses current thread for a given time. | Makes one thread wait until another finishes.    |
| 2   | Used for delays.                        | Used for synchronization between threads.        |
| 3   | Does not release locks.                 | Releases CPU for other threads while waiting.    |
| 4   | Static method of Thread class.          | Instance method called on another thread object. |

---

| \*  | `User thread`                                  | `Daemon thread`                                       |
| --- | ---------------------------------------------- | ----------------------------------------------------- |
| 1   | Keeps JVM alive until finished.                | JVM exits when only daemon threads remain.            |
| 2   | Used for main tasks (e.g., application logic). | Used for background tasks (e.g., garbage collection). |
| 3   | Default type of thread.                        | Must be explicitly set as daemon.                     |
| 4   | Important for application completion.          | Supports user threads, not critical for completion.   |

---

| \*  | `Synchronized method`                  | `Synchronized block`                       |
| --- | -------------------------------------- | ------------------------------------------ |
| 1   | Locks entire method.                   | Locks only chosen section of code.         |
| 2   | Less granular, may reduce performance. | More granular, better performance control. |
| 3   | Easier to implement.                   | More flexible, can lock specific objects.  |
| 4   | May block unnecessary code.            | Restricts lock to critical section only.   |

---

| \*  | `synchronized`                          | `ReentrantLock`                                    |
| --- | --------------------------------------- | -------------------------------------------------- |
| 1   | Implicit, simpler, JVM‑managed.         | Explicit, flexible, developer‑controlled.          |
| 2   | No advanced features.                   | Provides tryLock, fairness, interruptible locking. |
| 3   | Automatically released when block ends. | Must be manually unlocked.                         |
| 4   | Cannot check lock status.               | Can check if lock is held.                         |

---

| \*  | `lock()`                             | `tryLock()`                                   |
| --- | ------------------------------------ | --------------------------------------------- |
| 1   | Waits until lock is acquired.        | Attempts to acquire lock immediately.         |
| 2   | May block indefinitely.              | Returns `false` if lock unavailable.          |
| 3   | Suitable when waiting is acceptable. | Suitable when you want non‑blocking behavior. |
| 4   | No timeout option.                   | Can use timeout version of tryLock.           |

---

| \*  | `execute()`                         | `submit()`                                    |
| --- | ----------------------------------- | --------------------------------------------- |
| 1   | Runs task, no result returned.      | Runs task, returns a `Future`.                |
| 2   | Suitable for fire‑and‑forget tasks. | Suitable when you need results or exceptions. |
| 3   | Accepts only Runnable.              | Accepts Runnable and Callable.                |
| 4   | No way to track completion.         | Can track completion via Future.              |

---

| \*  | `Runnable`                           | `Callable`                          |
| --- | ------------------------------------ | ----------------------------------- |
| 1   | No return value.                     | Returns a value.                    |
| 2   | Cannot throw checked exceptions.     | Can throw checked exceptions.       |
| 3   | Used with `execute()` or `submit()`. | Used only with `submit()`.          |
| 4   | Functional interface with `run()`.   | Functional interface with `call()`. |

---

| \*  | `FixedThreadPool`                  | `SingleThreadExecutor`                   |
| --- | ---------------------------------- | ---------------------------------------- |
| 1   | Pool with fixed number of threads. | Only one thread.                         |
| 2   | Tasks run in parallel.             | Tasks run sequentially in order.         |
| 3   | Good for parallel workloads.       | Good for ordered, single‑threaded tasks. |
| 4   | Multiple threads share workload.   | Ensures strict task ordering.            |

---

| \*  | `FixedThreadPool`                    | `CachedThreadPool`                               |
| --- | ------------------------------------ | ------------------------------------------------ |
| 1   | Fixed number of threads.             | Creates new threads as needed.                   |
| 2   | Stable workload handling.            | Good for many short tasks.                       |
| 3   | Prevents unlimited thread growth.    | Can grow dynamically, may cause resource issues. |
| 4   | Threads remain alive until shutdown. | Idle threads terminated after 60 seconds.        |

---

| \*  | `shutdown()`                                            | `shutdownNow()`                         |
| --- | ------------------------------------------------------- | --------------------------------------- |
| 1   | Graceful shutdown, waits for submitted tasks to finish. | Attempts to stop all tasks immediately. |
| 2   | No interruption of running tasks.                       | Interrupts running tasks.               |
| 3   | Returns nothing.                                        | Returns list of pending tasks.          |
| 4   | Safer for production use.                               | Risky, may leave tasks incomplete.      |

---

| \*  | `invokeAll()`                                 | `invokeAny()`                                                |
| --- | --------------------------------------------- | ------------------------------------------------------------ |
| 1   | Runs multiple tasks, waits for all to finish. | Runs multiple tasks, returns result of first successful one. |
| 2   | Returns list of Futures.                      | Returns single result.                                       |
| 3   | Useful when all results are needed.           | Useful when only one fastest result is needed.               |
| 4   | May take longer (waits for all).              | Faster (stops after first success).                          |

# Part G: Real-World Thinking Questions

1. **In a course enrollment system, why can race condition happen?**

   > When multiple students try to enroll in the same course at the same time, threads may update the seat count simultaneously.  
   > Example: Two students click "Enroll" at the same moment. Without synchronization, both may succeed, leading to overbooking.  
   > Simply, if one seat available and 2 students books then both will get registered if synchronization is not there.

2. **In ticket booking, why should only one thread book the last seat?**

   > If two threads book the last seat `concurrently`, both may think it’s available.  
   > Example: Two users attempt to book the final movie ticket. Synchronization ensures only one succeeds, preventing duplicate bookings.

3. **In wallet debit, why is locking important?**

   > Locking ensures atomic updates to the balance. Without it, two debit operations could withdraw more than the wallet balance.  
   > Example: Balance = ₹1000. Two threads debit ₹800 each. Without locking, both succeed, leaving balance = -₹600.

4. **In bulk email sending, why is ExecutorService better than raw threads?**

   > ExecutorService reuses a pool of threads, reducing overhead. Raw threads for each email would be costly and inefficient.  
   > Example: Sending 10,000 promotional emails — ExecutorService manages with a fixed pool instead of creating 10,000 threads.

5. **In audit logging, why can SingleThreadExecutor be useful?**

   > Logs must be written in order. A single thread ensures sequential, consistent logging without race conditions.  
   > Example: Multiple transactions log entries. SingleThreadExecutor guarantees logs appear in the correct chronological order.

6. **In dashboard loading, why can multiple Callable tasks improve waiting time?**

   > Different widgets (charts, stats, notifications) can load in parallel. Callable tasks return results asynchronously, reducing total wait time.  
   > Example: Instead of loading charts one by one, all widgets are fetched simultaneously, making the dashboard appear faster.

7. **In payment status checking, where can ScheduledExecutorService be used?**

   > To periodically check payment status until confirmation arrives. Scheduled tasks automate repeated checks.  
   > Example: Every 10 seconds, a task queries the payment gateway until "Success" is returned.

8. **In external price provider system, where can invokeAny() be useful?**

   > When querying multiple providers for a stock/commodity price, you only need the fastest valid response.  
   > Example: Three APIs provide gold prices. `invokeAny()` returns the first successful result and cancels the rest.

9. **Why should `Future.get()` not be called too early after each submit?**

   > Because `get()` blocks until completion. Calling it immediately serializes tasks, reducing parallelism.  
   > Example: Submitting 5 tasks and calling `get()` right after each submit makes them run one by one instead of concurrently.

10. **Why should `unlock()` always be inside finally?**

    > If an exception occurs inside the critical section, the lock must still be released.  
    > Putting `unlock()` in `finally` guarantees release, preventing deadlocks.  
    > Example: In ticket booking, if an exception occurs while deducting payment, `unlock()` in `finally` ensures other threads can still book.

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
