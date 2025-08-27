package Assigment9;

import java.util.*;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Rajakumari","GTT");
        Employee emp2=new Employee(2,"Rk","GTTA");
        Employee emp3=new Employee(3,"Raj","GOTD");
        Employee emp4=new Employee(4,"Raji","GOT");
        Employee emp5=new Employee(5,"Raja","DATA");
        Set<Employee> empSet=new HashSet<Employee>();
        empSet.add(emp1);
        empSet.add(emp2);
        empSet.add(emp3);
        empSet.add(emp4);
        empSet.add(emp5);
        System.out.println("Employee List:");
        for(Employee emp:empSet)
        {
            System.out.println(emp);
        }
        int removeid=3;
        empSet.remove(new Employee(removeid,"",""));
        System.out.println("After Removing Employee List:");
        for(Employee emp:empSet){
            System.out.println(emp);
        }
        int updateid=4;
        for(Employee emp:empSet){
            if (emp.getId()==updateid){
                emp.setDepartment("GTT");
            }
        }
        System.out.println("After Updating Employee List:");
        for(Employee emp:empSet){
            System.out.println(emp);
        }
        System.out.println("Search by id");
        empSet.contains(new Employee(1,"",""));
        empSet.contains(new Employee(0,"","GTT"));
        List<Employee> empList=new ArrayList<>();
        Collections.sort(empList);
        System.out.println("After Sorting Employee List:");
        for(Employee emp:empList){
            System.out.println(emp);
        }
        Collections.sort(empList, new EmployeeNameComparator());
        System.out.println("After Sorting Employee List based on Name:");
        for(Employee emp:empList){
            System.out.println(emp);
        }
    }
}
