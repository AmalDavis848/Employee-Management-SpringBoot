package com.example.employees.service;

import com.example.employees.entity.Employee;
import com.example.employees.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
