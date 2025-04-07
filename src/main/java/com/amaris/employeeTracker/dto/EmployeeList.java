package com.amaris.employeeTracker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeList {
    private String status;
    private List<Employee> data;
    private String message;
}
