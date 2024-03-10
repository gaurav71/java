package introtooops.inheritance;

public class Student extends User {
    private String batch;
    private int marks;

    public Student(String name, String email, String batch, int marks) {
        // compiler can automatically call the parent's no arg default constructor.
        // However, if the parent does not have a no arg constructor then we have to call the
        // parent's parameterized constructor manually using the super keyword and provide arguments.
        super(name, email);
        // attributes from parent's constructor are initialized, we can access them from here
        System.out.println(this.getName());
        // super keyword can be used to only access attributes created from parent class
        System.out.println(super.getName());
        this.batch = batch;
        this.marks = marks;
    }

    public void printAll() {
        System.out.println(this.getName());
        System.out.println(this.getEmail());
        System.out.println(this.getBatch());
        System.out.println(this.getMarks());
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public int test(int val) {
        return val;
    }

    public int test(double val) {
        return (int) val;
    }
}
