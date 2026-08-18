public class P7_TicketBookingWithsync {
    public static void main(String[] args) {

        // bookTicket object
        TicketBookingSync t = new TicketBookingSync();

        // passing bookTicket object and name of user to TicketBookingThread
        TicketBookingThread t1 = new TicketBookingThread(t, "Rahul");
        TicketBookingThread t2 = new TicketBookingThread(t, "Priya");

        t1.start();
        t2.start();
    }
}

// bookTicket method
class TicketBookingSync {
    int availableSeats = 1;

    void bookTicket(String username) {

        synchronized (this){

            try {
                if (availableSeats > 0) {
                        System.out.println(username + " is booking ticket");

                        Thread.sleep(5000); // ticket booking time

                        availableSeats--; // one ticket count decreased

                        System.out.println(username + " booking successful");
                }
                else {
                        System.out.println(username + " no seat available");
                }
            }

            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class TicketBookingThread extends Thread{

    TicketBookingSync t;
    String name;

    TicketBookingThread(TicketBookingSync ti, String name){
        this.t = ti;
        this.name = name;
    }

    @Override
    public void run() {
        t.bookTicket(name);
    }
}

/*
## Program 7: Ticket Booking With synchronized

Create class TicketBooking :
	availableSeats = 1
	method bookTicket(String userName)

Create two user threads:
	Rahul
	Priya

Both should try to book ticket.
Use synchronized to avoid overbooking.
 */

/*
2. Rahul is booking ticket then Priya could not check bookTicket method as it is synchronized
3. priya try again, meanwhile Rahul booking successful, now Priya can enter into bookTicket method and proceed
3. output is guaranteed as synchronized is used
4. t1 booking ticket for Rahul t2 booking ticket for Priya
5. synchronized (this) is protecting ticket booking logic which make sures at a time only one person can book ticket which make sures number of tickets booked = number of people booked
7. in real life we use this kinda logic for ticket booking, wallet debit credit, payment service etc etc.

*/

