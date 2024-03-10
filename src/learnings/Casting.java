package learnings;

public class Casting {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 10;
        // implicit casting
        // RHS is evaluated and stored in an appropriate type before LHS comes into picture
        // Since val1 and val2 are both of int types, the result of the expression is stored in int
        // The result then stored in long type (LHS) by doing implicit upcasting
        long res = val1 * val2;

        // explicit casting
        // Now the RHS expression result will be stored in long type because one of the opearand is of long
        // Basically, the most appropriate type will be chosen from RHS to store the RHS expression result
        long res2 = (long) val1 * val2;


        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;

        long z = (long) x + y;

        

        System.out.println(z);
    }
}
