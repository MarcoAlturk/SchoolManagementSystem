package org.Alturk.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Course
 * @author Marco Alturk (2359284)
 */
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Course {
    private double credit;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;
    private String id;
    private int nextId = 1;
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d", nextId++);
    }
}
