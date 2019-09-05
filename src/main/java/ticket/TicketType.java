package ticket;

public enum TicketType {
    FULL,
    FULL_VIP,
    FREE_PASS,
    ONE_DAY,
    ONE_DAY_VIP;

    public static TicketType whatKindOfTicket(int positionInTicketType) {
        switch (positionInTicketType) {
            case 0:
                return TicketType.FULL;
            case 1:
                return TicketType.FULL_VIP;
            case 2:
                return TicketType.FREE_PASS;
            case 3:
                return TicketType.ONE_DAY;
            case 4:
                return TicketType.ONE_DAY_VIP;
            default:
                return TicketType.FULL;
        }
    }
}