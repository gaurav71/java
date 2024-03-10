package introtooops.inheritance;

import java.util.ArrayList;

public class Client {
    static void printAllUserNames(ArrayList<User> users) {
        for (int i=0; i<users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
    }

    public static void main(String[] args) {
        Student student = new Student("John", "john@email.com", "b2", 90);
        student.printAll();

        // Implicit casting
        // Upcasting
        // only User class attributes accessible from this object
        User u = new Student("Mary", "mary@email.com", "b2", 90);

        // Explicit casting
        // Downcasting
        // attributes from User class accessible but if we access Student class attributes
        // it will throw error
        Student s = (Student) new User("Paul", "paul@email.com");


        Student s1 = new Student("Jake", "jake@email.com", "b1", 90);
        Student s2 = new Student("Nathan", "nathan@email.com", "b1", 90);
        User u1 = new User("Charlie", "charlie@email.com");

        ArrayList<User> users = new ArrayList<>();
        users.add(s1);
        users.add(s2);
        users.add(u1);
        printAllUserNames(users);
    }
}
