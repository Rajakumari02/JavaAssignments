package Assignment3_1_Encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee(1,"Rajakumari",30000.00,"IT");
        Manager manager=new Manager(2,"Rajakumari",900000,"ET",10,"GTT");
        System.out.println("Employee Details");
        employee.displayEmployeeDetails();
        System.out.println("Manager Details");
        manager.displayManagerDetails();
    }
}
