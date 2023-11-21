package org.Alturk.dto;

/**
 * SchoolManagementSystem
 * @author Marco Alturk (2359284)
 */
public class SchoolManagementSystem {
    private static final int MAX_NUM_OF_DEPARTMENTS = 5;
    private static final int MAX_NUM_OF_STUDENTS = 200;
    private static final int MAX_NUM_OF_COURSES_PER_STUDENT = 5;
    private static final int MAX_NUM_OF_TEACHERS = 20;
    private static final int MAX_NUM_OF_COURSES_PER_SCHOOL = 30;
    private static final int MAX_NUM_OF_STUDENTS_PER_COURSE = 5;

    public SchoolManagementSystem() {

    }

    /**
     * Finds the department with the department id
     * @param id the department id
     * @return the department
     */
    public Department findDepartment(String id) {

    }

    /**
     * Finds the teacher with the teacher id
     * @param id the teacher id
     * @return the teacher
     */
    public Teacher findTeacher(String id) {

    }

    /**
     * Finds the course with the course id
     * @param id the course id
     * @return the course
     */
    public Course findCourse(String id) {

    }

    /**
     * Finds the student with the student id
     * @param id the student id
     * @return the student
     */
    public Student findStudent(String id) {

    }

    /**
     * Prints all the teachers
     */
    public void printTeachers() {

    }

    /**
     * Prints all the departments
     */
    public void printDepartments() {

    }

    /**
     * Prints all the students
     */
    public void printStudents() {

    }

    /**
     * Prints all the courses
     */
    public void printCourses() {

    }

    /**
     * Change a course for a teacher
     * @param teacherId the id of the teacher
     * @param courseId the id of the course
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     * Add a teacher
     * @param fname Teacher's first name
     * @param lname Teacher's last name
     * @param departmentName Department's name
     */
    public void addTeacher(String fname, String lname, String departmentName) {

    }

    /**
     * Add a student
     * @param fname Student's first name
     * @param lname Student's last name
     * @param departmentName Department's name
     */
    public void addStudent(String fname, String lname, String departmentName) {

    }
}
