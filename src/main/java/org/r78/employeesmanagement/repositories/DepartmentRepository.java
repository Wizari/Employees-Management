package org.r78.employeesmanagement.repositories;

import org.r78.employeesmanagement.domain.Department;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class DepartmentRepository implements IDepartmentRepository {
    private List<Department> departmentList = new ArrayList<>();

    @Override
    public void add(Department department) {
        this.departmentList.add(department);
    }

    @Override
    public Collection<Department> getAll() {
        return departmentList;
    }


}
