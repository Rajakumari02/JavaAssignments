package Assignment6_1_AccessModifiers.payroll;

import Assignment6_1_AccessModifiers.HR.Employee;

public class payRollService {
    public static void main(String[] args) {
        Employee employee = new Employee("Test1",787878,98,"ET");
        System.out.println("Name "+employee.employeeName);
        System.out.println("Salary "+employee.getSalary());

    }
}
