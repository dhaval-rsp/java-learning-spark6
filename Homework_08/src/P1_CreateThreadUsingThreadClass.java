public class P1_CreateThreadUsingThreadClass {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        NumberThread t2 = new NumberThread();

        t1.start();
        t2.start();

    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " by " + Thread.currentThread().getName());
        }
    }
}


/*
2. it should print number 1 to 5 using both thread
3. Output order is not guaranteed.
4. t1 & t2 both threads start working simultaneously
7. this can be useful to get any list quickly like restaurant list in food app if one runnable used with 2 thread

*/