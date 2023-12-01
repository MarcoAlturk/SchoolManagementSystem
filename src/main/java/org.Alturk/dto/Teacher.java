package org.Alturk.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Teacher
 * @author Marco Alturk (2359284)
 */
@EqualsAndHashCode
@Getter
@Setter
public class Teacher {
    private String fname;
    private String lname;
    private Department department;
    private String id;
    private int nextId = 1;
    public Teacher(String fname, String lname, Department department) {
        this.id = String.format("T%03d", nextId++);
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", id='" + id + '\'' +
                '}';
    }
}
