package Assignment6_1_AccessModifiers.HR;

public class HRPortal {
    public static void main(String[] args) {
        Employee employee=new Employee("Rajakumari",90000,900,"ET");
        System.out.println("Name"+employee.employeeName);
        System.out.println("EmployeeID"+employee.employeeID);
        System.out.println("Department"+employee.department);
        System.out.println("Salary"+employee.getSalary());
    }
}
