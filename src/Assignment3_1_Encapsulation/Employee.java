package Assignment3_1_Encapsulation;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }
}
class Manager extends Employee {
    private int teamSize;
    private String projectName;
    public Manager(int id, String name, double salary, String department,int teamSize,String projectName) {
        super(id,name,salary,department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }
    public void displayManagerDetails() {
        super.displayEmployeeDetails();
        System.out.println("Team Size: "+teamSize);
        System.out.println("Project Name: "+projectName);
    }
}