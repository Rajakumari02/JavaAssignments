package Assignment7_2_CustomException;
class TicketLimitExceededException extends RuntimeException {
    public TicketLimitExceededException(String message) {
        super(message);
    }
}
public class TicketBooking {
    public void bookTicket(String movieName, int quantity) {
        if(quantity>6){
            throw new TicketLimitExceededException("Cannot book more than 6 tickets at once");
        }
        else{
            System.out.println("Booking "+quantity+" tickets for "+movieName+" → Booking successful!");
        }
    }


}
