package org.r78.employeesmanagement;

import lombok.extern.slf4j.Slf4j;
import org.r78.employeesmanagement.domain.Department;
import org.r78.employeesmanagement.domain.Position;
import org.r78.employeesmanagement.repositories.IDepartmentRepository;
import org.r78.employeesmanagement.repositories.IEmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class EmployeesManagementApplication {

    @Autowired
    private IDepartmentRepository departmentRepository;
    @Autowired
    private IEmployeesRepository employeesRepository;


    public static void main(String[] args) {
        SpringApplication.run(EmployeesManagementApplication.class, args);

    }

    @Bean
    public CommandLineRunner initialize() {

        return args -> {
            log.debug("initialize");
            Department departmentA = new Department();
            departmentA.setName("A");
            departmentA.setId(1L);
            log.debug(departmentA.toString());
            Department departmentB = new Department();
            departmentB.setName("B");
            departmentB.setId(2L);
            log.debug(departmentB.toString());
//            Department departmentC = new Department();
//            departmentC.setId(3L);
//            departmentC.setName("C");
//            departmentRepository.add(departmentC);

            Position programmer = new Position();
            programmer.setId(1L);
            programmer.setName("Programmer");
            log.debug(programmer.toString());
            Position teamLeader = new Position();
            teamLeader.setName("Team Leader");
            teamLeader.setId(2L);
            log.debug(teamLeader.toString());


            departmentRepository.add(departmentA);
            departmentRepository.add(departmentB);
            log.debug(departmentRepository.getAll().toString());
        };
    }

}
