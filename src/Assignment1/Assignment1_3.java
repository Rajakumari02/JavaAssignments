package Assignment1;

import java.util.*;
public class Assignment1_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double price1=sc.nextDouble();
        Double price2=sc.nextDouble();
        Double price3=sc.nextDouble();
        Double maximum =price1;
        double lowest=(price1<price2)?((price1<price3)?price1:price3):((price2<price3)?price2:price3);
        double highest=(price1>price2)?((price1>price3)?price1:price3):((price2>price3)?price2:price3);
        double difference_percentage=((highest-lowest)/lowest)*100;
        System.out.println("Website 1 price is:"+price1);
        System.out.println("Website 2 price is:"+price2);
        System.out.println("Website 3 price is:"+price3);
        System.out.println("Highest price is "+highest);
        System.out.println("Lowest price is "+lowest);
        System.out.println("Difference percentage is "+difference_percentage);
        }

    }
