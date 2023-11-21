package org.Alturk.dto;

/**
 * Teacher
 * @author Marco Alturk (2359284)
 */
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;
    private int nextId = 1;
    public Teacher() {
        this.id = String.format("T%03d", nextId++);
    }
}
