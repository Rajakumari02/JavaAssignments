package Assignment5_polymorphism;

public class Ecommerce{
    public static void main(String[] args){
        DiscountCalculator calc = new DiscountCalculator();
        double percentDiscount=calc.calculateDiscount(500, 100);
        double flatDiscount=calc.calculateDiscount(10000,50,true);
        double discount=calc.calculateDiscount(10000);
        System.out.println("Discount using percent: "+percentDiscount);
        System.out.println("Discount using flat amount: "+flatDiscount);
        System.out.println("Discount using default: "+discount);
        Payment payment= new creditCardPayment();
        payment.processPayment(500);
        Payment payment1= new UPIPayment();
        payment1.processPayment(300);
        Payment payment2= new CashPayment();
        payment2.processPayment(200);
    }
}