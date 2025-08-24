package Assignment3_2_Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;
    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited: " + amount);
    }
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("withdrawn Successfully");
            System.out.println("Available balance: " + balance);
        }
        else {
            System.out.println("Not enough balance");
        }
    }
}
class SavingsAccount extends BankAccount {
    private double InterestRate;
    public SavingsAccount(String accountNumber, double balance, String ownerName, double Interestrate) {
        super(accountNumber, balance, ownerName);
        this.InterestRate = Interestrate;
    }
    public void calculateInterest() {
        double interest = getBalance() * InterestRate / 100 ;
        System.out.println("Interest is " + interest);
    }
}
class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(String accountNumber, double balance, String ownerName,double overdraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (amount<=overdraftLimit+getBalance()) {
            double balance = getBalance()-amount;
            System.out.println("Withdrawn Successfully");
            System.out.println("Current balance is " + balance);
        }
        else {
            System.out.println("Overdraft Limit Exceeded");
        }

    }
}