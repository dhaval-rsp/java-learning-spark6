public class P2_CreateThreadUsingRunnable {
    public static void main(String[] args) {
        EmailTask e = new EmailTask(); // Runnable object

        Thread t1 = new Thread(e); // Thread object with runnable object
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
2. it will print "Sending email 1 by Thread-0" from 1 to 5 total 10 times , 5 times from each thread
3. Output order is not guaranteed
4. both thread printing Sending email 1 by Thread-1 and so on
*/