package Assignment2;

public class Assignment2_2_1 {
    public static void main(String[] args) {
        String[] status={"P","D","C","F","F","D","P","C","C","P"};
        int no_of_pending=0,no_of_failed=0,no_of_completed=0,no_of_delivered=0;
        int order_number=0;
        for(String order_status:status) {
            switch (order_status) {
                case "P":
                    System.out.println("Order Number " + order_number + " is  Pending");
                    no_of_pending++;
                    break;
                case "D":
                    System.out.println("Order Number " + order_number + " is  Delivered");
                    no_of_delivered++;
                    break;
                case "C":
                    System.out.println("Order Number " + order_number + " is  Completed");
                    no_of_completed++;
                    break;
                case "F":
                    System.out.println("Order Number " + order_number + " is  Failed");
                    no_of_failed++;
                    break;
            }
            order_number++;
        }
        System.out.println("No of pending orders: "+no_of_pending);
        System.out.println("No of failed orders: "+no_of_failed);
        System.out.println("No of completed orders: "+no_of_completed);
        System.out.println("No of delivered orders: "+no_of_delivered);
        }
    }


