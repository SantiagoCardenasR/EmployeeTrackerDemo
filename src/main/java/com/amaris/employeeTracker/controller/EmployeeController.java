package com.amaris.employeeTracker.controller;

import com.amaris.employeeTracker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
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
