package Assignment2;

import java.util.Scanner;

public class Assignment2_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select from below options and enter the type of access needed");
        System.out.println("A for Admin Access,M for Manager Access,V for Viewer Access,E for Exit");
        while(true){
            String option_selected = input.nextLine();
            switch(option_selected){
                case "A":
                    System.out.println("Admin: Can manage user and settings");
                    break;
                case "M":
                    System.out.println("Manager: Can generate reports and approve requests");
                    break;
                case "V":
                    System.out.println("Viewer: Read-Only access");
                    break;
                case "E":
                    System.out.println("Exit");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }

    }
}
