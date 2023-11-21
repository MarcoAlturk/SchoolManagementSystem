package org.Alturk.dto;

/**
 * Department
 * @author Marco Alturk (2359284)
 */

public class Department {
    private String departmentName;
    private String id;
    private int nextId = 1;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }
}
