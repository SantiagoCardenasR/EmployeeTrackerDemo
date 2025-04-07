package com.amaris.employeeTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeeTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTrackerApplication.class, args);
	}

}
