package oops.accessmodifiers.student.communication;

import oops.accessmodifiers.student.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();

        // public member accessible everywhere
        student.name = "Gaurav";

        // private member not accessible outside class methods.
        // student.age = 20;

        // default member not accessible outside the package (subpackage also treated as diff package)
        // student.batch = "b2";

        // protected member not accessible outside the package (subpackage also treated as diff package)
        // student.email = "gaurav@email.com";
    }
}
