import attendee.FestivalAttendeeThread;
import gate.FestivalGate;
import statistic.FestivalStatisticsThread;
import ticket.TicketType;

import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        int maxAttendeeNumber = 50000;
        FestivalGate festivalGate = new FestivalGate();

        Thread threadForStatistic = new Thread(new FestivalStatisticsThread(festivalGate));
        threadForStatistic.setDaemon(true);
        threadForStatistic.start();

        for (int i = 0; i < maxAttendeeNumber; i++) {
            TicketType ticketType = null;
            SecureRandom secureRandom = new SecureRandom();
            int randomNumber = secureRandom.nextInt(5);
            ticketType = TicketType.whatKindOfTicket(randomNumber);

            Thread threadForAttendees = new Thread(new FestivalAttendeeThread(ticketType, festivalGate));
            threadForAttendees.start();
        }
    }
}