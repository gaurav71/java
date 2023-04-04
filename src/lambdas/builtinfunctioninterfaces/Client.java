package lambdas.builtinfunctioninterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Client {
    public static void main(String[] args) {
        EnhancedList<Integer> arr = new EnhancedList<>(List.of(10, 20, 30));

        Predicate<Integer> evenFilter = val -> val % 2 == 0;
        Predicate<Integer> dividesBy3 = val -> val % 3 == 0;
        Predicate<Integer> finalFilter = evenFilter.and(dividesBy3);
        EnhancedList<Integer> filteredList = arr.filter(finalFilter);
        filteredList.forEach(System.out::println);
        /*decodes to*/
        filteredList.forEach((val) -> System.out.println(val));
        /*decodes to*/
        filteredList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer val) {
                System.out.println(val);
            }
        });

        Consumer<Integer> consumeInt = val -> System.out.print(val + " ");
        Consumer<Integer> secondConsumer = val -> System.out.print(val+20 + " ");
        Consumer<Integer> finalConsumer = consumeInt.andThen(secondConsumer);
        arr.forEach(finalConsumer);

        Supplier<Double> supplier = () -> Math.random();

        Function<Integer, Integer> doubleIt = val -> val * 2;
        Function<Integer, Integer> addOne = val -> val + 1;
        EnhancedList<Integer> newList = arr.map(doubleIt).map(addOne);
        newList.forEach(System.out::println);
    }
}
