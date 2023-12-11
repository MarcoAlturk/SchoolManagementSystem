package org.Alturk;

import org.Alturk.dto.SchoolManagementSystem;

/**
 * @author Marco Alturk (2359284)
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem schoolManagementSystem = new SchoolManagementSystem("Vanier College");
        schoolManagementSystem.addDepartment("Computer Science");
        schoolManagementSystem.addDepartment("Social Science");
        schoolManagementSystem.addDepartment("Computer Technology");
        schoolManagementSystem.addDepartment("French");
        schoolManagementSystem.addDepartment("Math");
        schoolManagementSystem.addDepartment("Music");
        schoolManagementSystem.printDepartments();
        schoolManagementSystem.addStudent("Mike", "Conan", "D001");

        // Max out the number of students
        for (int i = 0; i < 200; i++) {
            schoolManagementSystem.addStudent("Student" + i, "Student" + i, "D001");
        }

        // Print out all the students, add a teacher and printTeachers
        schoolManagementSystem.printStudents();
        schoolManagementSystem.addTeacher("Yi", "Wang", "D001");
        schoolManagementSystem.printTeachers();

        // Max out the number of courses
        schoolManagementSystem.addCourse("Intro to programming", 3.0, "D001");
        schoolManagementSystem.addCourse("Math 101", 3.0, "D005");
        schoolManagementSystem.addCourse("Physics 101", 3.0, "D005");
        schoolManagementSystem.addCourse("French 101", 3.0, "D004");
        schoolManagementSystem.addCourse("English 101", 3.0, "D002");
        schoolManagementSystem.addCourse("Chemistry 101", 3.0, "D005");

        // Max out the number of teachers
        for (int i = 0; i < 20; i++) {
            schoolManagementSystem.addTeacher("Teacher" + i, "Teacher" + i, "D001");
        }

        // Modify the teacher of some coures
        schoolManagementSystem.modifyCourseTeacher("T004", "C001");
        // Try registering course for non existant courseId
        schoolManagementSystem.modifyCourseTeacher("T004", "C007");
        // Try registering course for non existant teacherId
        schoolManagementSystem.modifyCourseTeacher("T021", "C001");
        // Register successful course
        schoolManagementSystem.registerCourse("S001","C001");

        // Try registering course for non existant studentid
        schoolManagementSystem.registerCourse("S225", "C001");

        schoolManagementSystem.registerCourse("S001", "C002");
        schoolManagementSystem.registerCourse("S001", "C002");
        schoolManagementSystem.registerCourse("S001", "C003");
        schoolManagementSystem.registerCourse("S001", "C004");

        // Max out a course
        schoolManagementSystem.registerCourse("S002", "C001");
        schoolManagementSystem.registerCourse("S003", "C001");
        schoolManagementSystem.registerCourse("S004", "C001");
        schoolManagementSystem.registerCourse("S005", "C001");
        schoolManagementSystem.registerCourse("S006", "C001");

        schoolManagementSystem.registerCourse("S001", "C002");

        schoolManagementSystem.registerCourse("S001", "C005");

        // student cannot register for the same course twice
        schoolManagementSystem.registerCourse("S059", "C006");
        schoolManagementSystem.registerCourse("S059", "C006");
    }
}
