package org.Alturk.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
    private Course[] courses = new Course[SchoolManagementSystem.MAX_NUM_OF_STUDENTS_PER_COURSE];
    private int numOfCourses = 0;
    private Department department;
    private String id;
    private static int nextId = 1;
    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.id = String.format("S%03d", nextId++);
    }

    private String displayCourses() {
        if (courses == null) {
            return "[]";
        }
        String coursesString = "[";
        for (Course course : courses) {
            if (course != null ) {
                coursesString += "'" + course.getCourseName() + "', ";
            }
        }
        return coursesString + "]";
    }

    public void addCourse(Course course) {
        courses[numOfCourses++] = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname=" + lname + '\'' +
                ", department=" + department +
                ", courseNum=" + numOfCourses +
                ", courses=" + displayCourses() +
                '}';
    }
}
