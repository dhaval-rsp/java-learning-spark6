import java.util.concurrent.locks.*;

public class P8_TicketBookingWithReentrantLock {
    public static void main(String[] args) {
        TicketBooking ticketBooking = new TicketBooking();

        TicketThread t1 = new TicketThread(ticketBooking, "jay");
        TicketThread t2 = new TicketThread(ticketBooking, "jatin");

        t1.start();
        t2.start();
    }
}


class TicketBooking {
    int availableSeats = 1;
    Lock lock = new ReentrantLock();

    void bookTicket(String username) {
        boolean locked = lock.tryLock(); // therad tries to hold lock here if no thread holding it then it will own the lock and moves to critical section of if where booking logic written

        if (locked) {
            try {
                if (availableSeats > 0) {
                    System.out.println(username + " is booking ticket");
                    Thread.sleep(5000);
                    availableSeats--;
                    System.out.println(username + " booking successful");
                } else {
                    System.out.println(username + " no seat available");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(username + " could not get lock, try agian");
        }
    }
}

class TicketThread extends Thread{
    TicketBooking t;
    String name;
    TicketThread(TicketBooking ti, String name){
        this.t = ti;
        this.name = name;
    }

    @Override
    public void run() {
        t.bookTicket(name);
    }
}


/*
2. jay is booking ticket > jatin could not get lock, try agian > jay booking successful
3. output is guaranteed as lock used
4. t1 booking ticket for jay t2 booking ticket for jatin
5. lock is protecting ticket booking logic which make sures at a time only one person can book ticket which make sures number of tickets booked = number of people booked
7. in real life we use this kinda logic for ticket booking, wallet debit credit, payment service etc etc.

*/