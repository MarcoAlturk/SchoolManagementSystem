package org.Alturk.dto;

/**
 * Course
 * @author Marco Alturk (2359284)
 */
public class Course {
    private double credit;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;
    private String id;
    private int nextId = 1;
    public Course() {
        this.id = String.format("C%03d", nextId++);
    }
}
