public class P1_CreateThreadUsingThreadClass {
    public static void main(String[] args) {

        // object creation to call run() using start()
        NumberThread t1 = new NumberThread();
        NumberThread t2 = new NumberThread();

        t1.start(); // automatically calls run() method of Thread class
        t2.start(); // automatically calls run() method of Thread class

    }
}

class NumberThread extends Thread {

    // run method - will be used in start()
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " by " + Thread.currentThread().getName());
        }
    }
}


/*
## Program 1: Create Thread Using Thread Class

```
Create class NumberThread that extends Thread .
It should print numbers from 1 to 5.
Create two thread objects and start both.

Write:
	Is output order fixed?
```
 */
