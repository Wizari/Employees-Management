package org.r78.employeesmanagement.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Collection;

@Slf4j
@Component
public class TableGenerator implements ITableGenerator {


    @Override
    public String convertToRow(Object object, String... excludesFields) {
        Class<?> aClass = object.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("<tr>");
        try {

            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields) {
                for (String excludesField : excludesFields) {
                    if (!excludesField.equals(field.getName())) {
                        field.setAccessible(true);
                        sb.append("<td>");
                        sb.append(field.get(object));
                        sb.append("</td>");
                    }
                }

            }
            sb.append("</tr>");
            return sb.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String convertToRow(Object object) {
        Class<?> aClass = object.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("<tr>");
        try {

            Field[] fields = aClass.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
//                String name = field.getName();
                sb.append("<td>");
                sb.append(field.get(object));
                sb.append("</td>");
            }
            sb.append("</tr>");
            return sb.toString();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String convertToTable(Collection<?> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"1\">");
        for (Object o : collection) {
            sb.append(this.convertToRow(o));
        }
        sb.append("</table>");
        return sb.toString();
    }

    @Override
    public String convertToTable(Collection<?> collection, Collection<String> headers, String...
            excludesFields) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"1\">");
        sb.append("<tr>");
        for (String header : headers) {
            sb.append("<th>");
            sb.append(header);
            sb.append("</th>");
        }
        sb.append("</tr>");
        for (Object o : collection) {
            sb.append(this.convertToRow(o, excludesFields));
        }
        sb.append("</table>");
        return sb.toString();
    }


    @Override
    public String convertToTable(Collection<?> collection, Collection<String> headers) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"4\" border=\"1\">");
        sb.append("<tr>");
        for (String header : headers) {
            sb.append("<th>");
            sb.append(header);
            sb.append("</th>");
        }
        sb.append("</tr>");
        for (Object o : collection) {
            sb.append(this.convertToRow(o));
        }
        sb.append("</table>");
        return sb.toString();
    }


}
