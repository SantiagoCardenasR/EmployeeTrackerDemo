package com.amaris.employeeTracker.service.impl;

import com.amaris.employeeTracker.dto.Employee;
import com.amaris.employeeTracker.dto.EmployeeList;
import com.amaris.employeeTracker.dto.EmployeeResponse;
import com.amaris.employeeTracker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final WebClient webClient;

    @Autowired
    public EmployeeServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public ResponseEntity<String> getAllEmployees() {
        try {
            var apiResponse = webClient.get()
                    .uri("/employees")
                    .exchangeToMono(response -> {
                        if (response.statusCode().is2xxSuccessful()) {
                            return response.bodyToMono(String.class);
                        } else {
                            return response.createException().flatMap(Mono::error);
                        }
                    })
                    .doOnError(Throwable::printStackTrace)
                    .block();
            return ResponseEntity.ok(apiResponse);
        } catch (WebClientResponseException e) {
            if (e.getStatusCode() == HttpStatus.CONFLICT) {
                // Manejo especial para 409 Conflict
                throw new RuntimeException("El servidor rechazó la solicitud debido a un conflicto.");
            }
            throw e;
        }
    }

    @Override
    public ResponseEntity<String> getEmployeeById(Integer id) {
        try {
            var apiResponse = webClient.get()
                    .uri("/employee/"+id)
                    .exchangeToMono(response -> {
                        if (response.statusCode().is2xxSuccessful()) {
                            return response.bodyToMono(String.class);
                        } else {
                            return response.createException().flatMap(Mono::error);
                        }
                    })
                    .doOnError(Throwable::printStackTrace)
                    .block();
            return ResponseEntity.ok(apiResponse);
        } catch (WebClientResponseException e) {
            if (e.getStatusCode() == HttpStatus.CONFLICT) {
                // Manejo especial para 409 Conflict
                throw new RuntimeException("El servidor rechazó la solicitud debido a un conflicto.");
            }
            throw e;
        }
    }
}
