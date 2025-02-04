package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    private Teacher teacher;
    @BeforeEach
    void setUp() {
        teacher = new Teacher ("Mr. Nye", "Science");
    }

    @AfterEach
    void tearDown() {
        teacher = null;
        System.gc();
    }

    @Test
    void getName() {
        assertEquals("Mr. Nye", teacher.getName());
    }

    @Test
    void getSubject() {
        assertEquals("Science", teacher.getSubject());
    }

    @Test
    void testToString() {
        assertNotNull(teacher.getName());
    }

    @Test
    void testEmptySubject() {
        assertThrows(IllegalArgumentException.class, () -> {Teacher t2 = new Teacher("Bob", "");});
    }

    @Test
    void testEmptyTeacherName() {
        assertThrows(IllegalArgumentException.class, () -> {Teacher t3 = new Teacher("", "Geometry");});
    }

    @Test
    void testInvalidSubject(){
        assertThrows(IllegalArgumentException.class, () ->
        {Teacher t4 = new Teacher("Alice", "Underwater Basket Weaving");});
    }

}