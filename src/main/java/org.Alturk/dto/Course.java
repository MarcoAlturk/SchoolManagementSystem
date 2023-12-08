package org.Alturk.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/**
 * Course
 * @author Marco Alturk (2359284)
 */
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
    private static int nextId = 1;
    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d", nextId++);
    }

    private String displayStudents() {
        if (students == null) {
            return "[]";
        }
        String studentsString = "[";
        for (Student student : students) {
            studentsString += student + ", ";
        }
        return studentsString + "]";
    }

    @Override
    public String toString() {
        if (teacher != null) {
            return "Course{" +
                    "id='" + id + "'" +
                    ",courseName='" + courseName + "'" +
                    ",credit=" + credit +
                    ",teacher=" + teacher.getFname() + " " + teacher.getLname() +
                    ",department='" + department + "'" +
                    "students=" + displayStudents() + "}";
        }
        return "Course{" +
                "id='" + id + "'" +
                ", courseName='" + courseName + "'" +
                ", credit=" + credit +
                ", teacher=null"+
                ", department='" + department + "'" +
                ", students=" + displayStudents() + "}";
    }
}
