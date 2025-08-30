package Assignemnt10.Interface;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;
public class Assignment1 {
    public static void main(String[] args) {
        List<Double> transactions = Arrays.asList(12000.0, 90000.0, 8000.0, 22000.0, 25000.0);

        for (Double transaction : transactions) {
            System.out.println("----------------------------");
            //1 checking if transaction is higher than 50000
            Predicate<Double> checktransaction = checkedtransaction -> checkedtransaction > 50000.0;
            if (checktransaction.test(transaction)) {
                System.out.println("Suspicious transaction: " + transaction);
                continue;
            }
            //2 print processed amount
            Consumer<Double> transactionAmount = (a) -> System.out.println("Processede transaction of Rs." + a);
            transactionAmount.accept(transaction);

            //3 4 digit otp verification
            Supplier<Integer> otpGenerator = () -> ThreadLocalRandom.current().nextInt(1000, 9999);
            int otp = otpGenerator.get();
            System.out.println("Transcation otp is " + otp);

            //4 deduct processing fee
            Function<Double, Double> deductFee = (amount) -> amount - (amount * 0.02);
            Double ProcessedAmount = deductFee.apply(transaction);
            System.out.println(" Amount after deducting 2% processing fee " + ProcessedAmount);

            //5 Final Amount
            BiFunction<Double, Double, Double> discountFunction = (amount, feePercent) -> amount - (amount * feePercent / 100);
            double finalAmount = discountFunction.apply(ProcessedAmount, 10.0);
            System.out.println("Final amount: " + finalAmount);
        }
    }
}
