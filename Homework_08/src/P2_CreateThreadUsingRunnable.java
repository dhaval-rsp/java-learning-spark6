public class P2_CreateThreadUsingRunnable {
    public static void main(String[] args) {

        // Creating Runnable object to call run()
        EmailTask e = new EmailTask();

        // loading runnable obj in Thread object
        Thread t1 = new Thread(e);
        Thread t2 = new Thread(e);

        t1.start();
        t2.start();
    }
}

class EmailTask implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Sending email " + i + " by " + Thread.currentThread().getName());
        }
    }
}

/*
## Program 2: Create Thread Using Runnable

Create class EmailTask that implements Runnable .
Inside run() , print:
	Sending email by <thread-name>

Create 3 threads using same EmailTask style and start them
 */

/*
2. it will print "Sending email 1 by Thread-0" from 1 to 5 total 10 times , 5 times from each thread
3. Output order is not guaranteed
4. both thread printing Sending email 1 by Thread-1 and so on
*/

