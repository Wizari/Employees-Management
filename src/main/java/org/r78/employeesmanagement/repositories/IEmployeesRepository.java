package org.r78.employeesmanagement.repositories;


import org.r78.employeesmanagement.domain.Employee;

import java.util.Collection;

public interface IEmployeesRepository {

    void add(Employee employee);

    Collection<Employee> getAll();
}
