package Assignment6_2_ExceptionHandling1;

public class Atm {
    private double balance;
    public Atm(double balance){
        this.balance=balance;
    }
    public void withdraw(double amount){
        if(amount>balance){
            throw new ArithmeticException("Insufficient balance. Available: "+balance);
        }
        if(amount<=0){
            throw new IllegalArgumentException("Invalid amount entered");
        }
        balance=balance-amount;
        System.out.println("Amount Withdrawn Sucessfully");
        System.out.println("Available balance: "+balance);
    }
}
