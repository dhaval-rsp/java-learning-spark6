public class P3_startVSrun {
    public static void main(String[] args) {

        Email e = new Email();

        e.start();
        e.run();
    }
}

class Email extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Sending email " + i +
                    " by " + Thread.currentThread().getName());
        }
    }
}

/*
## Program 3: start() vs run()

Create a thread and call:
	thread.run();
	thread.start();

Print current thread name inside run() .
Explain the difference.
 */

/*
2. run will print Sending email 1 by main & start will print Sending email 1 by Thread-0
3. output order is guaranteed as main thread called first [e.run] Thread-0 called later which actual do the parallelism
4. main thread calling run method, e.start() creates Thread-0

Difference is simple, run is normal method so if you call from main method then main thread will start workin, start() method
actually creating new thread Thread-0
*/

