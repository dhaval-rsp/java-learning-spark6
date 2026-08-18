import java.util.concurrent.locks.*;

public class P9_WalletDebitWithtryLock {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();

        WalletThread t1 = new WalletThread(wallet, "Rahul", -3000);
        WalletThread t2 = new WalletThread(wallet, "Priya", 3000);

        t1.start();
        t2.start();
    }
}

class Wallet {

    double balance = 5000;
    Lock lock = new ReentrantLock(); // ReentrantLock object for critical section

    void debitAmount(String userName, double amount) {

        if (amount < 0) {
            System.out.println(userName + " Cannot Debit Negative Amount");
            return; // exit early, no lock needed
        }

        if (amount > balance) {
            System.out.println(userName + " insufficient balance");
            return; // exit early, no lock needed
        }

        // Only lock if the requested amount is valid
        boolean locked = lock.tryLock();
        if (locked) {
            try {
                System.out.println(userName + " is debiting " + amount);
                try {
                    Thread.sleep(2000); // debiting in process
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                balance -= amount; // adjusting balance as per amount debited
                System.out.println(userName + " debit successful. Remaining balance: " + balance);
            }
            finally {
                lock.unlock();  // always release lock
            }
        }
        else {
            System.out.println(userName + " Please try again - currently payment is in process");
        }
    }
}

class WalletThread extends Thread {
    Wallet wallet;
    String userName;
    double amount;

    WalletThread(Wallet wallet, String userName, double amount) {
        this.wallet = wallet;
        this.userName = userName;
        this.amount = amount;
    }

    @Override
    public void run() {
        wallet.debitAmount(userName, amount);
    }
}

/*
## Program 9: Wallet Debit With tryLock()

Create class Wallet :
	balance = 5000
	method debit(String userName, double amount)

Use tryLock()

Rules:
	If lock is available, debit amount if balance is enough.
	If lock is not available, print "Please try again" .
	Create two threads trying to debit wallet.
 */

/*
2.Priya Please try again - currently payment is in process
Rahul is debiting 3000.0
Rahul debit successful. Remaining balance: 2000.0

3. Output order not changed as lock aquire
4. t1 thread doing payment for rahul t2 thread doing payment for priya
5. lock is protecting debiting logic so at a time only one debit process happens

*/