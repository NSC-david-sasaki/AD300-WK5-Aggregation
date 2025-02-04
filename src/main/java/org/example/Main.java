package org.example;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
    Student s1 = new Student("Ferris Bueller", 12);
    Student s2 = new Student("Cameron Frye", 12);
    Student s3 = new Student("Sloan Peterson", 12);

    Student s4 = new Student("Jeannie Bueller", 10);
    Student s5 = new Student("Alice Smith", 10);
    Student s6 = new Student("Bob Jones ", 10);

    Teacher t1 = new Teacher("Mr. McGinty", "Geometry");
    Teacher t2 = new Teacher("Mr. Bueller", "Economics");

    Teacher t3 = new Teacher("Mrs. Lopez", "Foreign language");
    Teacher t4 = new Teacher("Mr. Herbert", "Foreign language");

    Department d1 = new Department("Mathematics");
    d1.addDeptTeacher(t1);
    d1.addDeptTeacher(t2);
    d1.addDeptStudent(s4);
    d1.addDeptStudent(s5);
    d1.addDeptStudent(s6);

    Department d2 = new Department("Social Studies");
    d2.addDeptTeacher(t3);
    d2.addDeptTeacher(t4);
    d2.addDeptStudent(s1);
    d2.addDeptStudent(s2);
    d2.addDeptStudent(s3);

    School sc1 = new School("Shermer High School");
    sc1.addDepartment(d1);
    sc1.addDepartment(d2);

    System.out.println("School Name:"+sc1.getName());
    System.out.println();

    System.out.println(d1.getDeptName()+" Department");
    System.out.print("-Teachers:");
    StringJoiner sj = new StringJoiner(", ");
    for (Teacher teacher : d1.getAllDeptTeachers()) {
        String string = teacher.toString();
        sj.add(string);
    }
    System.out.println(sj.toString());
    System.out.print("-Students:");
    StringJoiner sj3 = new StringJoiner(", ");
    //d1.getAllDeptStudents().forEach(System.out::print);
    for (Student student : d1.getAllDeptStudents()) {
        String string = student.toString();
        sj3.add(string);
    }
    System.out.println(sj3.toString());

    System.out.println();
    System.out.println(d2.getDeptName()+" Department");
    System.out.print("-Teachers:");
    StringJoiner sj2 = new StringJoiner(", ");
    for (Teacher teacher : d2.getAllDeptTeachers()) {
        String string = teacher.toString();
        sj2.add(string);
    }
    System.out.println(sj2.toString());
    System.out.print("-Students:");
    StringJoiner sj4 = new StringJoiner(", ");
    for (Student student : d2.getAllDeptStudents()) {
        String string = student.toString();
        sj4.add(string);
    }
    System.out.println(sj4.toString());

    }
}