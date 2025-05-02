package org.sp.beans;

import java.util.List;

public class Subject {

    private List<String> students;

    // Getter method for students
    public List<String> getStudents() {
        return students;
    }

    // Setter method for students
    public void setStudents(List<String> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "students=" + students +
                '}';
    }
}
