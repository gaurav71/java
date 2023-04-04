package lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

class EnhancedList<T> extends ArrayList<T> {
    EnhancedList<T> filter(FilterCondition<T> filterCondition) {
        EnhancedList<T> filteredList = new EnhancedList<>();

        for (T item : this) {
            if (filterCondition.check(item)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }

    // Predicate interface already provided by java
    EnhancedList<T> filterPredicate(Predicate<T> filterCondition) {
        EnhancedList<T> filteredList = new EnhancedList<>();

        for (T item : this) {
            if (filterCondition.test(item)) {
                filteredList.add(item);
            }
        }

        return filteredList;
    }

    EnhancedList<T> map(MapCallback<T> mapCallback) {
        EnhancedList<T> list = new EnhancedList<>();

        for (T item : this) {
            T newItem = mapCallback.mapper(item);
            list.add(newItem);
        }

        return list;
    }
}
