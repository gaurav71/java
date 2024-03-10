package introtooops.accessmodifiers.instructor;

import introtooops.accessmodifiers.student.Student;

import java.util.ArrayList;

public class Instructor {
    String name;
    ArrayList<Student> students;

    void addStudent(Student student) {
        // only public member name is accessible outside the package
        System.out.println(student.name + " added");
        this.students.add(student);
    }
}
