import java.util.concurrent.*;

public class P12_ScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        PaymentCheckOnce p = new PaymentCheckOnce();
        PaymentCheckRepeat r = new PaymentCheckRepeat();

        scheduler.schedule(p.task,3, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(r.task, 0, 5, TimeUnit.SECONDS);

        try {
            Thread.sleep(20000); // run for 20 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
        System.out.println("I am main");
    }
}

class PaymentCheckOnce{
    Runnable task = () -> System.out.println("Checking payment status");
}

class PaymentCheckRepeat{
    Runnable task = () -> System.out.println("Checking payment status on repeat");
}


