package org.r78.employeesmanagement.controller;


import org.r78.employeesmanagement.domain.Department;
import org.r78.employeesmanagement.repositories.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    IDepartmentRepository departmentRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        String departmentList = this.departmentRepository.getAll().toString();

        return "<html>\n" +
                "<head>\n" +
                "<title>\n" +
                "My first page.\n" +
                "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>\n" +
                departmentList +
                "</h1>\n" +
                "</body>\n" +
                "</html>";
    }

}
