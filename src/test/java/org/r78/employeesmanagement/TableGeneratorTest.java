package org.r78.employeesmanagement;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.r78.employeesmanagement.domain.Department;
import org.r78.employeesmanagement.utils.DepartmentTableGenerator;
import org.r78.employeesmanagement.utils.IDepartmentTableGenerator;
import org.r78.employeesmanagement.utils.ITableGenerator;
import org.r78.employeesmanagement.utils.TableGenerator;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Slf4j
public class TableGeneratorTest {

    @Test
    public void generalTableGeneratorTest() {
        ITableGenerator tableGenerator = new TableGenerator();
        System.out.println(tableGenerator.convertToRow(new Department(1L, "A")));
    }

    @Test
    public void simpleTest() {
        IDepartmentTableGenerator generator = new DepartmentTableGenerator();
        List<Department> departments = Arrays.asList(
                new Department(1L, "A"),
                new Department(2L, "B"));
        String expected = "<table width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"1\">\n" +
                "    <tr>\n" +
                "        <th>\n" +
                "            ID\n" +
                "        </th>\n" +
                "        <th>\n" +
                "            Name\n" +
                "        </th>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>  1</td>\n" +
                "        <td>A</td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td>2</td>\n" +
                "        <td>B</td>\n" +
                "    </tr>\n" +
                "</table>";
        String result = generator.convertToTable(departments);

        expected = expected.replaceAll("\n|\r\n", "");
        expected = expected.replaceAll(" ", "");

        result = result.replaceAll("\n|\r\n", "");
        result = result.replaceAll(" ", "");

        assertEquals(expected, result);

    }
}
