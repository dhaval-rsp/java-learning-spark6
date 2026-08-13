import java.util.concurrent.*;
import java.util.*;

public class P15_DashboardLoading {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                new ProfileTask(),
                new OrdersTask(),
                new WalletTask()
        );

        try {
            // Run all tasks in parallel
            List<Future<String>> results = executor.invokeAll(tasks);

            // Print results
            for (Future<String> r : results) {
                System.out.println(r.get());
            }

            // After all tasks complete
            System.out.println("Dashboard ready");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

class ProfileTask implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1100); // loading profile
        return "Profile loaded";
    }
}

class OrdersTask implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(3000); // loading orders
        return "Orders loaded";
    }
}

class WalletTask implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1900); // loading wallet
        return "Wallet loaded";
    }
}





