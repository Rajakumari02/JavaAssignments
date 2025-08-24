package Assignment1;

public class Assignment1_1 {
    public static void main(String[] args) {
        Double principal = 9000.00;
        Double interest_rate = 5.0;
        Integer tenure = 3;
        Double emi = (principal * interest_rate * Math.pow(1 + interest_rate, tenure)) / ((Math.pow(1 + interest_rate, tenure) - 1));
        System.out.println("Calculated EMI: " + emi);
    }
}
