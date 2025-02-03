package org.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Teacher> deptTeachers = new ArrayList<>();
    private List<Student> deptStudents = new ArrayList<>();

    public void addDeptTeacher(Teacher teacher) {
        if (!(teacher == null)){
            deptTeachers.add(teacher);
        }
        else throw new NullPointerException("Teacher is null");
    }

    public void addDeptStudent(Student student) {
        if (!(student == null)){
            deptStudents.add(student);
        }
        else throw new NullPointerException("Student is null");
    }

    public List<Teacher> getAllDeptTeachers() {
        return deptTeachers;
    }

    public List<Student> getAllDeptStudents() {
        return deptStudents;
    }

    public String getDeptName() {
        return name;
    }

    Department(String name) {
        if (!(name == null)){
            this.name = name;
        }
        else throw new NullPointerException("Department is null");
    }

    @Override
    public String toString() {
        return name;
    }

}
