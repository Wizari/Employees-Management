package org.r78.employeesmanagement.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DepartmentController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
//    @GetMapping("/")
    public String index() {

        return "<html>\n" +
                "<head>\n" +
                "<title>\n" +
                "My first page.\n" +
                "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>\n" +
                "Hello, world!\n" +
                "</h1>\n" +
                "</body>\n" +
                "</html>";
    }


}
