package org.r78.employeesmanagement.utils;

import org.r78.employeesmanagement.domain.Department;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class DepartmentTableGenerator implements IDepartmentTableGenerator {

    @Override
    public String convertToRow(Department department) {
//        String id = department.getId().toString();
//        String name = department.getName();
        String result = "<tr>\n" +
                "    <td>" +
                "" + department.getId().toString() +
                "</td>\n" +
                "    <td>" +
                "" + department.getName()  +
                "</td>\n" +
                "</tr>\n";

        // Почему не нужен toString?
//        result += department.getId();
//        result += department.getName();
        return result;
    }

    @Override
    public String convertToTable(Collection<Department> departmentsList) {
        StringBuilder result = new StringBuilder("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"1\">\n" +
                "    <tr>\n" +
                "        <th>\n" +
                "            ID\n" +
                "        </th>\n" +
                "        <th>\n" +
                "            Name\n" +
                "        </th>\n" +
                "    </tr>\n");
        for (Department department : departmentsList) {
            result.append(convertToRow(department));
            result.append("\n");
        }
        result.append("</table>");
        return result.toString();
    }
}
