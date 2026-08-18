import java.util.concurrent.*;

public class P14_PaymentStatusWithCallable {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create a task for a specific order
        PaymentStatusTask task = new PaymentStatusTask("ORD123");

        // Submit the task and get a Future
        Future<String> future = executor.submit(task);

        try {
            // Wait for result
            String result = future.get();
            System.out.println(result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}

// Callable task that returns payment status
class PaymentStatusTask implements Callable<String> {
    private String orderId;

    PaymentStatusTask(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public String call() throws Exception {
        // Simulate payment processing
        Thread.sleep(2000); // optional, just to mimic delay
        return "Payment SUCCESS for order " + orderId;
    }
}
