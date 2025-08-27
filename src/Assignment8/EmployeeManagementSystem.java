package Assignment8;
import java.util.*;
import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(90,"Rajakumari","GTT",900000));
        employees.add(new Employee(900,"Raja","GTT",90000));
        employees.add(new Employee(901,"RK","GTT",700000));
        for(Employee e:employees){
            if(e.getId()==900){
                e.setDepartment("GDIA");
            }
            if(e.getId()==90){
                employees.remove(e);
            }
            Employee searchemployee=new Employee(90,"Rajakumari","GTT",90000);
            boolean found=employees.contains(searchemployee);
            if(found){
                System.out.println("Employee found at index: "+employees.indexOf(searchemployee));
            }
            else{
                System.out.println("Employee not found");
            }
        Employee employee1=new Employee(900,"Rajakumari","GTT",90000);
        Employee employee2=new Employee(900,"Rajakumari","GTT",90000);
        boolean same=employee1.equals(employee2);
        if(same){
            System.out.println("Both employees are same");
        }
        else{
             System.out.println("Both employees are not same");
        }
        }
    }
}



