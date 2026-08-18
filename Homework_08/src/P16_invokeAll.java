import java.util.concurrent.*;
import java.util.*;

public class P16_invokeAll {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                new StudentTask(),
                new CourseTask(),
                new PaymentTaskNew()
        );

        try {
            // invokeAll waits for all tasks to finish
            List<Future<String>> results = executor.invokeAll(tasks);

            // Print all results
            for (Future<String> f : results) {
                System.out.println(f.get());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            executor.shutdown();
        }
    }
}

class StudentTask implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Total students: 120";
    }
}

class CourseTask implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(1500);
        return "Total courses: 15";
    }
}

class PaymentTaskNew implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Total payments: 300";
    }
}

/*
## Program 16: invokeAll()

Use invokeAll() for three Callable tasks:
	total students
	total courses
	total payments
Print all results.
 */
