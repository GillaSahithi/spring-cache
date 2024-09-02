package com.example.springcaching.repository;

import com.example.springcaching.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeRepository{
    private List<Employee> emp = new ArrayList<>(
            Arrays.asList(
                    new Employee(1L,"Sahithi","Gilla","CSE"),
                    new Employee(2L, "Sahi", "G","IT")
            )
    );

    public List<Employee> employees() {
        return emp;
    }

    public Employee employeeById(Long id) {
        for (Employee employee : emp) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
}
