package Assignment6_1_AccessModifiers.reports;

import Assignment6_1_AccessModifiers.HR.Employee;

public class Manager extends Employee {
    public Manager(String employeeName, double salary, int employeeID, String department) {
        super(employeeName, salary, employeeID, department);
    }
    public void generateReport() {
        System.out.println("Department "+department);

    }

}
