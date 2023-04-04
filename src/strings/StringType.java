package strings;
import java.util.*;

public class StringType {

    public static void useFulMethods() {
        String string = "hello there";

        if (string.contains("ll")) {
            System.out.println("double l");
        }

        string = string.concat(" you");
        System.out.println(string);

        String sub = string.substring(0,5);
        System.out.println(sub);

        char[] arr = string.toCharArray();
        string = new String(arr);
        System.out.println(string);
    }

    public static void chars() {
        char ch = 'a';
        System.out.println(ch);

        // int is bigger type than char. char can be stored in int without explicit casting
        int val = ch;
        System.out.println(val);

        // implicit casting is done to store int to char
        char ch2 = (char) val;
        System.out.println(ch2);

        // char operation gives int value. need to cast to store in char again
        char x = 'd';
        int y = x - 'a';
        char z = (char) y;
        System.out.println(y);

        int value = 4;
        char h = (char) ('a' + value);
        System.out.println(h);
    }

    public static void sort() {
        String str = "hello world";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        System.out.println(str);
    }

    public static void main(String[] args) {
//        useFulMethods();
//        chars();
//        sort();
    }
}
