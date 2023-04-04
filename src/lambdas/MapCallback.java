package lambdas;

@FunctionalInterface
public interface MapCallback<T> {
    T mapper(T item);
}
