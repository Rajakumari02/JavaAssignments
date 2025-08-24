package Assignment6_2_ExceptionHandling4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the seat number");
        String seatNumber = input.nextLine();
        FlightBooking booking = new FlightBooking();
        try{
            int seatNo = Integer.parseInt(seatNumber);
            booking.bookSeat(seatNo);
        }
        catch(NumberFormatException e){
            System.out.println("Please enter a number.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
}
