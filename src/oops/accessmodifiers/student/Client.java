package oops.accessmodifiers.student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Jake");

        // public member accessible everywhere
        student.name = "Gaurav";

        // private member not accessible outside class methods.
        // student.age = 20;

        // default member accessible within package
        student.batch = "b2";

        // protected member accessible within package
        student.email = "gaurav@email.com";
    }
}
