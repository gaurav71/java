package lambdas.exampleswithgenerics;

public class Client {
    static void withoutLambdas() {
        EnhancedList<Integer> list = new EnhancedList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(2);

        list.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 1;
            }
        }).map(new Function<Integer>() {
            @Override
            public Integer apply(Integer value) {
                return value + 10;
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
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

        list.filter((val) -> val % 2 == 0)
                .map((val) -> val *val)
                .forEach((Consumer<Integer>) (val) -> System.out.println(val));
    }

    public static void main(String[] args) {
        withoutLambdas();
        withLambdas();
    }
}
