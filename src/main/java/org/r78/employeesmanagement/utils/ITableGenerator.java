package org.r78.employeesmanagement.utils;

import java.util.Collection;

public interface ITableGenerator {
    String convertToRow(Object object, String... excludesFields);

    String convertToRow(Object object);

    String convertToTable(Collection<?> collection);

    String convertToTable(Collection<?> collection, Collection<String> headers, String ... excludesFields);

    String convertToTable(Collection<?> collection, Collection<String> headers);
}
