package org.r78.employeesmanagement.controller;


import org.r78.employeesmanagement.domain.Department;
import org.r78.employeesmanagement.repositories.IDepartmentRepository;
import org.r78.employeesmanagement.utils.IDepartmentTableGenerator;
import org.r78.employeesmanagement.utils.ITableGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RestController
public class DepartmentController {
    @Autowired
    IDepartmentRepository departmentRepository;
    @Autowired
    IDepartmentTableGenerator departmentTableGenerator;

    @Autowired
    ITableGenerator tableGenerator;



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        String departmentList = this.departmentRepository.getAll().toString();

//        return "<html>\n" +
//                "<head>\n" +
//                "<title>\n" +
//                "My first page.\n" +
//                "</title>\n" +
//                "</head>\n" +
//                "<body>\n" +
//                "<h1>\n" +
//                departmentList +
//                "</h1>\n" +
//                "</body>\n" +
//                "</html>";



//        ArrayList<Department> a = new ArrayList<>(departmentRepository.getAll());
        String [] abc = {"name"};
        return tableGenerator.convertToTable(departmentRepository.getAll(),  Arrays.asList("Id"), abc);

    }

}
