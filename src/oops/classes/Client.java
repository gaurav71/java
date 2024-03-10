package oops.classes;

public class Client {
    public static void main(String args[]) {
        Student s1 = new Student("Gaurav", 10);
        Student s2 = new Student("James", 20);

        System.out.println(s1.getCount());
        System.out.println(s1.count);
        System.out.println(Student.getCount());
        System.out.println(Student.count);
    }
}
