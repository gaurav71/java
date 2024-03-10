package introtooops.accessmodifiers.instructor;

import introtooops.accessmodifiers.student.Student;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        Student student = new Student();
        instructor.addStudent(student);

        StudentIterator iterator = new StudentIterator();
        iterator.iterate();
    }
}
