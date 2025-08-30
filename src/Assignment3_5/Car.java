package Assignment3_5;

public class Car extends Vehicle {

    int seatingCapacity;

    public Car(int registrationNumber, String brand, double rentalRate, int seatingCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double calculateRent(int days) {
        super.calculateRent(days);
        if (seatingCapacity > 3) {
            rent += 300;
        }
        return rent;
    }
}
