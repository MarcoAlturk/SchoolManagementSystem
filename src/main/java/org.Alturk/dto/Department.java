package org.Alturk.dto;

import lombok.ToString;

/**
 * Department
 * @author Marco Alturk (2359284)
 */
@ToString
public class Department {
    private String departmentName;
    private String id;
    private int nextId = 1;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }
}
