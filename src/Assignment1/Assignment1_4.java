package Assignment1;

import java.util.*;
public class Assignment1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double monthly_salary= input.nextDouble();
        Double annual_salary=12*monthly_salary;
        double tax_percentage;
        System.out.println("Monthly salary is "+monthly_salary);
        System.out.println("Annual salary is "+annual_salary);
        if (annual_salary<1200000){
             tax_percentage =0;
        }
        else if(annual_salary>1200000 & annual_salary<1800000){
            tax_percentage =annual_salary*0.24;
        }
        else if(annual_salary>1800000 & annual_salary<2600000){
            tax_percentage =annual_salary*0.54;
        }
        else{
            tax_percentage = annual_salary * 0.6;
        }
        double net_salary=annual_salary- tax_percentage;
        System.out.println("Tax applied based on salary range "+ tax_percentage);
        System.out.println("Net salary after deducting tax_percentage "+net_salary);
    }
    }
