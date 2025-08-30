package Assignment3_5;

public class Truck extends Vehicle {

    int loadCapacity;
    public Truck(int registrationNumber, String brand, double rentalRate, int loadCapacity) {
        super(registrationNumber, brand, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRent(int days) {
        super.calculateRent(days);
        if(loadCapacity>3000){
            rent+=200;
        }
        return rent;
    }
}
