import java.util.concurrent.*;

public class P17_invokeAny {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<String> providerA = new PriceProvider("Provider 1");
        Callable<String> providerB = new PriceProvider("Provider 2");
        Callable<String> providerC = new PriceProvider("Provider 3");

        try {
            // invokeAny returns the first successful result
            String result = executor.invokeAny(
                    java.util.Arrays.asList(providerA, providerB, providerC)
            );
            System.out.println("First successful result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

class PriceProvider implements Callable<String> {
    private String providerName;

    PriceProvider(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public String call() throws Exception {

        // variable response time
        Thread.sleep((long)(Math.random() * 3000));
        return "Price received from " + providerName;
    }
}



/*
2. First successful result: Price received from Provider 2
3. single line output
4. all thread returning result but invokeany taking the first one result

*/
