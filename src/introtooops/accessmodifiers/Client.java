package introtooops.accessmodifiers;

import introtooops.accessmodifiers.student.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();

        // public member accessible everywhere
        student.name = "Gaurav";

        // private member not accessible outside class methods.
        // student.age = 20;

        // default member not accessible outside the package (parent package is considered a diff package)
        // student.batch = "b2";

        // protected member not accessible outside the package (parent package is considered a diff package)
        // student.email = "gaurav@email.com";

        class TestStudent extends Student {
            void test() {
                // protected member of Student is accessible in every child of Student even in different packages.
                this.email = "some@some.com";
                // default member of Student is not accessible outside the package
                // this.batch = "b2";
            }
        }
    }
}
