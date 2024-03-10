package learnings;

public class DataTypes {
    public static void main(String[] args) {
        /*-------------------------------PRIMITIVE--------------------------------*/

        // Integral
        byte b;     // 1 byte
        short s;    // 2 bytes
        int i;      // 4 bytes
        long l;     // 8 bytes
        // Range = [2^n-1, (2^n-1) - 1]
        // Negative numbers are stored as 2s compliment of their +ve counterparts (-13 = 2's complement of 13)
        // For typecasting, remember (you cannot store a bigger value type to smaller type)
        // Every number is stored as integer, If we go outside range of integer (long) then we have to specify during initialization
        l = 100000000000l;

        // Non Integral
        float f;    // 4 bytes
        double d;   // 8 bytes
        char c;     // 2 bytes
        boolean bo; // 1 byte
        // Unlike c++, a non zero number is not considered as true in java. we have to provide boolean value
        // Every decimal number is stored as double. If we want to use float, we have to specify it
        f = 2.5f;

        c = 'x';
        // implicit type casting (storing smaller type char to bigger type int)
        int ch = c;
        // explicit type casting (storing bigger type int to smaller type char)
        c = (char) (ch + 1);

        // Wrapper Classes for Primitive data types
        // Integer
        // Float
        // Double
        // Boolean
        // Objects created from these oops.classes are immutable
        // Meaning, if we change the value of it, a new object will be created with the new value,
        // instead of updating the old one

        Integer in = Integer.valueOf(10); // Integer@123
        in++; // Integer@456
        in += 10; // Integer@489

        /*-------------------------------NON PRIMITIVE--------------------------------*/
        // ***STRINGS***
        // Strings are immutable
        // String literals are stored in string pool part of heap
        // When we create a new string literal, jvm first checks in the pool if the value is already present
        // String Objects are also stored in heap but outside of string pool
        // If we update string, a new string in heap is created
        String s1 = "java"; // new string is created in string pool
        String s2 = "java"; // s2 will point to the same address as s1 (s2 == s1)
        String s3 = "javascript"; // new string is created in pool
        String s4 = new String("java"); // new string is created in heap
        String s5 = new String("java"); // new string is created in heap (s4 != s5)
        s5 += "script";

        // check the references of the object (pointing to the same address or not)
        if (s1 == s2) System.out.println("s1 and s2 pointing to same address");
        // check the values of the string
        if (s1.equals(s2)) System.out.println("s1 and s2 having the same string value");
    }

}
