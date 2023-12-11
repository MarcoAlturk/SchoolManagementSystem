package org.Alturk.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * SchoolManagementSystem
 * @author Marco Alturk (2359284)
 */
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class SchoolManagementSystem {
    public static final int MAX_NUM_OF_DEPARTMENTS = 5;
    public static final int MAX_NUM_OF_STUDENTS = 200;
    public static final int MAX_NUM_OF_COURSES_PER_STUDENT = 5;
    public static final int MAX_NUM_OF_TEACHERS = 20;
    public static final int MAX_NUM_OF_COURSES_PER_SCHOOL = 30;
    public static final int MAX_NUM_OF_STUDENTS_PER_COURSE = 5;

    private Student[] students = new Student[MAX_NUM_OF_STUDENTS];
    private int numOfStudents = 0;
    private Teacher[] teachers = new Teacher[MAX_NUM_OF_TEACHERS];
    private int numOfTeachers = 0;
    private Course[] courses = new Course[MAX_NUM_OF_COURSES_PER_SCHOOL];
    private int numOfCourses = 0;
    private Department[] departments = new Department[MAX_NUM_OF_DEPARTMENTS];
    private int numOfDepartments = 0;
    private String schoolName;

    public SchoolManagementSystem(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * Finds the department with the department id
     * @param id the department id
     * @return the department
     */
    private Department findDepartment(String id) {
        for (Department department : departments) {
            if (department != null && department.getId().equals(id)) {
                return department;
            }
        }

        return null;
    }

    /**
     * Finds the teacher with the teacher id
     * @param id the teacher id
     * @return the teacher
     */
    private Teacher findTeacher(String id) {
        for (Teacher teacher : teachers) {
            if (teacher != null && teacher.getId().equals(id)) {
                return teacher;
            }
        }

        return null;
    }

    /**
     * Finds the course with the course id
     * @param id the course id
     * @return the course
     */
    private Course findCourse(String id) {
        for (Course course : courses) {
            if (course != null && course.getId().equals(id)) {
                return course;
            }
        }

        return null;
    }

    /**
     * Finds the student with the student id
     * @param id the student id
     * @return the student
     */
    private Student findStudent(String id) {
        for (Student student : students) {
            if (student != null && student.getId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    /**
     * Prints all the teachers
     */
    public void printTeachers() {
        System.out.println("Displaying All Teachers : \n ----------------- ");

        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * Prints all the departments
     */
    public void printDepartments() {
        System.out.println("Displaying All Departments : \n ----------------- ");

        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * Prints all the students
     */
    public void printStudents() {
        System.out.println("Displaying All Students : \n ----------------- ");

        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * Prints all the courses
     */
    public void printCourses() {
        System.out.println("Displaying All Courses : \n ----------------- ");

        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    /**
     * Change a course for a teacher
     * @param teacherId the id of the teacher
     * @param courseId the id of the course
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {
        if (findTeacher(teacherId) != null) {
            if (findCourse(courseId) != null) {
                if (findTeacher(teacherId).getDepartment() == findCourse(courseId).getDepartment()) {
                    findCourse(courseId).setTeacher(findTeacher(teacherId));
                    System.out.printf("%s teacher info updated successfully.\n", findCourse(courseId));

                    return;
                }
                System.out.println("The teacher is not in that department!");

                return;
            }
            System.out.printf("Cannot find any course match with courseId %s, modify teacher for course %s failed.\n",
                    courseId, courseId);

            return;
        }
        System.out.printf("Cannot find any teacher match with teacherId %s, modify teacher for course %s failed.\n",
                        teacherId, courseId);
    }

    /**
     * Add a teacher
     * @param fname Teacher's first name
     * @param lname Teacher's last name
     * @param departmentId Department's name
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (numOfTeachers < MAX_NUM_OF_TEACHERS) {
            Teacher newTeacher = new Teacher(fname, lname, findDepartment(departmentId));
            teachers[numOfTeachers++] = newTeacher;
            System.out.printf("%s Added Successfully!\n", newTeacher);

            return;
        }
        System.out.println("Max teacher reached, add a new teacher failed.");
    }

    /**
     * Add a student
     * @param fname Student's first name
     * @param lname Student's last name
     * @param departmentId Department's id
     */
    public void addStudent(String fname, String lname, String departmentId) {
        if (numOfStudents < MAX_NUM_OF_STUDENTS) {
            if (findDepartment(departmentId) != null) {
                Student newStudent = new Student(fname, lname, findDepartment(departmentId));
                students[numOfStudents++] = newStudent;
                System.out.printf("%s added successfully.\n", newStudent);

                return;
            }
            System.out.println("Department with that id is not found!");

            return;
        }
        System.out.println("Max student reached, add a new student failed.");
    }

    /**
     * Add a new department
     * @param departmentName the department id
     */
    public void addDepartment(String departmentName) {
        if (numOfDepartments < MAX_NUM_OF_DEPARTMENTS) {
            Department newDepartment = new Department(departmentName);
            departments[numOfDepartments++] = newDepartment;
            System.out.printf("%s Added Successfully!\n", newDepartment);

            return;
        }
        System.out.println("Max department reached, add a new department failed.");
    }

    /**
     * Add a course
     * @param courseName the name of the course
     * @param credits the number of credits of the course
     * @param departmentId the id of the department of the course
     */
    public void addCourse(String courseName, double credits, String departmentId) {
        if (findDepartment(departmentId) == null) {
            System.out.println("No department with that id!");

            return;
        }
        if (numOfCourses < MAX_NUM_OF_COURSES_PER_SCHOOL) {
            Course newCourse = new Course(courseName, credits, findDepartment(departmentId));
            courses[numOfCourses++] = newCourse;
            System.out.printf("%s Added Successfully!\n", newCourse);

            return;
        }
        System.out.println("Max course reached, add a new course failed.");
    }

    /**
     * Registers a course for a student
     * @param studentId the id of the student
     * @param courseId the id of the course
     */
    public void registerCourse(String studentId, String courseId) {
        if (findStudent(studentId) != null) {
            if (findCourse(courseId) != null) {
                if (findStudent(studentId).getNumOfCourses() + 1 < MAX_NUM_OF_COURSES_PER_STUDENT) {
                    if (findCourse(courseId).getNumOfStudents() + 1 < MAX_NUM_OF_STUDENTS_PER_COURSE) {
                        if (findStudent(studentId).getNumOfCourses() > 0){
                            for (Course course : findStudent(studentId).getCourses()) {
                                if (course != null && course.getId().equals(courseId)) {
                                    System.out.printf("Student %s has already registered Course %s," +
                                                    " register course %s for student %s failed.\n", studentId, courseId, courseId,
                                            studentId);

                                    return;
                                }
                            }
                        }

                        findStudent(studentId).setNumOfCourses(findStudent(studentId).getNumOfCourses());
                        findCourse(courseId).setNumOfStudents(findCourse(courseId).getNumOfStudents());
                        findCourse(courseId).addStudent(findStudent(studentId));
                        findStudent(studentId).addCourse(findCourse(courseId));

                        System.out.printf("Student register course successfully. \nLatest student info: %s\nLatest " +
                                "course info: %s\n", findStudent(studentId), findCourse(courseId));


                        return;
                    }
                    System.out.printf("Course %s has been fully registered, register course %s for student %s failed.\n",
                            courseId, courseId, studentId);
                    return;

                }
                System.out.printf("Student %s has already registered %s courses, register course for student %s failed.\n",
                        studentId, MAX_NUM_OF_COURSES_PER_STUDENT, studentId);

                return;
            }

            System.out.printf("Cannot find any student match with courseId %s, register course for student %s failed.\n",
                    courseId, studentId);

            return;
        }
        System.out.printf("Cannot find any student match with studentId %s, register course for student %s failed.\n",
                        studentId, studentId);

    }
}
