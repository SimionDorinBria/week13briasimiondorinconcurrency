package gate;

import ticket.TicketType;

import java.util.AbstractQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FestivalGate {
    public AbstractQueue<TicketType> attendeeList = new ConcurrentLinkedQueue<TicketType>();

    public synchronized void addAttendee(TicketType ticketType) {
        attendeeList.add(ticketType);
    }

    public synchronized int numberOfAKindOfTickets(AbstractQueue<TicketType> attendeeList, TicketType ticketType) {
        int numberOfAKindOfTickets = 0;
        for (TicketType attendee : attendeeList) {
            if (attendee.equals(ticketType)) {
                numberOfAKindOfTickets++;
            }
        }
        return numberOfAKindOfTickets;
    }

    public synchronized void printTicketsNumber() {
        System.out.println(attendeeList.size() + " people entered: " +
                numberOfAKindOfTickets(attendeeList, TicketType.FULL) + " have full tickets, " +
                numberOfAKindOfTickets(attendeeList, TicketType.FULL_VIP) + " have full VIP passes, " +
                numberOfAKindOfTickets(attendeeList, TicketType.FREE_PASS) + " have free passes, " +
                numberOfAKindOfTickets(attendeeList, TicketType.ONE_DAY) + " have one-day passes, " +
                numberOfAKindOfTickets(attendeeList, TicketType.ONE_DAY_VIP) + " have one-day vip passes.");
    }
}