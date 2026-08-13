import java.util.concurrent.*;

public class P11_SingleThreadExecutorAuditLog {

    public static void main(String[] args) {
        // SingleThreadExecutor ensures tasks run sequentially in order
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(new AuditTask("Order created"));
        executor.submit(new AuditTask("Payment completed"));
        executor.submit(new AuditTask("Invoice generated"));
        executor.submit(new AuditTask("Email sent"));

        executor.shutdown();
    }
}

class AuditTask implements Runnable {
    private String message;

    AuditTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message + " by " + Thread.currentThread().getName());
    }
}


