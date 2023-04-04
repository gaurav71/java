package collections;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int item = iterator.next();
            System.out.print(item);
        }

        list.forEach((Integer item) -> System.out.print(item));

        for (int x : list) {
            System.out.print(x);
        }
    }
}
