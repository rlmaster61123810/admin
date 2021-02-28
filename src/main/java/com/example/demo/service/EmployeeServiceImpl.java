package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeReposity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeReposity employeeReposity;

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    public EmployeeReposity getEmployeeReposity() {
        return employeeReposity;
    }

    public void setEmployeeReposity(EmployeeReposity employeeReposity) {
        this.employeeReposity = employeeReposity;
    }

}
