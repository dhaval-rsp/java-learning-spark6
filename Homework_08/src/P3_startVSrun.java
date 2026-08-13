public class P3_startVSrun {
    public static void main(String[] args) {
        Email e = new Email();

        e.run();
        e.start();
    }
}

class Email extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <=5; i++) {
            System.out.println("Sending email " + i + " by " + Thread.currentThread().getName());
        }
    }
}



/*
2. run will print Sending email 1 by main & start will print Sending email 1 by Thread-0
3. output order is not guaranteed as main thread + Thread-0 both has same priority
4. main thread calling run method, Thread-0 calling new

Difference is simple, run is normal method so if you call from main method then main thread will start workin, start() method
actually creating new thread Thread-0
*/