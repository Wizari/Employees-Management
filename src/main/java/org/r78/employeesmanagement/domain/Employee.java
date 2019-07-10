package org.r78.employeesmanagement.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private Long id;
    private String name;
    private String lastName;
    private Department department;
    private Position position;


}
