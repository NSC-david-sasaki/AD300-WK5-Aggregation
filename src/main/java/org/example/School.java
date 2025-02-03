package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Department> schoolDepartments = new ArrayList<>();

    public void addDepartment(Department department) {
        if (!(department == null)) {
            schoolDepartments.add(department);
        }
        else throw new IllegalArgumentException("Department is null");
    }

    public List<Department> getSchoolDepartments() {
        return schoolDepartments;
    }

    public String getName() {
        return name;
    }

    School(String name) {
        if (!(name == null)){
            this.name = name;
        }
        else throw new NullPointerException("School is null");
    }
}
