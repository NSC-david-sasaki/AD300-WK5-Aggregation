package org.example;

public class Main {
    public static void main(String[] args) {
    Student s1 = new Student("Ferris Bueller", 12);
    Student s2 = new Student("Cameron Frye", 12);
    Student s3 = new Student("Sloan Peterson", 12);

    Student s4 = new Student("Jeannie Bueller", 10);
    Student s5 = new Student("Alice Smith", 10);
    Student s6 = new Student("Bob Jones ", 10);

    Teacher t1 = new Teacher("Mr. McGinty", "Math");
    Teacher t2 = new Teacher("Mr. Bueller", "Economics");

    Teacher t3 = new Teacher("Mrs. Lopze", "Foreignlanguage");
    Teacher t4 = new Teacher("Mr. Herbert", "Foreignlanguage");

    Department d1 = new Department("Math");
    d1.addDeptTeacher((Teacher) t1);
    d1.addDeptTeacher((Teacher) t2);
    d1.addDeptStudent(s4);
    d1.addDeptStudent(s5);
    d1.addDeptStudent(s6);

    Department d2 = new Department("SocialStudies");
    d2.addDeptTeacher((Teacher) t3);
    d2.addDeptTeacher((Teacher) t4);
    d2.addDeptStudent((Student) s1);
    d2.addDeptStudent((Student) s2);
    d2.addDeptStudent((Student) s3);

    School sc1 = new School("Shermer High School");
    sc1.addDepartment(d1);
    sc1.addDepartment(d2);

    System.out.println(sc1.getName());
    sc1.getSchoolDepartments().forEach(System.out::println);

    d1.getAllDeptTeachers().forEach(System.out::println);
    d1.getAllDeptStudents().forEach(System.out::println);

    d2.getAllDeptTeachers().forEach(System.out::println);
    d2.getAllDeptStudents().forEach(System.out::println);

    }
}