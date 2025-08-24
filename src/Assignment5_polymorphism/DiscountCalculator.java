package Assignment5_polymorphism;

public class DiscountCalculator {
    public double calculateDiscount(double price, double discountPercent){
        return price*discountPercent/100;
    }
    public double calculateDiscount(double price, double discountAmount, boolean isFlat){
        if(isFlat){
            return discountAmount;
        }
        else{
            return price*discountAmount/100;
        }
    }
    public double calculateDiscount(double price){
        return price*0.05;
    }
}
class Payment{
    public void processPayment(double amount){
        System.out.println("Procesing generic payment of Rs. "+amount);;
    }
}
class creditCardPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs. "+amount);
    }
}
class UPIPayment extends Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing UPI payment of Rs."+amount);
    }
}
class CashPayment extends Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing cash payment of Rs."+amount);
    }
}