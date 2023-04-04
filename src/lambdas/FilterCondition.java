package lambdas;

@FunctionalInterface
public interface FilterCondition<T> {
    boolean check(T item);
}
