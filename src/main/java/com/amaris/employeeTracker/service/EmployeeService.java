package com.amaris.employeeTracker.service;

import com.amaris.employeeTracker.dto.Employee;
import com.amaris.employeeTracker.dto.EmployeeList;
import com.amaris.employeeTracker.dto.EmployeeResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    public ResponseEntity<String> getAllEmployees();
    public ResponseEntity<String> getEmployeeById(Integer id);
}
