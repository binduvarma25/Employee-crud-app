package com.example.coding.demo.service;

import com.example.coding.demo.model.Employee;
import com.example.coding.demo.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //this would create the new Record
    public Employee saveEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployee(Integer id) {
        return this.employeeRepository.findById(id);
    }

    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee emp, Integer id) {
        return emp;
    }

    public void deleteEmployee(Integer id) {
        this.employeeRepository.deleteById(id);
    }
}
