package org.example;

public class Student {
    private String name;
    private int grade;

    public String getName(){
        return this.name;
    }

    public int getGradeLevel(){
        return this.grade;
    }

    Student(String name, int GradeLevel){
        if (!name.isEmpty()) {
            this.name = name;
        }
        else throw new IllegalArgumentException("Name cannot be empty");

        if ((GradeLevel> 0) && (GradeLevel < 13)) {
            this.grade = GradeLevel;
        }
        else throw new IllegalArgumentException("GradeLevel must be between 0 and 13");
    }

    @Override
    public String toString() {
        return "Name:"+getName()+"\n"+"Grade Level:"+getGradeLevel();
    }
}
