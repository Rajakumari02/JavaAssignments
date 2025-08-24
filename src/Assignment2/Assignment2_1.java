package Assignment2;

import java.util.Scanner;
public class Assignment2_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double price;
        double total_sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter price:");
            price=sc.nextDouble();
            total_sum+=price;
        }
        System.out.println("Total price of items purchased is "+total_sum);
    }
}
