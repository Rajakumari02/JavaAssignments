package Assignment7_2_CustomException;
class TicketLimitExceededException extends RuntimeException {
    public TicketLimitExceededException(String message) {
        super(message);
    }
}
public class TicketBooking {
}
