package Assignment3_2_Encapsulation;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings=new SavingsAccount("A1234",9000,"Rajakumari",0.90);
        CurrentAccount current=new CurrentAccount("B7890",900.9,"Rk",500);
        System.out.println("Transcations in Savings Account");
        savings.deposit(900);
        savings.withdraw(500);
        savings.calculateInterest();
        System.out.println("Transcations in Current Account");
        current.deposit(500);
        current.withdraw(100);
    }
}
