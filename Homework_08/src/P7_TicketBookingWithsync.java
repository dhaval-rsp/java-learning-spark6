public class P7_TicketBookingWithsync {
    public static void main(String[] args) {
        TicketBookingNew t = new TicketBookingNew();

        TicketBookingThread t1 = new TicketBookingThread(t, "jay");
        TicketBookingThread t2 = new TicketBookingThread(t, "jatin");

        t1.start();
        t2.start();
    }
}

class TicketBookingNew {
    int availableSeats = 1;

    void bookTicket(String username) {
        synchronized (this){
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
            }
        }
    }
}

class TicketBookingThread extends Thread{
    TicketBookingNew t;
    String name;
    TicketBookingThread(TicketBookingNew ti, String name){
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
3. output is guaranteed as synchronized is used
4. t1 booking ticket for jay t2 booking ticket for jatin
5. lock is protecting ticket booking logic which make sures at a time only one person can book ticket which make sures number of tickets booked = number of people booked
7. in real life we use this kinda logic for ticket booking, wallet debit credit, payment service etc etc.

*/