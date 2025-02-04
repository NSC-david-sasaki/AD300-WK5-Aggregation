package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {
    private Department department;
    @BeforeEach
    void setUp() {
        department = new Department("Music");
    }

    @AfterEach
    void tearDown() {
        department = null;
        System.gc();
    }

    @Test
    void addDeptTeacher() {
        Teacher t1 = new Teacher("Jane Smith", "Music");
        assertDoesNotThrow(() -> department.addDeptTeacher(t1));
    }

    @Test
    void addDeptStudent() {
        Student s1 = new Student("John Doe", 10);
        assertDoesNotThrow(() -> department.addDeptStudent(s1));
    }

    @Test
    void getAllDeptTeachers() {
        Teacher t1 = new Teacher("Jane Smith", "Music");
        assertDoesNotThrow(() -> department.addDeptTeacher(t1));
        assertEquals("[Jane Smith (Music)]", department.getAllDeptTeachers().toString());
    }

    @Test
    void getAllDeptStudents() {
        Student s1 = new Student("John Doe", 10);
        assertDoesNotThrow(() -> department.addDeptStudent(s1));
        assertEquals("[John Doe (Grade 10)]", department.getAllDeptStudents().toString());
    }

    @Test
    void getDeptName() {
        assertEquals("Music", department.getDeptName());
    }

    @Test
    void testToString() {
        assertEquals("Music", department.toString());
    }
}