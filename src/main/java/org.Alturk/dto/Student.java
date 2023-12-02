package org.Alturk.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Student
 * @author Marco Alturk (2359284)
 */
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
    private static int nextId = 1;
    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", id='" + id + '\'' +
                '}';
    }
}
