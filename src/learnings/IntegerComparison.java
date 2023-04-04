package learnings;

import java.util.ArrayList;

public class IntegerComparison {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-31013930);
        list.add(-31013930);
        list.add(-31013930);

        int index1 = 1; // index of first integer to compare
        int index2 = 2; // index of second integer to compare

        // produces inconsistent results as double equal to compares refernces
        if (list.get(index1) == list.get(index2)) {
            System.out.println("The integers at index " + index1 + " and " + index2 + " are equal");
        } else if (list.get(index1) > list.get(index2)) {
            System.out.println("The integer at index " + index1 + " is greater than the integer at index " + index2);
        } else {
            System.out.println("The integer at index " + index1 + " is less than the integer at index " + index2);
        }

        // use equals method
        if (list.get(index1).equals(list.get(index2))) {
            System.out.println("The integers at index " + index1 + " and " + index2 + " are equal");
        } else if (list.get(index1).compareTo(list.get(index2)) > 0) {
            System.out.println("The integer at index " + index1 + " is greater than the integer at index " + index2);
        } else {
            System.out.println("The integer at index " + index1 + " is less than the integer at index " + index2);
        }

        // cast the values
        if ((int) list.get(index1) == (int) list.get(index2)) {
            System.out.println("The integers at index " + index1 + " and " + index2 + " are equal");
        } else if (list.get(index1) > list.get(index2)) {
            System.out.println("The integer at index " + index1 + " is greater than the integer at index " + index2);
        } else {
            System.out.println("The integer at index " + index1 + " is less than the integer at index " + index2);
        }
    }
}
