package org.Alturk.dto;

/**
 * Student
 * @author Marco Alturk (2359284)
 */
public class Student {
    private String fname;
    private String lname;
    private Course[] courses;
    private Department department;
    private int courseNum;
    private String id;
    private int nextId = 1;
    public Student() {
        this.id = String.format("S%03d", nextId++);
    }
}
