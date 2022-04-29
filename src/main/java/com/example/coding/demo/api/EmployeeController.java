package com.example.coding.demo.api;

import com.example.coding.demo.model.Employee;
import com.example.coding.demo.service.EmployeeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
@Tag(name = "Employee Controller", description = " This would provide the means to operate on Employee Domain object")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return this.employeeService.getAll();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody @Valid Employee employee) {
        return this.employeeService.saveEmployee(employee);
    }
}
