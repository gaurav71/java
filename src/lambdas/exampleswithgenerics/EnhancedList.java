package lambdas.exampleswithgenerics;

import java.util.ArrayList;

class EnhancedList<T> extends ArrayList<T> {
    EnhancedList<T> filter(Predicate<T> filterCondition) {
        EnhancedList<T> filteredList = new EnhancedList<>();

        for (T item : this) {
            if (filterCondition.test(item)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }

    EnhancedList<T> map(Function<T> mapCallback) {
        EnhancedList<T> list = new EnhancedList<>();

        for (T item : this) {
            T newItem = mapCallback.apply(item);
            list.add(newItem);
        }

        return list;
    }

    void forEach(Consumer<T> consumer) {
        for (T item : this) {
            consumer.accept(item);
        }
    }
}
