package org.r78.employeesmanagement.utils;

import org.r78.employeesmanagement.domain.Department;

import java.util.List;

public interface IDepartmentTableGenerator {
    /**
     * Сериализует сущность "Отдел" в код строки HTML таблицы
     * @param department Сериализуемая сущность
     * @return html код <td> ... </td>
     */
    String convertToRow(Department department);

    /**
     * Сериализует сущность "Отдел" в код HTML таблицы
     * @param departmentsList Сериализуемая сущность
     * @return html код <table> ... </table>
     */
    String convertToTable(List<Department> departmentsList);

}