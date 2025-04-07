package com.amaris.employeeTracker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeResponse {
    private String status;
    private Employee data;
    private String message;
}
