package introtooops.accessmodifiers.student;

public class Student {
    public String name;
    private int age;
    String batch; // default (package private)
    protected String email;

    // public constructor
    public Student() {}

    // default (package private) constructor
    Student(String name) {
        this.name = name;
    }
}
