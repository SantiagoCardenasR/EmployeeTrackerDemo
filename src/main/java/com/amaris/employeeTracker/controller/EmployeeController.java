package com.amaris.employeeTracker.controller;

import com.amaris.employeeTracker.dto.Employee;
import com.amaris.employeeTracker.dto.EmployeeList;
import com.amaris.employeeTracker.dto.EmployeeResponse;
import com.amaris.employeeTracker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping("/all")
    public ResponseEntity<String> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getEmployeeById(@PathVariable Integer id){
        return service.getEmployeeById(id);
    }
}
