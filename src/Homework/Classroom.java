package Homework;

import java.util.ArrayList;

public class Classroom {
    private ArrayList<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String toString() {
        String student = "";
        for(Student s : students) {
            student += s + "\n";
        }
        return student;
    }

    public Student searchFor(String student){
        for(Student s : students) {
            if(s.getName().equals(student)) {
                return s;
            }
        }
        return null;
    }

    public Student getStudent(String student) {
        for(Student s : students) {
            if(s.getName().equals(student)) {
                return s;
            }
        }
        return null;
    }
}
