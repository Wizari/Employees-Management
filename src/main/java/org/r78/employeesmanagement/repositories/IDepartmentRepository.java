package org.r78.employeesmanagement.repositories;

import org.r78.employeesmanagement.domain.Department;

import java.util.Collection;

public interface IDepartmentRepository {
    void add(Department department);

    Collection<Department> getAll();
}
