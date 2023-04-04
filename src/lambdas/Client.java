package lambdas;

import java.util.function.Consumer;

public class Client {
    static void withoutLambdas() {
        EnhancedList<Integer> list = new EnhancedList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(2);

        // we cant pass function as a parameter directly
        // we can pass an object which has the function as an attribute
        // STEPS:
        // create an interface with only has one function which needs to be passed
        // Use that interface as a parameter in the function
        // Pass a new object of a class (can be anonymous) implementing that interface
        EnhancedList<Integer> newList = list.filter(new FilterCondition<Integer>() {
            @Override
            public boolean check(Integer item) {
                return item % 2== 0;
            }
        }).map(new MapCallback<Integer>() {
            @Override
            public Integer mapper(Integer item) {
                return item * item;
            }
        });

        // Consumer interface provided by Java
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+ " ");
            }
        });
    }

    static void withLambdas() {
        EnhancedList<Integer> list = new EnhancedList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(2);

        // Just a syntactical sugar over without lambdas code
        EnhancedList<Integer> newList = list.filter((val) -> val % 2 == 0).map((val) -> val *val);
        list.forEach((val) -> System.out.print(val + " "));

        System.out.println(newList);
    }

    public static void main(String[] args) {
        withoutLambdas();
        withLambdas();
    }
}
