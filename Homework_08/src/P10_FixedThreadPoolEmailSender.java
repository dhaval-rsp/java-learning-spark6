import java.util.concurrent.*;

public class P10_FixedThreadPoolEmailSender {
    public static void main(String[] args) {

        String[] emails = {
                "dhoni@gmail.com",
                "viru@gmail.com",
                "gautam@gmail.com",
                "raina@gmail.com",
                "rohit@gmail.com",
                "kohli@gmail.com",
                "bumrah@gmail.com",
                "sachin@gmail.com",
                "yuvi@gmail.com",
                "jaddu@gmail.com"
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (String email : emails) {
            executor.submit(new EmailTaskNew(email));
        }
        executor.shutdown();
    }
}

class EmailTaskNew implements Runnable {

    private String email;

    EmailTaskNew(String email) {
        this.email = email;
    }

    @Override
    public void run() {
        System.out.println("Sending email to " + email + " by " + Thread.currentThread().getName());
    }
}

/*
## Program 10: FixedThreadPool Email Sender

Create array of 10 email ids.

Use:
	Executors.newFixedThreadPool(3)

Submit email sending tasks.

Print:
	Sending email to <email> by <thread-name>
 */
/*
2. expected output will be printing Sending email to gautam@gmail.com by pool-1-thread-3 and so on for all 10 emails by diff thread
3. output order is not guaranteed as any email can be sent as per thread availability
4. thread-1 thread-2 thread-3 all of them sending emails
7. it is simply can be used when bulk notification has to be sent
*/
