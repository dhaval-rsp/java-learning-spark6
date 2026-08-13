public class P6_RaceConditionDemo {
    public static void main(String[] args) {
        Counter c = new Counter();
        CounterTest t1 = new CounterTest(c);
        CounterTest t2 = new CounterTest(c);

        t1.start();
        t2.start();

        // waiting for thread execution so that counter get value
        try {
            t1.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            t2.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.count);
    }
}


class Counter {
    int count = 0;

    void increment() {
        synchronized (this){
            count++;
        }
    }
}

class CounterTest extends Thread{

    Counter cn; // Counter class reference

    // passing an object of Counter class "Counter counter" so that const. can access object and use it in run
    CounterTest(Counter counter){
        this.cn = counter;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++){
            cn.increment();
        }
    }
}


/*
2. expected output will be less than 2000
3. No output oreder as single lines
4. both thread doing work and increasing counter simultaneously

After synchronizing the block, the count++ block got synchronized which means at a time only one thread can look its value which ultemately make sure counting done properly, earlier both thread was checking same value like 5 at counter and then increasing it to 6 which is incorrect - one thread has to increase it to 6 and second one need to increase it to 7 that was needed.
*/