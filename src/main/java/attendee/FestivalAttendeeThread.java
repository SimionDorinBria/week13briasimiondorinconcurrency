package attendee;

import gate.FestivalGate;
import ticket.TicketType;

public class FestivalAttendeeThread implements Runnable {
    private TicketType ticketType;
    private FestivalGate festivalGate;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate festivalGate) {
        this.ticketType = ticketType;
        this.festivalGate = festivalGate;
    }

    public void run() {
        festivalGate.addAttendee(ticketType);
        try {
            Thread.sleep(650);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}