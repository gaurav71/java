package lambdas;

import java.util.List;

public class Client {
    public static void withoutLambdas() {
        EnhancedList list = new EnhancedList(List.of(1, 2, 3, 4, 5));

        // We cannot pass function directly as parameter
        // We can pass an object which has the function as an attribute
        // STEPS:
        // Create an interface with only has one function which needs to be passed
        // Pass a new object of a class (can be anonymous) implementing that interface

        List<Integer> odd = list.filter(new Predicate() {
            @Override
            public boolean test(int val) {
                return val % 2 == 1;
            }
        });

        List<Integer> add10 = list.map(new Function() {
            @Override
            public int apply(int val) {
                return val + 10;
            }
        });

        new EnhancedList(add10).forEach(new Consumer() {
            @Override
            public void accept(int val) {
                System.out.println(val);
            }
        });
    }

    public static void withLambdas() {
        EnhancedList list = new EnhancedList(List.of(1,2,3,4,5));
        // Syntactical sugar over anonymous class implementation
        List<Integer> odd = list.filter((val) -> val % 2 == 1);
        List<Integer> add10 = list.map((val) -> val + 10);
        new EnhancedList(add10).forEach(val -> System.out.println(val));
    }

    public static void main(String[] args) {
        withoutLambdas();
        withLambdas();
    }
}
