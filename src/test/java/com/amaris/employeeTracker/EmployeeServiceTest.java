package com.amaris.employeeTracker;


import com.amaris.employeeTracker.controller.EmployeeController;
import com.amaris.employeeTracker.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @InjectMocks
    private EmployeeController employeeController;

    @Mock
    private EmployeeServiceImpl employeeService;


    @Test
    public void testAllEmployees() {
        String dummyEmployee = "id:1, employee_name : Tiger Nixon, employee_salary :320800, employee_age :61, profile_image :\"\"";
        when(employeeService.getAllEmployees()).thenReturn(ResponseEntity.ok(dummyEmployee));

        ResponseEntity<String> response = employeeController.getAllEmployees();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertFalse(response.getStatusCode().isError());
    }

    @Test
    public void testEmployeeById() {
        String dummyEmployee = "id:1, employee_name : Tiger Nixon, employee_salary :320800, employee_age :61, profile_image :\"\"";

        when(employeeService.getEmployeeById(1)).thenReturn(ResponseEntity.ok(dummyEmployee));

        ResponseEntity<String> response = employeeController.getEmployeeById(1);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertFalse(response.getStatusCode().isError());
    }

}
