package lambdas.exampleswithgenerics;

public interface Function<T> {
    T apply(T value);
}
