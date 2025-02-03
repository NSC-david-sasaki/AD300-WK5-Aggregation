package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String subject;
    public Teacher(String name, String subject) {
        if (!name.isEmpty()) {
            this.name = name;
        }

        if (this.isSubject(subject)){
            this.subject = subject;
        }
        else throw new IllegalArgumentException("Invalid subject");
    }

    private boolean isSubject(String subject) {
        if (subject.isEmpty()) {
            return false;
        }
        List<String> subjects = new ArrayList<>();
        subjects.add("math");
        subjects.add("science");
        subjects.add("english");
        subjects.add("history");
        subjects.add("geography");
        subjects.add("physicaleducation");
        subjects.add("art");
        subjects.add("music");
        subjects.add("socialstudies");
        subjects.add("economics");
        subjects.add("computerscience");
        subjects.add("healtheducation");
        subjects.add("foreignlanguage");

        return subjects.contains(subject.toLowerCase());
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Name:"+getName()+"\n"+"Subject:"+getSubject();
    }
}
