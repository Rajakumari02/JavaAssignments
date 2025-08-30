package Assignment3_5;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the days: ");
        int days = input.nextInt();
        Vehicle car = new Car(2445,"Ford",900,9);
        Vehicle bike = new Bike(2202,"Benz",950,1040);
        Vehicle truck = new Truck(9090,"MG",1900,5000);
        System.out.println("The rental price for  car for "+ days +" is "+ car.calculateRent(days));
        System.out.println("The rental price for  bike for "+ days +" is "+ bike.calculateRent(days));
        System.out.println("The rental price for  truck for "+ days+" is "+ truck.calculateRent(days));
    }
}
