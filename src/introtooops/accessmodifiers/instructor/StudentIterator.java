package introtooops.accessmodifiers.instructor;

import introtooops.accessmodifiers.student.Student;

public class StudentIterator extends Student {
    void iterate() {
        System.out.println(this.name);

        // protected member accessible outside the package in subclass.
        System.out.println(this.email);

        // private member age not accessible outside the class methods
        // System.out.println(this.age);

        // default member not accessible outside the package
        // System.out.println(this.batch);
    }
}
