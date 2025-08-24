package Assignment2;

import java.util.Scanner;

public class Assignment2_2 {
    public static void main(String[] args){
            String pin_number="1090";
            Scanner input = new Scanner(System.in);
            int no_of_tries=0;
            boolean access=false;
            while(no_of_tries<3){
                System.out.println("Please Enter the pin number: ");
                String pin_entered=input.nextLine();
                if(pin_entered.equals(pin_number)){
                    System.out.println("Access Granted");
                    access=true;
                    break;
                }
                else{
                    System.out.println("Please retry");
                }
                no_of_tries++;
            }
            if(!access) {
                System.out.println("Entered wrong pin number");
                System.out.println("Access Denied");
            }
        }
    }

