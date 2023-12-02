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
        schoolManagementSystem.addDepartment("French Department");
        schoolManagementSystem.addDepartment("English Department");
        schoolManagementSystem.addDepartment("Spanish Department");

        schoolManagementSystem.printDepartments();

        for (int i = 0; i <= 20; i++) {
            schoolManagementSystem.addTeacher("caca", "popo", "D003");
        }
        schoolManagementSystem.printTeachers();
        System.out.println(schoolManagementSystem.findDepartment("D003"));
        System.out.println(schoolManagementSystem.findTeacher("T004"));
        System.out.println(schoolManagementSystem.findCourse("T004"));

    }
}
