package Assignment17_mapping.com.demo.onetomany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Autowired
    private EmployeeRepository employeeRepo;

    @PostMapping("/departments")
    public Department addNewDepartment(@RequestBody Department department) {
        return departmentRepo.save(department);
    }

    @PostMapping("/employees/{departmentid}")
    public Employee addNewEmployee(@RequestBody Employee employee, @PathVariable int departmentid) throws Exception {
        Department department = this.departmentRepo.findById(departmentid).orElseThrow(()-> new Exception("Department not found"));
        employee.setDepartment(department);
        return employeeRepo.save(employee);
    }

    @GetMapping("/departments/{id}")
    public Department getDepartment(@PathVariable int id) throws Exception {
        Department department = this.departmentRepo.findById(id).orElseThrow(()-> new Exception("Department not found"));
        return department;
    }

    @GetMapping("/employees/{id}")
    public EmployeeResponseDto getEmployee(@PathVariable int id) throws Exception {
        Employee employee = this.employeeRepo.findById(id).orElseThrow(()-> new Exception("Employee not found"));
        Department department = employee.getDepartment();
        EmployeeResponseDto employeeResponseDto = new EmployeeResponseDto();
        employeeResponseDto.setId(employee.getId());
        employeeResponseDto.setFirstName(employee.getFirstName());
        employeeResponseDto.setLastName(employee.getLastName());
        employeeResponseDto.setEmail(employee.getEmail());
        employeeResponseDto.setSalary(employee.getSalary());

        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(department.getId());
        departmentDto.setName(department.getName());
        departmentDto.setLocation(department.getLocation());

        employeeResponseDto.setDepartment(departmentDto);

        return employeeResponseDto;

    }

    @GetMapping("/departments")
    public List<Department> getDepartmentsWithoutEmployees() throws Exception {
        List<Department> departments = this.departmentRepo.findAll();
        List<Department> departmentsWithoutEmployees = new ArrayList<>();
        for(Department department : departments) {
            if(department.getEmployees().size() == 0) {
                departmentsWithoutEmployees.add(department);
            }
        }
        return departmentsWithoutEmployees;

    }

    @DeleteMapping("/departments/{id}")
    public Department deleteDepartment(@PathVariable int id) throws Exception {
        Department department =  this.departmentRepo.findById(id).orElseThrow(()-> new Exception("Department not found"));
        this.departmentRepo.deleteById(id);
        return department;
    }

}