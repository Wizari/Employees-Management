package org.r78.employeesmanagement;

import org.r78.employeesmanagement.controllers.LoggingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesManagementApplication {
public static void main(String[] args) {

        SpringApplication.run(EmployeesManagementApplication.class, args);
    LoggingController test = new LoggingController();
    test.index();

    }

}
