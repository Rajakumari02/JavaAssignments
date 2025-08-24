package Assignment7_1_CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ATM atm = new ATM();
        System.out.println("Enter the PIN Number");
        String enteredPin = input.nextLine();
        try{
            atm.validatePin(enteredPin);
        }
        catch (InvalidPINException e){
            System.out.println("Error: "+e.getMessage());
        }

    }

}
