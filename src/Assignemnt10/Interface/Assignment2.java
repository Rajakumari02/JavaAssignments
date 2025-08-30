package Assignemnt10.Interface;
import java.util.*;
import java.util.function.*;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment2 {
    public static void main(String[] args) {
        List<Double> ordersinUSD = Arrays.asList(700.0, 950.0, 200.0, 450.0);
        //1 Free shipping
        Predicate<Double> freeShipping = amount -> amount > 2000;

        //2 Order Confirmation
        Consumer<Double> ConfirmationStatus = amount ->
            System.out.println("Order placed successfully for Rs" + amount);

        //3 Coupon
        Supplier<String> coupon = () ->
            "SAVE" + ThreadLocalRandom.current().nextInt(100, 999);

        //4  Convert USD into INR
        Function<Double, Double> conversion = usd -> usd * 83;

        //5 discount
        BiFunction<Double, Double, Double> Discountapplied =
            (price, discount) -> price - (price * discount / 100);

        System.out.println("Online Shopping System");
        for (double orderinUSD : ordersinUSD) {
            double orderINR = conversion.apply(orderinUSD);
            System.out.println("\nOrder in INR: ₹" + orderINR);
            if (freeShipping.test(orderINR)) {
                System.out.println("Free shipping available");
            }
            ConfirmationStatus.accept(orderINR);
            String couponGenerated = coupon.get();
            System.out.println("Coupon code generated for the order: " + couponGenerated);
            double finalPrice = Discountapplied.apply(orderINR, 20.0);
            System.out.println("Final Price after 20% discount: ₹" + finalPrice);
            System.out.println("----------------------------------------------");
    }

}}
