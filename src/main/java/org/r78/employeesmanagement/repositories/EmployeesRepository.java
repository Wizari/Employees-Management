package org.r78.employeesmanagement.repositories;


import org.r78.employeesmanagement.domain.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class EmployeesRepository implements IEmployeesRepository {
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        this.employeeList.add(employee);
    }

    @Override
    public Collection<Employee> getAll() {
        return employeeList;
    }


}
