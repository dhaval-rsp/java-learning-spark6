import java.util.*;

public class P10_SupportTicketPriority {
    public static void main(String[] args) {

        // PriorityQueue with custom comparator (lower number = higher priority)
        PriorityQueue<SupportTicket> ticketQueue = new PriorityQueue<>(
                Comparator.comparingInt(t -> t.priority)
        );

        // Add tickets
        ticketQueue.add(new SupportTicket(101, "Login issue", 2));
        ticketQueue.add(new SupportTicket(102, "Payment failed", 1));
        ticketQueue.add(new SupportTicket(103, "Bug in report", 3));
        ticketQueue.add(new SupportTicket(104, "Account locked", 1));

        // Process tickets based on priority
        System.out.println("Processing tickets (lower number = higher priority):");
        while (!ticketQueue.isEmpty()) {
            System.out.println(ticketQueue.poll());
        }
    }
}

// SupportTicket class
class SupportTicket {
    int ticketId;
    String title;
    int priority; // lower number = higher priority

    SupportTicket(int ticketId, String title, int priority) {
        this.ticketId = ticketId;
        this.title = title;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Ticket[ID=" + ticketId + ", Title=" + title + ", Priority=" + priority + "]";
    }
}

/*
Program 10: Support Ticket Priority
Create class SupportTicket with:
	ticketId
	title
	priority

Use PriorityQueue<SupportTicket> .

Lower priority number means higher priority.

Process tickets based on priority.
 */