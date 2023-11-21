package org.Alturk.dto;

/**
 * Student
 * @author Marco Alturk (2359284)
 */
public class Student {
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private int nextId = 1;
    private String lname;
    private Department department;

    public Student() {
        this.id = String.format("S%03d", nextId++);
    }
}
