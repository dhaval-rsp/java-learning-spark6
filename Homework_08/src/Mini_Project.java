import java.util.concurrent.*;

// Main class
public class Mini_Project {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        try {
            Order order = new Order("101", "Rahul", 2500);

            // Step 1: Payment
            Future<String> paymentFuture = executor.submit(new PaymentClass(order));
            String paymentResult = paymentFuture.get(); // wait for payment
            System.out.println(paymentResult);

            // Step 2: Invoice (only if payment success)
            Future<String> invoiceFuture = executor.submit(new InvoiceClass(order));
            String invoiceResult = invoiceFuture.get(); // wait for invoice
            System.out.println(invoiceResult);

            // Step 3: Email (after invoice)
            executor.submit(new EmailClass(order)).get(); // wait for email
            System.out.println("Order processing completed");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}

// Order class
class Order {
    String orderId;
    String customerName;
    double amount;

    Order(String orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }
}

// PaymentTask
class PaymentClass implements Callable<String> {
    private Order order;

    PaymentClass(Order order) {
        this.order = order;
    }

    @Override
    public String call() throws Exception {
        // Simulate payment processing
        Thread.sleep(1000);
        return "Payment SUCCESS for order "
                + order.orderId +
                " by " + Thread.currentThread().getName();
    }
}

// InvoiceTask
class InvoiceClass implements Callable<String> {
    private Order order;

    InvoiceClass(Order order) {
        this.order = order;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Invoice generated for order "
                + order.orderId +
                " by " + Thread.currentThread().getName();
    }
}

// EmailTask
class EmailClass implements Runnable {
    private Order order;

    EmailClass(Order order) {
        this.order = order;
    }

    @Override
    public void run() {
        System.out.println("Email sent to " +
                order.customerName +
                " by " + Thread.currentThread().getName());
    }
}


