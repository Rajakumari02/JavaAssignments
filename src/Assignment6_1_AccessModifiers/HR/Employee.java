package Assignment6_1_AccessModifiers.HR;

public class Employee {
    public String employeeName;
    private double salary;
    int employeeID;
    protected String department;

    public Employee(String employeeName, double salary, int employeeID, String department) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeID = employeeID;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
}
