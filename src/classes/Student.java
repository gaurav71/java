package classes;

public class Student {
    private String name;

    // value is set before the constructor is called. (can update this value in constructor)
    private int rollNo = 0;

    // Class level attribute. common for all instances
    public static int count;

    // can only be assigned once. have to assign here or in constructor
    private final String id;

    // used as a global constant
    public static final String studentMotto = "E Pluribus Unum";

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.id = "uniq-" + rollNo;
        count++;
    }


    // static methods cannot use non-static (object level) methods and attributes
    public static int getCount() {
        return count;
    }

    // non-static method can use static methods and static attributes
    public void test() {
        int random = getCount() + count;
        System.out.println(random);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
