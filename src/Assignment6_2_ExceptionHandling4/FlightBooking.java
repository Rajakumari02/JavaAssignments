package Assignment6_2_ExceptionHandling4;

public class FlightBooking {
    private boolean[] seats=new boolean[5];
    public void bookSeat(int seatNumber) {
        if (seatNumber>5) {
            throw new ArrayIndexOutOfBoundsException("Invalid seat number");
        }
        if(seats[seatNumber]){
            throw new IllegalStateException("Already Booked Seat");
        }
        else{
            seats[seatNumber]=true;
        }
        System.out.println("Seat Number "+seatNumber+" is Booked");
    }
}
