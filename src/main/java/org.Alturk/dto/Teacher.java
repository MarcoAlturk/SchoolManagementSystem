package org.Alturk.dto;

import lombok.ToString;

/**
 * Teacher
 * @author Marco Alturk (2359284)
 */
@ToString
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String id;
    private int nextId = 1;
    public Teacher(String fname, String lname, Department department) {
        this.id = String.format("T%03d", nextId++);
    }
}
