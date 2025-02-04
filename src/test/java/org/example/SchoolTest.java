package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    private School school;
    @BeforeEach
    void setUp() {
        school = new School("South Park Elementary");
    }

    @AfterEach
    void tearDown() {
        school = null;
        System.gc();
    }

    @Test
    void addDepartment() {
       Department d1 = new Department("Art");
       assertDoesNotThrow(() -> school.addDepartment(d1));
    }

    @Test
    void getSchoolDepartments() {
        Department d1 = new Department("Art");
        school.addDepartment(d1);
        assertDoesNotThrow(() -> school.getSchoolDepartments());
        assertEquals("[Art]", school.getSchoolDepartments().toString());
    }

    @Test
    void getName() {
        assertEquals("South Park Elementary", school.getName());
    }
}