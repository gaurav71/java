import java.util.*;
public class ArrayType {

    private static Integer[][] converListToArray(List<? extends List<Integer>> A) {
        Integer[][] arr = new Integer[A.size()][];

        for (int i=0; i<arr.length; i++) {
            arr[i] = A.get(i).toArray(new Integer[0]);
        }

        return arr;
    }
    public static void main(String[] args) {
        List<List<Integer>> A = new ArrayList<>();
        int n = 5;

        for (int i=0; i<5; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            temp.add(2);
            temp.add(3);
            A.add(temp);
        }

        Integer[][] arr = converListToArray(A);

        Integer[][] arr2 = new Integer[4][];

        for (int i=0; i<arr2.length; i++) {
            arr2[i] = new Integer[8];

            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i+j;
                System.out.print(arr2[i][j]);
            }

            System.out.println();
        }
    }
}
