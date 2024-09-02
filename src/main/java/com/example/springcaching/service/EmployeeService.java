package com.example.springcaching.service;

import com.example.springcaching.model.Employee;
import com.example.springcaching.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // @Cacheable(value = "employeeCache")
    public List<Employee> getAllEmployees() {
        return employeeRepository.employees();
    }

    @Cacheable(value = "employeeCache", key = "#id")
    public Employee getEmployeeById(Long id) {
        return employeeRepository.employeeById(id);
    }
}
