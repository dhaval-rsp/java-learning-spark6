import java.util.concurrent.*;

public class P13_CallableAndFuture {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MarksCalculator());

        try {
            // Get result from Future
            Integer totalMarks = future.get();
            System.out.println("Total marks of 5 subjects: " + totalMarks);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

class MarksCalculator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // marks of 5 subjects
        int[] marks = {100, 50, 50, 100, 50};
        int total = 0;

        for (int m : marks) {
            total += m;
        }
        return total;
    }
}

