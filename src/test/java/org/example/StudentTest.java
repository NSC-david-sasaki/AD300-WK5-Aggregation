package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student1;
    @BeforeEach
    void setUp() {
        student1 = new Student("Alice", 9);
    }

    @AfterEach
    void tearDown() {
        student1 = null;
        System.gc();
    }

    @Test
    void getName() {
        assertEquals("Alice", student1.getName());
    }

    @Test
    void getGradeLevel() {
        assertEquals(9, student1.getGradeLevel());
    }

    @Test
    void testToString() {
        assertNotNull(student1.getName());
    }

    @Test
    void testNegativeGradeLevel() {
        assertThrows(IllegalArgumentException.class, () -> {Student s2 = new Student("Bob", -1);});
    }

    @Test
    void testRangeGradeLevel() {
        assertThrows(IllegalArgumentException.class, () -> {Student s2 = new Student("Bob", 255);});
    }

    @Test
    void testEmptyStudentName(){
        assertThrows(IllegalArgumentException.class, () -> {Student s3 = new Student("", 10);});
    }
}