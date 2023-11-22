package org.Alturk.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Student
 * @author Marco Alturk (2359284)
 */
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String fname;
    private String lname;
    private Course[] courses;
    private Department department;
    private int courseNum;
    private String id;
    private int nextId = 1;
    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
    }
}
