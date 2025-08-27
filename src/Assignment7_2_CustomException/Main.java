package Assignment7_2_CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicketBooking ticket = new TicketBooking();
        int quantity=input.nextInt();
        String movieName=input.next();
        try{
            ticket.bookTicket(movieName,quantity);
        }
        catch(TicketLimitExceededException e){
            System.out.println("Booking "+quantity+" tickets for "+movieName+"→ Error:"+e.getMessage());
        }
    }
}
