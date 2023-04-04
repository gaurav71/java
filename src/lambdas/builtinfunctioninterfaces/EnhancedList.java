package lambdas.builtinfunctioninterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EnhancedList<T> extends ArrayList<T> {

    EnhancedList(){}
    EnhancedList(List<T> data) {
        super();
        data.forEach(this::add);
    }
    EnhancedList<T> map(Function<T, T> function) {
        EnhancedList<T> newList = new EnhancedList<>();

        this.forEach(val -> {
            newList.add(function.apply(val));
        });

        return newList;
    }

    EnhancedList<T> filter(Predicate<T> predicate) {
        EnhancedList<T> filteredList = new EnhancedList<>();

        this.forEach(val -> {
            if (predicate.test(val)) {
                filteredList.add(val);
            }
        });

        return filteredList;
    }
}
