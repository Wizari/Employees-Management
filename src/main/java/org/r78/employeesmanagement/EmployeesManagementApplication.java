package org.r78.employeesmanagement;

import lombok.extern.slf4j.Slf4j;
import org.r78.employeesmanagement.domain.Department;
import org.r78.employeesmanagement.domain.Employee;
import org.r78.employeesmanagement.domain.Position;
import org.r78.employeesmanagement.repositories.DepartmentRepository;
import org.r78.employeesmanagement.repositories.IDepartmentRepository;
import org.r78.employeesmanagement.repositories.IPositionRepository;
import org.r78.employeesmanagement.repositories.PositionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeesManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesManagementApplication.class, args);

        Department departmentA = new Department();
        departmentA.setName("A");
        departmentA.setId(1L);
        log.debug(departmentA.toString());
        Department departmentB = new Department();
        departmentB.setName("B");
        departmentB.setId(2L);
        log.debug(departmentB.toString());

        Position programmer = new Position();
        programmer.setId(1L);
        programmer.setName("Programmer");
        log.debug(programmer.toString());
        Position teamLeader = new Position();
        teamLeader.setName("Team Leader");
        teamLeader.setId(2L);
        log.debug(teamLeader.toString());

        IDepartmentRepository departmentRepository = new DepartmentRepository();
        IPositionRepository positionRepository = new PositionRepository();
        departmentRepository.add(departmentA);
        departmentRepository.add(departmentB);
        log.debug(departmentRepository.getAll().toString());




    }

}
