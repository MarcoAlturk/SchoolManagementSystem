package org.Alturk;

import org.Alturk.dto.Department;
import org.Alturk.dto.SchoolManagementSystem;

import java.util.Arrays;

/**
 * @author Marco Alturk (2359284)
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem();

        schoolManagementSystem.addDepartment("Science Department");
        schoolManagementSystem.printDepartments();
        schoolManagementSystem.addTeacher("Marco", "Alturk", "D001");
        schoolManagementSystem.printTeachers();
        System.out.println(schoolManagementSystem.findDepartment("D001"));

    }
}
