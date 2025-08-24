package Assignment6_2_ExceptionHandling1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String entered = input.nextLine();
        Atm atm = new Atm(10000);
        try {
            double amount = Double.parseDouble(entered);
            atm.withdraw(amount);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}
