package org.Alturk;

import org.Alturk.dto.Department;
import org.Alturk.dto.SchoolManagementSystem;
import org.Alturk.dto.Teacher;

import java.io.PrintStream;
import java.util.Arrays;

/**
 * @author Marco Alturk (2359284)
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        schoolManagementSystem.addDepartment("Science Department");
        schoolManagementSystem.addDepartment("Math Department");
        schoolManagementSystem.addDepartment("Physics Department");
        schoolManagementSystem.addDepartment("English Department");
        schoolManagementSystem.addDepartment("History Department");

        schoolManagementSystem.printDepartments();
        schoolManagementSystem.addCourse("Math 101", 4.0, "D002");
        schoolManagementSystem.addCourse("Chemistry 101", 3.0, "D001");
        schoolManagementSystem.addCourse("History 101", 3.0, "D005");

        schoolManagementSystem.addTeacher("Marco", "Alturk", "D002");

        schoolManagementSystem.printTeachers();
        schoolManagementSystem.printCourses();

        schoolManagementSystem.modifyCourseTeacher("T001", "C001");


    }
}
